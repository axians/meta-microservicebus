FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI_append = " \
  file://10-gpio.rules \
  "
do_install_append () {
    install -d ${D}${sysconfdir}/udev/rules.d/
    install -m 0755 ${WORKDIR}/10-gpio.rules ${D}${sysconfdir}/udev/rules.d/10-gpio.rules
}

# Add gpio user group
inherit useradd
USERADD_PACKAGES = "${PN}"
GROUPADD_PARAM_${PN} = "-g 810 gpio"

FILES_${PN} += "${sysconfdir}/udev/rules.d/10-gpio.rules"

