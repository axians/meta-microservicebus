# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "node.js node for microservicebus. Please visit https://microservicebus.com for more information."

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "npm://registry.npmjs.org;name=microservicebus-node;version=${PV}"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/npmpkg"

INSANE_SKIP_microservicebus-node-npm-node-gyp = "file-rdeps"
INSANE_SKIP_microservicebus-node-uuid = "file-rdeps"
INSANE_SKIP_microservicebus-node-npm = "file-rdeps"

DEPENDS += " bash nodejs"
