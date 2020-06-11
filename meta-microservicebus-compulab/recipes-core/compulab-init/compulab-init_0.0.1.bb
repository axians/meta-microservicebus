inherit systemd

SUMMARY = "Install init script for Compulab gateway"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI += "file://compulab-init.service \
            file://compulab-init.sh"

S = "${WORKDIR}"

SYSTEMD_PACKAGES = "${PN}"

SYSTEMD_SERVICE_${PN} = " compulab-init.service"

FILES_${PN} += "${systemd_system_unitdir}/compulab-init.service \
                ${bindir}/compulab-init.sh"

# Dynamic parameters
MSB_HOME_DIR_PATH ??= "/data/home/msb"
MSB_NODE_USER ??= "msb"
MSB_NODE_GROUP ??= "msb"
RAUC_VAR_DIR ?= "/data/var/rauc"
COMPULAB_APN ?= "m2m.tele2.com"


do_install() {
             
    # Replace parameters in script
    sed -i -e 's:@MSB_NODE_USER@:${MSB_NODE_USER}:g' ${WORKDIR}/compulab-init.sh
    sed -i -e 's:@MSB_NODE_GROUP@:${MSB_NODE_GROUP}:g' ${WORKDIR}/compulab-init.sh
    sed -i -e 's:@MSB_HOME_DIR_PATH@:${MSB_HOME_DIR_PATH}:g' ${WORKDIR}/compulab-init.sh
    sed -i -e 's:@RAUC_VAR_DIR@:${RAUC_VAR_DIR}:g' ${WORKDIR}/compulab-init.sh
    sed -i -e 's:@COMPULAB_APN@:${COMPULAB_APN}:g' ${WORKDIR}/compulab-init.sh

    # Install service file
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/compulab-init.service ${D}${systemd_system_unitdir}

    # Install script
    install -d ${D}${bindir}
    install -m 0550 ${WORKDIR}/compulab-init.sh ${D}${bindir}/
}

REQUIRED_DISTRO_FEATURES= "systemd"

