inherit systemd

SUMMARY = "Install init script for rpi demo"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI += "file://rpi-init.service \
            file://rpi-init.sh"

S = "${WORKDIR}"

SYSTEMD_PACKAGES = "${PN}"

SYSTEMD_SERVICE_${PN} = " rpi-init.service"

FILES_${PN} += "${systemd_system_unitdir}/rpi-init.service \
                ${bindir}/rpi-init.sh"

# Dynamic parameters
MSB_NODE_USER ?= "msb"
MSB_NODE_GROUP ?= "msb"

do_install() {
             
    # Replace parameters in script
    #sed -i -e 's:@MSB_NODE_USER@:${MSB_NODE_USER}:g' ${WORKDIR}/rpi-init.sh
    #sed -i -e 's:@MSB_NODE_GROUP@:${MSB_NODE_GROUP}:g' ${WORKDIR}/rpi-init.sh

    # Install service file
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/rpi-init.service ${D}${systemd_system_unitdir}

    # Install script
    install -d ${D}${bindir}
    install -m 0550 ${WORKDIR}/rpi-init.sh ${D}${bindir}/
}

REQUIRED_DISTRO_FEATURES= "systemd"