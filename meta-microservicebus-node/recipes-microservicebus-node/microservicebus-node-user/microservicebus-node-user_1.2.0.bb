SUMMARY = "Manage users for microservicebus"
DESCRIPTION = "Create user for microservicebus-node"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

# Sudoers file for microservicebus user group
SRC_URI += "file://microservicebus-node-sudoers"

# Name of user for microServicebus
MSB_NODE_USER ?= "msb"
# Name of user group for microServicebus
MSB_NODE_GROUP ?= "msb"
# Specify home directory for msb user, default empty meaning it will be set to default for useradd
MSB_HOME_DIR_PATH ?= ""
# Specify users groups
MSB_USER_GROUPS ?= "tty,dialout"
# Specify users uid
MSB_USER_UID ?= "350"

# Conditional dependencies on microservicebus-dam
MSB_DEP ?= ""

S = "${WORKDIR}"

EXCLUDE_FROM_WORLD = "1"

inherit useradd

USERADD_PACKAGES = "${PN}"

# If no home directory is specified useradd will set to create one in default path normaly </home/>
# Else if an custom directory is specified useradd will be set to not create the directory only
# point the users home directory to the custom directory
MSB_CREATE_HOME = "${@oe.utils.conditional('MSB_HOME_DIR_PATH', '', '-m', '-M -d ' + d.getVar('MSB_HOME_DIR_PATH'), d)}"

# Create msb user
USERADD_PARAM_${PN} = "-u ${MSB_USER_UID} -c microServiceBus ${MSB_CREATE_HOME} -U -G ${MSB_USER_GROUPS} -r -s /bin/nologin ${MSB_NODE_USER}"

do_install () {

	# Replace microservicebus parameters
	sed -i -e 's:@MSB_NODE_GROUP@:${MSB_NODE_GROUP}:g' ${WORKDIR}/microservicebus-node-sudoers

	# Install sudoers file
	install -d ${D}${sysconfdir}/sudoers.d/
	install -m 0644 ${WORKDIR}/microservicebus-node-sudoers ${D}${sysconfdir}/sudoers.d/
}

FILES_${PN} = "${sysconfdir}/sudoers.d/"

# Prevents do_package failures with:
# debugsources.list: No such file or directory:
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

# If dependant on other recepies or groups...
# In config set: MSB_DEP = "microservicebus-dam docker-ce gpio"
DEPENDS += " ${MSB_DEP}"