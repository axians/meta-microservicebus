FILESEXTRAPATHS_prepend := "${THISDIR}/base-files:"

SRC_URI_append = " \
  file://fstab \
  file://auto.sh \
  "
do_install_append () {
    install -d ${D}${sysconfdir}/profile.d/
    install -m 0755 ${WORKDIR}/auto.sh ${D}${sysconfdir}/profile.d/auto.sh
}

FILES_${PN} += "${sysconfdir}/profile.d/auto.sh"
