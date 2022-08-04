SUMMARY = "microServiceBus-node is the node.js based device agent used together with microServiceBus.com."

DESCRIPTION =  "microServiceBus.com is an integration platform for IoT and enterprise applications. \
                This platform lets you expose microservices from small devices and large systems using a remote hosting infrastructure. \
                These nodes can run on both Linux and Windows using components built either natively (ARM) or using node.js."

HOMEPAGE = "https://microservicebus.com"

# Fetch from NPM registry
SRC_URI = " \
    npm://registry.npmjs.org/;name=cute-files;version=${PV};package=microservicebus-node \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap_${PV}.json \
    "
inherit npm

# Name of user for microServicebus
MSB_NODE_USER ?= "msb"

do_install_append(){
    # Change owner of msb-node to set user, needed for msb-core install
	chown -R ${MSB_NODE_USER} ${D}${nonarch_libdir}/node/microservicebus-node/
}

# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/npm"

RDEPENDS_${PN} += " python nodejs-npm sudo"
DEPENDS += " microservicebus-node-user"
