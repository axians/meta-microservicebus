SUMMARY = "Manage users for microservicebus"
DESCRIPTION = "Create user for microservicebus-node"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

S = "${WORKDIR}"

EXCLUDE_FROM_WORLD = "1"

inherit useradd

USERADD_PACKAGES = "${PN}"

# You must also set USERADD_PARAM and/or GROUPADD_PARAM when
# you inherit useradd.

# USERADD_PARAM specifies command line options to pass to the
# useradd command. Multiple users can be created by separating
# the commands with a semicolon. Here we'll create two users,
# user1 and user2:
USERADD_PARAM_${PN} = "-ou 0 -g 0 -d /mnt/mmc/home/msbsrv -p msbsrv347g% msbsrv"

do_install () {
	install -d -m 755 ${D}${datadir}/msbsrv

	# The new users and groups are created before the do_install
	# step, so you are now free to make use of them:
	chown -R msbsrv ${D}${datadir}/msbsrv
}

FILES_${PN} = "${datadir}/msbsrv/"

# Prevents do_package failures with:
# debugsources.list: No such file or directory:
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"