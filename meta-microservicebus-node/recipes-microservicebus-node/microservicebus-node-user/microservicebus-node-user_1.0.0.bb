SUMMARY = "Manage users for microservicebus"
DESCRIPTION = "Create user for microservicebus-node"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

# Name of user for microServicebus
MSB_NODE_USER ?= "msb"
# Specify home directory for msb user, default empty meaning it will be set to default for useradd
MSB_HOME_DIR_PATH ?= ""
# Specify users groups
MSB_USER_GROUPS ?= "tty,dialout"

S = "${WORKDIR}"

EXCLUDE_FROM_WORLD = "1"

inherit useradd

USERADD_PACKAGES = "${PN}"

# If no home directory is specified useradd will set to create one in default path normaly </home/>
# Else if an custom directory is specified useradd will be set to not create the directory only
# point the users home directory to the custom directory
MSB_CREATE_HOME = "${@oe.utils.conditional('MSB_HOME_DIR_PATH', '', '-m', '-M -d ' + d.getVar('MSB_HOME_DIR_PATH'), d)}"

# Create msb user
USERADD_PARAM_${PN} = "-u 1200 -c microServiceBus ${MSB_CREATE_HOME} -U -G ${MSB_USER_GROUPS} -r -s /bin/nologin ${MSB_NODE_USER}"

do_install () {
	install -d -m 755 ${D}${datadir}/${MSB_NODE_USER}
	chown -R ${MSB_NODE_USER} ${D}${datadir}/${MSB_NODE_USER}
}

FILES_${PN} = "${datadir}/${MSB_NODE_USER}"

# Prevents do_package failures with:
# debugsources.list: No such file or directory:
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"