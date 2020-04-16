SUMMARY = "Support for running microServiceBus"
LICENSE = "MIT"

inherit packagegroup


PACKAGES = "\
    packagegroup-microservicebus-extra \
    "

# Extra applications to add features useful to microServiceBus
RDEPENDS_packagegroup-microservicebus-extra = "\
    nodejs-serialport \
    "
