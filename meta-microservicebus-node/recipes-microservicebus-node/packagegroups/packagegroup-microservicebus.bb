SUMMARY = "Support for microServiceBus"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} = "\
    nodejs \
    nodejs-npm \
    \
    microservicebus-node-user \
    microservicebus-node \
    microservicebus-node-service \
    nodejs-dbus \
    nodejs-serialport \
    \
"
