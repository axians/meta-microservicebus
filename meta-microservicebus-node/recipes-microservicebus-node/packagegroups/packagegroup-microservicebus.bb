SUMMARY = "Support for microServiceBus and use of gyp for npm"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} = "\
    nodejs \
    nodejs-npm \
    \
    microservicebus-node \
    microservicebus-node-service \
    nodejs-serialport \
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
