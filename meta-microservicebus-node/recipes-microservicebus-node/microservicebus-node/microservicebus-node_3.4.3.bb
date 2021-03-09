# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "node.js node for microservicebus. Please visit https://microservicebus.com for more information."
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   getlicenses.js
#   node_modules/string_decoder/LICENSE
#   node_modules/colors/LICENSE
#   node_modules/jsbn/LICENSE
#   node_modules/verror/LICENSE
#   node_modules/oauth-sign/LICENSE
#   node_modules/isstream/LICENSE.md
#   node_modules/tunnel-agent/LICENSE
#   node_modules/aws-sign2/LICENSE
#   node_modules/forever-agent/LICENSE
#   node_modules/extsprintf/LICENSE
#   node_modules/request/LICENSE
#   node_modules/minizlib/LICENSE
#   node_modules/readable-stream/LICENSE
#   node_modules/jsprim/LICENSE
#   node_modules/uri-js/LICENSE
#   node_modules/duplexer2/LICENSE.md
#   node_modules/rc/LICENSE.BSD
#   node_modules/rc/LICENSE.APACHE2
#   node_modules/process-nextick-args/license.md
#   node_modules/bcrypt-pbkdf/LICENSE
#   node_modules/tweetnacl/LICENSE
#   node_modules/qs/LICENSE
#   node_modules/caseless/LICENSE
#   node_modules/ecc-jsbn/lib/LICENSE-jsbn
#   node_modules/dashdash/LICENSE.txt
#   node_modules/asn1/LICENSE
#   node_modules/tough-cookie/LICENSE
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "MIT & Unknown & ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cc883f74a12beac0fd9a1809032541d0 \
                    file://getlicenses.js;md5=8f6c14f3ec26a0536cf2ba8ec2160abe \
                    file://node_modules/is-arrayish/LICENSE;md5=e67c75e89656b80fd99cb7d30fb43102 \
                    file://node_modules/string_decoder/LICENSE;md5=14af51f8c0a6c6e400b53e18c6e5f85c \
                    file://node_modules/colors/LICENSE;md5=441ee46669f9365ff2492e9b555c8ee7 \
                    file://node_modules/lowercase-keys/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/url-parse-lax/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/asynckit/LICENSE;md5=177bc287fb9558bf3ea50b440c1c86ff \
                    file://node_modules/prepend-http/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/ajv/LICENSE;md5=4973982316cdc12e988b814af2813df7 \
                    file://node_modules/http-signature/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/graceful-readlink/LICENSE;md5=b0270ddb7ee6643eee76e80113234806 \
                    file://node_modules/json-schema-traverse/LICENSE;md5=ea87ade09b9e6da4f2e47904a4ee137b \
                    file://node_modules/uuid/LICENSE.md;md5=353e680cdafd96bf30131cbb7b14a6e8 \
                    file://node_modules/error-ex/LICENSE;md5=e67c75e89656b80fd99cb7d30fb43102 \
                    file://node_modules/read-all-stream/license;md5=2a8369b875113ae53aa6c5bb39a58d3c \
                    file://node_modules/jsbn/LICENSE;md5=c6ea389b6b52325149beeec27075c5ac \
                    file://node_modules/form-data/License;md5=7aa505292e2636a9e59d4d3f258f4819 \
                    file://node_modules/got/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/fast-deep-equal/LICENSE;md5=ea87ade09b9e6da4f2e47904a4ee137b \
                    file://node_modules/pinkie-promise/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/extend/LICENSE;md5=33d9f7a91df276ec16aa941032ee1476 \
                    file://node_modules/har-schema/LICENSE;md5=bfa81591facc9224e4c7451c8dc12958 \
                    file://node_modules/require-reload/LICENSE;md5=9862e3aecc2338bb6a1af4d73cc7a1e7 \
                    file://node_modules/punycode/LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987 \
                    file://node_modules/pinkie/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/mime-db/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/verror/LICENSE;md5=04fce49dd88d841ceb36616ab9789ce0 \
                    file://node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/is-stream/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/iconv-lite/LICENSE;md5=f942263d98f0d75e0e0101884e86261d \
                    file://node_modules/minipass/LICENSE;md5=ff53df3ad94e5c618e230ab49ce310fa \
                    file://node_modules/oauth-sign/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/core-util-is/LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff \
                    file://node_modules/deep-extend/LICENSE;md5=827bb5781213ff1e9d2fe309bbfc0115 \
                    file://node_modules/fs-minipass/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/isstream/LICENSE.md;md5=1798150b9d70250c42b55b3530e6af2b \
                    file://node_modules/commander/LICENSE;md5=25851d4d10d6611a12d5571dab945a00 \
                    file://node_modules/tunnel-agent/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/aws-sign2/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/forever-agent/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/fast-json-stable-stringify/LICENSE;md5=febe55307df96f60ad763842f5a8ca6f \
                    file://node_modules/extsprintf/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://node_modules/getpass/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/ini/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/is-retry-allowed/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/timed-out/license;md5=2a8369b875113ae53aa6c5bb39a58d3c \
                    file://node_modules/is-redirect/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/capture-stack-trace/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/request/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/request/node_modules/uuid/LICENSE.md;md5=c9420736e23afb538ba5fbe44197f0b4 \
                    file://node_modules/minizlib/LICENSE;md5=d8a0ca0c46bfa01db064fa836f550966 \
                    file://node_modules/yallist/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/mkdirp/LICENSE;md5=f653359cc2be3ff55aa601d58d84c808 \
                    file://node_modules/jsprim/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://node_modules/tar/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/uri-js/LICENSE;md5=3b55dad4a98748003b5b423477713da1 \
                    file://node_modules/util-deprecate/LICENSE;md5=b7c99ef4b0f3ad9911a52219947f8cf0 \
                    file://node_modules/aws4/LICENSE;md5=ff6f181928a91d8631d565516b4db3cb \
                    file://node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/package-json/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/unzip-response/license;md5=5b422d6bf88afe88977d04f8bdd4959c \
                    file://node_modules/duplexer2/LICENSE.md;md5=2ac3dfdce5a77f9cff9b5f70d216d17d \
                    file://node_modules/is-typedarray/LICENSE.md;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/rc/LICENSE.BSD;md5=e7a2a325a0069e82aff675bbf74464a0 \
                    file://node_modules/rc/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/rc/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/json-stringify-safe/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/process-nextick-args/license.md;md5=216769dac98a78ec088ee7cc6fad1dfa \
                    file://node_modules/delayed-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/create-error-class/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/bcrypt-pbkdf/LICENSE;md5=aaf6ebb9d1b815768d32661e72bdd761 \
                    file://node_modules/sshpk/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/parse-json/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/tweetnacl/LICENSE;md5=911690f51af322440237a253d695d19f \
                    file://node_modules/object-assign/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/psl/LICENSE;md5=2425d288296fae32e27553694ff40294 \
                    file://node_modules/qs/LICENSE;md5=d5c7c6dc45a33a0a9620ed81315672d7 \
                    file://node_modules/caseless/LICENSE;md5=e9dadf023ba6ebd98e3e0acb6e2470e3 \
                    file://node_modules/performance-now/license.txt;md5=a07ae1b6dc33215d89a1281ee71c863c \
                    file://node_modules/ecc-jsbn/LICENSE;md5=0d289b6d63cbcc18e4b2af9a5bd28b54 \
                    file://node_modules/ecc-jsbn/lib/LICENSE-jsbn;md5=32052d48bacabd1c02e56c6889082a27 \
                    file://node_modules/registry-url/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-status-codes/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/dashdash/LICENSE.txt;md5=ebce61c1a0900d798daaf5853c69ce72 \
                    file://node_modules/network/node_modules/async/LICENSE;md5=dc113e0fc4029c29942399ad22425402 \
                    file://node_modules/combined-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/har-validator/LICENSE;md5=6f7daec5e5143ffeb21745646b425ab2 \
                    file://node_modules/chownr/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/asn1/LICENSE;md5=5ce2f42143c298495637e28e40cd5462 \
                    file://node_modules/wmic/node_modules/async/LICENSE;md5=73f63c1fa4541b2f2f34d77140ebe89d \
                    file://node_modules/strip-json-comments/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/needle/license.txt;md5=331eb5d406e4439ff2e996b744f54d90 \
                    file://node_modules/async/LICENSE;md5=73f63c1fa4541b2f2f34d77140ebe89d \
                    file://node_modules/tough-cookie/LICENSE;md5=7189377a5215f1211b70cf2b9754841e \
                    file://node_modules/safer-buffer/LICENSE;md5=3baebc2a17b8f5bff04882cd0dc0f76e \
                    file://package.json;md5=78c90dcdd7623f1d9f2c4b5fbcb5b7b4 \
                    file://node_modules/ajv/package.json;md5=bc185fb380e6969e7ae607dde40bc9c3 \
                    file://node_modules/app-module-path/package.json;md5=0ec4db8ff00dad3ef341503e0c7b4aca \
                    file://node_modules/asn1/package.json;md5=0c5153fa7dfd857870bc28c3bacf921d \
                    file://node_modules/assert-plus/package.json;md5=2b7930e340a2439c18ca9871c3dbb834 \
                    file://node_modules/async/package.json;md5=4352ed13333ee61619386feb1caf0bfd \
                    file://node_modules/asynckit/package.json;md5=e1fcbbcbd664b4b2966883624fbad801 \
                    file://node_modules/aws-sign2/package.json;md5=f4b8ff99a798371a0647cdc9243723f6 \
                    file://node_modules/aws4/package.json;md5=d96c3cfaa1a1fe6cd87f289f5bff1cd5 \
                    file://node_modules/bcrypt-pbkdf/package.json;md5=1950748932ca316ec58675f625809860 \
                    file://node_modules/capture-stack-trace/package.json;md5=4efaf36edafbd14d9e18f2925d436ac7 \
                    file://node_modules/caseless/package.json;md5=0b6c0d646d6be3e0439fd5c4cb50eb31 \
                    file://node_modules/chownr/package.json;md5=8f7eeb8b80a6ebb304df487b88cbd703 \
                    file://node_modules/colors/package.json;md5=4327d7f964260e081ec682385f046758 \
                    file://node_modules/combined-stream/package.json;md5=089f95f5df2908028bdbbe545ad5c0e3 \
                    file://node_modules/commander/package.json;md5=62a092fd9c7f04706a46da68049afaec \
                    file://node_modules/compare-version/package.json;md5=850c36412a0ec78989a57f704b759910 \
                    file://node_modules/core-util-is/package.json;md5=685b947d7cae341b1e6f305b205da7ae \
                    file://node_modules/create-error-class/package.json;md5=43fc026bb0890d17a732a401a2a0faa6 \
                    file://node_modules/dashdash/package.json;md5=0ffb1aad4da09fac3c64eb3c09d10c49 \
                    file://node_modules/debug/package.json;md5=71a7656944ffe50cc27ebe02491ae49b \
                    file://node_modules/deep-extend/package.json;md5=843d8bcf451f015c3a6b3930e0b6eaee \
                    file://node_modules/delayed-stream/package.json;md5=cd5e299bb3405995d7e81ead42d4949d \
                    file://node_modules/duplexer2/package.json;md5=4eb79ce818182efe036989dc61691910 \
                    file://node_modules/ecc-jsbn/package.json;md5=0ee3b1b336a7d241844622b050681563 \
                    file://node_modules/error-ex/package.json;md5=0663755e17d14453332b4e48c7aea9d4 \
                    file://node_modules/extend/package.json;md5=5074ec873b4010df5203d20e73e65246 \
                    file://node_modules/extsprintf/package.json;md5=7c02b29c15d45f83ee155dc101993c76 \
                    file://node_modules/fast-deep-equal/package.json;md5=da1199afd6b2d7a1eaa9e30acd35f4e6 \
                    file://node_modules/fast-json-stable-stringify/package.json;md5=903a31da36d2259011d342196a9b1265 \
                    file://node_modules/forever-agent/package.json;md5=71ca2080c34c1c0f241895916e86b3a9 \
                    file://node_modules/form-data/package.json;md5=bd35e0b775988ee9080c108ad5aa2ee1 \
                    file://node_modules/fs-minipass/package.json;md5=5391f566f8afb10ff27831ab50bff208 \
                    file://node_modules/getpass/package.json;md5=37a5fcbc8b99a0676c8f83fc7169fe4a \
                    file://node_modules/got/package.json;md5=5e10b0f11dea8c64ff1caf1057f4cb16 \
                    file://node_modules/graceful-readlink/package.json;md5=f881aaad9fe682764eae2e89914e858a \
                    file://node_modules/har-schema/package.json;md5=54d2c0fffb398fed596e246ee7a19829 \
                    file://node_modules/har-validator/package.json;md5=ed1b063932b04bc4dde19bd9293415de \
                    file://node_modules/http-signature/package.json;md5=72db3ad4de36b5604debdf9e7bb78ff9 \
                    file://node_modules/iconv-lite/package.json;md5=a8b97f25878ddc5419a9afe173037035 \
                    file://node_modules/inherits/package.json;md5=f73908dab55d4259f3ed052ce9fb2fbb \
                    file://node_modules/ini/package.json;md5=b613cca593420ef7097ea40ac8705690 \
                    file://node_modules/is-arrayish/package.json;md5=c7d062aad2809fdef776f85e4da00eb5 \
                    file://node_modules/is-redirect/package.json;md5=bac99ecfc5ace6a9b7c58d01dcd9442a \
                    file://node_modules/is-retry-allowed/package.json;md5=46f88852bde05671f60f2701a2509e98 \
                    file://node_modules/is-stream/package.json;md5=85ba3dbdbccd3e5f8505dd02a538db06 \
                    file://node_modules/is-typedarray/package.json;md5=018697ad65588671c2bdd7b3ec2bdef3 \
                    file://node_modules/isarray/package.json;md5=a490f11007b2cc9d19c4a250592c2e71 \
                    file://node_modules/isstream/package.json;md5=2c74d78c5b8e181e78e90b9a3e2fd0e0 \
                    file://node_modules/jsbn/package.json;md5=a10cd005c4727beb0ca9b4f9fb37b441 \
                    file://node_modules/json-schema/package.json;md5=52088871554be9185eff18969e96948a \
                    file://node_modules/json-schema-traverse/package.json;md5=e706b186146b3f00005442861f98c091 \
                    file://node_modules/json-stringify-safe/package.json;md5=184d1a71034cb154ad7d1abf0e64e3a0 \
                    file://node_modules/jsprim/package.json;md5=9e330579d00de959cda1726ea6aa37ef \
                    file://node_modules/lowercase-keys/package.json;md5=178ca96ff779a0ac1a60d2b50b81956c \
                    file://node_modules/mime-db/package.json;md5=0e8c957f7c9bb16ad6a9d8ce1327e91c \
                    file://node_modules/mime-types/package.json;md5=4d78752212821b31da04f985667090de \
                    file://node_modules/minimist/package.json;md5=84505571ecc56b8071068f44de7c79b2 \
                    file://node_modules/minipass/package.json;md5=61e41d32eda6e2aa0e845ec4e6f79aaa \
                    file://node_modules/minizlib/package.json;md5=18063883e703c0f5da4521ecd2fedf57 \
                    file://node_modules/mkdirp/package.json;md5=6a1f8790c34f10f8e970819eef841cd4 \
                    file://node_modules/ms/package.json;md5=cbd55880a650b56c3d5acddbbdbee9bc \
                    file://node_modules/needle/package.json;md5=a2384779a3dc12d41e750d494100ec8d \
                    file://node_modules/network/node_modules/async/package.json;md5=c307f401b8512aa5ab70eb7ac1efe62d \
                    file://node_modules/network/package.json;md5=d2428b3e385bc5c39ad738921fb70fe4 \
                    file://node_modules/node-status-codes/package.json;md5=7f2d5001c44231289f08ea5fd397cad2 \
                    file://node_modules/oauth-sign/package.json;md5=7b1e2f118776b8af50278f4629cba165 \
                    file://node_modules/object-assign/package.json;md5=2854c33ba575a9ebc613d1a617ece277 \
                    file://node_modules/package-json/package.json;md5=87bc0246517a8517bc966317298be4f0 \
                    file://node_modules/parse-json/package.json;md5=8c60533f01154efc5e33af0a4b1f4272 \
                    file://node_modules/performance-now/package.json;md5=ffd06b287f3c72ca8ca1abcdf43aab53 \
                    file://node_modules/pinkie/package.json;md5=3f35dc060ffed961606280c0c1171fe2 \
                    file://node_modules/pinkie-promise/package.json;md5=6b1a768dbc0d6416d3bbae9c4cf0e75b \
                    file://node_modules/prepend-http/package.json;md5=7061b533d4288287b7f3ce74a4dcc802 \
                    file://node_modules/process-nextick-args/package.json;md5=6bd1fff965ff97b4aff54e6b4e382ed0 \
                    file://node_modules/psl/package.json;md5=53c8b1b2c58bc210351376f113307326 \
                    file://node_modules/punycode/package.json;md5=11e1d3e03bb34de07e247a480cebb0b0 \
                    file://node_modules/qs/package.json;md5=dabbbd0380e4fd44e4d49cceeda84119 \
                    file://node_modules/rc/package.json;md5=dcf8f74e9fad2b9d45a0c5d70eba335d \
                    file://node_modules/read-all-stream/package.json;md5=672251a85a45c1258de09e92b810f463 \
                    file://node_modules/readable-stream/package.json;md5=55d646ab9e50735393b18c874d0bd5ab \
                    file://node_modules/registry-url/package.json;md5=8d7c4581b75ada5b11761283740a9df7 \
                    file://node_modules/request/node_modules/uuid/package.json;md5=a114f1fa334f6add6b4e4b8c0ca6057b \
                    file://node_modules/request/package.json;md5=663c3e276e3ba0b503fc062d6ceb22e0 \
                    file://node_modules/require-reload/package.json;md5=94c8389ca68f24b6bae5c2635b12eacc \
                    file://node_modules/safe-buffer/package.json;md5=bd7ef6f38f0ba20882d2601bd3ecaf11 \
                    file://node_modules/safer-buffer/package.json;md5=274d956f400350c9f6cf96d22cdda227 \
                    file://node_modules/sshpk/package.json;md5=4ced8d334a4cd023e5b663c51ae88bc5 \
                    file://node_modules/string_decoder/package.json;md5=4a56e8c1789fe3bc13c55f8fec7e3ce2 \
                    file://node_modules/strip-json-comments/package.json;md5=1dfad7430c94d2f136604def66ed9854 \
                    file://node_modules/tar/package.json;md5=bc3f0b301693293d76377a65567928bc \
                    file://node_modules/timed-out/package.json;md5=443ecba284dad80f56bcc13e25da9f64 \
                    file://node_modules/tough-cookie/package.json;md5=fd096f2790eb11bb538a93611a2820ee \
                    file://node_modules/tunnel-agent/package.json;md5=36d88acec2f39b7b86a347a0d8117296 \
                    file://node_modules/tweetnacl/package.json;md5=d8e646711b5775f632423c9ece45bec4 \
                    file://node_modules/unzip-response/package.json;md5=71dd3a5958bb8b37cb79b2f09ffe574f \
                    file://node_modules/uri-js/package.json;md5=7c79a9087e2e5f406201efae4c65b75b \
                    file://node_modules/url-parse-lax/package.json;md5=60a9dcdd32590d5f6ed91f715767eafa \
                    file://node_modules/util-deprecate/package.json;md5=73e6c3ff1709538c921d13a75cae485d \
                    file://node_modules/uuid/package.json;md5=aa619957486afb552d32f68b57d8516b \
                    file://node_modules/verror/package.json;md5=5721040ba86c8a3b64364ccd5576a208 \
                    file://node_modules/wmic/node_modules/async/package.json;md5=4352ed13333ee61619386feb1caf0bfd \
                    file://node_modules/wmic/package.json;md5=a445c18b9ac7c8e19d369d441d34d140 \
                    file://node_modules/yallist/package.json;md5=b15d27bf2cf04083fef9389ce68aa620"

SRC_URI = " \
    npm://registry.npmjs.org/;name=cute-files;version=${PV};package=microservicebus-node \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    "

S = "${WORKDIR}/npm"

inherit npm

LICENSE_${PN} = "MIT Unknown"
LICENSE_${PN}-ajv = "MIT"
LICENSE_${PN}-app-module-path = "Unknown"
LICENSE_${PN}-asn1 = "Unknown"
LICENSE_${PN}-assert-plus = "Unknown"
LICENSE_${PN}-async = "MIT"
LICENSE_${PN}-asynckit = "MIT"
LICENSE_${PN}-aws-sign2 = "Unknown"
LICENSE_${PN}-aws4 = "MIT"
LICENSE_${PN}-bcrypt-pbkdf = "Unknown"
LICENSE_${PN}-capture-stack-trace = "MIT"
LICENSE_${PN}-caseless = "Unknown"
LICENSE_${PN}-chownr = "ISC"
LICENSE_${PN}-colors = "Unknown"
LICENSE_${PN}-combined-stream = "MIT"
LICENSE_${PN}-commander = "MIT"
LICENSE_${PN}-compare-version = "Unknown"
LICENSE_${PN}-core-util-is = "MIT"
LICENSE_${PN}-create-error-class = "MIT"
LICENSE_${PN}-dashdash = "Unknown"
LICENSE_${PN}-debug = "MIT"
LICENSE_${PN}-deep-extend = "MIT"
LICENSE_${PN}-delayed-stream = "MIT"
LICENSE_${PN}-duplexer2 = "Unknown"
LICENSE_${PN}-ecc-jsbn = "MIT Unknown"
LICENSE_${PN}-error-ex = "MIT"
LICENSE_${PN}-extend = "MIT"
LICENSE_${PN}-extsprintf = "Unknown"
LICENSE_${PN}-fast-deep-equal = "MIT"
LICENSE_${PN}-fast-json-stable-stringify = "MIT"
LICENSE_${PN}-forever-agent = "Unknown"
LICENSE_${PN}-form-data = "MIT"
LICENSE_${PN}-fs-minipass = "ISC"
LICENSE_${PN}-getpass = "MIT"
LICENSE_${PN}-got = "MIT"
LICENSE_${PN}-graceful-readlink = "MIT"
LICENSE_${PN}-har-schema = "ISC"
LICENSE_${PN}-har-validator = "MIT"
LICENSE_${PN}-http-signature = "MIT"
LICENSE_${PN}-iconv-lite = "MIT"
LICENSE_${PN}-inherits = "ISC"
LICENSE_${PN}-ini = "ISC"
LICENSE_${PN}-is-arrayish = "MIT"
LICENSE_${PN}-is-redirect = "MIT"
LICENSE_${PN}-is-retry-allowed = "MIT"
LICENSE_${PN}-is-stream = "MIT"
LICENSE_${PN}-is-typedarray = "MIT"
LICENSE_${PN}-isarray = "Unknown"
LICENSE_${PN}-isstream = "Unknown"
LICENSE_${PN}-jsbn = "Unknown"
LICENSE_${PN}-json-schema = "Unknown"
LICENSE_${PN}-json-schema-traverse = "MIT"
LICENSE_${PN}-json-stringify-safe = "ISC"
LICENSE_${PN}-jsprim = "Unknown"
LICENSE_${PN}-lowercase-keys = "MIT"
LICENSE_${PN}-mime-db = "MIT"
LICENSE_${PN}-mime-types = "MIT"
LICENSE_${PN}-minimist = "MIT"
LICENSE_${PN}-minipass = "ISC"
LICENSE_${PN}-minizlib = "Unknown"
LICENSE_${PN}-mkdirp = "MIT"
LICENSE_${PN}-ms = "MIT"
LICENSE_${PN}-needle = "MIT"
LICENSE_${PN}-network-async = "MIT"
LICENSE_${PN}-network = "Unknown"
LICENSE_${PN}-node-status-codes = "MIT"
LICENSE_${PN}-oauth-sign = "Unknown"
LICENSE_${PN}-object-assign = "MIT"
LICENSE_${PN}-package-json = "MIT"
LICENSE_${PN}-parse-json = "MIT"
LICENSE_${PN}-performance-now = "MIT"
LICENSE_${PN}-pinkie = "MIT"
LICENSE_${PN}-pinkie-promise = "MIT"
LICENSE_${PN}-prepend-http = "MIT"
LICENSE_${PN}-process-nextick-args = "Unknown"
LICENSE_${PN}-psl = "MIT"
LICENSE_${PN}-punycode = "MIT"
LICENSE_${PN}-qs = "Unknown"
LICENSE_${PN}-rc = "MIT Unknown"
LICENSE_${PN}-read-all-stream = "MIT"
LICENSE_${PN}-readable-stream = "Unknown"
LICENSE_${PN}-registry-url = "MIT"
LICENSE_${PN}-request-uuid = "MIT"
LICENSE_${PN}-request = "Unknown"
LICENSE_${PN}-require-reload = "MIT"
LICENSE_${PN}-safe-buffer = "MIT"
LICENSE_${PN}-safer-buffer = "MIT"
LICENSE_${PN}-sshpk = "MIT"
LICENSE_${PN}-stringdecoder = "Unknown"
LICENSE_${PN}-strip-json-comments = "MIT"
LICENSE_${PN}-tar = "ISC"
LICENSE_${PN}-timed-out = "MIT"
LICENSE_${PN}-tough-cookie = "Unknown"
LICENSE_${PN}-tunnel-agent = "Unknown"
LICENSE_${PN}-tweetnacl = "Unknown"
LICENSE_${PN}-unzip-response = "MIT"
LICENSE_${PN}-uri-js = "Unknown"
LICENSE_${PN}-url-parse-lax = "MIT"
LICENSE_${PN}-util-deprecate = "MIT"
LICENSE_${PN}-uuid = "MIT"
LICENSE_${PN}-verror = "Unknown"
LICENSE_${PN}-wmic-async = "MIT"
LICENSE_${PN}-wmic = "Unknown"
LICENSE_${PN}-yallist = "ISC"
