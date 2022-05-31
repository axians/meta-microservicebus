# Recipe created by recipetool
SUMMARY = "Node.js package to access serial ports. Linux, OSX and Windows. Welcome your robotic JavaScript overlords. Better yet, program them!"

#DEPENDS += " libcdio libgcc glibc"
RDEPENDS:${PN} += " libcdio libgcc glibc"

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   node_modules/node-addon-api/LICENSE.md
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "MIT & Unknown"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/@serialport/binding-mock/LICENSE;md5=e51623d7e3b251d815956df4ea40c6b3 \
                    file://node_modules/@serialport/bindings-cpp/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/@serialport/bindings-cpp/node_modules/@serialport/bindings-interface/LICENSE;md5=e51623d7e3b251d815956df4ea40c6b3 \
                    file://node_modules/@serialport/bindings-interface/LICENSE;md5=e51623d7e3b251d815956df4ea40c6b3 \
                    file://node_modules/@serialport/parser-byte-length/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/@serialport/parser-cctalk/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/@serialport/parser-delimiter/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/@serialport/parser-inter-byte-timeout/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/@serialport/parser-packet-length/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/@serialport/parser-readline/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/@serialport/parser-ready/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/@serialport/parser-regex/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/@serialport/parser-slip-encoder/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/@serialport/parser-spacepacket/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/@serialport/stream/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/@serialport/stream/node_modules/@serialport/bindings-interface/LICENSE;md5=e51623d7e3b251d815956df4ea40c6b3 \
                    file://node_modules/debug/LICENSE;md5=d85a365580888e9ee0a01fb53e8e9bf0 \
                    file://node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/node-addon-api/LICENSE.md;md5=0492ef29a9d558a3e9660e7accc9ca6a \
                    file://node_modules/node-gyp-build/LICENSE;md5=bb7eae1c2fbb280c72665db9a1efc896"

SRC_URI = " \
    npm://registry.npmjs.org/;package=serialport;version=${PV} \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    "

S = "${WORKDIR}/npm"

inherit npm

LICENSE:${PN} = "MIT"
LICENSE:${PN}-serialport-binding-mock = "MIT"
LICENSE:${PN}-serialport-bindings-cpp-serialport-bindings-interface = "MIT"
LICENSE:${PN}-serialport-bindings-cpp = "MIT"
LICENSE:${PN}-serialport-bindings-interface = "MIT"
LICENSE:${PN}-serialport-parser-byte-length = "MIT"
LICENSE:${PN}-serialport-parser-cctalk = "MIT"
LICENSE:${PN}-serialport-parser-delimiter = "MIT"
LICENSE:${PN}-serialport-parser-inter-byte-timeout = "MIT"
LICENSE:${PN}-serialport-parser-packet-length = "MIT"
LICENSE:${PN}-serialport-parser-readline = "MIT"
LICENSE:${PN}-serialport-parser-ready = "MIT"
LICENSE:${PN}-serialport-parser-regex = "MIT"
LICENSE:${PN}-serialport-parser-slip-encoder = "MIT"
LICENSE:${PN}-serialport-parser-spacepacket = "MIT"
LICENSE:${PN}-serialport-stream-serialport-bindings-interface = "MIT"
LICENSE:${PN}-serialport-stream = "MIT"
LICENSE:${PN}-debug = "MIT"
LICENSE:${PN}-ms = "MIT"
LICENSE:${PN}-node-addon-api = "Unknown"
LICENSE:${PN}-node-gyp-build = "MIT"

# Workaround to fix qa errors in test code
INSANE_SKIP:${PN} = "already-stripped arch file-rdeps"
