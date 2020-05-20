FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
	file://rauc.cfg \
	file://docker.cfg \
	"

do_configure_append () {
	cat ../rauc.cfg >> ${B}/.config
	cat ../docker.cfg >> ${B}/.config
}
