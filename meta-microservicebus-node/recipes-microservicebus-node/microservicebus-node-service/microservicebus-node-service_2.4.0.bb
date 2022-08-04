inherit systemd
inherit features_check

SUMMARY = "Install microservicebus as systemd service and add dbus conf file"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI += "file://microservicebus-node.service \
            file://com.microservicebus.core.conf"

S = "${WORKDIR}"

SYSTEMD_PACKAGES = "${PN}"

SYSTEMD_SERVICE_${PN} = " microservicebus-node.service"

FILES_${PN} += "${systemd_system_unitdir}/microservicebus-node.service \
                ${datadir}/dbus-1/system.d/com.microservicebus.core.conf"

#Dynamic parameters for service file, set default values
MSB_NODE_ARG ?= "-w"
MSB_NODE_WORK_DIR ?= "/usr/lib/node/microservicebus-node"
MSB_NODE_USER ?= "msb"
MSB_NODE_GROUP ?= "msb"
MSB_NODE_HOST ?= "microservicebus.com"
MSB_DAM_SOCKETPATH ?= "/var/run/dam"
MSB_NODE_EXTRA_CA_CERTS ?= ""

do_install() {
             
    #Replace parameters in service file
    sed -i -e 's:@MSB_NODE_ARG@:${MSB_NODE_ARG}:g' ${WORKDIR}/microservicebus-node.service
    sed -i -e 's:@MSB_NODE_WORK_DIR@:${MSB_NODE_WORK_DIR}:g' ${WORKDIR}/microservicebus-node.service
    sed -i -e 's:@MSB_NODE_USER@:${MSB_NODE_USER}:g' ${WORKDIR}/microservicebus-node.service
    sed -i -e 's:@MSB_NODE_GROUP@:${MSB_NODE_GROUP}:g' ${WORKDIR}/microservicebus-node.service
    sed -i -e 's:@MSB_NODE_HOST@:${MSB_NODE_HOST}:g' ${WORKDIR}/microservicebus-node.service
    sed -i -e 's:@MSB_DAM_SOCKETPATH@:${MSB_DAM_SOCKETPATH}:g' ${WORKDIR}/microservicebus-node.service
    sed -i -e 's:@MSB_NODE_EXTRA_CA_CERTS@:${MSB_NODE_EXTRA_CA_CERTS}:g' ${WORKDIR}/microservicebus-node.service

    #Install service file
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/microservicebus-node.service ${D}${systemd_system_unitdir}

    #Install dbus busconfig file
    install -d ${D}${datadir}/dbus-1/system.d
    install -m 0644 ${WORKDIR}/com.microservicebus.core.conf ${D}${datadir}/dbus-1/system.d/com.microservicebus.core.conf
}

REQUIRED_DISTRO_FEATURES= "systemd"

