require microservicebus-dam.inc

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.

LICENSE = "MIT & Apache-2.0 & ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cc883f74a12beac0fd9a1809032541d0 \
                    file://node_modules/stream-combiner/LICENSE;md5=a6a4d0fd1bedfc3135e80ba0a71c0f84 \
                    file://node_modules/nan/LICENSE.md;md5=e6270b7774528599f2623a4aeb625829 \
                    file://node_modules/dbus-native/LICENSE;md5=a6df4eaa6c6a1471228755d06f2494cf \
                    file://node_modules/from/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/from/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/split/LICENCE;md5=84ddd974e10adfabbf232e7efb7ed715 \
                    file://node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/optimist/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/file-uri-to-path/LICENSE;md5=9513dc0b97137379cfabc81b60889174 \
                    file://node_modules/ms/license.md;md5=2b8bc52ae6b7ba58e1629deabd53986f \
                    file://node_modules/duplexer/LICENCE;md5=8966d3100f2d871ee216d056c0ea0160 \
                    file://node_modules/pause-stream/LICENSE;md5=e84e358937c41144f40fe5dcb85d0930 \
                    file://node_modules/abstract-socket/LICENSE;md5=34b1124f6512c77f5bf313a663beb85f \
                    file://node_modules/put/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/bindings/LICENSE.md;md5=471723f32516f18ef36e7ef63580e4a8 \
                    file://node_modules/hexy/LICENSE;md5=5b9dd4be4addf4633440307f14dfcee8 \
                    file://node_modules/xml2js/LICENSE;md5=d9fc599c8d9e6f8665063862aac66dfc \
                    file://node_modules/through/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/through/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/sax/LICENSE;md5=326d5674181c4bb210e424772c60fa80 \
                    file://node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/xmlbuilder/LICENSE;md5=f2836c06c74eca0f4565de06fe9900b0 \
                    file://node_modules/event-stream/LICENCE;md5=f45c7572cc474604287b60d5e5f80f8f \
                    file://node_modules/map-stream/LICENCE;md5=f45c7572cc474604287b60d5e5f80f8f \
                    file://node_modules/follow-redirects/LICENSE;md5=2913574e921aefe1275cd5864b4f9b66 \
                    file://node_modules/wordwrap/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/long/LICENSE;md5=d273d63619c9aeaf15cdaf76422c4f87 \
                    file://package.json;md5=4dc3c16dd200b263e4d1beafcc0f1f00 \
                    file://node_modules/abstract-socket/package.json;md5=902ae46dfed9922e49db6bc928d90bad \
                    file://node_modules/bindings/package.json;md5=17005447df8440e0e386849b8fa2b682 \
                    file://node_modules/dbus-native/package.json;md5=d8c2e818dc41a2f1c04b4f24a84cdfbc \
                    file://node_modules/debug/package.json;md5=428aa7fa2bd4f273e5226f0c3c6ab6de \
                    file://node_modules/duplexer/package.json;md5=fec1bb248ae11765fc05cf1527514c16 \
                    file://node_modules/event-stream/package.json;md5=8050d5891f8bad9b9d2c8e359ad21005 \
                    file://node_modules/file-uri-to-path/package.json;md5=65f30030f0e7b2eff552eaabd8bb1fe1 \
                    file://node_modules/follow-redirects/package.json;md5=e2422db77c6fd028794950693a2f22ea \
                    file://node_modules/from/package.json;md5=d20c5ac240e646216b908c348ca53137 \
                    file://node_modules/hexy/package.json;md5=6d5b61f87db50c9924bffe0724a7ed3d \
                    file://node_modules/long/package.json;md5=b269491fc04df9171c87fc414269c31d \
                    file://node_modules/map-stream/package.json;md5=d9d7300b92d25d1117e17ba9f50b357b \
                    file://node_modules/minimist/package.json;md5=5cdc9b4d6017e4086edb5a4f8443b0be \
                    file://node_modules/ms/package.json;md5=a682078f64a677ddad1f50307a14b678 \
                    file://node_modules/nan/package.json;md5=3cfe1e5a98bb9fe54ff73d4aef6df453 \
                    file://node_modules/optimist/package.json;md5=271658d42746bc19e9c553da871d4a8e \
                    file://node_modules/pause-stream/package.json;md5=9050577870ef15196016849177500db5 \
                    file://node_modules/put/package.json;md5=50473c1edd32c51908f67fac065aa946 \
                    file://node_modules/safe-buffer/package.json;md5=b206856c7ef099626bf28cdc5498787a \
                    file://node_modules/sax/package.json;md5=4f338f842e93421a35e3ec9e051d650b \
                    file://node_modules/split/package.json;md5=77bc1624fc416332204682f7685619f9 \
                    file://node_modules/stream-combiner/package.json;md5=d1c818df49608207f157623f30dfb936 \
                    file://node_modules/through/package.json;md5=44807c9c9205ec0de2c7d40a49e82262 \
                    file://node_modules/wordwrap/package.json;md5=faea7a7078e35abb3ccef26017a56533 \
                    file://node_modules/xml2js/package.json;md5=8ad35633fb70121b15d1717674bc93b9 \
                    file://node_modules/xmlbuilder/package.json;md5=0dc88320ef14794cb9182b08de640383"

SRC_URI = "npm://registry.npmjs.org/;name=microservicebus-dam;version=${PV};package=microservicebus-dam \
           npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
           "

S = "${WORKDIR}/npm"

inherit npm

LICENSE_${PN} = "MIT"
LICENSE_${PN}-abstract-socket = "MIT"
LICENSE_${PN}-bindings = "MIT"
LICENSE_${PN}-dbus-native = "MIT"
LICENSE_${PN}-debug = "MIT"
LICENSE_${PN}-duplexer = "MIT"
LICENSE_${PN}-event-stream = "MIT"
LICENSE_${PN}-file-uri-to-path = "MIT"
LICENSE_${PN}-follow-redirects = "MIT"
LICENSE_${PN}-from = "MIT"
LICENSE_${PN}-hexy = "MIT"
LICENSE_${PN}-long = "Apache-2.0"
LICENSE_${PN}-map-stream = "MIT"
LICENSE_${PN}-minimist = "MIT"
LICENSE_${PN}-ms = "MIT"
LICENSE_${PN}-nan = "MIT"
LICENSE_${PN}-optimist = "MIT"
LICENSE_${PN}-pause-stream = "MIT"
LICENSE_${PN}-put = "MIT"
LICENSE_${PN}-safe-buffer = "MIT"
LICENSE_${PN}-sax = "ISC"
LICENSE_${PN}-split = "MIT"
LICENSE_${PN}-stream-combiner = "MIT"
LICENSE_${PN}-through = "MIT"
LICENSE_${PN}-wordwrap = "MIT"
LICENSE_${PN}-xml2js = "MIT"
LICENSE_${PN}-xmlbuilder = "MIT"
