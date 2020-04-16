FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = " \
  file://ca.cert.pem \
  "

SRC_URI_append_cl-som-imx7 = " \
  file://cl-som-imx7/system.conf \
  "