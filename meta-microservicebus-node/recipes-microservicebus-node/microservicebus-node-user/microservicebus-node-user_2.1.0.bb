SUMMARY = "Manage users for microservicebus"
DESCRIPTION = "Create user for microservicebus-node"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

# Sudoers file for microservicebus user group
SRC_URI += "file://microservicebus-node-sudoers \
	    file://superuser"


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

MSB_ENABLE_SU ?= "FALSE"
MSB_SU_NAME ?= "msbsu"
#MSB_SU_PASSWORD ?= Set password from local.conf using extrauser, problem with useradd and not DES as hash. 

# Conditional dependencies
MSB_DEP ?= ""

S = "${WORKDIR}"
DEPENDS += "openssl-native"
RDEPENDS_${PN} += " sudo"
EXCLUDE_FROM_WORLD = "1"

inherit useradd

USERADD_PACKAGES = "${PN}"

# If no home directory is specified useradd will set to create one in default path normaly </home/>
# Else if an custom directory is specified useradd will be set to not create the directory only
# point the users home directory to the custom directory
MSB_CREATE_HOME = "${@oe.utils.conditional('MSB_HOME_DIR_PATH', '', '-m', '-M -d ' + d.getVar('MSB_HOME_DIR_PATH'), d)}"

#Append MSB_CREATE_SU:
MSB_CREATE_SU = "${@oe.utils.conditional('MSB_ENABLE_SU', 'TRUE', ';-u 360 -d /home/' + d.getVar('MSB_SU_NAME') + ' -r -m -s /bin/bash ' + d.getVar('MSB_SU_NAME') + '', '', d)}"

# Create msb user
USERADD_PARAM_${PN} = "-u ${MSB_USER_UID} -c microServiceBus ${MSB_CREATE_HOME} -U -G ${MSB_USER_GROUPS} -r -s /bin/nologin ${MSB_NODE_USER} ${MSB_CREATE_SU}"

# We don't want to own parent dir
DIRFILES = "1"

do_install () {

	# Replace microservicebus parameters
	sed -i -e 's:@MSB_NODE_GROUP@:${MSB_NODE_GROUP}:g' ${WORKDIR}/microservicebus-node-sudoers

	# Install sudoers file
	install -d ${D}${sysconfdir}/sudoers.d/
	install -m 0644 ${WORKDIR}/microservicebus-node-sudoers ${D}${sysconfdir}/sudoers.d/

	# Install msbsu file
	sed -i -e 's:@MSB_SU_NAME@:${MSB_SU_NAME}:g' ${WORKDIR}/superuser
	install -m 0644 ${WORKDIR}/superuser ${D}${sysconfdir}/sudoers.d/
}

FILES_${PN} = "${sysconfdir}/sudoers.d/"

# Prevents do_package failures with:
# debugsources.list: No such file or directory:
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

# If dependant on other recepies or groups...
# In config set: MSB_DEP = "microservicebus-dam docker-ce gpio"
DEPENDS += " ${MSB_DEP}"
