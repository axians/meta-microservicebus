inherit systemd

SUMMARY = "Install and start DAM as systemd service"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI += "file://microservicebus-dam.service"

S = "${WORKDIR}"

SYSTEMD_PACKAGES = "${PN}"

SYSTEMD_SERVICE_${PN} = " microservicebus-dam.service"

FILES_${PN} += "${systemd_system_unitdir}/microservicebus-dam.service"

#Dynamic parameters for service file, set default values
MSB_NODE_HOST ??= "microservicebus.com"

do_install() {

             #Replace parameters in service file
	     sed -i -e 's:@MSB_NODE_HOST@:${MSB_NODE_HOST}:g' ${WORKDIR}/microservicebus-dam.service

             #Install service file
             install -d ${D}${systemd_system_unitdir}
             install -m 0644 ${WORKDIR}/microservicebus-dam.service ${D}${systemd_system_unitdir}
}

REQUIRED_DISTRO_FEATURES= "systemd"
