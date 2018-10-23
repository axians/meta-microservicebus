# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "D-bus protocol implementation in native javascript"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   node_modules/abstract-socket/node_modules/nan/LICENSE.md
#   node_modules/long/LICENSE
#   node_modules/xml2js/node_modules/sax/LICENSE
#   node_modules/hexy/LICENSE
#   node_modules/event-stream/node_modules/from/LICENSE.APACHE2
#   node_modules/event-stream/node_modules/pause-stream/LICENSE
#   node_modules/event-stream/node_modules/pause-stream/node_modules/through/LICENSE.APACHE2
#   node_modules/event-stream/node_modules/split/node_modules/through/LICENSE.APACHE2
#   node_modules/event-stream/node_modules/stream-combiner/node_modules/through/LICENSE.APACHE2
#   node_modules/event-stream/node_modules/through/LICENSE.APACHE2
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Unknown & Apache-2.0 & ISC & MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/abstract-socket/LICENSE;md5=34b1124f6512c77f5bf313a663beb85f \
                    file://node_modules/abstract-socket/node_modules/nan/LICENSE.md;md5=e6270b7774528599f2623a4aeb625829 \
                    file://node_modules/long/LICENSE;md5=d273d63619c9aeaf15cdaf76422c4f87 \
                    file://node_modules/xml2js/LICENSE;md5=3e9c860b4db024104ec031caa97a73ab \
                    file://node_modules/xml2js/node_modules/sax/LICENSE;md5=326d5674181c4bb210e424772c60fa80 \
                    file://node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/put/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/hexy/LICENSE;md5=5b9dd4be4addf4633440307f14dfcee8 \
                    file://node_modules/optimist/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/optimist/node_modules/wordwrap/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/optimist/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/event-stream/LICENCE;md5=f45c7572cc474604287b60d5e5f80f8f \
                    file://node_modules/event-stream/node_modules/from/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/event-stream/node_modules/from/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/event-stream/node_modules/pause-stream/LICENSE;md5=e84e358937c41144f40fe5dcb85d0930 \
                    file://node_modules/event-stream/node_modules/pause-stream/node_modules/through/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/event-stream/node_modules/pause-stream/node_modules/through/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/event-stream/node_modules/split/LICENCE;md5=84ddd974e10adfabbf232e7efb7ed715 \
                    file://node_modules/event-stream/node_modules/split/node_modules/through/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/event-stream/node_modules/split/node_modules/through/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/event-stream/node_modules/stream-combiner/LICENSE;md5=a6a4d0fd1bedfc3135e80ba0a71c0f84 \
                    file://node_modules/event-stream/node_modules/stream-combiner/node_modules/duplexer/LICENCE;md5=8966d3100f2d871ee216d056c0ea0160 \
                    file://node_modules/event-stream/node_modules/stream-combiner/node_modules/through/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/event-stream/node_modules/stream-combiner/node_modules/through/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/event-stream/node_modules/flatmap-stream/LICENSE.txt;md5=60ac0b36ad9ecee1dffd044e2b1a1f2f \
                    file://node_modules/event-stream/node_modules/duplexer/LICENCE;md5=8966d3100f2d871ee216d056c0ea0160 \
                    file://node_modules/event-stream/node_modules/through/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/event-stream/node_modules/through/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/event-stream/node_modules/map-stream/LICENCE;md5=f45c7572cc474604287b60d5e5f80f8f"

SRC_URI = "npm://registry.npmjs.org;name=dbus-native;version=${PV};"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

NPMPN = "dbus-native"

inherit npm

# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/npmpkg"
LICENSE_${PN}-abstract-socket-bindings = "MIT"
LICENSE_${PN}-abstract-socket-nan = "MIT"
LICENSE_${PN}-abstract-socket = "MIT"
LICENSE_${PN}-event-stream-duplexer = "MIT"
LICENSE_${PN}-event-stream-flatmap-stream = "MIT"
LICENSE_${PN}-event-stream-from = "Unknown MIT"
LICENSE_${PN}-event-stream-map-stream = "MIT"
LICENSE_${PN}-event-stream-pause-stream-through = "Unknown MIT"
LICENSE_${PN}-event-stream-pause-stream = "MIT"
LICENSE_${PN}-event-stream-split-through = "Unknown MIT"
LICENSE_${PN}-event-stream-split = "MIT"
LICENSE_${PN}-event-stream-stream-combiner-duplexer = "MIT"
LICENSE_${PN}-event-stream-stream-combiner-through = "Unknown MIT"
LICENSE_${PN}-event-stream-stream-combiner = "MIT"
LICENSE_${PN}-event-stream-through = "Unknown MIT"
LICENSE_${PN}-event-stream = "MIT"
LICENSE_${PN}-hexy = "MIT"
LICENSE_${PN}-long = "Apache-2.0"
LICENSE_${PN}-optimist-minimist = "MIT"
LICENSE_${PN}-optimist-wordwrap = "MIT"
LICENSE_${PN}-optimist = "MIT"
LICENSE_${PN}-put = "MIT"
LICENSE_${PN}-safe-buffer = "MIT"
LICENSE_${PN}-xml2js-sax = "ISC"
LICENSE_${PN}-xml2js = "MIT"
LICENSE_${PN} = "MIT"


