SUMMARY = "Support for running microServiceBus"
LICENSE = "MIT"

inherit packagegroup


PACKAGES = "\
    packagegroup-microservicebus-base \
    packagegroup-microservicebus-extra \
    packagegroup-microservicebus-build \
    "

# Normal minimun packages to install to ron microServicebus on Yocto
RDEPENDS_packagegroup-microservicebus-base = "\
    nodejs \
    nodejs-npm \
    \
    microservicebus-node-user \
    microservicebus-node \
    microservicebus-node-service \
    nodejs-dbus \
    "

# Extra applications to add features useful to microServiceBus
RDEPENDS_packagegroup-microservicebus-extra = "\
    nodejs-serialport \
    "
# Packages to enable running node-gyp for compiling native addon modules for Node.js
RDEPENDS_packagegroup-microservicebus-build = "\
    make \
    cpp \
    cpp-symlinks \
    gcc \
    gcc-symlinks \
    g++ \
    g++-symlinks \
    \
    binutils \
    binutils-symlinks \
    "