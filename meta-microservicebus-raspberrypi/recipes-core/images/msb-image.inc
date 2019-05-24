# Base configuration for msb-images

# Run ssh server default
EXTRA_IMAGE_FEATURES += " ssh-server-openssh"

# Use u-boot as second bootloader, to enable dual boot
RPI_USE_U_BOOT = "1"

# Set fixed size rootf to not break rauc update
IMAGE_ROOTFS_EXTRA_SPACE = "0"
IMAGE_ROOTFS_SIZE = "1048576"

# Rauc to install firmware update, need u-boot-fw-utils
# to set u-boot env. from user space to switch slots
IMAGE_INSTALL_append = " rauc"
IMAGE_INSTALL_append = " u-boot-fw-utils"

# Wifi support
DISTRO_FEATURES_append = " wifi"
IMAGE_INSTALL_append = " iw wpa-supplicant"

# Basic microservicebus
IMAGE_INSTALL_append = " \
    packagegroup-microservicebus-base \
    "
# Enable init script to prepare wifi, ssh, data partition
IMAGE_INSTALL_append = " rpi-init"

# Add raspberry pi firmware
RRECOMMENDS_${PN} = "\
    ${MACHINE_EXTRA_RRECOMMENDS} \
"
