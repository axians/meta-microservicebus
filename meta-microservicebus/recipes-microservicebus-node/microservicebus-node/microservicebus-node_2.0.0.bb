# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "node.js node for microservicebus. Please visit https://microservicebus.com for more information."
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
#   getlicenses.js
#   node_modules/network/node_modules/wmic/node_modules/async/node_modules/lodash/LICENSE
#   node_modules/tar/node_modules/minizlib/LICENSE
#   node_modules/colors/LICENSE
#   node_modules/package-json/node_modules/rc/LICENSE.APACHE2
#   node_modules/package-json/node_modules/rc/LICENSE.BSD
#   node_modules/package-json/node_modules/got/node_modules/duplexer2/LICENSE.md
#   node_modules/package-json/node_modules/got/node_modules/duplexer2/node_modules/readable-stream/LICENSE
#   node_modules/package-json/node_modules/got/node_modules/readable-stream/LICENSE
#   node_modules/package-json/node_modules/got/node_modules/readable-stream/node_modules/string_decoder/LICENSE
#   node_modules/package-json/node_modules/got/node_modules/readable-stream/node_modules/process-nextick-args/license.md
#   node_modules/package-json/node_modules/got/node_modules/read-all-stream/node_modules/readable-stream/LICENSE
#   node_modules/package-json/node_modules/registry-url/node_modules/rc/LICENSE.APACHE2
#   node_modules/package-json/node_modules/registry-url/node_modules/rc/LICENSE.BSD
#   node_modules/request/LICENSE
#   node_modules/request/node_modules/forever-agent/LICENSE
#   node_modules/request/node_modules/isstream/LICENSE.md
#   node_modules/request/node_modules/qs/LICENSE
#   node_modules/request/node_modules/caseless/LICENSE
#   node_modules/request/node_modules/tough-cookie/LICENSE
#   node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/asn1/LICENSE
#   node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/jsbn/LICENSE
#   node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/lib/LICENSE-jsbn
#   node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/node_modules/jsbn/LICENSE
#   node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/dashdash/LICENSE.txt
#   node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/tweetnacl/LICENSE
#   node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/bcrypt-pbkdf/LICENSE
#   node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/bcrypt-pbkdf/node_modules/tweetnacl/LICENSE
#   node_modules/request/node_modules/http-signature/node_modules/jsprim/LICENSE
#   node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/extsprintf/LICENSE
#   node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/LICENSE
#   node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/node_modules/extsprintf/LICENSE
#   node_modules/request/node_modules/tunnel-agent/LICENSE
#   node_modules/request/node_modules/aws-sign2/LICENSE
#   node_modules/request/node_modules/oauth-sign/LICENSE
#   node_modules/async/node_modules/lodash/LICENSE
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Unknown & BSD-3-Clause & Unlicense & Apache-2.0 & \
BSD-2-Clause & ISC & MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=75dbbb2f49d90bfc476532dc5861fd26 \
                    file://getlicenses.js;md5=8f6c14f3ec26a0536cf2ba8ec2160abe \
                    file://node_modules/network/node_modules/needle/license.txt;md5=331eb5d406e4439ff2e996b744f54d90 \
                    file://node_modules/network/node_modules/needle/node_modules/iconv-lite/LICENSE;md5=f942263d98f0d75e0e0101884e86261d \
                    file://node_modules/network/node_modules/needle/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/network/node_modules/needle/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/network/node_modules/commander/LICENSE;md5=25851d4d10d6611a12d5571dab945a00 \
                    file://node_modules/network/node_modules/commander/node_modules/graceful-readlink/LICENSE;md5=b0270ddb7ee6643eee76e80113234806 \
                    file://node_modules/network/node_modules/wmic/node_modules/iconv-lite/LICENSE;md5=f942263d98f0d75e0e0101884e86261d \
                    file://node_modules/network/node_modules/wmic/node_modules/iconv-lite/node_modules/safer-buffer/LICENSE;md5=3baebc2a17b8f5bff04882cd0dc0f76e \
                    file://node_modules/network/node_modules/wmic/node_modules/async/LICENSE;md5=73f63c1fa4541b2f2f34d77140ebe89d \
                    file://node_modules/network/node_modules/wmic/node_modules/async/node_modules/lodash/LICENSE;md5=8f10c81975f996c3ba5b424884b4af96 \
                    file://node_modules/network/node_modules/async/LICENSE;md5=dc113e0fc4029c29942399ad22425402 \
                    file://node_modules/require-reload/LICENSE;md5=9862e3aecc2338bb6a1af4d73cc7a1e7 \
                    file://node_modules/tar/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/tar/node_modules/minipass/LICENSE;md5=ff53df3ad94e5c618e230ab49ce310fa \
                    file://node_modules/tar/node_modules/minipass/node_modules/yallist/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/tar/node_modules/minipass/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/tar/node_modules/yallist/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/tar/node_modules/chownr/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/tar/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/tar/node_modules/minizlib/LICENSE;md5=d8a0ca0c46bfa01db064fa836f550966 \
                    file://node_modules/tar/node_modules/minizlib/node_modules/minipass/LICENSE;md5=ff53df3ad94e5c618e230ab49ce310fa \
                    file://node_modules/tar/node_modules/fs-minipass/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/tar/node_modules/fs-minipass/node_modules/minipass/LICENSE;md5=ff53df3ad94e5c618e230ab49ce310fa \
                    file://node_modules/tar/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/tar/node_modules/mkdirp/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/colors/LICENSE;md5=5bc6c72caa0dcc082d24a52a6ae12112 \
                    file://node_modules/package-json/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/package-json/node_modules/rc/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/package-json/node_modules/rc/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/package-json/node_modules/rc/LICENSE.BSD;md5=e7a2a325a0069e82aff675bbf74464a0 \
                    file://node_modules/package-json/node_modules/got/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/package-json/node_modules/got/node_modules/object-assign/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/package-json/node_modules/got/node_modules/pinkie-promise/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/package-json/node_modules/got/node_modules/pinkie-promise/node_modules/pinkie/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/package-json/node_modules/got/node_modules/duplexer2/LICENSE.md;md5=2ac3dfdce5a77f9cff9b5f70d216d17d \
                    file://node_modules/package-json/node_modules/got/node_modules/duplexer2/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/package-json/node_modules/got/node_modules/parse-json/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/package-json/node_modules/got/node_modules/parse-json/node_modules/error-ex/LICENSE;md5=e67c75e89656b80fd99cb7d30fb43102 \
                    file://node_modules/package-json/node_modules/got/node_modules/parse-json/node_modules/error-ex/node_modules/is-arrayish/LICENSE;md5=e67c75e89656b80fd99cb7d30fb43102 \
                    file://node_modules/package-json/node_modules/got/node_modules/unzip-response/license;md5=5b422d6bf88afe88977d04f8bdd4959c \
                    file://node_modules/package-json/node_modules/got/node_modules/url-parse-lax/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/package-json/node_modules/got/node_modules/url-parse-lax/node_modules/prepend-http/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/package-json/node_modules/got/node_modules/is-stream/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/package-json/node_modules/got/node_modules/is-retry-allowed/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/package-json/node_modules/got/node_modules/node-status-codes/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/package-json/node_modules/got/node_modules/timed-out/license;md5=2a8369b875113ae53aa6c5bb39a58d3c \
                    file://node_modules/package-json/node_modules/got/node_modules/lowercase-keys/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/package-json/node_modules/got/node_modules/create-error-class/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/package-json/node_modules/got/node_modules/create-error-class/node_modules/capture-stack-trace/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/package-json/node_modules/got/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/package-json/node_modules/got/node_modules/readable-stream/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/package-json/node_modules/got/node_modules/readable-stream/node_modules/string_decoder/LICENSE;md5=14af51f8c0a6c6e400b53e18c6e5f85c \
                    file://node_modules/package-json/node_modules/got/node_modules/readable-stream/node_modules/string_decoder/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/package-json/node_modules/got/node_modules/readable-stream/node_modules/core-util-is/LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff \
                    file://node_modules/package-json/node_modules/got/node_modules/readable-stream/node_modules/process-nextick-args/license.md;md5=216769dac98a78ec088ee7cc6fad1dfa \
                    file://node_modules/package-json/node_modules/got/node_modules/readable-stream/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/package-json/node_modules/got/node_modules/readable-stream/node_modules/util-deprecate/LICENSE;md5=b7c99ef4b0f3ad9911a52219947f8cf0 \
                    file://node_modules/package-json/node_modules/got/node_modules/read-all-stream/license;md5=2a8369b875113ae53aa6c5bb39a58d3c \
                    file://node_modules/package-json/node_modules/got/node_modules/read-all-stream/node_modules/pinkie-promise/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/package-json/node_modules/got/node_modules/read-all-stream/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/package-json/node_modules/got/node_modules/is-redirect/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/package-json/node_modules/registry-url/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/package-json/node_modules/registry-url/node_modules/rc/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/package-json/node_modules/registry-url/node_modules/rc/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/package-json/node_modules/registry-url/node_modules/rc/LICENSE.BSD;md5=e7a2a325a0069e82aff675bbf74464a0 \
                    file://node_modules/package-json/node_modules/registry-url/node_modules/rc/node_modules/deep-extend/LICENSE;md5=827bb5781213ff1e9d2fe309bbfc0115 \
                    file://node_modules/package-json/node_modules/registry-url/node_modules/rc/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/package-json/node_modules/registry-url/node_modules/rc/node_modules/ini/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/package-json/node_modules/registry-url/node_modules/rc/node_modules/strip-json-comments/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/request/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/request/node_modules/forever-agent/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/request/node_modules/isstream/LICENSE.md;md5=1798150b9d70250c42b55b3530e6af2b \
                    file://node_modules/request/node_modules/extend/LICENSE;md5=33d9f7a91df276ec16aa941032ee1476 \
                    file://node_modules/request/node_modules/combined-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/request/node_modules/qs/LICENSE;md5=d5c7c6dc45a33a0a9620ed81315672d7 \
                    file://node_modules/request/node_modules/caseless/LICENSE;md5=e9dadf023ba6ebd98e3e0acb6e2470e3 \
                    file://node_modules/request/node_modules/tough-cookie/LICENSE;md5=7189377a5215f1211b70cf2b9754841e \
                    file://node_modules/request/node_modules/tough-cookie/node_modules/psl/LICENSE;md5=2425d288296fae32e27553694ff40294 \
                    file://node_modules/request/node_modules/tough-cookie/node_modules/punycode/LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987 \
                    file://node_modules/request/node_modules/form-data/License;md5=7aa505292e2636a9e59d4d3f258f4819 \
                    file://node_modules/request/node_modules/form-data/node_modules/combined-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/request/node_modules/form-data/node_modules/combined-stream/node_modules/delayed-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/request/node_modules/form-data/node_modules/asynckit/LICENSE;md5=177bc287fb9558bf3ea50b440c1c86ff \
                    file://node_modules/request/node_modules/form-data/node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/request/node_modules/form-data/node_modules/mime-types/node_modules/mime-db/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/request/node_modules/performance-now/license.txt;md5=a07ae1b6dc33215d89a1281ee71c863c \
                    file://node_modules/request/node_modules/http-signature/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/request/node_modules/http-signature/node_modules/sshpk/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/asn1/LICENSE;md5=5ce2f42143c298495637e28e40cd5462 \
                    file://node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/asn1/node_modules/safer-buffer/LICENSE;md5=3baebc2a17b8f5bff04882cd0dc0f76e \
                    file://node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/jsbn/LICENSE;md5=c6ea389b6b52325149beeec27075c5ac \
                    file://node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/LICENSE;md5=0d289b6d63cbcc18e4b2af9a5bd28b54 \
                    file://node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/lib/LICENSE-jsbn;md5=32052d48bacabd1c02e56c6889082a27 \
                    file://node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/node_modules/jsbn/LICENSE;md5=c6ea389b6b52325149beeec27075c5ac \
                    file://node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/node_modules/safer-buffer/LICENSE;md5=3baebc2a17b8f5bff04882cd0dc0f76e \
                    file://node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/getpass/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/dashdash/LICENSE.txt;md5=ebce61c1a0900d798daaf5853c69ce72 \
                    file://node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/tweetnacl/LICENSE;md5=911690f51af322440237a253d695d19f \
                    file://node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/safer-buffer/LICENSE;md5=3baebc2a17b8f5bff04882cd0dc0f76e \
                    file://node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/bcrypt-pbkdf/LICENSE;md5=aaf6ebb9d1b815768d32661e72bdd761 \
                    file://node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/bcrypt-pbkdf/node_modules/tweetnacl/LICENSE;md5=911690f51af322440237a253d695d19f \
                    file://node_modules/request/node_modules/http-signature/node_modules/jsprim/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/extsprintf/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/LICENSE;md5=04fce49dd88d841ceb36616ab9789ce0 \
                    file://node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/node_modules/extsprintf/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/node_modules/core-util-is/LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff \
                    file://node_modules/request/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/request/node_modules/is-typedarray/LICENSE.md;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/request/node_modules/json-stringify-safe/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/request/node_modules/tunnel-agent/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/request/node_modules/tunnel-agent/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/request/node_modules/har-validator/LICENSE;md5=6f7daec5e5143ffeb21745646b425ab2 \
                    file://node_modules/request/node_modules/har-validator/node_modules/ajv/LICENSE;md5=4973982316cdc12e988b814af2813df7 \
                    file://node_modules/request/node_modules/har-validator/node_modules/ajv/node_modules/fast-deep-equal/LICENSE;md5=ea87ade09b9e6da4f2e47904a4ee137b \
                    file://node_modules/request/node_modules/har-validator/node_modules/ajv/node_modules/fast-json-stable-stringify/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/request/node_modules/har-validator/node_modules/ajv/node_modules/json-schema-traverse/LICENSE;md5=ea87ade09b9e6da4f2e47904a4ee137b \
                    file://node_modules/request/node_modules/har-validator/node_modules/ajv/node_modules/uri-js/node_modules/punycode/LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987 \
                    file://node_modules/request/node_modules/har-validator/node_modules/har-schema/LICENSE;md5=bfa81591facc9224e4c7451c8dc12958 \
                    file://node_modules/request/node_modules/uuid/LICENSE.md;md5=c9420736e23afb538ba5fbe44197f0b4 \
                    file://node_modules/request/node_modules/aws4/LICENSE;md5=ff6f181928a91d8631d565516b4db3cb \
                    file://node_modules/request/node_modules/aws-sign2/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/request/node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/request/node_modules/oauth-sign/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/async/LICENSE;md5=9ec5487258cc65072647c5488b4d59ad \
                    file://node_modules/async/node_modules/lodash/LICENSE;md5=8f10c81975f996c3ba5b424884b4af96 \
                    file://node_modules/uuid/LICENSE.md;md5=c9420736e23afb538ba5fbe44197f0b4"

SRC_URI = "npm://registry.npmjs.org;name=microservicebus-node;version=${PV}"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/npmpkg"
LICENSE_${PN}-app-module-path = "BSD-2-Clause"
LICENSE_${PN}-async-lodash = "MIT"
LICENSE_${PN}-async = "MIT"
LICENSE_${PN}-colors = "MIT"
LICENSE_${PN}-compare-version = "MIT"
LICENSE_${PN}-minimist = "MIT"
LICENSE_${PN}-network-async = "MIT"
LICENSE_${PN}-network-commander-graceful-readlink = "MIT"
LICENSE_${PN}-network-commander = "MIT"
LICENSE_${PN}-network-needle-debug-ms = "MIT"
LICENSE_${PN}-network-needle-debug = "MIT"
LICENSE_${PN}-network-needle-iconv-lite = "MIT"
LICENSE_${PN}-network-needle = "MIT"
LICENSE_${PN}-network-wmic-async-lodash = "MIT"
LICENSE_${PN}-network-wmic-async = "MIT"
LICENSE_${PN}-network-wmic-iconv-lite-safer-buffer = "MIT"
LICENSE_${PN}-network-wmic-iconv-lite = "MIT"
LICENSE_${PN}-network-wmic = "ISC"
LICENSE_${PN}-network = "MIT"
LICENSE_${PN}-package-json-got-create-error-class-capture-stack-trace = "MIT"
LICENSE_${PN}-package-json-got-create-error-class = "MIT"
LICENSE_${PN}-package-json-got-duplexer2-readable-stream = "MIT"
LICENSE_${PN}-package-json-got-duplexer2 = "BSD-3-Clause"
LICENSE_${PN}-package-json-got-is-redirect = "MIT"
LICENSE_${PN}-package-json-got-is-retry-allowed = "MIT"
LICENSE_${PN}-package-json-got-is-stream = "MIT"
LICENSE_${PN}-package-json-got-lowercase-keys = "MIT"
LICENSE_${PN}-package-json-got-node-status-codes = "MIT"
LICENSE_${PN}-package-json-got-object-assign = "MIT"
LICENSE_${PN}-package-json-got-parse-json-error-ex-is-arrayish = "MIT"
LICENSE_${PN}-package-json-got-parse-json-error-ex = "MIT"
LICENSE_${PN}-package-json-got-parse-json = "MIT"
LICENSE_${PN}-package-json-got-pinkie-promise-pinkie = "MIT"
LICENSE_${PN}-package-json-got-pinkie-promise = "MIT"
LICENSE_${PN}-package-json-got-read-all-stream-pinkie-promise = "MIT"
LICENSE_${PN}-package-json-got-read-all-stream-readable-stream = "MIT"
LICENSE_${PN}-package-json-got-read-all-stream = "MIT"
LICENSE_${PN}-package-json-got-readable-stream-core-util-is = "MIT"
LICENSE_${PN}-package-json-got-readable-stream-inherits = "ISC"
LICENSE_${PN}-package-json-got-readable-stream-isarray = "MIT"
LICENSE_${PN}-package-json-got-readable-stream-process-nextick-args = "MIT"
LICENSE_${PN}-package-json-got-readable-stream-safe-buffer = "MIT"
LICENSE_${PN}-package-json-got-readable-stream-string-decoder-safe-buffer = "MIT"
LICENSE_${PN}-package-json-got-readable-stream-string-decoder = "MIT"
LICENSE_${PN}-package-json-got-readable-stream-util-deprecate = "MIT"
LICENSE_${PN}-package-json-got-readable-stream = "MIT"
LICENSE_${PN}-package-json-got-timed-out = "MIT"
LICENSE_${PN}-package-json-got-unzip-response = "MIT"
LICENSE_${PN}-package-json-got-url-parse-lax-prepend-http = "MIT"
LICENSE_${PN}-package-json-got-url-parse-lax = "MIT"
LICENSE_${PN}-package-json-got = "MIT"
LICENSE_${PN}-package-json-rc = "Unknown MIT"
LICENSE_${PN}-package-json-registry-url-rc-deep-extend = "MIT"
LICENSE_${PN}-package-json-registry-url-rc-ini = "ISC"
LICENSE_${PN}-package-json-registry-url-rc-minimist = "MIT"
LICENSE_${PN}-package-json-registry-url-rc-strip-json-comments = "MIT"
LICENSE_${PN}-package-json-registry-url-rc = "Unknown MIT"
LICENSE_${PN}-package-json-registry-url = "MIT"
LICENSE_${PN}-package-json = "MIT"
LICENSE_${PN}-request-aws-sign2 = "Apache-2.0"
LICENSE_${PN}-request-aws4 = "MIT"
LICENSE_${PN}-request-caseless = "Apache-2.0"
LICENSE_${PN}-request-combined-stream = "MIT"
LICENSE_${PN}-request-extend = "MIT"
LICENSE_${PN}-request-forever-agent = "Apache-2.0"
LICENSE_${PN}-request-form-data-asynckit = "MIT"
LICENSE_${PN}-request-form-data-combined-stream-delayed-stream = "MIT"
LICENSE_${PN}-request-form-data-combined-stream = "MIT"
LICENSE_${PN}-request-form-data-mime-types-mime-db = "MIT"
LICENSE_${PN}-request-form-data-mime-types = "MIT"
LICENSE_${PN}-request-form-data = "MIT"
LICENSE_${PN}-request-har-validator-ajv-fast-deep-equal = "MIT"
LICENSE_${PN}-request-har-validator-ajv-fast-json-stable-stringify = "MIT"
LICENSE_${PN}-request-har-validator-ajv-json-schema-traverse = "MIT"
LICENSE_${PN}-request-har-validator-ajv-uri-js-punycode = "MIT"
LICENSE_${PN}-request-har-validator-ajv-uri-js = "BSD-2-Clause"
LICENSE_${PN}-request-har-validator-ajv = "MIT"
LICENSE_${PN}-request-har-validator-har-schema = "ISC"
LICENSE_${PN}-request-har-validator = "MIT"
LICENSE_${PN}-request-http-signature-assert-plus = "MIT"
LICENSE_${PN}-request-http-signature-jsprim-assert-plus = "MIT"
LICENSE_${PN}-request-http-signature-jsprim-extsprintf = "MIT"
LICENSE_${PN}-request-http-signature-jsprim-json-schema = "Unknown"
LICENSE_${PN}-request-http-signature-jsprim-verror-assert-plus = "MIT"
LICENSE_${PN}-request-http-signature-jsprim-verror-core-util-is = "MIT"
LICENSE_${PN}-request-http-signature-jsprim-verror-extsprintf = "MIT"
LICENSE_${PN}-request-http-signature-jsprim-verror = "MIT"
LICENSE_${PN}-request-http-signature-jsprim = "MIT"
LICENSE_${PN}-request-http-signature-sshpk-asn1-safer-buffer = "MIT"
LICENSE_${PN}-request-http-signature-sshpk-asn1 = "MIT"
LICENSE_${PN}-request-http-signature-sshpk-assert-plus = "MIT"
LICENSE_${PN}-request-http-signature-sshpk-bcrypt-pbkdf-tweetnacl = "Unlicense"
LICENSE_${PN}-request-http-signature-sshpk-bcrypt-pbkdf = "BSD-3-Clause"
LICENSE_${PN}-request-http-signature-sshpk-dashdash-assert-plus = "MIT"
LICENSE_${PN}-request-http-signature-sshpk-dashdash = "MIT"
LICENSE_${PN}-request-http-signature-sshpk-ecc-jsbn-jsbn = "MIT"
LICENSE_${PN}-request-http-signature-sshpk-ecc-jsbn-safer-buffer = "MIT"
LICENSE_${PN}-request-http-signature-sshpk-ecc-jsbn = "Unknown MIT"
LICENSE_${PN}-request-http-signature-sshpk-getpass-assert-plus = "MIT"
LICENSE_${PN}-request-http-signature-sshpk-getpass = "MIT"
LICENSE_${PN}-request-http-signature-sshpk-jsbn = "MIT"
LICENSE_${PN}-request-http-signature-sshpk-safer-buffer = "MIT"
LICENSE_${PN}-request-http-signature-sshpk-tweetnacl = "Unlicense"
LICENSE_${PN}-request-http-signature-sshpk = "MIT"
LICENSE_${PN}-request-http-signature = "MIT"
LICENSE_${PN}-request-is-typedarray = "MIT"
LICENSE_${PN}-request-isstream = "MIT"
LICENSE_${PN}-request-json-stringify-safe = "ISC"
LICENSE_${PN}-request-mime-types = "MIT"
LICENSE_${PN}-request-oauth-sign = "Apache-2.0"
LICENSE_${PN}-request-performance-now = "MIT"
LICENSE_${PN}-request-qs = "BSD-3-Clause"
LICENSE_${PN}-request-safe-buffer = "MIT"
LICENSE_${PN}-request-tough-cookie-psl = "MIT"
LICENSE_${PN}-request-tough-cookie-punycode = "MIT"
LICENSE_${PN}-request-tough-cookie = "BSD-3-Clause"
LICENSE_${PN}-request-tunnel-agent-safe-buffer = "MIT"
LICENSE_${PN}-request-tunnel-agent = "Apache-2.0"
LICENSE_${PN}-request-uuid = "MIT"
LICENSE_${PN}-request = "Apache-2.0"
LICENSE_${PN}-require-reload-tests-lib-require-reload-test = "Unknown"
LICENSE_${PN}-require-reload-tests-require-reload-test = "Unknown"
LICENSE_${PN}-require-reload = "MIT"
LICENSE_${PN}-tar-chownr = "ISC"
LICENSE_${PN}-tar-fs-minipass-minipass = "ISC"
LICENSE_${PN}-tar-fs-minipass = "ISC"
LICENSE_${PN}-tar-minipass-safe-buffer = "MIT"
LICENSE_${PN}-tar-minipass-yallist = "ISC"
LICENSE_${PN}-tar-minipass = "ISC"
LICENSE_${PN}-tar-minizlib-minipass = "ISC"
LICENSE_${PN}-tar-minizlib = "MIT"
LICENSE_${PN}-tar-mkdirp-minimist = "MIT"
LICENSE_${PN}-tar-mkdirp = "MIT"
LICENSE_${PN}-tar-safe-buffer = "MIT"
LICENSE_${PN}-tar-yallist = "ISC"
LICENSE_${PN}-tar = "ISC"
LICENSE_${PN}-uuid = "MIT"
LICENSE_${PN} = "MIT"

DEPENDS += " bash nodejs"
RDEPENDS_${PN} += " python nodejs nodejs-npm"