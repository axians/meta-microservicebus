inherit systemd
inherit features_check

SUMMARY = "Install init script for Intel NUC gateway"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI += "file://msb-initscript.service \
            file://msb-initscript.sh \
            file://dot.bashrc \
            "

S = "${WORKDIR}"

SYSTEMD_PACKAGES = "${PN}"

SYSTEMD_SERVICE_${PN} = " msb-initscript.service"

FILES_${PN} += "${systemd_system_unitdir}/msb-initscript.service \
                ${bindir}/msb-initscript.sh"

# Dynamic parameters
MSB_HOME_DIR_PATH ??= "/data/home/msb"
MSB_NODE_USER ??= "msb"
MSB_NODE_GROUP ??= "msb"
IOTEDGE ??= "FALSE"

do_install() {
             
    # Replace parameters in script
    sed -i -e 's:@MSB_NODE_USER@:${MSB_NODE_USER}:g' ${WORKDIR}/msb-initscript.sh
    sed -i -e 's:@MSB_NODE_GROUP@:${MSB_NODE_GROUP}:g' ${WORKDIR}/msb-initscript.sh
    sed -i -e 's:@MSB_HOME_DIR_PATH@:${MSB_HOME_DIR_PATH}:g' ${WORKDIR}/msb-initscript.sh
    sed -i -e 's:@IOTEDGE@:${IOTEDGE}:g' ${WORKDIR}/msb-initscript.sh

    # Install service file
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/msb-initscript.service ${D}${systemd_system_unitdir}

    # Install script
    install -d ${D}${bindir}
    install -m 0550 ${WORKDIR}/msb-initscript.sh ${D}${bindir}/

    # Install bashrc file
    sed -i -e 's:@RAUC_BUNDLE_VERSION@:${RAUC_BUNDLE_VERSION}:g' ${WORKDIR}/dot.bashrc
    install -d ${D}${sysconfdir}/profile.d/
    install -m 0755 ${WORKDIR}/dot.bashrc ${D}${sysconfdir}/skel/.bashrc
    install -m 0755 ${WORKDIR}/dot.bashrc ${D}${ROOT_HOME}/.bashrc
}

REQUIRED_DISTRO_FEATURES= "systemd"
RDEPENDS_${PN} += " bash iptables"

