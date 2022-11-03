SUMMARY = "Support for running microServiceBus"
LICENSE = "MIT"

inherit packagegroup


PACKAGES = "\
    packagegroup-microservicebus-dam-base \
    "

# Normal minimun packages to install to run microServicebus on Yocto
RDEPENDS:packagegroup-microservicebus-dam-base = "\
    nodejs \
    nodejs-npm \
    microservicebus-dam \
    microservicebus-dam-scheduled-service \
    microservicebus-dam-service \
    "

