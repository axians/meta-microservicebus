# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "node.js node for microservicebus. Please visit https://microservicebus.com for more information."
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   node_modules/bcrypt-pbkdf/LICENSE
#   node_modules/colors/LICENSE
#   node_modules/duplexer2/LICENSE.md
#   node_modules/ecc-jsbn/lib/LICENSE-jsbn
#   node_modules/jsbn/LICENSE
#   node_modules/json-schema/LICENSE
#   node_modules/minizlib/LICENSE
#   node_modules/rc/LICENSE.APACHE2
#   node_modules/rc/LICENSE.BSD
#   node_modules/readable-stream/LICENSE
#   node_modules/string_decoder/LICENSE
#   node_modules/tough-cookie/LICENSE
#   node_modules/uri-js/LICENSE
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Apache-2.0 & BSD-3-Clause & ISC & MIT & Unknown & Unlicense"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cc883f74a12beac0fd9a1809032541d0 \
                    file://node_modules/ajv/LICENSE;md5=4973982316cdc12e988b814af2813df7 \
                    file://node_modules/asn1/LICENSE;md5=5ce2f42143c298495637e28e40cd5462 \
                    file://node_modules/async/LICENSE;md5=73f63c1fa4541b2f2f34d77140ebe89d \
                    file://node_modules/asynckit/LICENSE;md5=177bc287fb9558bf3ea50b440c1c86ff \
                    file://node_modules/aws-sign2/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/aws4/LICENSE;md5=ff6f181928a91d8631d565516b4db3cb \
                    file://node_modules/bcrypt-pbkdf/LICENSE;md5=aaf6ebb9d1b815768d32661e72bdd761 \
                    file://node_modules/capture-stack-trace/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/caseless/LICENSE;md5=e9dadf023ba6ebd98e3e0acb6e2470e3 \
                    file://node_modules/chownr/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/colors/LICENSE;md5=441ee46669f9365ff2492e9b555c8ee7 \
                    file://node_modules/combined-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/commander/LICENSE;md5=25851d4d10d6611a12d5571dab945a00 \
                    file://node_modules/core-util-is/LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff \
                    file://node_modules/create-error-class/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/dashdash/LICENSE.txt;md5=ebce61c1a0900d798daaf5853c69ce72 \
                    file://node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/deep-extend/LICENSE;md5=827bb5781213ff1e9d2fe309bbfc0115 \
                    file://node_modules/delayed-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/duplexer2/LICENSE.md;md5=2ac3dfdce5a77f9cff9b5f70d216d17d \
                    file://node_modules/ecc-jsbn/LICENSE;md5=0d289b6d63cbcc18e4b2af9a5bd28b54 \
                    file://node_modules/ecc-jsbn/lib/LICENSE-jsbn;md5=32052d48bacabd1c02e56c6889082a27 \
                    file://node_modules/error-ex/LICENSE;md5=e67c75e89656b80fd99cb7d30fb43102 \
                    file://node_modules/extend/LICENSE;md5=33d9f7a91df276ec16aa941032ee1476 \
                    file://node_modules/extsprintf/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://node_modules/fast-deep-equal/LICENSE;md5=ea87ade09b9e6da4f2e47904a4ee137b \
                    file://node_modules/fast-json-stable-stringify/LICENSE;md5=febe55307df96f60ad763842f5a8ca6f \
                    file://node_modules/forever-agent/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/form-data/License;md5=7aa505292e2636a9e59d4d3f258f4819 \
                    file://node_modules/fs-minipass/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/getpass/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/got/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/graceful-readlink/LICENSE;md5=b0270ddb7ee6643eee76e80113234806 \
                    file://node_modules/har-schema/LICENSE;md5=bfa81591facc9224e4c7451c8dc12958 \
                    file://node_modules/har-validator/LICENSE;md5=6f7daec5e5143ffeb21745646b425ab2 \
                    file://node_modules/http-signature/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/iconv-lite/LICENSE;md5=f942263d98f0d75e0e0101884e86261d \
                    file://node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/ini/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/is-arrayish/LICENSE;md5=e67c75e89656b80fd99cb7d30fb43102 \
                    file://node_modules/is-redirect/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/is-retry-allowed/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/is-stream/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/is-typedarray/LICENSE.md;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/isstream/LICENSE.md;md5=1798150b9d70250c42b55b3530e6af2b \
                    file://node_modules/jsbn/LICENSE;md5=c6ea389b6b52325149beeec27075c5ac \
                    file://node_modules/json-schema-traverse/LICENSE;md5=ea87ade09b9e6da4f2e47904a4ee137b \
                    file://node_modules/json-schema/LICENSE;md5=cd1c1e0d7bf9f0594f023e0e3a62838b \
                    file://node_modules/json-stringify-safe/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/jsprim/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://node_modules/lowercase-keys/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/mime-db/LICENSE;md5=175b28b58359f8b4a969c9ab7c828445 \
                    file://node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/minipass/LICENSE;md5=ff53df3ad94e5c618e230ab49ce310fa \
                    file://node_modules/minizlib/LICENSE;md5=d8a0ca0c46bfa01db064fa836f550966 \
                    file://node_modules/mkdirp/LICENSE;md5=f653359cc2be3ff55aa601d58d84c808 \
                    file://node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/needle/license.txt;md5=331eb5d406e4439ff2e996b744f54d90 \
                    file://node_modules/network/node_modules/async/LICENSE;md5=dc113e0fc4029c29942399ad22425402 \
                    file://node_modules/node-status-codes/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/oauth-sign/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/object-assign/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/package-json/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/parse-json/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/performance-now/license.txt;md5=a07ae1b6dc33215d89a1281ee71c863c \
                    file://node_modules/pinkie-promise/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/pinkie/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/prepend-http/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/process-nextick-args/license.md;md5=216769dac98a78ec088ee7cc6fad1dfa \
                    file://node_modules/psl/LICENSE;md5=2425d288296fae32e27553694ff40294 \
                    file://node_modules/punycode/LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987 \
                    file://node_modules/qs/LICENSE.md;md5=b289135779dd930509ae81e6041690c0 \
                    file://node_modules/rc/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/rc/LICENSE.BSD;md5=e7a2a325a0069e82aff675bbf74464a0 \
                    file://node_modules/rc/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/read-all-stream/license;md5=2a8369b875113ae53aa6c5bb39a58d3c \
                    file://node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/registry-url/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/request/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/request/node_modules/uuid/LICENSE.md;md5=c9420736e23afb538ba5fbe44197f0b4 \
                    file://node_modules/require-reload/LICENSE;md5=9862e3aecc2338bb6a1af4d73cc7a1e7 \
                    file://node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/safer-buffer/LICENSE;md5=3baebc2a17b8f5bff04882cd0dc0f76e \
                    file://node_modules/sshpk/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/string_decoder/LICENSE;md5=14af51f8c0a6c6e400b53e18c6e5f85c \
                    file://node_modules/strip-json-comments/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/tar/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/timed-out/license;md5=2a8369b875113ae53aa6c5bb39a58d3c \
                    file://node_modules/tough-cookie/LICENSE;md5=7189377a5215f1211b70cf2b9754841e \
                    file://node_modules/tunnel-agent/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/tweetnacl/LICENSE;md5=911690f51af322440237a253d695d19f \
                    file://node_modules/unzip-response/license;md5=5b422d6bf88afe88977d04f8bdd4959c \
                    file://node_modules/uri-js/LICENSE;md5=3b55dad4a98748003b5b423477713da1 \
                    file://node_modules/url-parse-lax/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/util-deprecate/LICENSE;md5=b7c99ef4b0f3ad9911a52219947f8cf0 \
                    file://node_modules/uuid/LICENSE.md;md5=353e680cdafd96bf30131cbb7b14a6e8 \
                    file://node_modules/verror/LICENSE;md5=04fce49dd88d841ceb36616ab9789ce0 \
                    file://node_modules/verror/node_modules/core-util-is/LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff \
                    file://node_modules/wmic/node_modules/async/LICENSE;md5=73f63c1fa4541b2f2f34d77140ebe89d \
                    file://node_modules/yallist/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/app-module-path/README.md;md5=733995ab9f53abf33dd30874b7a61f94 \
                    file://node_modules/assert-plus/README.md;md5=1603a576d703aa76728a38047eede967 \
                    file://node_modules/compare-version/README.md;md5=a7cdd4e7f0055e05e32f82ec652799fd \
                    file://node_modules/isarray/README.md;md5=e7424a48d45a2e04d52c15e786681063 \
                    file://node_modules/network/README.md;md5=24227ed10e218a5ef72083e53dc909a3 \
                    file://node_modules/wmic/README.md;md5=deba3dc6a4385e3a443a63455a76269b"

SRC_URI = " \
    npm://registry.npmjs.org/;package=microservicebus-node;version=${PV} \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap_3.4.5.json \
    "

S = "${WORKDIR}/npm"

inherit npm

LICENSE:${PN} = "MIT"
LICENSE:${PN}-ajv = "MIT"
LICENSE:${PN}-app-module-path = "Unknown"
LICENSE:${PN}-asn1 = "MIT"
LICENSE:${PN}-assert-plus = "Unknown"
LICENSE:${PN}-async = "MIT"
LICENSE:${PN}-asynckit = "MIT"
LICENSE:${PN}-aws-sign2 = "Apache-2.0"
LICENSE:${PN}-aws4 = "MIT"
LICENSE:${PN}-bcrypt-pbkdf = "Unknown"
LICENSE:${PN}-capture-stack-trace = "MIT"
LICENSE:${PN}-caseless = "Apache-2.0"
LICENSE:${PN}-chownr = "ISC"
LICENSE:${PN}-colors = "Unknown"
LICENSE:${PN}-combined-stream = "MIT"
LICENSE:${PN}-commander = "MIT"
LICENSE:${PN}-compare-version = "Unknown"
LICENSE:${PN}-core-util-is = "MIT"
LICENSE:${PN}-create-error-class = "MIT"
LICENSE:${PN}-dashdash = "MIT"
LICENSE:${PN}-debug = "MIT"
LICENSE:${PN}-deep-extend = "MIT"
LICENSE:${PN}-delayed-stream = "MIT"
LICENSE:${PN}-duplexer2 = "Unknown"
LICENSE:${PN}-ecc-jsbn = "MIT & Unknown"
LICENSE:${PN}-error-ex = "MIT"
LICENSE:${PN}-extend = "MIT"
LICENSE:${PN}-extsprintf = "MIT"
LICENSE:${PN}-fast-deep-equal = "MIT"
LICENSE:${PN}-fast-json-stable-stringify = "MIT"
LICENSE:${PN}-forever-agent = "Apache-2.0"
LICENSE:${PN}-form-data = "MIT"
LICENSE:${PN}-fs-minipass = "ISC"
LICENSE:${PN}-getpass = "MIT"
LICENSE:${PN}-got = "MIT"
LICENSE:${PN}-graceful-readlink = "MIT"
LICENSE:${PN}-har-schema = "ISC"
LICENSE:${PN}-har-validator = "MIT"
LICENSE:${PN}-http-signature = "MIT"
LICENSE:${PN}-iconv-lite = "MIT"
LICENSE:${PN}-inherits = "ISC"
LICENSE:${PN}-ini = "ISC"
LICENSE:${PN}-is-arrayish = "MIT"
LICENSE:${PN}-is-redirect = "MIT"
LICENSE:${PN}-is-retry-allowed = "MIT"
LICENSE:${PN}-is-stream = "MIT"
LICENSE:${PN}-is-typedarray = "MIT"
LICENSE:${PN}-isarray = "Unknown"
LICENSE:${PN}-isstream = "MIT"
LICENSE:${PN}-jsbn = "Unknown"
LICENSE:${PN}-json-schema = "Unknown"
LICENSE:${PN}-json-schema-traverse = "MIT"
LICENSE:${PN}-json-stringify-safe = "ISC"
LICENSE:${PN}-jsprim = "MIT"
LICENSE:${PN}-lowercase-keys = "MIT"
LICENSE:${PN}-mime-db = "MIT"
LICENSE:${PN}-mime-types = "MIT"
LICENSE:${PN}-minimist = "MIT"
LICENSE:${PN}-minipass = "ISC"
LICENSE:${PN}-minizlib = "Unknown"
LICENSE:${PN}-mkdirp = "MIT"
LICENSE:${PN}-ms = "MIT"
LICENSE:${PN}-needle = "MIT"
LICENSE:${PN}-network-async = "MIT"
LICENSE:${PN}-network = "Unknown"
LICENSE:${PN}-node-status-codes = "MIT"
LICENSE:${PN}-oauth-sign = "Apache-2.0"
LICENSE:${PN}-object-assign = "MIT"
LICENSE:${PN}-package-json = "MIT"
LICENSE:${PN}-parse-json = "MIT"
LICENSE:${PN}-performance-now = "MIT"
LICENSE:${PN}-pinkie = "MIT"
LICENSE:${PN}-pinkie-promise = "MIT"
LICENSE:${PN}-prepend-http = "MIT"
LICENSE:${PN}-process-nextick-args = "MIT"
LICENSE:${PN}-psl = "MIT"
LICENSE:${PN}-punycode = "MIT"
LICENSE:${PN}-qs = "BSD-3-Clause"
LICENSE:${PN}-rc = "MIT & Unknown"
LICENSE:${PN}-read-all-stream = "MIT"
LICENSE:${PN}-readable-stream = "Unknown"
LICENSE:${PN}-registry-url = "MIT"
LICENSE:${PN}-request-uuid = "MIT"
LICENSE:${PN}-request = "Apache-2.0"
LICENSE:${PN}-require-reload = "MIT"
LICENSE:${PN}-safe-buffer = "MIT"
LICENSE:${PN}-safer-buffer = "MIT"
LICENSE:${PN}-sshpk = "MIT"
LICENSE:${PN}-stringdecoder = "Unknown"
LICENSE:${PN}-strip-json-comments = "MIT"
LICENSE:${PN}-tar = "ISC"
LICENSE:${PN}-timed-out = "MIT"
LICENSE:${PN}-tough-cookie = "Unknown"
LICENSE:${PN}-tunnel-agent = "Apache-2.0"
LICENSE:${PN}-tweetnacl = "Unlicense"
LICENSE:${PN}-unzip-response = "MIT"
LICENSE:${PN}-uri-js = "Unknown"
LICENSE:${PN}-url-parse-lax = "MIT"
LICENSE:${PN}-util-deprecate = "MIT"
LICENSE:${PN}-uuid = "MIT"
LICENSE:${PN}-verror-core-util-is = "MIT"
LICENSE:${PN}-verror = "MIT"
LICENSE:${PN}-wmic-async = "MIT"
LICENSE:${PN}-wmic = "Unknown"
LICENSE:${PN}-yallist = "ISC"
