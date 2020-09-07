require microservicebus-dam.inc

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap_${PV}.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown_${PV}.json"

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "ISC & Apache-2.0 & MIT"
LIC_FILES_CHKSUM = " \
                    file://node_modules/dbus-native/LICENSE;md5=a6df4eaa6c6a1471228755d06f2494cf \
                    file://node_modules/through/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/through/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/long/LICENSE;md5=d273d63619c9aeaf15cdaf76422c4f87 \
                    file://node_modules/map-stream/LICENCE;md5=f45c7572cc474604287b60d5e5f80f8f \
                    file://node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/xml2js/LICENSE;md5=d9fc599c8d9e6f8665063862aac66dfc \
                    file://node_modules/pause-stream/LICENSE;md5=e84e358937c41144f40fe5dcb85d0930 \
                    file://node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/abstract-socket/LICENSE;md5=34b1124f6512c77f5bf313a663beb85f \
                    file://node_modules/file-uri-to-path/LICENSE;md5=9513dc0b97137379cfabc81b60889174 \
                    file://node_modules/stream-combiner/LICENSE;md5=a6a4d0fd1bedfc3135e80ba0a71c0f84 \
                    file://node_modules/sax/LICENSE;md5=326d5674181c4bb210e424772c60fa80 \
                    file://node_modules/split/LICENCE;md5=84ddd974e10adfabbf232e7efb7ed715 \
                    file://node_modules/optimist/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/follow-redirects/LICENSE;md5=2913574e921aefe1275cd5864b4f9b66 \
                    file://node_modules/hexy/LICENSE;md5=5b9dd4be4addf4633440307f14dfcee8 \
                    file://node_modules/put/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/bindings/LICENSE.md;md5=471723f32516f18ef36e7ef63580e4a8 \
                    file://node_modules/xmlbuilder/LICENSE;md5=f2836c06c74eca0f4565de06fe9900b0 \
                    file://node_modules/wordwrap/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/event-stream/LICENCE;md5=f45c7572cc474604287b60d5e5f80f8f \
                    file://node_modules/from/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/from/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/nan/LICENSE.md;md5=e6270b7774528599f2623a4aeb625829 \
                    file://node_modules/duplexer/LICENCE;md5=8966d3100f2d871ee216d056c0ea0160 \
                    file://node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://LICENSE;md5=cc883f74a12beac0fd9a1809032541d0 \
                    "

LICENSE_${PN}-dbus-native-abstract-socket-bindings-file-uri-to-path = "MIT"
LICENSE_${PN}-dbus-native-abstract-socket-bindings = "MIT"
LICENSE_${PN}-dbus-native-abstract-socket-nan = "MIT"
LICENSE_${PN}-dbus-native-abstract-socket = "MIT"
LICENSE_${PN}-dbus-native-event-stream-duplexer = "MIT"
LICENSE_${PN}-dbus-native-event-stream-from = "MIT"
LICENSE_${PN}-dbus-native-event-stream-map-stream = "MIT"
LICENSE_${PN}-dbus-native-event-stream-pause-stream-through = "MIT"
LICENSE_${PN}-dbus-native-event-stream-pause-stream = "MIT"
LICENSE_${PN}-dbus-native-event-stream-split-through = "MIT"
LICENSE_${PN}-dbus-native-event-stream-split = "MIT"
LICENSE_${PN}-dbus-native-event-stream-stream-combiner-duplexer = "MIT"
LICENSE_${PN}-dbus-native-event-stream-stream-combiner-through = "MIT"
LICENSE_${PN}-dbus-native-event-stream-stream-combiner = "MIT"
LICENSE_${PN}-dbus-native-event-stream-through = "MIT"
LICENSE_${PN}-dbus-native-event-stream = "MIT"
LICENSE_${PN}-dbus-native-hexy = "MIT"
LICENSE_${PN}-dbus-native-long = "Apache-2.0"
LICENSE_${PN}-dbus-native-optimist-minimist = "MIT"
LICENSE_${PN}-dbus-native-optimist-wordwrap = "MIT"
LICENSE_${PN}-dbus-native-optimist = "MIT"
LICENSE_${PN}-dbus-native-put = "MIT"
LICENSE_${PN}-dbus-native-safe-buffer = "MIT"
LICENSE_${PN}-dbus-native-xml2js-sax = "ISC MIT"
LICENSE_${PN}-dbus-native-xml2js-xmlbuilder = "MIT"
LICENSE_${PN}-dbus-native-xml2js = "MIT"
LICENSE_${PN}-dbus-native = "MIT"
LICENSE_${PN}-follow-redirects-debug-ms = "MIT"
LICENSE_${PN}-follow-redirects-debug = "MIT"
LICENSE_${PN}-follow-redirects = "MIT"
LICENSE_${PN} = "MIT"
