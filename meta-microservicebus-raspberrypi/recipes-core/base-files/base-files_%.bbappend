FILESEXTRAPATHS_prepend := "${THISDIR}/base-files:"

SRC_URI_append = " \
  file://fstab \
  file://net.issue \
  "
do_install_append () {
  # Install extra network print out for /etc/issue
  install -d ${D}${sysconfdir}/issue.d
  install -m 0644 ${WORKDIR}/*.issue ${D}${sysconfdir}/issue.d
}