inherit bundle

RAUC_BUNDLE_COMPATIBLE = "msb-rpi3-rauc"
RAUC_BUNDLE_VERSION ?= "v2018-10-16-1"

RAUC_BUNDLE_SLOTS = "rootfs"
RAUC_SLOT_rootfs[fstype] = "ext4"
RAUC_SLOT_rootfs = "msb-image-rauc"

RAUC_KEY_FILE = "/home/jonas/git/poky-sumo/meta-microservicebus-node/recipes-core/rauc/files/demo.key.pem"
RAUC_CERT_FILE = "/home/jonas/git/poky-sumo/meta-microservicebus-node/recipes-core/rauc/files/ca.cert.pem"
