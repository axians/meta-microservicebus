FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = " \
  file://ca.cert.pem \
  "

# Use different RAUC conf files for different machines
SRC_URI_append_raspberrypi3 = " \
  file://raspberrypi3/system.conf \
  "
  