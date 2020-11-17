inherit systemd

SUMMARY = "Install and start DAM as systemd service"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

#here we specify the source we want to build
SRC_URI += "file://${THISDIR}/microservicebus-dam.service"
#here we specify the source directory, where we can do all the building and expect sources to be placed
S = "${WORKDIR}"

SYSTEMD_PACKAGES = "${PN}"

SYSTEMD_SERVICE_${PN} = " microservicebus-dam.service"

FILES_${PN} += "${systemd_system_unitdir}/microservicebus-dam.service"

#Dynamic parameters for service file, set default values
MSB_NODE_HOST ?= "microservicebus.com"

#bitbake task
#created a directory /home/root for target install the script
do_install() {
	sed -i -e 's:@MSB_NODE_HOST@:${MSB_NODE_HOST}:g' ${THISDIR}/microservicebus-dam.service
	install -d ${D}${systemd_system_unitdir}
	install -m 0644 ${THISDIR}/microservicebus-dam.service ${D}${systemd_system_unitdir}
}

REQUIRED_DISTRO_FEATURES= "systemd"

