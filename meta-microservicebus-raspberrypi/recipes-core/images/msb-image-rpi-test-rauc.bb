# Base this image on core-image-base
require recipes-core/images/core-image-base.bb

EXTRA_IMAGE_FEATURES ?= "debug-tweaks ssh-server-openssh"

SERIAL_CONSOLE = ""

RPI_USE_U_BOOT = "1"

IMAGE_ROOTFS_EXTRA_SPACE = "1048576"

IMAGE_INSTALL_append = " rauc"

IMAGE_INSTALL_append = " u-boot-fw-utils"

IMAGE_INSTALL_append = " \
    packagegroup-microservicebus-base \
    packagegroup-microservicebus-extra \
    packagegroup-microservicebus-build \
    "

# Packages from packagegroup-rpi-test
RDEPENDS_${PN} = "\
    bcm2835-tests \
    wiringpi \
    rpio \
    rpi-gpio \
    pi-blaster \
    python-rtimu \
    python-sense-hat \
    connman \
    connman-client \
    crda \
    bluez5 \
"