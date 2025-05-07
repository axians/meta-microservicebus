# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "node.js node for microservicebus. Please visit https://microservicebus.com for more information."
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   node_modules/colors/LICENSE
#   node_modules/duplexer2/LICENSE.md
#   node_modules/minizlib/LICENSE
#   node_modules/rc/LICENSE.APACHE2
#   node_modules/rc/LICENSE.BSD
#   node_modules/readable-stream/LICENSE
#   node_modules/sax/LICENSE
#   node_modules/string_decoder/LICENSE
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "ISC & MIT & Unknown"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cc883f74a12beac0fd9a1809032541d0 \
                    file://node_modules/async/LICENSE;md5=73f63c1fa4541b2f2f34d77140ebe89d \
                    file://node_modules/capture-stack-trace/license;md5=872dd0ce7824087172ca09a60bf9de6c \
                    file://node_modules/chownr/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/colors/LICENSE;md5=441ee46669f9365ff2492e9b555c8ee7 \
                    file://node_modules/commander/LICENSE;md5=25851d4d10d6611a12d5571dab945a00 \
                    file://node_modules/core-util-is/LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff \
                    file://node_modules/create-error-class/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/deep-extend/LICENSE;md5=827bb5781213ff1e9d2fe309bbfc0115 \
                    file://node_modules/duplexer2/LICENSE.md;md5=2ac3dfdce5a77f9cff9b5f70d216d17d \
                    file://node_modules/error-ex/LICENSE;md5=e67c75e89656b80fd99cb7d30fb43102 \
                    file://node_modules/fs-minipass/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/got/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/graceful-readlink/LICENSE;md5=b0270ddb7ee6643eee76e80113234806 \
                    file://node_modules/iconv-lite/LICENSE;md5=f942263d98f0d75e0e0101884e86261d \
                    file://node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/ini/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/is-arrayish/LICENSE;md5=e67c75e89656b80fd99cb7d30fb43102 \
                    file://node_modules/is-plain-obj/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/is-redirect/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/is-retry-allowed/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/is-stream/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/lowercase-keys/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/minipass/LICENSE;md5=78e0c554693f15c5d2e74a90dfef3816 \
                    file://node_modules/minizlib/LICENSE;md5=d8a0ca0c46bfa01db064fa836f550966 \
                    file://node_modules/mkdirp/LICENSE;md5=f653359cc2be3ff55aa601d58d84c808 \
                    file://node_modules/msb-network/node_modules/async/LICENSE;md5=73f63c1fa4541b2f2f34d77140ebe89d \
                    file://node_modules/needle/license.txt;md5=2fd561ba82cb42a5a9304f08b2506da4 \
                    file://node_modules/node-status-codes/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/object-assign/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/package-json/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/parse-json/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/pinkie-promise/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/pinkie/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/prepend-http/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/process-nextick-args/license.md;md5=216769dac98a78ec088ee7cc6fad1dfa \
                    file://node_modules/rc/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/rc/LICENSE.BSD;md5=e7a2a325a0069e82aff675bbf74464a0 \
                    file://node_modules/rc/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/read-all-stream/license;md5=2a8369b875113ae53aa6c5bb39a58d3c \
                    file://node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/registry-auth-token/LICENSE;md5=7b1df94b672916450d194cf7a8bd0e2d \
                    file://node_modules/registry-url/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/require-reload/LICENSE;md5=9862e3aecc2338bb6a1af4d73cc7a1e7 \
                    file://node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/safer-buffer/LICENSE;md5=3baebc2a17b8f5bff04882cd0dc0f76e \
                    file://node_modules/sax/LICENSE;md5=5f49410228c16917dacc5eab921004cb \
                    file://node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/string_decoder/LICENSE;md5=14af51f8c0a6c6e400b53e18c6e5f85c \
                    file://node_modules/strip-json-comments/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/tar/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/unzip-response/license;md5=5b422d6bf88afe88977d04f8bdd4959c \
                    file://node_modules/url-parse-lax/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/util-deprecate/LICENSE;md5=b7c99ef4b0f3ad9911a52219947f8cf0 \
                    file://node_modules/uuid/LICENSE.md;md5=353e680cdafd96bf30131cbb7b14a6e8 \
                    file://node_modules/wmic/node_modules/iconv-lite/LICENSE;md5=f942263d98f0d75e0e0101884e86261d \
                    file://node_modules/yallist/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/app-module-path/README.md;md5=733995ab9f53abf33dd30874b7a61f94 \
                    file://node_modules/compare-version/README.md;md5=a7cdd4e7f0055e05e32f82ec652799fd \
                    file://node_modules/isarray/README.md;md5=e7424a48d45a2e04d52c15e786681063 \
                    file://node_modules/msb-network/README.md;md5=3d5dee191df05fd608bb6b5653b687fa \
                    file://node_modules/timed-out/readme.md;md5=2bad67f5b3d14516ae134be5e9f7f7bc \
                    file://node_modules/wmic/README.md;md5=7cd21e82cd206b77e0fff1217ae429df"

SRC_URI = " \
    npm://registry.npmjs.org/;package=microservicebus-node;version=${PV} \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap_4.1.0.json \
    "

S = "${WORKDIR}/npm"

inherit npm

LICENSE:${PN} = "MIT"
LICENSE:${PN}-app-module-path = "Unknown"
LICENSE:${PN}-async = "MIT"
LICENSE:${PN}-capture-stack-trace = "MIT"
LICENSE:${PN}-chownr = "ISC"
LICENSE:${PN}-colors = "Unknown"
LICENSE:${PN}-commander = "MIT"
LICENSE:${PN}-compare-version = "Unknown"
LICENSE:${PN}-core-util-is = "MIT"
LICENSE:${PN}-create-error-class = "MIT"
LICENSE:${PN}-deep-extend = "MIT"
LICENSE:${PN}-duplexer2 = "Unknown"
LICENSE:${PN}-error-ex = "MIT"
LICENSE:${PN}-fs-minipass = "ISC"
LICENSE:${PN}-got = "MIT"
LICENSE:${PN}-graceful-readlink = "MIT"
LICENSE:${PN}-iconv-lite = "MIT"
LICENSE:${PN}-inherits = "ISC"
LICENSE:${PN}-ini = "ISC"
LICENSE:${PN}-is-arrayish = "MIT"
LICENSE:${PN}-is-plain-obj = "MIT"
LICENSE:${PN}-is-redirect = "MIT"
LICENSE:${PN}-is-retry-allowed = "MIT"
LICENSE:${PN}-is-stream = "MIT"
LICENSE:${PN}-isarray = "Unknown"
LICENSE:${PN}-lowercase-keys = "MIT"
LICENSE:${PN}-minimist = "MIT"
LICENSE:${PN}-minipass = "ISC"
LICENSE:${PN}-minizlib = "Unknown"
LICENSE:${PN}-mkdirp = "MIT"
LICENSE:${PN}-msb-network = "MIT & Unknown"
LICENSE:${PN}-msb-network-async = "Unknown"
LICENSE:${PN}-needle = "MIT"
LICENSE:${PN}-node-status-codes = "MIT"
LICENSE:${PN}-object-assign = "MIT"
LICENSE:${PN}-package-json = "MIT"
LICENSE:${PN}-parse-json = "MIT"
LICENSE:${PN}-pinkie = "MIT"
LICENSE:${PN}-pinkie-promise = "MIT"
LICENSE:${PN}-prepend-http = "MIT"
LICENSE:${PN}-process-nextick-args = "MIT"
LICENSE:${PN}-rc = "MIT & Unknown"
LICENSE:${PN}-read-all-stream = "MIT"
LICENSE:${PN}-readable-stream = "Unknown"
LICENSE:${PN}-registry-auth-token = "MIT"
LICENSE:${PN}-registry-url = "MIT"
LICENSE:${PN}-require-reload = "MIT"
LICENSE:${PN}-safe-buffer = "MIT"
LICENSE:${PN}-safer-buffer = "MIT"
LICENSE:${PN}-sax = "Unknown"
LICENSE:${PN}-semver = "ISC"
LICENSE:${PN}-stringdecoder = "Unknown"
LICENSE:${PN}-strip-json-comments = "MIT"
LICENSE:${PN}-tar = "ISC"
LICENSE:${PN}-timed-out = "Unknown"
LICENSE:${PN}-unzip-response = "MIT"
LICENSE:${PN}-url-parse-lax = "MIT"
LICENSE:${PN}-util-deprecate = "MIT"
LICENSE:${PN}-uuid = "MIT"
LICENSE:${PN}-wmic = "MIT & Unknown"
LICENSE:${PN}-wmic-iconv-lite = "Unknown"
LICENSE:${PN}-yallist = "ISC"
