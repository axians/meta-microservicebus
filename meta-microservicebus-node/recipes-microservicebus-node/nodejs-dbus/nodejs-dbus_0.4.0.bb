SUMMARY = "D-bus protocol implementation in native javascript"
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
LIC_FILES_CHKSUM = "file://node_modules/long/LICENSE;md5=d273d63619c9aeaf15cdaf76422c4f87 \
		file://node_modules/abstract-socket/node_modules/nan/LICENSE.md;md5=e6270b7774528599f2623a4aeb625829 \
		file://node_modules/abstract-socket/node_modules/bindings/LICENSE.md;md5=471723f32516f18ef36e7ef63580e4a8 \
		file://node_modules/abstract-socket/node_modules/bindings/node_modules/file-uri-to-path/LICENSE;md5=9513dc0b97137379cfabc81b60889174 \
		file://node_modules/abstract-socket/LICENSE;md5=34b1124f6512c77f5bf313a663beb85f \
		file://node_modules/hexy/LICENSE;md5=5b9dd4be4addf4633440307f14dfcee8 \
		file://node_modules/put/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
		file://node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
		file://node_modules/optimist/node_modules/wordwrap/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
		file://node_modules/optimist/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
		file://node_modules/optimist/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
		file://node_modules/event-stream/node_modules/split/node_modules/through/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
		file://node_modules/event-stream/node_modules/split/node_modules/through/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
		file://node_modules/event-stream/node_modules/through/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
		file://node_modules/event-stream/node_modules/through/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
		file://node_modules/event-stream/node_modules/stream-combiner/node_modules/through/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
		file://node_modules/event-stream/node_modules/stream-combiner/node_modules/through/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
		file://node_modules/event-stream/node_modules/stream-combiner/LICENSE;md5=a6a4d0fd1bedfc3135e80ba0a71c0f84 \
		file://node_modules/event-stream/node_modules/pause-stream/node_modules/through/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
		file://node_modules/event-stream/node_modules/pause-stream/node_modules/through/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
		file://node_modules/event-stream/node_modules/pause-stream/LICENSE;md5=e84e358937c41144f40fe5dcb85d0930 \
		file://node_modules/event-stream/node_modules/from/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
		file://node_modules/event-stream/node_modules/from/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
		file://node_modules/xml2js/node_modules/xmlbuilder/LICENSE;md5=eb65a7137aed46eac98ceb8cb8b057a1 \
		file://node_modules/xml2js/node_modules/sax/LICENSE;md5=326d5674181c4bb210e424772c60fa80 \
		file://node_modules/xml2js/LICENSE;md5=d9fc599c8d9e6f8665063862aac66dfc"

SRC_URI = "npm://registry.npmjs.org/;name=dbus-native;version=${PV}"

# NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
# NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

NPMPN = "dbus-native"

inherit npm

# Name of user for microServicebus
MSB_USER_UID ?= "350"

do_install_append(){
  chown -R ${MSB_USER_ID}:${MSB_USER_ID} ${D}${nonarch_libdir}/node_modules/${NPMPN}
}

# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/npmpkg"
LICENSE_${PN}-abstract-socket-bindings-file-uri-to-path = "MIT"
LICENSE_${PN}-abstract-socket-bindings = "MIT"
LICENSE_${PN}-abstract-socket-nan = "MIT"
LICENSE_${PN}-abstract-socket = "MIT"
LICENSE_${PN}-event-stream-duplexer = "MIT"
LICENSE_${PN}-event-stream-from = "Apache-2.0 MIT"
LICENSE_${PN}-event-stream-map-stream = "MIT"
LICENSE_${PN}-event-stream-pause-stream-through = "Apache-2.0 MIT"
LICENSE_${PN}-event-stream-pause-stream = "MIT"
LICENSE_${PN}-event-stream-split-through = "Apache-2.0 MIT"
LICENSE_${PN}-event-stream-split = "MIT"
LICENSE_${PN}-event-stream-stream-combiner-duplexer = "MIT"
LICENSE_${PN}-event-stream-stream-combiner-through = "Apache-2.0 MIT"
LICENSE_${PN}-event-stream-stream-combiner = "MIT"
LICENSE_${PN}-event-stream-through = "Apache-2.0 MIT"
LICENSE_${PN}-event-stream = "MIT"
LICENSE_${PN}-hexy = "MIT"
LICENSE_${PN}-long = "Apache-2.0"
LICENSE_${PN}-optimist-minimist = "MIT"
LICENSE_${PN}-optimist-wordwrap = "MIT"
LICENSE_${PN}-optimist = "MIT"
LICENSE_${PN}-put = "MIT"
LICENSE_${PN}-safe-buffer = "MIT"
LICENSE_${PN}-xml2js-sax = "ISC"
LICENSE_${PN}-xml2js-xmlbuilder = "MIT"
LICENSE_${PN}-xml2js = "MIT"
LICENSE_${PN} = "MIT"

# Workaround to fix qa errors in test code
INSANE_SKIP_${PN}-put = "arch"
