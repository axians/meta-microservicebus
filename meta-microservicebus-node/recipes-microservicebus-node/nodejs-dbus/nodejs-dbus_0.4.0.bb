# Recipe created by recipetool
SUMMARY = "D-bus protocol implementation in native javascript"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   node_modules/from/LICENSE.APACHE2
#   node_modules/pause-stream/LICENSE
#   node_modules/sax/LICENSE
#   node_modules/through/LICENSE.APACHE2
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Apache-2.0 & MIT & Unknown"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a6df4eaa6c6a1471228755d06f2494cf \
                    file://node_modules/abstract-socket/LICENSE;md5=34b1124f6512c77f5bf313a663beb85f \
                    file://node_modules/bindings/LICENSE.md;md5=471723f32516f18ef36e7ef63580e4a8 \
                    file://node_modules/duplexer/LICENCE;md5=8966d3100f2d871ee216d056c0ea0160 \
                    file://node_modules/event-stream/LICENCE;md5=f45c7572cc474604287b60d5e5f80f8f \
                    file://node_modules/file-uri-to-path/LICENSE;md5=9513dc0b97137379cfabc81b60889174 \
                    file://node_modules/from/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/from/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/hexy/LICENSE;md5=5b9dd4be4addf4633440307f14dfcee8 \
                    file://node_modules/long/LICENSE;md5=d273d63619c9aeaf15cdaf76422c4f87 \
                    file://node_modules/map-stream/LICENCE;md5=f45c7572cc474604287b60d5e5f80f8f \
                    file://node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/nan/LICENSE.md;md5=3952ff1c51e4ebe5b12c1bc501de4683 \
                    file://node_modules/optimist/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/pause-stream/LICENSE;md5=e84e358937c41144f40fe5dcb85d0930 \
                    file://node_modules/put/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/sax/LICENSE;md5=326d5674181c4bb210e424772c60fa80 \
                    file://node_modules/split/LICENCE;md5=84ddd974e10adfabbf232e7efb7ed715 \
                    file://node_modules/stream-combiner/LICENSE;md5=a6a4d0fd1bedfc3135e80ba0a71c0f84 \
                    file://node_modules/through/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/through/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/wordwrap/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/xml2js/LICENSE;md5=d9fc599c8d9e6f8665063862aac66dfc \
                    file://node_modules/xmlbuilder/LICENSE;md5=f2836c06c74eca0f4565de06fe9900b0"

SRC_URI = " \
    npm://registry.npmjs.org/;package=dbus-native;version=${PV} \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    "

S = "${WORKDIR}/npm"

inherit npm

LICENSE:${PN} = "MIT"
LICENSE:${PN}-abstract-socket = "MIT"
LICENSE:${PN}-bindings = "MIT"
LICENSE:${PN}-duplexer = "MIT"
LICENSE:${PN}-event-stream = "MIT"
LICENSE:${PN}-file-uri-to-path = "MIT"
LICENSE:${PN}-from = "MIT & Unknown"
LICENSE:${PN}-hexy = "MIT"
LICENSE:${PN}-long = "Apache-2.0"
LICENSE:${PN}-map-stream = "MIT"
LICENSE:${PN}-minimist = "MIT"
LICENSE:${PN}-nan = "MIT"
LICENSE:${PN}-optimist = "MIT"
LICENSE:${PN}-pause-stream = "Unknown"
LICENSE:${PN}-put = "MIT"
LICENSE:${PN}-safe-buffer = "MIT"
LICENSE:${PN}-sax = "Unknown"
LICENSE:${PN}-split = "MIT"
LICENSE:${PN}-stream-combiner = "MIT"
LICENSE:${PN}-through = "MIT & Unknown"
LICENSE:${PN}-wordwrap = "MIT"
LICENSE:${PN}-xml2js = "MIT"
LICENSE:${PN}-xmlbuilder = "MIT"

# Workaround to fix qa errors in test code
INSANE_SKIP:${PN} = "arch"
