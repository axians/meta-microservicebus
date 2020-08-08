inherit systemd

SUMMARY = "Install and start DAM Scheduled Poller as a systemd service"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

#here we specify the source we want to build
SRC_URI += "file://${THISDIR}/microservicebus-dam-scheduled.service"
#here we specify the source directory, where we can do all the building and expect sources to be placed
S = "${WORKDIR}"

SYSTEMD_PACKAGES = "${PN}"

SYSTEMD_SERVICE_${PN} = " microservicebus-dam-scheduled.service"

FILES_${PN} += "${systemd_system_unitdir}/microservicebus-dam-scheduled.service"
MSB_NODE_HOST ?= "microservicebus.com"

#bitbake task
#created a directory /home/root for target install the script
do_install() {

             install -d ${D}${systemd_system_unitdir}
             install -m 0644 ${THISDIR}/microservicebus-dam-scheduled.service ${D}${systemd_system_unitdir}
	     sed -i -e 's:@MSB_NODE_HOST@:${MSB_NODE_HOST}:g' ${THISDIR}/microservicebus-dam-scheduled.service
}

REQUIRED_DISTRO_FEATURES= "systemd"

