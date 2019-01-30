inherit systemd

SUMMARY = "Install and start microservicebus as systemd service"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

#here we specify the source we want to build
SRC_URI += "file://microservicebus-node.service"
#here we specify the source directory, where we can do all the building and expect sources to be placed
S = "${WORKDIR}"

SYSTEMD_PACKAGES = "${PN}"

SYSTEMD_SERVICE_${PN} = " microservicebus-node.service"

FILES_${PN} += "${systemd_system_unitdir}/microservicebus-node.service"

#bitbake task
#created a directory /home/root for target install the script
do_install() {

             install -d ${D}${systemd_system_unitdir}
             install -m 0644 ${WORKDIR}/microservicebus.service ${D}${systemd_system_unitdir}
}

REQUIRED_DISTRO_FEATURES= "systemd"