# Base this image on core-image-base
require recipes-core/images/core-image-base.bb

EXTRA_IMAGE_FEATURES ?= "debug-tweaks ssh-server-openssh"

SERIAL_CONSOLE = ""

IMAGE_ROOTFS_EXTRA_SPACE = "1024"

IMAGE_INSTALL_append = " nodejs nodejs-npm"
IMAGE_INSTALL_append = " microservicebus-node"
