FILESEXTRAPATHS_append := "${THISDIR}/files:"
SRC_URI += "file://eth.network"

FILES_${PN} += "{sysconfdir}/systemd/network/*"

PACKAGECONFIG += "networkd resolved timesyncd hostnamed polkit myhostname"


do_install_append() {
  install -d ${D}${sysconfdir}/systemd/network/
  install -m 0644 ${WORKDIR}/*.network ${D}${sysconfdir}/systemd/network/
}