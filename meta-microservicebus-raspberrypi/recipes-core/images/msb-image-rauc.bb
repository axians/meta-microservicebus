# Base this image on core-image-base
require recipes-core/images/core-image-base.bb

EXTRA_IMAGE_FEATURES ?= "debug-tweaks ssh-server-openssh"

SERIAL_CONSOLE = ""

RPI_USE_U_BOOT = "1"

IMAGE_ROOTFS_EXTRA_SPACE = "1048576"

IMAGE_INSTALL_append = " rauc"

IMAGE_INSTALL_append = " u-boot-fw-utils"

IMAGE_INSTALL_append = " packagegroup-microservicebus-dev"
