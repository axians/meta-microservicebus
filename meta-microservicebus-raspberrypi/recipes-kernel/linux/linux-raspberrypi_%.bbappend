FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://rauc.cfg \
            file://wifi.cfg"

KERNEL_MODULE_AUTOLOAD += " brcmfmac"