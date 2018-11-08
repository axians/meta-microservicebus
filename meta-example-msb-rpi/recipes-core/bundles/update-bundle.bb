inherit bundle

RDEPENDS_${PN} += "msb-image-rauc"

RAUC_BUNDLE_COMPATIBLE = "msb-rpi3-rauc"
RAUC_BUNDLE_VERSION = "1.1.5"

RAUC_BUNDLE_SLOTS = "rootfs"
RAUC_SLOT_rootfs[fstype] = "ext4"
RAUC_SLOT_rootfs = "msb-image-rauc"

RAUC_KEY_FILE = "/home/jonas/git/devtool/meta-microservicebus-node/meta-example-msb-rpi/recipes-core/rauc/files/demo.key.pem"
RAUC_CERT_FILE = "/home/jonas/git/devtool/meta-microservicebus-node/meta-example-msb-rpi/recipes-core/rauc/files/ca.cert.pem"
