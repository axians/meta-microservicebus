FILESEXTRAPATHS_prepend := "${THISDIR}/base-files:"

SRC_URI_append = " \
  file://fstab \
  file://auto.sh \
  file://dmidecode \
  file://dot.bashrc \
  "
RDEPENDS_${PN} += " bash"

do_install_append () {
    install -d ${D}${sysconfdir}/profile.d/
    install -m 0755 ${WORKDIR}/auto.sh ${D}${sysconfdir}/profile.d/auto.sh
    install -m 0755 ${WORKDIR}/dmidecode ${D}${sbindir}/dmidecode
    install -m 0755 ${WORKDIR}/dot.bashrc ${D}${sysconfdir}/skel/.bashrc
}

FILES_${PN} += "${sysconfdir}/profile.d/auto.sh"
FILES_${PN} += "${sbindir}/dmidecode"


