SUMMARY = "Support for microServiceBus."
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} = "\
    nodejs \
    nodejs-npm \
    \
    microservicebus-node \
    msb-service \
    \
    cpp \
    cpp-symlinks \
    gcc \
    gcc-symlinks \
    g++ \
    g++-symlinks \
    make \
    \
    binutils \
    binutils-symlinks \
    \
"
