SUMMARY = "microServiceBus-node is the node.js based device agent used together with microServiceBus.com."

DESCRIPTION =  "microServiceBus.com is an integration platform for IoT and enterprise applications. \
                This platform lets you expose microservices from small devices and large systems using a remote hosting infrastructure. \
                These nodes can run on both Linux and Windows using components built either natively (ARM) or using node.js."

HOMEPAGE = "https://microservicebus.com"

# Fetch from NPM registry
SRC_URI = "npm://registry.npmjs.org;name=microservicebus-node;version=${PV}"

inherit npm

# Name of user for microServicebus
MSB_USER_ID ?= "350"

do_install_append(){
    set +e
    # Change owner of msb-node to set user, needed for msb-core install
    chown -f -R ${MSB_USER_ID}:${MSB_USER_ID} ${D}${libdir}/node/microservicebus-node/
    chown -f -R ${MSB_USER_ID}:${MSB_USER_ID} ${D}${nonarch_libdir}/node_modules/microservicebus-node/
}

# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/npmpkg"

RDEPENDS_${PN} += " python nodejs-npm sudo"
DEPENDS += " microservicebus-node-user"
