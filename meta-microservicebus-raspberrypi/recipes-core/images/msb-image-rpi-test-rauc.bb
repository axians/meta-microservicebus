# Base this image on core-image-base
require recipes-core/images/core-image-base.bb

# Include base settings
require recipes-core/images/msb-image.inc

# Add serialport and make..
IMAGE_INSTALL_append = " \
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
