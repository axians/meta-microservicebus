# Base this image on core-image-base
require recipes-core/images/core-image-base.bb

# This configuration is to run mSB-node inside Azure IoT-Edge container 

# Run ssh server default
EXTRA_IMAGE_FEATURES += " ssh-server-openssh"

# Use u-boot as second bootloader, to enable dual boot
RPI_USE_U_BOOT = "1"

# Set fixed size rootf to not break rauc update
IMAGE_ROOTFS_EXTRA_SPACE = "0"
IMAGE_ROOTFS_SIZE = "4194304"

# Add raspberry pi firmware
RRECOMMENDS_${PN} = "\
    ${MACHINE_EXTRA_RRECOMMENDS} \
"

# Rauc to install firmware update, need u-boot-fw-utils
# to set u-boot env. from user space to switch slots
IMAGE_INSTALL_append = " rauc"
IMAGE_INSTALL_append = " u-boot-fw-utils"

# Wifi support
DISTRO_FEATURES_append = " wifi"
IMAGE_INSTALL_append = " iw wpa-supplicant"

# Basic microservicebus
IMAGE_INSTALL_append = " \
    "
# Enable init script to prepare wifi, ssh, data partition.
# Add resize2fs to be able to use all off sd-card
IMAGE_INSTALL_append = " \
    rpi-init \
    e2fsprogs-resize2fs \
    "
    
#Azure IoT Edge
IMAGE_INSTALL_append = "\
    libiothsm-std \
    iotedge-cli \
    iotedge-daemon \
    "

# The setting below needs to be added to local.conf or distro, this is only as template 
#DISTRO_FEATURES_append = " virtualization"

# Workaround as IoT-Edge not support latest rust version in meta-rust
#PREFERRED_VERSION_rust = "1.34.2"
#PREFERRED_VERSION_rust-native = "1.34.2"
#PREFERRED_VERSION_cargo = "1.34.2"
#PREFERRED_VERSION_cargo-native = "1.34.2"
#PREFERRED_VERSION_libstd-rs = "1.34.2"
#PREFERRED_VERSION_rust-cross = "1.34.2"
#PREFERRED_VERSION_rust-llvm = "1.34.2"
#PREFERRED_VERSION_rust-llvm-native = "1.34.2"


