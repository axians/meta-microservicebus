inherit bundle

RAUC_BUNDLE_COMPATIBLE = "${MACHINE}-msb-rauc"
RAUC_BUNDLE_VERSION = "2.0.30"
RAUC_BUNDLE_DESCRIPTION = "microServiceBus bundle built for ${MACHINE}"

RAUC_BUNDLE_SLOTS = "rootfs"
RAUC_SLOT_rootfs[fstype] = "ext4"
RAUC_SLOT_rootfs = "core-image-full-cmdline"

RAUC_KEY_FILE = "${MSB_CL-SOM-IMX7_LAYERDIR}/recipes-core/rauc/files/demo.key.pem"
RAUC_CERT_FILE = "${MSB_CL-SOM-IMX7_LAYERDIR}/recipes-core/rauc/files/ca.cert.pem"
