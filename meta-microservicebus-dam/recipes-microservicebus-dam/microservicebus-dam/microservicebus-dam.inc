SUMMARY = "Device Access Management service for microServiceBus.com. Please visit https://microservicebus.com for more information."

HOMEPAGE = "https://microservicebus.com"

# Workaround to fix qa errors in test code
INSANE_SKIP:${PN} = "arch"

RDEPENDS:${PN} += " sudo bash"

# Add msbdam user group
inherit useradd

USERADD_PACKAGES = "${PN}"

GROUPADD_PARAM:${PN} = "-g 800 msbdam"

# create /var/lib/dam
# set ownership + sticky-bit
do_install:append () {
    install -d -o root -g msbdam ${D}/run/dam
    rm -Rf ${D}/usr/lib/node/microservicebus-dam/{.eslintrc.js,logo.png,microservicebus-dam-*.tgz,snap}
}

FILES:${PN} += "/run/dam"

# Removing /run from the empty dir list (https://git.yoctoproject.org/poky/plain/meta/classes/insane.bbclass)
QA_EMPTY_DIRS:remove = "/run"
