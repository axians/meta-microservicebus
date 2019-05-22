FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " file://wpa_supplicant-wlan0.conf"

FILES_${PN} += "${sysconfdir}/wpa_supplicant/wpa_supplicant-wlan0.conf"

RPI_WIFI_SSID ?= "ssid"
RPI_WIFI_PSK ?= "psk"

do_install_append() {

  # Replace settings in conf file
  sed -i -e 's:@RPI_WIFI_SSID@:${RPI_WIFI_SSID}:g' ${WORKDIR}/wpa_supplicant-wlan0.conf
	sed -i -e 's:@RPI_WIFI_PSK@:${RPI_WIFI_PSK}:g' ${WORKDIR}/wpa_supplicant-wlan0.conf

  install -d ${D}${sysconfdir}/wpa_supplicant
	install -m 0755 ${WORKDIR}/wpa_supplicant-wlan0.conf ${D}${sysconfdir}/wpa_supplicant/wpa_supplicant-wlan0.conf

  # Make sure the system directory for systemd exists.
  install -d ${D}${sysconfdir}/systemd/system/multi-user.target.wants/

  # Link the service file for autostart.
  ln -s ${systemd_unitdir}/system/wpa_supplicant@.service \
        ${D}${sysconfdir}/systemd/system/multi-user.target.wants/wpa_supplicant@wlan0.service

}
