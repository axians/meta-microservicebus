FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = " \
  file://system.conf \
  file://ca.cert.pem \
  "