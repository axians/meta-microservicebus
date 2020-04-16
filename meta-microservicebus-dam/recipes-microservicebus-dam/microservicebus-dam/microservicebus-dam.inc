SUMMARY = "Device Access Management service for microServiceBus.com. Please visit https://microservicebus.com for more information."

HOMEPAGE = "https://microservicebus.com"

# Fetch from NPM registry
SRC_URI = "npm://registry.npmjs.org/;name=microservicebus-dam;version=${PV}"

inherit npm

# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/npmpkg"

# Workaround to fix qa errors in test code
INSANE_SKIP_${PN}-put = "arch"

RDEPENDS_${PN} += " dmidecode sudo bash"

# Add msbdam user group
inherit useradd

USERADD_PACKAGES = "${PN}"

GROUPADD_PARAM_${PN} = "-g 800 msbdam"

# create /var/lib/dam
# set ownership + sticky-bit
do_install_append () {
  install -d -o root -g msbdam ${D}/run/dam
  rm -Rf ${D}/usr/lib/node/microservicebus-dam/{.eslintrc.js,logo.png,microservicebus-dam-*.tgz,snap}
}

FILES_${PN} += "/run/dam"
