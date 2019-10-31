# Base this image on core-image-base
require recipes-core/images/core-image-base.bb

# Include base settings
require recipes-core/images/msb-image.inc

# Add serialport and make..
IMAGE_INSTALL_append = " \
    packagegroup-microservicebus-extra \
    packagegroup-microservicebus-build \
    "
