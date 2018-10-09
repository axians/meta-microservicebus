# Base this image on core-image-base
require recipes-core/images/core-image-base.bb

EXTRA_IMAGE_FEATURES ?= "debug-tweaks ssh-server-openssh"


#IMAGE_FSTYPES = "tar.bz2 ext3"
IMAGE_FSTYPES ?= "tar.bz2 ext3 rpi-sdimg"

SERIAL_CONSOLE = ""

RPI_USE_U_BOOT = "1"

IMAGE_ROOTFS_EXTRA_SPACE = "1048576"


IMAGE_INSTALL_append = " bash python"
IMAGE_INSTALL_append = " nodejs nodejs-npm"
IMAGE_INSTALL_append = " microservicebus-node"
IMAGE_INSTALL_append = " rauc"

IMAGE_INSTALL_append = " u-boot-fw-utils"
