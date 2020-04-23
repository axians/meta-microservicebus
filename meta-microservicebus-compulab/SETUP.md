echo Installing Poky
git clone git://git.yoctoproject.org/poky
cd poky
git fetch --tags
git checkout tags/yocto-2.6

echo Prepare NXP BSP
cd ..
repo init -u git://source.codeaurora.org/external/imx/imx-manifest.git -b imx-linux-warrior -m imx-4.19.35-1.1.0.xml
repo sync

echo add compuLab meta layer
v

echo add meta-bsp-microservicebus
git clone -b warrior https://github.com/axians/meta-microservicebus.git sources/meta-microservicebus/

echo setup environment
COMPULAB_MACHINE=cl-som-imx7
MACHINE=${COMPULAB_MACHINE} DISTRO=fsl-imx-fb source sources/meta-bsp-imx7/tools/setup-env -b build-fb-imx7

#echo build image
bitbake-layers add-layer ../sources/meta-microservicebus/meta-microservicebus-node

# build
bitbake -k core-image-full-cmdline
xzcat core-image-full-cmdline-cl-som-imx7.sdcard.xz -v | sudo dd of=/dev/mmcblk0 bs=1M

# deploy
SRC=/dev/mmcblk0 DST=/dev/mmcblk2 cl-deploy

# WIFI
rfkill unblock all
nmcli device wifi connect HOME.PL1 password YANKOAVE4

#modem
nmcli con add type gsm ifname cdc-wdm0 con-name GSMMSB apn m2m.tele2.com
nmcli con up GSMMSB

# RAUC
rauc mark-active rootfs.0

# Bundle
gunzip -c core-image-full-cmdline-cl-som-imx7-20200409084128.rootfs.ext4.gz >core-image-full-cmdline-cl-som-imx7.ext4
bitbake update-bundle-rauc



