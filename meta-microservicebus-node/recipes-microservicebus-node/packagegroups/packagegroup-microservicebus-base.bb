SUMMARY = "Support for running microServiceBus"
LICENSE = "MIT"

inherit packagegroup


PACKAGES = "\
    packagegroup-microservicebus-base \
    "

# Normal minimun packages to install to ron microServicebus on Yocto
RDEPENDS_packagegroup-microservicebus-base = "\
    nodejs \
    nodejs-npm \
    \
    microservicebus-node-user \
    microservicebus-node \
    microservicebus-node-service \
    "

