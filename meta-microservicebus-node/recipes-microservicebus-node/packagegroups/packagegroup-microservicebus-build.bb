SUMMARY = "Support for running microServiceBus"
LICENSE = "MIT"

inherit packagegroup


PACKAGES = "\
    packagegroup-microservicebus-build \
    "
# Packages to enable running node-gyp for compiling native addon modules for Node.js
RDEPENDS:packagegroup-microservicebus-build = "\
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
