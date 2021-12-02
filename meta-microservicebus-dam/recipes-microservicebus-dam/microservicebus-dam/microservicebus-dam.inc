SUMMARY = "Device Access Management service for microServiceBus.com. Please visit https://microservicebus.com for more information."

HOMEPAGE = "https://microservicebus.com"

# Workaround to fix qa errors in test code
INSANE_SKIP_${PN} = "arch"

RDEPENDS_${PN} += " sudo bash"

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

