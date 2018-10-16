SUMMARY = "Replace default configfile for u-boot fw-utils"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI_append = "file://fw_env.config"

do_install () {
	install -d ${D}${sysconfdir}
	install -m 0644 ${WORKDIR}/fw_env.config ${D}${sysconfdir}/fw_env.config
}