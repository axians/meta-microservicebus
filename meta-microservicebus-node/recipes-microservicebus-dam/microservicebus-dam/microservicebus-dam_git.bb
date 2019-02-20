# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Device Access Management service for microServiceBus.com. Please visit https://microservicebus.com for more information."
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://node_modules/follow-redirects/LICENSE;md5=2913574e921aefe1275cd5864b4f9b66 \
                    file://node_modules/follow-redirects/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/follow-redirects/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6"

SRC_URI = "git://github.com/axians/microservicebus-dam.git;user=git;protocol=ssh;branch=dev \
           npm://registry.npmjs.org;name=follow-redirects;version=1.7.0;subdir=node_modules/follow-redirects \
           "

# Modify these as desired
PV = "1.1.0"
# +git${SRCPV}"
SRCREV = "703f8e438b1ab83ea51d830f3ba42534a0b2d5d2"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/git"
LICENSE_${PN}-follow-redirects-debug-ms = "MIT"
LICENSE_${PN}-follow-redirects-debug = "MIT"
LICENSE_${PN}-follow-redirects = "MIT"
LICENSE_${PN} = "MIT"

RDEPENDS_${PN} += " modemmanager dmidecode sudo"

# example followed from http://cgit.openembedded.org/openembedded-core/tree/meta-skeleton/recipes-skeleton/useradd/useradd-example.bb.
#
inherit useradd

USERADD_PACKAGES = "${PN}"

# GROUPADD_PARAM works the same way, which you set to the options
# you'd normally pass to the groupadd command. This will create
# groups group1 and group2:
GROUPADD_PARAM_${PN} = "-g 800 msbdam"

# create /var/lib/dam
# set ownership + sticky-bit

do_install_append () {
  install -d -o root -g msbdam ${D}/run/dam
  rm -Rf ${D}/usr/lib/node_modules/microservicebus-dam/{.eslintrc.js,logo.png,microservicebus-dam-*.tgz,snap}
}

FILES_${PN} += "/run/dam"

