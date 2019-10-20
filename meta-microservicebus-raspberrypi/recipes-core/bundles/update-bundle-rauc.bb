inherit bundle

RAUC_BUNDLE_COMPATIBLE = "${MACHINE}-msb-rauc"
RAUC_BUNDLE_VERSION = "2.0.0"

RAUC_BUNDLE_SLOTS = "rootfs"
RAUC_SLOT_rootfs[fstype] = "ext4"
RAUC_SLOT_rootfs = "msb-image-rauc"

RAUC_KEY_FILE = "${MSB_RASPBERRYPI_LAYERDIR}/recipes-core/rauc/files/demo.key.pem"
RAUC_CERT_FILE = "${MSB_RASPBERRYPI_LAYERDIR}/recipes-core/rauc/files/ca.cert.pem"
