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
#   node_modules/network/node_modules/wmic/node_modules/async/node_modules/lodash/LICENSE
#   node_modules/tar/node_modules/minizlib/LICENSE
#   node_modules/colors/LICENSE
#   node_modules/npm/LICENSE
#   node_modules/npm/node_modules/libcipm/node_modules/bin-links/LICENSE
#   node_modules/npm/node_modules/libcipm/node_modules/npm-logical-tree/LICENSE.md
#   node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/ssri/LICENSE.md
#   node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/mississippi/license
#   node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/tar/node_modules/minizlib/LICENSE
#   node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/promise-retry/node_modules/retry/License
#   node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/npm-pick-manifest/LICENSE.md
#   node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/normalize-package-data/LICENSE
#   node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/LICENSE
#   node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/through2/LICENSE.html
#   node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/through2/LICENSE.md
#   node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/from2/LICENSE.md
#   node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/concat-stream/node_modules/typedarray/LICENSE
#   node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/node-fetch-npm/node_modules/encoding/LICENSE
#   node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md
#   node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/LICENSE.md
#   node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/node_modules/mississippi/license
#   node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/node_modules/mississippi/node_modules/through2/LICENSE.html
#   node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/node_modules/mississippi/node_modules/through2/LICENSE.md
#   node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/node_modules/mississippi/node_modules/from2/LICENSE.md
#   node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/node_modules/mississippi/node_modules/concat-stream/node_modules/typedarray/LICENSE
#   node_modules/npm/node_modules/libcipm/node_modules/worker-farm/LICENSE.md
#   node_modules/npm/node_modules/libcipm/node_modules/npm-lifecycle/LICENSE
#   node_modules/npm/node_modules/npm-registry-fetch/LICENSE.md
#   node_modules/npm/node_modules/npm-registry-fetch/node_modules/figgy-pudding/LICENSE.md
#   node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/LICENSE
#   node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/ssri/LICENSE.md
#   node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/mississippi/license
#   node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/promise-retry/node_modules/retry/License
#   node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/node-fetch-npm/node_modules/encoding/LICENSE
#   node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/LICENSE.md
#   node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/ssri/LICENSE.md
#   node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/license
#   node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/through2/LICENSE.html
#   node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/through2/LICENSE.md
#   node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/from2/LICENSE.md
#   node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/concat-stream/node_modules/typedarray/LICENSE
#   node_modules/npm/node_modules/figgy-pudding/LICENSE.md
#   node_modules/npm/node_modules/columnify/node_modules/wcwidth/LICENSE
#   node_modules/npm/node_modules/columnify/node_modules/wcwidth/node_modules/defaults/node_modules/clone/LICENSE
#   node_modules/npm/node_modules/gentle-fs/LICENSE
#   node_modules/npm/node_modules/lodash.clonedeep/LICENSE
#   node_modules/npm/node_modules/npm-audit-report/LICENSE
#   node_modules/npm/node_modules/npm-audit-report/node_modules/cli-table3/node_modules/colors/LICENSE
#   node_modules/npm/node_modules/ssri/LICENSE.md
#   node_modules/npm/node_modules/lodash._bindcallback/LICENSE.txt
#   node_modules/npm/node_modules/JSONStream/LICENSE.APACHE2
#   node_modules/npm/node_modules/JSONStream/node_modules/through/LICENSE.APACHE2
#   node_modules/npm/node_modules/cli-table2/node_modules/colors/LICENSE
#   node_modules/npm/node_modules/cli-table2/node_modules/lodash/LICENSE
#   node_modules/npm/node_modules/libnpx/LICENSE.md
#   node_modules/npm/node_modules/libnpx/node_modules/dotenv/LICENSE
#   node_modules/npm/node_modules/libnpx/node_modules/update-notifier/license
#   node_modules/npm/node_modules/libnpx/node_modules/yargs/LICENSE
#   node_modules/npm/node_modules/mississippi/license
#   node_modules/npm/node_modules/mississippi/node_modules/through2/LICENSE.html
#   node_modules/npm/node_modules/mississippi/node_modules/through2/LICENSE.md
#   node_modules/npm/node_modules/mississippi/node_modules/from2/LICENSE.md
#   node_modules/npm/node_modules/mississippi/node_modules/concat-stream/node_modules/typedarray/LICENSE
#   node_modules/npm/node_modules/sorted-union-stream/node_modules/stream-iterate/node_modules/readable-stream/LICENSE
#   node_modules/npm/node_modules/sorted-union-stream/node_modules/from2/LICENSE.md
#   node_modules/npm/node_modules/bin-links/LICENSE
#   node_modules/npm/node_modules/bin-links/node_modules/gentle-fs/LICENSE
#   node_modules/npm/node_modules/bin-links/node_modules/gentle-fs/node_modules/fs-vacuum/node_modules/path-is-inside/LICENSE.txt
#   node_modules/npm/node_modules/bin-links/node_modules/gentle-fs/node_modules/path-is-inside/LICENSE.txt
#   node_modules/npm/node_modules/bin-links/node_modules/cmd-shim/LICENSE
#   node_modules/npm/node_modules/libnpmhook/LICENSE.md
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/LICENSE.md
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/figgy-pudding/LICENSE.md
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/JSONStream/LICENSE.APACHE2
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/JSONStream/node_modules/through/LICENSE.APACHE2
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/LICENSE
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/ssri/LICENSE.md
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/mississippi/license
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/promise-retry/node_modules/retry/License
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/node-fetch-npm/node_modules/encoding/LICENSE
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/LICENSE.md
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/figgy-pudding/LICENSE.md
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/fs-write-stream-atomic/node_modules/readable-stream/LICENSE
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/rimraf/node_modules/glob/node_modules/fs.realpath/LICENSE
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/ssri/LICENSE.md
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/ssri/node_modules/figgy-pudding/LICENSE.md
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/license
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/parallel-transform/node_modules/readable-stream/LICENSE
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/through2/LICENSE.html
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/through2/LICENSE.md
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/through2/node_modules/readable-stream/LICENSE
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/duplexify/node_modules/readable-stream/LICENSE
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/from2/LICENSE.md
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/from2/node_modules/readable-stream/LICENSE
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/flush-write-stream/node_modules/readable-stream/LICENSE
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/concat-stream/node_modules/typedarray/LICENSE
#   node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/concat-stream/node_modules/readable-stream/LICENSE
#   node_modules/npm/node_modules/libnpmhook/node_modules/figgy-pudding/LICENSE.md
#   node_modules/npm/node_modules/lodash._baseuniq/LICENSE
#   node_modules/npm/node_modules/lodash._baseuniq/node_modules/lodash._createset/LICENSE
#   node_modules/npm/node_modules/lodash._baseuniq/node_modules/lodash._root/LICENSE
#   node_modules/npm/node_modules/qrcode-terminal/LICENSE
#   node_modules/npm/node_modules/npm-user-validate/LICENSE
#   node_modules/npm/node_modules/tar/node_modules/minizlib/LICENSE
#   node_modules/npm/node_modules/lodash.union/LICENSE
#   node_modules/npm/node_modules/lodash._getnative/LICENSE
#   node_modules/npm/node_modules/ansistyles/LICENSE
#   node_modules/npm/node_modules/lodash._baseindexof/LICENSE.txt
#   node_modules/npm/node_modules/update-notifier/license
#   node_modules/npm/node_modules/update-notifier/node_modules/configstore/license
#   node_modules/npm/node_modules/update-notifier/node_modules/is-installed-globally/node_modules/is-path-inside/node_modules/path-is-inside/LICENSE.txt
#   node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/got/node_modules/duplexer3/LICENSE.md
#   node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/registry-url/node_modules/rc/LICENSE.APACHE2
#   node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/registry-url/node_modules/rc/LICENSE.BSD
#   node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/registry-auth-token/node_modules/rc/LICENSE.APACHE2
#   node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/registry-auth-token/node_modules/rc/LICENSE.BSD
#   node_modules/npm/node_modules/pacote/node_modules/promise-retry/node_modules/retry/License
#   node_modules/npm/node_modules/pacote/node_modules/make-fetch-happen/LICENSE
#   node_modules/npm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/node-fetch-npm/node_modules/encoding/LICENSE
#   node_modules/npm/node_modules/pacote/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md
#   node_modules/npm/node_modules/npm-pick-manifest/LICENSE.md
#   node_modules/npm/node_modules/normalize-package-data/LICENSE
#   node_modules/npm/node_modules/lodash._cacheindexof/LICENSE.txt
#   node_modules/npm/node_modules/lodash.without/LICENSE
#   node_modules/npm/node_modules/sha/LICENSE
#   node_modules/npm/node_modules/sha/node_modules/readable-stream/LICENSE
#   node_modules/npm/node_modules/sorted-object/LICENSE.txt
#   node_modules/npm/node_modules/cmd-shim/LICENSE
#   node_modules/npm/node_modules/request/LICENSE
#   node_modules/npm/node_modules/request/node_modules/forever-agent/LICENSE
#   node_modules/npm/node_modules/request/node_modules/isstream/LICENSE.md
#   node_modules/npm/node_modules/request/node_modules/hawk/LICENSE
#   node_modules/npm/node_modules/request/node_modules/hawk/node_modules/cryptiles/LICENSE
#   node_modules/npm/node_modules/request/node_modules/hawk/node_modules/cryptiles/node_modules/boom/LICENSE
#   node_modules/npm/node_modules/request/node_modules/hawk/node_modules/sntp/LICENSE
#   node_modules/npm/node_modules/request/node_modules/hawk/node_modules/boom/LICENSE
#   node_modules/npm/node_modules/request/node_modules/hawk/node_modules/hoek/LICENSE
#   node_modules/npm/node_modules/request/node_modules/qs/LICENSE
#   node_modules/npm/node_modules/request/node_modules/caseless/LICENSE
#   node_modules/npm/node_modules/request/node_modules/tough-cookie/LICENSE
#   node_modules/npm/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/asn1/LICENSE
#   node_modules/npm/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/jsbn/LICENSE
#   node_modules/npm/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/lib/LICENSE-jsbn
#   node_modules/npm/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/dashdash/LICENSE.txt
#   node_modules/npm/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/tweetnacl/LICENSE
#   node_modules/npm/node_modules/request/node_modules/http-signature/node_modules/jsprim/LICENSE
#   node_modules/npm/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/extsprintf/LICENSE
#   node_modules/npm/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/LICENSE
#   node_modules/npm/node_modules/request/node_modules/tunnel-agent/LICENSE
#   node_modules/npm/node_modules/request/node_modules/aws-sign2/LICENSE
#   node_modules/npm/node_modules/request/node_modules/oauth-sign/LICENSE
#   node_modules/npm/node_modules/read-package-tree/node_modules/read-package-json/node_modules/normalize-package-data/LICENSE
#   node_modules/npm/node_modules/worker-farm/LICENSE.md
#   node_modules/npm/node_modules/worker-farm/node_modules/errno/node_modules/prr/LICENSE.md
#   node_modules/npm/node_modules/retry/License
#   node_modules/npm/node_modules/path-is-inside/LICENSE.txt
#   node_modules/npm/node_modules/opener/LICENSE.txt
#   node_modules/npm/node_modules/glob/node_modules/fs.realpath/LICENSE
#   node_modules/npm/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md
#   node_modules/npm/node_modules/npm-lifecycle/LICENSE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/byline/LICENSE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/gyp/LICENSE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/tar/node_modules/block-stream/LICENCE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/LICENSE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/forever-agent/LICENSE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/isstream/LICENSE.md
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/qs/LICENSE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/caseless/LICENSE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/tough-cookie/LICENSE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/asn1/LICENSE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/jsbn/LICENSE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/lib/LICENSE-jsbn
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/node_modules/jsbn/LICENSE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/dashdash/LICENSE.txt
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/tweetnacl/LICENSE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/bcrypt-pbkdf/LICENSE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/bcrypt-pbkdf/node_modules/tweetnacl/LICENSE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/jsprim/LICENSE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/extsprintf/LICENSE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/LICENSE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/node_modules/extsprintf/LICENSE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/tunnel-agent/LICENSE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/aws-sign2/LICENSE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/oauth-sign/LICENSE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/nopt/node_modules/abbrev/LICENSE
#   node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/LICENSE
#   node_modules/npm/node_modules/npm-packlist/node_modules/ignore-walk/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md
#   node_modules/npm/node_modules/nopt/node_modules/abbrev/LICENSE
#   node_modules/npm/node_modules/readable-stream/LICENSE
#   node_modules/npm/node_modules/readable-stream/node_modules/string_decoder/LICENSE
#   node_modules/npm/node_modules/readable-stream/node_modules/process-nextick-args/license.md
#   node_modules/npm/node_modules/node-gyp/gyp/LICENSE
#   node_modules/npm/node_modules/node-gyp/node_modules/tar/node_modules/block-stream/LICENCE
#   node_modules/npm/node_modules/node-gyp/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md
#   node_modules/npm/node_modules/abbrev/LICENSE
#   node_modules/npm/node_modules/cacache/LICENSE.md
#   node_modules/npm/node_modules/lodash._createcache/LICENSE
#   node_modules/npm/node_modules/lodash._createcache/node_modules/lodash._getnative/LICENSE
#   node_modules/npm/node_modules/lodash.restparam/LICENSE.txt
#   node_modules/npm/node_modules/npm-install-checks/LICENSE
#   node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/LICENSE
#   node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/ssri/LICENSE.md
#   node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/through2/LICENSE.html
#   node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/through2/LICENSE.md
#   node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/from2/LICENSE.md
#   node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/concat-stream/node_modules/typedarray/LICENSE
#   node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/promise-retry/node_modules/retry/License
#   node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/node-fetch-npm/node_modules/encoding/LICENSE
#   node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/LICENSE.md
#   node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/license
#   node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/through2/LICENSE.html
#   node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/through2/LICENSE.md
#   node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/from2/LICENSE.md
#   node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/concat-stream/node_modules/typedarray/LICENSE
#   node_modules/npm/node_modules/lodash.uniq/LICENSE
#   node_modules/npm/node_modules/ansicolors/LICENSE
#   node_modules/npm/node_modules/is-cidr/LICENSE
#   node_modules/npm/node_modules/is-cidr/node_modules/cidr-regex/LICENSE
#   node_modules/npm/node_modules/npm-registry-client/node_modules/ssri/LICENSE.md
#   node_modules/npm/node_modules/npm-registry-client/node_modules/normalize-package-data/LICENSE
#   node_modules/npm/node_modules/npm-registry-client/node_modules/request/LICENSE
#   node_modules/npm/node_modules/npm-registry-client/node_modules/retry/License
#   node_modules/npm/node_modules/npm-registry-client/node_modules/concat-stream/node_modules/typedarray/LICENSE
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
#   node_modules/request/node_modules/hawk/LICENSE
#   node_modules/request/node_modules/hawk/node_modules/cryptiles/LICENSE
#   node_modules/request/node_modules/hawk/node_modules/cryptiles/node_modules/boom/LICENSE
#   node_modules/request/node_modules/hawk/node_modules/cryptiles/node_modules/boom/node_modules/hoek/LICENSE
#   node_modules/request/node_modules/hawk/node_modules/sntp/LICENSE
#   node_modules/request/node_modules/hawk/node_modules/sntp/node_modules/hoek/LICENSE
#   node_modules/request/node_modules/hawk/node_modules/boom/LICENSE
#   node_modules/request/node_modules/hawk/node_modules/boom/node_modules/hoek/LICENSE
#   node_modules/request/node_modules/hawk/node_modules/hoek/LICENSE
#   node_modules/request/node_modules/qs/LICENSE
#   node_modules/request/node_modules/caseless/LICENSE
#   node_modules/request/node_modules/tough-cookie/LICENSE
#   node_modules/request/node_modules/tunnel-agent/LICENSE
#   node_modules/request/node_modules/aws-sign2/LICENSE
#   node_modules/request/node_modules/oauth-sign/LICENSE
#   node_modules/async/node_modules/lodash/LICENSE
#   node_modules/uuid/LICENSE.md
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Apache-2.0 & CC0-1.0 & (WTFPL | MIT) & (BSD-2-Clause | MIT) \
& ISC & BSD-2-Clause & Unlicense & CC-BY-3.0 & Unknown & MIT & \
Artistic-2.0 & BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=75dbbb2f49d90bfc476532dc5861fd26 \
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
                    file://node_modules/npm/LICENSE;md5=55a3c686daad7dc7b9be707d72b6f3f4 \
                    file://node_modules/npm/node_modules/archy/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/npm/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/npm/node_modules/libcipm/LICENSE.md;md5=d02015a432c87d75b9efcb9e6083e35f \
                    file://node_modules/npm/node_modules/libcipm/node_modules/bluebird/LICENSE;md5=5dd221993f51ba714ddd208ff3b2ed01 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/find-npm-prefix/LICENSE;md5=2764032ecd89f3bafb0a1a35f966f9e8 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/bin-links/LICENSE;md5=55a3c686daad7dc7b9be707d72b6f3f4 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/npm-logical-tree/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/read-package-json/LICENSE;md5=6392dc4522c189c9616b2ec1ab763bec \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/LICENSE;md5=600e087d738cbe15867f79bd3dba1474 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/promise-inflight/LICENSE;md5=cee2d39676c27439adb09d8f5aba5a5b \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/ssri/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/bluebird/LICENSE;md5=5dd221993f51ba714ddd208ff3b2ed01 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/minipass/LICENSE;md5=ff53df3ad94e5c618e230ab49ce310fa \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/mississippi/license;md5=2cc4ca67731de11ba12ab2ba3628eb2c \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/tar/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/tar/node_modules/minipass/LICENSE;md5=ff53df3ad94e5c618e230ab49ce310fa \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/tar/node_modules/yallist/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/tar/node_modules/chownr/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/tar/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/tar/node_modules/minizlib/LICENSE;md5=d8a0ca0c46bfa01db064fa836f550966 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/tar/node_modules/fs-minipass/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/tar/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/promise-retry/LICENSE;md5=d81e220dee93fdbcbf7696cc76cec0a0 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/promise-retry/node_modules/retry/License;md5=c40fe50d231414ad1bc68e8965e7e95e \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/get-stream/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/which/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/npm-pick-manifest/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/npm-pick-manifest/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/npm-pick-manifest/node_modules/npm-package-arg/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/normalize-package-data/LICENSE;md5=745d0cb7803882ab26451fefb149878e \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/lru-cache/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/glob/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/npm-packlist/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/npm-packlist/node_modules/ignore-walk/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/npm-packlist/node_modules/ignore-walk/node_modules/minimatch/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/npm-packlist/node_modules/npm-bundled/LICENSE;md5=ff53df3ad94e5c618e230ab49ce310fa \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/npm-package-arg/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/LICENSE;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/agentkeepalive/node_modules/humanize-ms/LICENSE;md5=838c366f69b72c5df05c96dff79b35f2 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/agentkeepalive/node_modules/humanize-ms/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/https-proxy-agent/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/https-proxy-agent/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/https-proxy-agent/node_modules/agent-base/node_modules/es6-promisify/node_modules/es6-promise/LICENSE;md5=6e73e44544d76c1978a076a8292d031a \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/http-proxy-agent/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/http-proxy-agent/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/http-proxy-agent/node_modules/agent-base/node_modules/es6-promisify/node_modules/es6-promise/LICENSE;md5=6e73e44544d76c1978a076a8292d031a \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/pumpify/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/pumpify/node_modules/pump/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/stream-each/LICENSE;md5=a75272c6b584d0f8e2c1676b4e72469e \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/stream-each/node_modules/stream-shift/LICENSE;md5=42014010547e55bd3bcac2fec8c45624 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/parallel-transform/LICENSE;md5=fe19878d618a5580149056ac2bb9df7f \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/through2/LICENSE.html;md5=bb8031aeb39f1781e22716925f7589ac \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/through2/LICENSE.md;md5=12ef18138f1e1743e5d57ffef544235b \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/through2/node_modules/xtend/LICENCE;md5=96bcdf84e670aafacac9e094bce29ac9 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/end-of-stream/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/duplexify/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/duplexify/node_modules/stream-shift/LICENSE;md5=42014010547e55bd3bcac2fec8c45624 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/from2/LICENSE.md;md5=15f73c9cd6e10613050c714901f0e056 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/flush-write-stream/LICENSE;md5=a75272c6b584d0f8e2c1676b4e72469e \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/concat-stream/LICENSE;md5=3ad90c134f824ddfcea611ee1fa567a8 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/concat-stream/node_modules/typedarray/LICENSE;md5=6085b70b74c7dcf7df4e955725e3153d \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/pump/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/node-fetch-npm/LICENSE.md;md5=89fabe2fb10f72e48c2b3be506237d1e \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/node-fetch-npm/node_modules/encoding/LICENSE;md5=a9992d70215d97e8b82d289cec0c1ffa \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/node-fetch-npm/node_modules/encoding/node_modules/iconv-lite/LICENSE;md5=f942263d98f0d75e0e0101884e86261d \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/node-fetch-npm/node_modules/encoding/node_modules/iconv-lite/node_modules/safer-buffer/LICENSE;md5=3baebc2a17b8f5bff04882cd0dc0f76e \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/socks-proxy-agent/node_modules/socks/LICENSE;md5=742dc14598fb295b01df682683c57709 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/socks-proxy-agent/node_modules/socks/node_modules/smart-buffer/LICENSE;md5=742dc14598fb295b01df682683c57709 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/socks-proxy-agent/node_modules/agent-base/node_modules/es6-promisify/node_modules/es6-promise/LICENSE;md5=6e73e44544d76c1978a076a8292d031a \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/minimatch/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/minimatch/node_modules/brace-expansion/LICENSE;md5=a5df515ef062cc3affd8c0ae59c059ec \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md;md5=7fa99ddc3424107350ca6e9a24552085 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/minimatch/node_modules/brace-expansion/node_modules/concat-map/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/node_modules/mississippi/license;md5=2cc4ca67731de11ba12ab2ba3628eb2c \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/node_modules/mississippi/node_modules/pumpify/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/node_modules/mississippi/node_modules/stream-each/LICENSE;md5=a75272c6b584d0f8e2c1676b4e72469e \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/node_modules/mississippi/node_modules/stream-each/node_modules/stream-shift/LICENSE;md5=42014010547e55bd3bcac2fec8c45624 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/node_modules/mississippi/node_modules/parallel-transform/LICENSE;md5=fe19878d618a5580149056ac2bb9df7f \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/node_modules/mississippi/node_modules/through2/LICENSE.html;md5=bb8031aeb39f1781e22716925f7589ac \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/node_modules/mississippi/node_modules/through2/LICENSE.md;md5=12ef18138f1e1743e5d57ffef544235b \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/node_modules/mississippi/node_modules/through2/node_modules/xtend/LICENCE;md5=96bcdf84e670aafacac9e094bce29ac9 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/node_modules/mississippi/node_modules/end-of-stream/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/node_modules/mississippi/node_modules/duplexify/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/node_modules/mississippi/node_modules/duplexify/node_modules/stream-shift/LICENSE;md5=42014010547e55bd3bcac2fec8c45624 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/node_modules/mississippi/node_modules/from2/LICENSE.md;md5=15f73c9cd6e10613050c714901f0e056 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/node_modules/mississippi/node_modules/flush-write-stream/LICENSE;md5=a75272c6b584d0f8e2c1676b4e72469e \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/node_modules/mississippi/node_modules/concat-stream/LICENSE;md5=3ad90c134f824ddfcea611ee1fa567a8 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/node_modules/mississippi/node_modules/concat-stream/node_modules/typedarray/LICENSE;md5=6085b70b74c7dcf7df4e955725e3153d \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/node_modules/mississippi/node_modules/pump/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/cacache/node_modules/y18n/LICENSE;md5=55e5f88040679148136545002139a8b1 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/osenv/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libcipm/node_modules/pacote/node_modules/protoduck/LICENSE;md5=600e087d738cbe15867f79bd3dba1474 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/lock-verify/LICENSE;md5=cee2d39676c27439adb09d8f5aba5a5b \
                    file://node_modules/npm/node_modules/libcipm/node_modules/lock-verify/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libcipm/node_modules/lock-verify/node_modules/npm-package-arg/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/worker-farm/LICENSE.md;md5=4dcc11be7d284ae672629a65a5bf6b45 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/npm-lifecycle/LICENSE;md5=55a3c686daad7dc7b9be707d72b6f3f4 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/npm-package-arg/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libcipm/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/npm/node_modules/libcipm/node_modules/protoduck/LICENSE;md5=600e087d738cbe15867f79bd3dba1474 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/figgy-pudding/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/bluebird/LICENSE;md5=5dd221993f51ba714ddd208ff3b2ed01 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/lru-cache/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/npm-package-arg/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/LICENSE;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/agentkeepalive/node_modules/humanize-ms/LICENSE;md5=838c366f69b72c5df05c96dff79b35f2 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/agentkeepalive/node_modules/humanize-ms/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/https-proxy-agent/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/https-proxy-agent/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/https-proxy-agent/node_modules/agent-base/node_modules/es6-promisify/node_modules/es6-promise/LICENSE;md5=6e73e44544d76c1978a076a8292d031a \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/ssri/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/http-proxy-agent/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/http-proxy-agent/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/http-proxy-agent/node_modules/agent-base/node_modules/es6-promisify/node_modules/es6-promise/LICENSE;md5=6e73e44544d76c1978a076a8292d031a \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/mississippi/license;md5=2cc4ca67731de11ba12ab2ba3628eb2c \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/promise-retry/LICENSE;md5=d81e220dee93fdbcbf7696cc76cec0a0 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/promise-retry/node_modules/retry/License;md5=c40fe50d231414ad1bc68e8965e7e95e \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/node-fetch-npm/LICENSE.md;md5=89fabe2fb10f72e48c2b3be506237d1e \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/node-fetch-npm/node_modules/encoding/LICENSE;md5=a9992d70215d97e8b82d289cec0c1ffa \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/node-fetch-npm/node_modules/encoding/node_modules/iconv-lite/LICENSE;md5=f942263d98f0d75e0e0101884e86261d \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/node-fetch-npm/node_modules/encoding/node_modules/iconv-lite/node_modules/safer-buffer/LICENSE;md5=3baebc2a17b8f5bff04882cd0dc0f76e \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/lru-cache/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/promise-inflight/LICENSE;md5=cee2d39676c27439adb09d8f5aba5a5b \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/LICENSE;md5=cee2d39676c27439adb09d8f5aba5a5b \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/ssri/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/ssri/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/bluebird/LICENSE;md5=5dd221993f51ba714ddd208ff3b2ed01 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/license;md5=2cc4ca67731de11ba12ab2ba3628eb2c \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/pumpify/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/stream-each/LICENSE;md5=a75272c6b584d0f8e2c1676b4e72469e \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/stream-each/node_modules/stream-shift/LICENSE;md5=42014010547e55bd3bcac2fec8c45624 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/parallel-transform/LICENSE;md5=fe19878d618a5580149056ac2bb9df7f \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/through2/LICENSE.html;md5=bb8031aeb39f1781e22716925f7589ac \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/through2/LICENSE.md;md5=12ef18138f1e1743e5d57ffef544235b \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/through2/node_modules/xtend/LICENCE;md5=96bcdf84e670aafacac9e094bce29ac9 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/end-of-stream/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/duplexify/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/duplexify/node_modules/stream-shift/LICENSE;md5=42014010547e55bd3bcac2fec8c45624 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/from2/LICENSE.md;md5=15f73c9cd6e10613050c714901f0e056 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/flush-write-stream/LICENSE;md5=a75272c6b584d0f8e2c1676b4e72469e \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/concat-stream/LICENSE;md5=3ad90c134f824ddfcea611ee1fa567a8 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/concat-stream/node_modules/typedarray/LICENSE;md5=6085b70b74c7dcf7df4e955725e3153d \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/pump/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/chownr/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/y18n/LICENSE;md5=55e5f88040679148136545002139a8b1 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/lru-cache/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/glob/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/socks-proxy-agent/node_modules/socks/LICENSE;md5=742dc14598fb295b01df682683c57709 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/socks-proxy-agent/node_modules/socks/node_modules/smart-buffer/LICENSE;md5=742dc14598fb295b01df682683c57709 \
                    file://node_modules/npm/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/socks-proxy-agent/node_modules/agent-base/node_modules/es6-promisify/node_modules/es6-promise/LICENSE;md5=6e73e44544d76c1978a076a8292d031a \
                    file://node_modules/npm/node_modules/figgy-pudding/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/columnify/LICENSE;md5=08307ca687a9024e20c568930d2fc768 \
                    file://node_modules/npm/node_modules/columnify/node_modules/strip-ansi/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/columnify/node_modules/strip-ansi/node_modules/ansi-regex/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/columnify/node_modules/wcwidth/LICENSE;md5=092dd56cbbfd377304f7efac1c0d8ada \
                    file://node_modules/npm/node_modules/columnify/node_modules/wcwidth/node_modules/defaults/LICENSE;md5=489acc9b048e777e84792302478b5e83 \
                    file://node_modules/npm/node_modules/columnify/node_modules/wcwidth/node_modules/defaults/node_modules/clone/LICENSE;md5=411e33109fa516d190d232100fdc7f8e \
                    file://node_modules/npm/node_modules/strip-ansi/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/strip-ansi/node_modules/ansi-regex/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/read-installed/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/npm/node_modules/read-installed/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/read-installed/node_modules/read-package-json/LICENSE;md5=6392dc4522c189c9616b2ec1ab763bec \
                    file://node_modules/npm/node_modules/read-installed/node_modules/readdir-scoped-modules/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/read-installed/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/npm/node_modules/read-installed/node_modules/util-extend/LICENSE;md5=d7351a4fc8e956f1a68413490d5e655e \
                    file://node_modules/npm/node_modules/read-installed/node_modules/slide/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/npm/node_modules/read-installed/node_modules/debuglog/LICENSE;md5=40a8cc092438d1ad43c1146547c36218 \
                    file://node_modules/npm/node_modules/lockfile/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/lockfile/node_modules/signal-exit/LICENSE.txt;md5=e29e20260a1c78dba16a233048565cde \
                    file://node_modules/npm/node_modules/gentle-fs/LICENSE;md5=55a3c686daad7dc7b9be707d72b6f3f4 \
                    file://node_modules/npm/node_modules/gentle-fs/node_modules/iferr/LICENSE;md5=71eb11f3dd6fa9d8989eb0aea3ce6e96 \
                    file://node_modules/npm/node_modules/dezalgo/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/dezalgo/node_modules/asap/LICENSE.md;md5=6ef000dc4ca2360ae9216d401862c653 \
                    file://node_modules/npm/node_modules/config-chain/LICENCE;md5=84ddd974e10adfabbf232e7efb7ed715 \
                    file://node_modules/npm/node_modules/config-chain/node_modules/proto-list/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/config-chain/node_modules/ini/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/promise-inflight/LICENSE;md5=cee2d39676c27439adb09d8f5aba5a5b \
                    file://node_modules/npm/node_modules/meant/LICENSE;md5=6abb6a219c67dceb6196c53e76cdb30e \
                    file://node_modules/npm/node_modules/lodash.clonedeep/LICENSE;md5=a3b2b7770df62392c164de4001b59f8f \
                    file://node_modules/npm/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/move-concurrently/LICENSE;md5=cee2d39676c27439adb09d8f5aba5a5b \
                    file://node_modules/npm/node_modules/move-concurrently/node_modules/copy-concurrently/LICENSE;md5=cee2d39676c27439adb09d8f5aba5a5b \
                    file://node_modules/npm/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/iferr/LICENSE;md5=71eb11f3dd6fa9d8989eb0aea3ce6e96 \
                    file://node_modules/npm/node_modules/npm-audit-report/LICENSE;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/npm-audit-report/node_modules/console-control-strings/LICENSE;md5=43abbc6f9093aea69560715033788727 \
                    file://node_modules/npm/node_modules/npm-audit-report/node_modules/cli-table3/LICENSE;md5=edd644abc2b3cfc24845957cb7424b35 \
                    file://node_modules/npm/node_modules/npm-audit-report/node_modules/cli-table3/node_modules/object-assign/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/npm-audit-report/node_modules/cli-table3/node_modules/colors/LICENSE;md5=441ee46669f9365ff2492e9b555c8ee7 \
                    file://node_modules/npm/node_modules/npm-audit-report/node_modules/cli-table3/node_modules/string-width/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/query-string/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/query-string/node_modules/decode-uri-component/license;md5=775415f59d9642dd552fd60e4c0adda4 \
                    file://node_modules/npm/node_modules/query-string/node_modules/strict-uri-encode/license;md5=1801ea63a6ba2dfc429eb5f36d09e06f \
                    file://node_modules/npm/node_modules/hosted-git-info/LICENSE;md5=a01f10cd299d5727263720d47cc2c908 \
                    file://node_modules/npm/node_modules/byte-size/LICENSE;md5=292fde4cf1818dfd2c446b0de2d40f51 \
                    file://node_modules/npm/node_modules/ssri/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/lodash._bindcallback/LICENSE.txt;md5=f519f8cb155e30cece6b0e75aa6a3a53 \
                    file://node_modules/npm/node_modules/tiny-relative-date/LICENSE.md;md5=0e0c5c7b4dd8fb370a42923416bdcc11 \
                    file://node_modules/npm/node_modules/JSONStream/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/npm/node_modules/JSONStream/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/npm/node_modules/JSONStream/node_modules/jsonparse/LICENSE;md5=566d04c41bfbe138f33e4ffd343e11e4 \
                    file://node_modules/npm/node_modules/JSONStream/node_modules/through/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/npm/node_modules/JSONStream/node_modules/through/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/npm/node_modules/bluebird/LICENSE;md5=5dd221993f51ba714ddd208ff3b2ed01 \
                    file://node_modules/npm/node_modules/has-unicode/LICENSE;md5=2bab5b1c26e9c44fc4e489bb98cfb196 \
                    file://node_modules/npm/node_modules/find-npm-prefix/LICENSE;md5=2764032ecd89f3bafb0a1a35f966f9e8 \
                    file://node_modules/npm/node_modules/fs-write-stream-atomic/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/fs-write-stream-atomic/node_modules/iferr/LICENSE;md5=71eb11f3dd6fa9d8989eb0aea3ce6e96 \
                    file://node_modules/npm/node_modules/cli-table2/node_modules/colors/LICENSE;md5=441ee46669f9365ff2492e9b555c8ee7 \
                    file://node_modules/npm/node_modules/cli-table2/node_modules/lodash/LICENSE;md5=f519f8cb155e30cece6b0e75aa6a3a53 \
                    file://node_modules/npm/node_modules/cli-table2/node_modules/string-width/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/cli-table2/node_modules/string-width/node_modules/strip-ansi/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/cli-table2/node_modules/string-width/node_modules/strip-ansi/node_modules/ansi-regex/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/cli-table2/node_modules/string-width/node_modules/code-point-at/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/cli-table2/node_modules/string-width/node_modules/is-fullwidth-code-point/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/cli-table2/node_modules/string-width/node_modules/is-fullwidth-code-point/node_modules/number-is-nan/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/text-table/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/npm/node_modules/libnpx/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/dotenv/LICENSE;md5=f063f692e0722821de5bd48ee5898746 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/update-notifier/license;md5=893ad33659c31c56c0f4ba00ac978281 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/which/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpx/node_modules/y18n/LICENSE;md5=55e5f88040679148136545002139a8b1 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/npm-package-arg/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/LICENSE;md5=becfe5b407a6b8b768960384631232c9 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/os-locale/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/os-locale/node_modules/execa/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/os-locale/node_modules/execa/node_modules/strip-eof/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/os-locale/node_modules/execa/node_modules/p-finally/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/os-locale/node_modules/execa/node_modules/is-stream/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/os-locale/node_modules/execa/node_modules/cross-spawn/LICENSE;md5=d81e220dee93fdbcbf7696cc76cec0a0 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/os-locale/node_modules/execa/node_modules/cross-spawn/node_modules/shebang-command/license;md5=1801ea63a6ba2dfc429eb5f36d09e06f \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/os-locale/node_modules/execa/node_modules/cross-spawn/node_modules/shebang-command/node_modules/shebang-regex/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/os-locale/node_modules/execa/node_modules/get-stream/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/os-locale/node_modules/execa/node_modules/npm-run-path/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/os-locale/node_modules/execa/node_modules/npm-run-path/node_modules/path-key/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/os-locale/node_modules/execa/node_modules/signal-exit/LICENSE.txt;md5=e29e20260a1c78dba16a233048565cde \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/os-locale/node_modules/mem/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/os-locale/node_modules/mem/node_modules/mimic-fn/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/os-locale/node_modules/lcid/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/which-module/LICENSE;md5=42624e59bd3dabedcca59e1b54e3af50 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/y18n/LICENSE;md5=55e5f88040679148136545002139a8b1 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/require-main-filename/LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/require-directory/LICENSE;md5=903997d26b12b72b43aa60018387bb90 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/string-width/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/string-width/node_modules/is-fullwidth-code-point/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/get-caller-file/LICENSE.md;md5=d21aa422a43e9693d50143d612b58967 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/set-blocking/LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/decamelize/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/find-up/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/find-up/node_modules/locate-path/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/find-up/node_modules/locate-path/node_modules/p-locate/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/find-up/node_modules/locate-path/node_modules/p-locate/node_modules/p-limit/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/find-up/node_modules/locate-path/node_modules/p-locate/node_modules/p-limit/node_modules/p-try/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/find-up/node_modules/locate-path/node_modules/path-exists/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/cliui/LICENSE.txt;md5=83623193d3051ca8068a89a455c699ca \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/cliui/node_modules/strip-ansi/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/cliui/node_modules/wrap-ansi/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/cliui/node_modules/wrap-ansi/node_modules/strip-ansi/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/cliui/node_modules/wrap-ansi/node_modules/strip-ansi/node_modules/ansi-regex/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/cliui/node_modules/wrap-ansi/node_modules/string-width/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/cliui/node_modules/wrap-ansi/node_modules/string-width/node_modules/code-point-at/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/cliui/node_modules/wrap-ansi/node_modules/string-width/node_modules/is-fullwidth-code-point/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/cliui/node_modules/wrap-ansi/node_modules/string-width/node_modules/is-fullwidth-code-point/node_modules/number-is-nan/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/cliui/node_modules/string-width/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/yargs-parser/LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35 \
                    file://node_modules/npm/node_modules/libnpx/node_modules/yargs/node_modules/yargs-parser/node_modules/camelcase/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/json-parse-better-errors/LICENSE.md;md5=048cc2006d506256349ca6088641486b \
                    file://node_modules/npm/node_modules/mississippi/license;md5=2cc4ca67731de11ba12ab2ba3628eb2c \
                    file://node_modules/npm/node_modules/mississippi/node_modules/pumpify/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/mississippi/node_modules/pumpify/node_modules/pump/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/mississippi/node_modules/stream-each/LICENSE;md5=a75272c6b584d0f8e2c1676b4e72469e \
                    file://node_modules/npm/node_modules/mississippi/node_modules/stream-each/node_modules/stream-shift/LICENSE;md5=42014010547e55bd3bcac2fec8c45624 \
                    file://node_modules/npm/node_modules/mississippi/node_modules/parallel-transform/LICENSE;md5=fe19878d618a5580149056ac2bb9df7f \
                    file://node_modules/npm/node_modules/mississippi/node_modules/through2/LICENSE.html;md5=bb8031aeb39f1781e22716925f7589ac \
                    file://node_modules/npm/node_modules/mississippi/node_modules/through2/LICENSE.md;md5=12ef18138f1e1743e5d57ffef544235b \
                    file://node_modules/npm/node_modules/mississippi/node_modules/through2/node_modules/xtend/LICENCE;md5=96bcdf84e670aafacac9e094bce29ac9 \
                    file://node_modules/npm/node_modules/mississippi/node_modules/end-of-stream/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/mississippi/node_modules/duplexify/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/mississippi/node_modules/duplexify/node_modules/stream-shift/LICENSE;md5=42014010547e55bd3bcac2fec8c45624 \
                    file://node_modules/npm/node_modules/mississippi/node_modules/from2/LICENSE.md;md5=15f73c9cd6e10613050c714901f0e056 \
                    file://node_modules/npm/node_modules/mississippi/node_modules/flush-write-stream/LICENSE;md5=a75272c6b584d0f8e2c1676b4e72469e \
                    file://node_modules/npm/node_modules/mississippi/node_modules/concat-stream/LICENSE;md5=3ad90c134f824ddfcea611ee1fa567a8 \
                    file://node_modules/npm/node_modules/mississippi/node_modules/concat-stream/node_modules/typedarray/LICENSE;md5=6085b70b74c7dcf7df4e955725e3153d \
                    file://node_modules/npm/node_modules/mississippi/node_modules/pump/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/detect-newline/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/sorted-union-stream/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/sorted-union-stream/node_modules/stream-iterate/LICENSE;md5=a75272c6b584d0f8e2c1676b4e72469e \
                    file://node_modules/npm/node_modules/sorted-union-stream/node_modules/stream-iterate/node_modules/stream-shift/LICENSE;md5=42014010547e55bd3bcac2fec8c45624 \
                    file://node_modules/npm/node_modules/sorted-union-stream/node_modules/stream-iterate/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/npm/node_modules/sorted-union-stream/node_modules/from2/LICENSE.md;md5=15f73c9cd6e10613050c714901f0e056 \
                    file://node_modules/npm/node_modules/sorted-union-stream/node_modules/from2/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/npm/node_modules/sorted-union-stream/node_modules/from2/node_modules/readable-stream/LICENSE;md5=d7351a4fc8e956f1a68413490d5e655e \
                    file://node_modules/npm/node_modules/sorted-union-stream/node_modules/from2/node_modules/readable-stream/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/npm/node_modules/sorted-union-stream/node_modules/from2/node_modules/readable-stream/node_modules/string_decoder/LICENSE;md5=fcf5cfdc777e49f11402422c72a86f43 \
                    file://node_modules/npm/node_modules/sorted-union-stream/node_modules/from2/node_modules/readable-stream/node_modules/core-util-is/LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff \
                    file://node_modules/npm/node_modules/inflight/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/npm/node_modules/qw/LICENSE;md5=d7cc5466f7dfa7564d4b857a88cba2ae \
                    file://node_modules/npm/node_modules/bin-links/LICENSE;md5=55a3c686daad7dc7b9be707d72b6f3f4 \
                    file://node_modules/npm/node_modules/bin-links/node_modules/gentle-fs/LICENSE;md5=55a3c686daad7dc7b9be707d72b6f3f4 \
                    file://node_modules/npm/node_modules/bin-links/node_modules/gentle-fs/node_modules/read-cmd-shim/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/npm/node_modules/bin-links/node_modules/gentle-fs/node_modules/fs-vacuum/LICENSE;md5=f2805ad197001ec4be993f8f0c106c2d \
                    file://node_modules/npm/node_modules/bin-links/node_modules/gentle-fs/node_modules/fs-vacuum/node_modules/path-is-inside/LICENSE.txt;md5=8de5f23be471b6814f19b2ad82a5208a \
                    file://node_modules/npm/node_modules/bin-links/node_modules/gentle-fs/node_modules/fs-vacuum/node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/bin-links/node_modules/gentle-fs/node_modules/fs-vacuum/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/npm/node_modules/bin-links/node_modules/gentle-fs/node_modules/path-is-inside/LICENSE.txt;md5=8de5f23be471b6814f19b2ad82a5208a \
                    file://node_modules/npm/node_modules/bin-links/node_modules/gentle-fs/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/npm/node_modules/bin-links/node_modules/gentle-fs/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/npm/node_modules/bin-links/node_modules/gentle-fs/node_modules/slide/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/npm/node_modules/bin-links/node_modules/gentle-fs/node_modules/aproba/LICENSE;md5=9d215c9223fbef14a4642cc450e7ed4b \
                    file://node_modules/npm/node_modules/bin-links/node_modules/gentle-fs/node_modules/iferr/LICENSE;md5=71eb11f3dd6fa9d8989eb0aea3ce6e96 \
                    file://node_modules/npm/node_modules/bin-links/node_modules/bluebird/LICENSE;md5=5dd221993f51ba714ddd208ff3b2ed01 \
                    file://node_modules/npm/node_modules/bin-links/node_modules/write-file-atomic/LICENSE;md5=68705ba56afdf6710c9187ed9a9cdd03 \
                    file://node_modules/npm/node_modules/bin-links/node_modules/write-file-atomic/node_modules/signal-exit/LICENSE.txt;md5=e29e20260a1c78dba16a233048565cde \
                    file://node_modules/npm/node_modules/bin-links/node_modules/write-file-atomic/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/npm/node_modules/bin-links/node_modules/cmd-shim/LICENSE;md5=8ce909f9cccb74a7c6f2720930d072c1 \
                    file://node_modules/npm/node_modules/bin-links/node_modules/cmd-shim/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/npm/node_modules/bin-links/node_modules/cmd-shim/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/npm/node_modules/bin-links/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/npm/node_modules/libnpmhook/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/figgy-pudding/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/JSONStream/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/JSONStream/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/JSONStream/node_modules/jsonparse/LICENSE;md5=566d04c41bfbe138f33e4ffd343e11e4 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/JSONStream/node_modules/through/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/JSONStream/node_modules/through/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/bluebird/LICENSE;md5=5dd221993f51ba714ddd208ff3b2ed01 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/lru-cache/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/lru-cache/node_modules/yallist/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/lru-cache/node_modules/pseudomap/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/npm-package-arg/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/npm-package-arg/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/npm-package-arg/node_modules/hosted-git-info/LICENSE;md5=a01f10cd299d5727263720d47cc2c908 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/npm-package-arg/node_modules/validate-npm-package-name/LICENSE;md5=2c81fede4288971ecb9719722b894db6 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/npm-package-arg/node_modules/validate-npm-package-name/node_modules/builtins/License;md5=69aef5ffcb6a0882bae34c8ed4a21c57 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/npm-package-arg/node_modules/osenv/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/npm-package-arg/node_modules/osenv/node_modules/os-homedir/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/npm-package-arg/node_modules/osenv/node_modules/os-tmpdir/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/LICENSE;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/agentkeepalive/node_modules/humanize-ms/LICENSE;md5=838c366f69b72c5df05c96dff79b35f2 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/agentkeepalive/node_modules/humanize-ms/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/https-proxy-agent/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/https-proxy-agent/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/https-proxy-agent/node_modules/agent-base/node_modules/es6-promisify/node_modules/es6-promise/LICENSE;md5=6e73e44544d76c1978a076a8292d031a \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/ssri/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/http-proxy-agent/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/http-proxy-agent/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/http-proxy-agent/node_modules/agent-base/node_modules/es6-promisify/node_modules/es6-promise/LICENSE;md5=6e73e44544d76c1978a076a8292d031a \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/mississippi/license;md5=2cc4ca67731de11ba12ab2ba3628eb2c \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/promise-retry/LICENSE;md5=d81e220dee93fdbcbf7696cc76cec0a0 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/promise-retry/node_modules/retry/License;md5=c40fe50d231414ad1bc68e8965e7e95e \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/node-fetch-npm/LICENSE.md;md5=89fabe2fb10f72e48c2b3be506237d1e \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/node-fetch-npm/node_modules/json-parse-better-errors/LICENSE.md;md5=048cc2006d506256349ca6088641486b \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/node-fetch-npm/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/node-fetch-npm/node_modules/encoding/LICENSE;md5=a9992d70215d97e8b82d289cec0c1ffa \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/node-fetch-npm/node_modules/encoding/node_modules/iconv-lite/LICENSE;md5=f942263d98f0d75e0e0101884e86261d \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/node-fetch-npm/node_modules/encoding/node_modules/iconv-lite/node_modules/safer-buffer/LICENSE;md5=3baebc2a17b8f5bff04882cd0dc0f76e \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/lru-cache/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/figgy-pudding/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/promise-inflight/LICENSE;md5=cee2d39676c27439adb09d8f5aba5a5b \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/LICENSE;md5=cee2d39676c27439adb09d8f5aba5a5b \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/run-queue/node_modules/aproba/LICENSE;md5=9d215c9223fbef14a4642cc450e7ed4b \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/fs-write-stream-atomic/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/LICENSE;md5=cee2d39676c27439adb09d8f5aba5a5b \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/fs-write-stream-atomic/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/fs-write-stream-atomic/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/fs-write-stream-atomic/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/fs-write-stream-atomic/node_modules/iferr/LICENSE;md5=71eb11f3dd6fa9d8989eb0aea3ce6e96 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/rimraf/node_modules/glob/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/rimraf/node_modules/glob/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/rimraf/node_modules/glob/node_modules/inflight/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/rimraf/node_modules/glob/node_modules/inflight/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/rimraf/node_modules/glob/node_modules/inflight/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/rimraf/node_modules/glob/node_modules/fs.realpath/LICENSE;md5=062470525c8e380f8567f665ef554d11 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/rimraf/node_modules/glob/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/rimraf/node_modules/glob/node_modules/once/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/rimraf/node_modules/glob/node_modules/minimatch/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/LICENSE;md5=a5df515ef062cc3affd8c0ae59c059ec \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md;md5=7fa99ddc3424107350ca6e9a24552085 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/concat-map/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/rimraf/node_modules/glob/node_modules/path-is-absolute/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/aproba/LICENSE;md5=9d215c9223fbef14a4642cc450e7ed4b \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/copy-concurrently/node_modules/iferr/LICENSE;md5=71eb11f3dd6fa9d8989eb0aea3ce6e96 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/move-concurrently/node_modules/aproba/LICENSE;md5=9d215c9223fbef14a4642cc450e7ed4b \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/ssri/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/ssri/node_modules/figgy-pudding/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/bluebird/LICENSE;md5=5dd221993f51ba714ddd208ff3b2ed01 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/license;md5=2cc4ca67731de11ba12ab2ba3628eb2c \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/pumpify/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/pumpify/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/pumpify/node_modules/duplexify/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/pumpify/node_modules/pump/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/pumpify/node_modules/pump/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/pumpify/node_modules/pump/node_modules/end-of-stream/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/stream-each/LICENSE;md5=a75272c6b584d0f8e2c1676b4e72469e \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/stream-each/node_modules/stream-shift/LICENSE;md5=42014010547e55bd3bcac2fec8c45624 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/stream-each/node_modules/end-of-stream/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/parallel-transform/LICENSE;md5=fe19878d618a5580149056ac2bb9df7f \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/parallel-transform/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/parallel-transform/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/through2/LICENSE.html;md5=bb8031aeb39f1781e22716925f7589ac \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/through2/LICENSE.md;md5=12ef18138f1e1743e5d57ffef544235b \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/through2/node_modules/xtend/LICENCE;md5=96bcdf84e670aafacac9e094bce29ac9 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/through2/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/end-of-stream/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/duplexify/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/duplexify/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/duplexify/node_modules/stream-shift/LICENSE;md5=42014010547e55bd3bcac2fec8c45624 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/duplexify/node_modules/end-of-stream/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/duplexify/node_modules/end-of-stream/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/duplexify/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/from2/LICENSE.md;md5=15f73c9cd6e10613050c714901f0e056 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/from2/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/from2/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/flush-write-stream/LICENSE;md5=a75272c6b584d0f8e2c1676b4e72469e \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/flush-write-stream/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/flush-write-stream/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/concat-stream/LICENSE;md5=3ad90c134f824ddfcea611ee1fa567a8 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/concat-stream/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/concat-stream/node_modules/typedarray/LICENSE;md5=6085b70b74c7dcf7df4e955725e3153d \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/concat-stream/node_modules/buffer-from/LICENSE;md5=46513463e8f7d9eb671a243f0083b2c6 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/concat-stream/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/pump/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/pump/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/pump/node_modules/end-of-stream/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/chownr/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/y18n/LICENSE;md5=55e5f88040679148136545002139a8b1 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/lru-cache/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/glob/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/cacache/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/socks-proxy-agent/node_modules/socks/LICENSE;md5=742dc14598fb295b01df682683c57709 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/socks-proxy-agent/node_modules/socks/node_modules/smart-buffer/LICENSE;md5=5b37b090a43e81bd880398260c467866 \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/npm-registry-fetch/node_modules/make-fetch-happen/node_modules/socks-proxy-agent/node_modules/agent-base/node_modules/es6-promisify/node_modules/es6-promise/LICENSE;md5=6e73e44544d76c1978a076a8292d031a \
                    file://node_modules/npm/node_modules/libnpmhook/node_modules/figgy-pudding/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/lodash._baseuniq/LICENSE;md5=a3b2b7770df62392c164de4001b59f8f \
                    file://node_modules/npm/node_modules/lodash._baseuniq/node_modules/lodash._createset/LICENSE;md5=a3b2b7770df62392c164de4001b59f8f \
                    file://node_modules/npm/node_modules/lodash._baseuniq/node_modules/lodash._root/LICENSE;md5=fe563f0ce45a88395a73e7dc46f5339e \
                    file://node_modules/npm/node_modules/qrcode-terminal/LICENSE;md5=beed67299fff1e7b91b5e4c3e43b505b \
                    file://node_modules/npm/node_modules/npm-user-validate/LICENSE;md5=89ac8ee2b7cbff80aea3575787f846ab \
                    file://node_modules/npm/node_modules/ansi-regex/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/tar/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/tar/node_modules/yallist/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/tar/node_modules/minizlib/LICENSE;md5=d8a0ca0c46bfa01db064fa836f550966 \
                    file://node_modules/npm/node_modules/tar/node_modules/fs-minipass/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/umask/LICENSE;md5=591ba02f79788ac1bf18566344ad5e1b \
                    file://node_modules/npm/node_modules/lodash.union/LICENSE;md5=a3b2b7770df62392c164de4001b59f8f \
                    file://node_modules/npm/node_modules/fs-vacuum/LICENSE;md5=f2805ad197001ec4be993f8f0c106c2d \
                    file://node_modules/npm/node_modules/npm-cache-filename/LICENSE;md5=ff53df3ad94e5c618e230ab49ce310fa \
                    file://node_modules/npm/node_modules/lodash._getnative/LICENSE;md5=f519f8cb155e30cece6b0e75aa6a3a53 \
                    file://node_modules/npm/node_modules/cli-columns/LICENSE;md5=01510fc972dca0e71a6bda3b07194824 \
                    file://node_modules/npm/node_modules/cli-columns/node_modules/strip-ansi/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/cli-columns/node_modules/strip-ansi/node_modules/ansi-regex/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/cli-columns/node_modules/string-width/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/cli-columns/node_modules/string-width/node_modules/strip-ansi/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/cli-columns/node_modules/string-width/node_modules/strip-ansi/node_modules/ansi-regex/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/cli-columns/node_modules/string-width/node_modules/is-fullwidth-code-point/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/validate-npm-package-license/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://node_modules/npm/node_modules/validate-npm-package-license/node_modules/spdx-correct/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://node_modules/npm/node_modules/validate-npm-package-license/node_modules/spdx-expression-parse/LICENSE;md5=35a411d082d4487ab0e0287014cddf80 \
                    file://node_modules/npm/node_modules/read-package-json/LICENSE;md5=6392dc4522c189c9616b2ec1ab763bec \
                    file://node_modules/npm/node_modules/read-package-json/node_modules/json-parse-better-errors/LICENSE.md;md5=048cc2006d506256349ca6088641486b \
                    file://node_modules/npm/node_modules/ansistyles/LICENSE;md5=bf595075ff556bc46c43e08f142fa4f5 \
                    file://node_modules/npm/node_modules/lodash._baseindexof/LICENSE.txt;md5=ad20573d95563085adde70ee845966ea \
                    file://node_modules/npm/node_modules/chownr/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/update-notifier/license;md5=893ad33659c31c56c0f4ba00ac978281 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/configstore/license;md5=3dc7e8ef9547262823300233d6a2d072 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/configstore/node_modules/make-dir/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/configstore/node_modules/make-dir/node_modules/pify/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/configstore/node_modules/write-file-atomic/LICENSE;md5=68705ba56afdf6710c9187ed9a9cdd03 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/configstore/node_modules/dot-prop/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/configstore/node_modules/dot-prop/node_modules/is-obj/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/configstore/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/configstore/node_modules/unique-string/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/configstore/node_modules/unique-string/node_modules/crypto-random-string/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/configstore/node_modules/xdg-basedir/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/is-installed-globally/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/is-installed-globally/node_modules/global-dirs/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/is-installed-globally/node_modules/global-dirs/node_modules/ini/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/is-installed-globally/node_modules/is-path-inside/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/is-installed-globally/node_modules/is-path-inside/node_modules/path-is-inside/LICENSE.txt;md5=8de5f23be471b6814f19b2ad82a5208a \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/import-lazy/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/ansi-align/LICENSE;md5=42624e59bd3dabedcca59e1b54e3af50 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/ansi-align/node_modules/string-width/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/cli-boxes/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/chalk/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/chalk/node_modules/supports-color/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/chalk/node_modules/supports-color/node_modules/has-flag/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/chalk/node_modules/escape-string-regexp/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/chalk/node_modules/ansi-styles/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/chalk/node_modules/ansi-styles/node_modules/color-convert/LICENSE;md5=9bdadfc9fbb3ab8d5a6d591bdbd52811 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/chalk/node_modules/ansi-styles/node_modules/color-convert/node_modules/color-name/LICENSE;md5=d301869b39e08b33665b7c4f16b8e41d \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/string-width/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/string-width/node_modules/is-fullwidth-code-point/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/widest-line/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/widest-line/node_modules/string-width/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/term-size/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/term-size/node_modules/execa/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/term-size/node_modules/execa/node_modules/strip-eof/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/term-size/node_modules/execa/node_modules/p-finally/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/term-size/node_modules/execa/node_modules/is-stream/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/term-size/node_modules/execa/node_modules/cross-spawn/LICENSE;md5=d81e220dee93fdbcbf7696cc76cec0a0 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/term-size/node_modules/execa/node_modules/cross-spawn/node_modules/shebang-command/license;md5=1801ea63a6ba2dfc429eb5f36d09e06f \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/term-size/node_modules/execa/node_modules/cross-spawn/node_modules/shebang-command/node_modules/shebang-regex/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/term-size/node_modules/execa/node_modules/cross-spawn/node_modules/which/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/term-size/node_modules/execa/node_modules/cross-spawn/node_modules/which/node_modules/isexe/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/term-size/node_modules/execa/node_modules/cross-spawn/node_modules/lru-cache/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/term-size/node_modules/execa/node_modules/get-stream/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/term-size/node_modules/execa/node_modules/npm-run-path/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/term-size/node_modules/execa/node_modules/npm-run-path/node_modules/path-key/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/term-size/node_modules/execa/node_modules/signal-exit/LICENSE.txt;md5=e29e20260a1c78dba16a233048565cde \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/boxen/node_modules/camelcase/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/chalk/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/chalk/node_modules/supports-color/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/chalk/node_modules/supports-color/node_modules/has-flag/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/chalk/node_modules/escape-string-regexp/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/chalk/node_modules/ansi-styles/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/chalk/node_modules/ansi-styles/node_modules/color-convert/LICENSE;md5=9bdadfc9fbb3ab8d5a6d591bdbd52811 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/chalk/node_modules/ansi-styles/node_modules/color-convert/node_modules/color-name/LICENSE;md5=d301869b39e08b33665b7c4f16b8e41d \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/semver-diff/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/semver-diff/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/got/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/got/node_modules/duplexer3/LICENSE.md;md5=2ac3dfdce5a77f9cff9b5f70d216d17d \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/got/node_modules/unzip-response/license;md5=5b422d6bf88afe88977d04f8bdd4959c \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/got/node_modules/url-parse-lax/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/got/node_modules/url-parse-lax/node_modules/prepend-http/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/got/node_modules/is-stream/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/got/node_modules/is-retry-allowed/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/got/node_modules/get-stream/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/got/node_modules/timed-out/license;md5=2a8369b875113ae53aa6c5bb39a58d3c \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/got/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/got/node_modules/lowercase-keys/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/got/node_modules/create-error-class/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/got/node_modules/is-redirect/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/registry-url/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/registry-url/node_modules/rc/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/registry-url/node_modules/rc/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/registry-url/node_modules/rc/LICENSE.BSD;md5=e7a2a325a0069e82aff675bbf74464a0 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/registry-url/node_modules/rc/node_modules/deep-extend/LICENSE;md5=74959162613f2777f3ef55bdb8b74c89 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/registry-url/node_modules/rc/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/registry-url/node_modules/rc/node_modules/strip-json-comments/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/registry-auth-token/LICENSE;md5=7b1df94b672916450d194cf7a8bd0e2d \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/registry-auth-token/node_modules/rc/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/registry-auth-token/node_modules/rc/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/registry-auth-token/node_modules/rc/LICENSE.BSD;md5=e7a2a325a0069e82aff675bbf74464a0 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/registry-auth-token/node_modules/rc/node_modules/deep-extend/LICENSE;md5=74959162613f2777f3ef55bdb8b74c89 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/registry-auth-token/node_modules/rc/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/registry-auth-token/node_modules/rc/node_modules/strip-json-comments/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/latest-version/node_modules/package-json/node_modules/registry-auth-token/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/xdg-basedir/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/is-ci/LICENSE;md5=0c6fa9c682ce05a9a4da4f4a96cf42ec \
                    file://node_modules/npm/node_modules/update-notifier/node_modules/is-ci/node_modules/ci-info/LICENSE;md5=0c6fa9c682ce05a9a4da4f4a96cf42ec \
                    file://node_modules/npm/node_modules/validate-npm-package-name/LICENSE;md5=2c81fede4288971ecb9719722b894db6 \
                    file://node_modules/npm/node_modules/validate-npm-package-name/node_modules/builtins/License;md5=69aef5ffcb6a0882bae34c8ed4a21c57 \
                    file://node_modules/npm/node_modules/pacote/LICENSE;md5=600e087d738cbe15867f79bd3dba1474 \
                    file://node_modules/npm/node_modules/pacote/node_modules/promise-retry/LICENSE;md5=d81e220dee93fdbcbf7696cc76cec0a0 \
                    file://node_modules/npm/node_modules/pacote/node_modules/promise-retry/node_modules/retry/License;md5=c40fe50d231414ad1bc68e8965e7e95e \
                    file://node_modules/npm/node_modules/pacote/node_modules/get-stream/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/pacote/node_modules/make-fetch-happen/LICENSE;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/agentkeepalive/node_modules/humanize-ms/LICENSE;md5=838c366f69b72c5df05c96dff79b35f2 \
                    file://node_modules/npm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/agentkeepalive/node_modules/humanize-ms/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/npm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/https-proxy-agent/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/npm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/https-proxy-agent/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/npm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/https-proxy-agent/node_modules/agent-base/node_modules/es6-promisify/node_modules/es6-promise/LICENSE;md5=6e73e44544d76c1978a076a8292d031a \
                    file://node_modules/npm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/http-proxy-agent/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/npm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/http-proxy-agent/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/npm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/http-proxy-agent/node_modules/agent-base/node_modules/es6-promisify/node_modules/es6-promise/LICENSE;md5=6e73e44544d76c1978a076a8292d031a \
                    file://node_modules/npm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/node-fetch-npm/LICENSE.md;md5=89fabe2fb10f72e48c2b3be506237d1e \
                    file://node_modules/npm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/node-fetch-npm/node_modules/encoding/LICENSE;md5=a9992d70215d97e8b82d289cec0c1ffa \
                    file://node_modules/npm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/node-fetch-npm/node_modules/encoding/node_modules/iconv-lite/LICENSE;md5=f942263d98f0d75e0e0101884e86261d \
                    file://node_modules/npm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/node-fetch-npm/node_modules/encoding/node_modules/iconv-lite/node_modules/safer-buffer/LICENSE;md5=3baebc2a17b8f5bff04882cd0dc0f76e \
                    file://node_modules/npm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/socks-proxy-agent/node_modules/socks/LICENSE;md5=742dc14598fb295b01df682683c57709 \
                    file://node_modules/npm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/socks-proxy-agent/node_modules/socks/node_modules/smart-buffer/LICENSE;md5=5b37b090a43e81bd880398260c467866 \
                    file://node_modules/npm/node_modules/pacote/node_modules/make-fetch-happen/node_modules/socks-proxy-agent/node_modules/agent-base/node_modules/es6-promisify/node_modules/es6-promise/LICENSE;md5=6e73e44544d76c1978a076a8292d031a \
                    file://node_modules/npm/node_modules/pacote/node_modules/minimatch/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/pacote/node_modules/minimatch/node_modules/brace-expansion/LICENSE;md5=a5df515ef062cc3affd8c0ae59c059ec \
                    file://node_modules/npm/node_modules/pacote/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md;md5=7fa99ddc3424107350ca6e9a24552085 \
                    file://node_modules/npm/node_modules/pacote/node_modules/minimatch/node_modules/brace-expansion/node_modules/concat-map/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/npm/node_modules/pacote/node_modules/protoduck/LICENSE;md5=600e087d738cbe15867f79bd3dba1474 \
                    file://node_modules/npm/node_modules/which/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/which/node_modules/isexe/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-pick-manifest/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/normalize-package-data/LICENSE;md5=745d0cb7803882ab26451fefb149878e \
                    file://node_modules/npm/node_modules/normalize-package-data/node_modules/is-builtin-module/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/normalize-package-data/node_modules/is-builtin-module/node_modules/builtin-modules/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/write-file-atomic/LICENSE;md5=68705ba56afdf6710c9187ed9a9cdd03 \
                    file://node_modules/npm/node_modules/write-file-atomic/node_modules/signal-exit/LICENSE.txt;md5=e29e20260a1c78dba16a233048565cde \
                    file://node_modules/npm/node_modules/lodash._cacheindexof/LICENSE.txt;md5=f519f8cb155e30cece6b0e75aa6a3a53 \
                    file://node_modules/npm/node_modules/lodash.without/LICENSE;md5=a3b2b7770df62392c164de4001b59f8f \
                    file://node_modules/npm/node_modules/sha/LICENSE;md5=38b757cd94af601a475aa9fa6f2b4de0 \
                    file://node_modules/npm/node_modules/sha/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/npm/node_modules/sha/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/npm/node_modules/sorted-object/LICENSE.txt;md5=93e718eabbb5803792f2eb34e98e2d67 \
                    file://node_modules/npm/node_modules/init-package-json/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/npm/node_modules/init-package-json/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/init-package-json/node_modules/validate-npm-package-license/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://node_modules/npm/node_modules/init-package-json/node_modules/read-package-json/LICENSE;md5=6392dc4522c189c9616b2ec1ab763bec \
                    file://node_modules/npm/node_modules/init-package-json/node_modules/validate-npm-package-name/LICENSE;md5=2c81fede4288971ecb9719722b894db6 \
                    file://node_modules/npm/node_modules/init-package-json/node_modules/promzard/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/npm/node_modules/init-package-json/node_modules/promzard/node_modules/read/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/init-package-json/node_modules/glob/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/init-package-json/node_modules/npm-package-arg/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/npm/node_modules/init-package-json/node_modules/read/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/cmd-shim/LICENSE;md5=8ce909f9cccb74a7c6f2720930d072c1 \
                    file://node_modules/npm/node_modules/uid-number/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/npm/node_modules/request/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/npm/node_modules/request/node_modules/forever-agent/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/npm/node_modules/request/node_modules/isstream/LICENSE.md;md5=1798150b9d70250c42b55b3530e6af2b \
                    file://node_modules/npm/node_modules/request/node_modules/extend/LICENSE;md5=33d9f7a91df276ec16aa941032ee1476 \
                    file://node_modules/npm/node_modules/request/node_modules/combined-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/npm/node_modules/request/node_modules/combined-stream/node_modules/delayed-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/npm/node_modules/request/node_modules/hawk/LICENSE;md5=aa3dcddf0039666585d9b80574526e38 \
                    file://node_modules/npm/node_modules/request/node_modules/hawk/node_modules/cryptiles/LICENSE;md5=26920e2bf2057e454e3ab72a437e564e \
                    file://node_modules/npm/node_modules/request/node_modules/hawk/node_modules/cryptiles/node_modules/boom/LICENSE;md5=ccfa8265c53cf13b063280d0917eb517 \
                    file://node_modules/npm/node_modules/request/node_modules/hawk/node_modules/sntp/LICENSE;md5=4ce2a96fc8315e28c47cc7b470e4ccdb \
                    file://node_modules/npm/node_modules/request/node_modules/hawk/node_modules/boom/LICENSE;md5=ccfa8265c53cf13b063280d0917eb517 \
                    file://node_modules/npm/node_modules/request/node_modules/hawk/node_modules/hoek/LICENSE;md5=a670c1b0730654cd87189993221cdf0d \
                    file://node_modules/npm/node_modules/request/node_modules/qs/LICENSE;md5=d5c7c6dc45a33a0a9620ed81315672d7 \
                    file://node_modules/npm/node_modules/request/node_modules/caseless/LICENSE;md5=e9dadf023ba6ebd98e3e0acb6e2470e3 \
                    file://node_modules/npm/node_modules/request/node_modules/tough-cookie/LICENSE;md5=ceb9c658d7a5d62bee6628c46832168e \
                    file://node_modules/npm/node_modules/request/node_modules/tough-cookie/node_modules/punycode/LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987 \
                    file://node_modules/npm/node_modules/request/node_modules/form-data/License;md5=7aa505292e2636a9e59d4d3f258f4819 \
                    file://node_modules/npm/node_modules/request/node_modules/form-data/node_modules/asynckit/LICENSE;md5=177bc287fb9558bf3ea50b440c1c86ff \
                    file://node_modules/npm/node_modules/request/node_modules/performance-now/license.txt;md5=a07ae1b6dc33215d89a1281ee71c863c \
                    file://node_modules/npm/node_modules/request/node_modules/http-signature/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/npm/node_modules/request/node_modules/http-signature/node_modules/sshpk/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/npm/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/asn1/LICENSE;md5=5ce2f42143c298495637e28e40cd5462 \
                    file://node_modules/npm/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/jsbn/LICENSE;md5=c6ea389b6b52325149beeec27075c5ac \
                    file://node_modules/npm/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/LICENSE;md5=0d289b6d63cbcc18e4b2af9a5bd28b54 \
                    file://node_modules/npm/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/lib/LICENSE-jsbn;md5=32052d48bacabd1c02e56c6889082a27 \
                    file://node_modules/npm/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/getpass/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/npm/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/dashdash/LICENSE.txt;md5=ebce61c1a0900d798daaf5853c69ce72 \
                    file://node_modules/npm/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/tweetnacl/LICENSE;md5=911690f51af322440237a253d695d19f \
                    file://node_modules/npm/node_modules/request/node_modules/http-signature/node_modules/jsprim/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://node_modules/npm/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/extsprintf/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://node_modules/npm/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/LICENSE;md5=04fce49dd88d841ceb36616ab9789ce0 \
                    file://node_modules/npm/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/node_modules/core-util-is/LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff \
                    file://node_modules/npm/node_modules/request/node_modules/is-typedarray/LICENSE.md;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/npm/node_modules/request/node_modules/stringstream/LICENSE.txt;md5=3b3d0996fc07ae2d89c4659b9ffcbe2e \
                    file://node_modules/npm/node_modules/request/node_modules/json-stringify-safe/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/request/node_modules/tunnel-agent/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/npm/node_modules/request/node_modules/har-validator/LICENSE;md5=bfa81591facc9224e4c7451c8dc12958 \
                    file://node_modules/npm/node_modules/request/node_modules/har-validator/node_modules/ajv/LICENSE;md5=715855234c57d97032971adfc0608a07 \
                    file://node_modules/npm/node_modules/request/node_modules/har-validator/node_modules/ajv/node_modules/fast-deep-equal/LICENSE;md5=ea87ade09b9e6da4f2e47904a4ee137b \
                    file://node_modules/npm/node_modules/request/node_modules/har-validator/node_modules/ajv/node_modules/fast-json-stable-stringify/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/npm/node_modules/request/node_modules/har-validator/node_modules/ajv/node_modules/json-schema-traverse/LICENSE;md5=ea87ade09b9e6da4f2e47904a4ee137b \
                    file://node_modules/npm/node_modules/request/node_modules/har-validator/node_modules/ajv/node_modules/co/LICENSE;md5=1cb994f27906c83d46a3cc6d9e1d8d6c \
                    file://node_modules/npm/node_modules/request/node_modules/har-validator/node_modules/har-schema/LICENSE;md5=bfa81591facc9224e4c7451c8dc12958 \
                    file://node_modules/npm/node_modules/request/node_modules/aws4/LICENSE;md5=ff6f181928a91d8631d565516b4db3cb \
                    file://node_modules/npm/node_modules/request/node_modules/aws-sign2/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/npm/node_modules/request/node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/npm/node_modules/request/node_modules/mime-types/node_modules/mime-db/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/npm/node_modules/request/node_modules/oauth-sign/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/npm/node_modules/read-package-tree/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/read-package-tree/node_modules/dezalgo/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/read-package-tree/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/read-package-tree/node_modules/read-package-json/LICENSE;md5=6392dc4522c189c9616b2ec1ab763bec \
                    file://node_modules/npm/node_modules/read-package-tree/node_modules/read-package-json/node_modules/json-parse-better-errors/LICENSE.md;md5=048cc2006d506256349ca6088641486b \
                    file://node_modules/npm/node_modules/read-package-tree/node_modules/read-package-json/node_modules/normalize-package-data/LICENSE;md5=745d0cb7803882ab26451fefb149878e \
                    file://node_modules/npm/node_modules/read-package-tree/node_modules/read-package-json/node_modules/normalize-package-data/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/read-package-tree/node_modules/read-package-json/node_modules/normalize-package-data/node_modules/hosted-git-info/LICENSE;md5=a01f10cd299d5727263720d47cc2c908 \
                    file://node_modules/npm/node_modules/read-package-tree/node_modules/read-package-json/node_modules/normalize-package-data/node_modules/validate-npm-package-license/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://node_modules/npm/node_modules/read-package-tree/node_modules/read-package-json/node_modules/normalize-package-data/node_modules/validate-npm-package-license/node_modules/spdx-correct/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://node_modules/npm/node_modules/read-package-tree/node_modules/read-package-json/node_modules/normalize-package-data/node_modules/validate-npm-package-license/node_modules/spdx-correct/node_modules/spdx-expression-parse/LICENSE;md5=35a411d082d4487ab0e0287014cddf80 \
                    file://node_modules/npm/node_modules/read-package-tree/node_modules/read-package-json/node_modules/normalize-package-data/node_modules/validate-npm-package-license/node_modules/spdx-expression-parse/LICENSE;md5=35a411d082d4487ab0e0287014cddf80 \
                    file://node_modules/npm/node_modules/read-package-tree/node_modules/read-package-json/node_modules/normalize-package-data/node_modules/is-builtin-module/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/read-package-tree/node_modules/read-package-json/node_modules/normalize-package-data/node_modules/is-builtin-module/node_modules/builtin-modules/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/read-package-tree/node_modules/read-package-json/node_modules/glob/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/read-package-tree/node_modules/read-package-json/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/npm/node_modules/read-package-tree/node_modules/readdir-scoped-modules/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/read-package-tree/node_modules/debuglog/LICENSE;md5=40a8cc092438d1ad43c1146547c36218 \
                    file://node_modules/npm/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/npm/node_modules/worker-farm/LICENSE.md;md5=4dcc11be7d284ae672629a65a5bf6b45 \
                    file://node_modules/npm/node_modules/worker-farm/node_modules/errno/node_modules/prr/LICENSE.md;md5=75bd46e30eb2544a54966a0b2b6204ca \
                    file://node_modules/npm/node_modules/retry/License;md5=c40fe50d231414ad1bc68e8965e7e95e \
                    file://node_modules/npm/node_modules/path-is-inside/LICENSE.txt;md5=8de5f23be471b6814f19b2ad82a5208a \
                    file://node_modules/npm/node_modules/opener/LICENSE.txt;md5=31b6a3af88d09b90528f8579ddaba01b \
                    file://node_modules/npm/node_modules/lru-cache/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/lru-cache/node_modules/yallist/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/lru-cache/node_modules/pseudomap/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/glob/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/glob/node_modules/fs.realpath/LICENSE;md5=062470525c8e380f8567f665ef554d11 \
                    file://node_modules/npm/node_modules/glob/node_modules/minimatch/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md;md5=7fa99ddc3424107350ca6e9a24552085 \
                    file://node_modules/npm/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/concat-map/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/npm/node_modules/glob/node_modules/path-is-absolute/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/npm-lifecycle/LICENSE;md5=55a3c686daad7dc7b9be707d72b6f3f4 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/byline/LICENSE;md5=cb13beb0afa908b598d3ba6b12a36a95 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/umask/LICENSE;md5=591ba02f79788ac1bf18566344ad5e1b \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/which/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/uid-number/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/resolve-from/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/LICENSE;md5=694e396551033371686c80d3a1a69e88 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/gyp/LICENSE;md5=ab828cb8ce4c62ee82945a11247b6bbd \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/tar/LICENSE;md5=34c65f5b9b91f31827910d3b54bd6497 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/tar/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/tar/node_modules/block-stream/LICENCE;md5=c695aba12d799c74e770d90e1c5d59aa \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/tar/node_modules/block-stream/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/tar/node_modules/block-stream/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/tar/node_modules/fstream/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/which/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/forever-agent/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/isstream/LICENSE.md;md5=1798150b9d70250c42b55b3530e6af2b \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/extend/LICENSE;md5=33d9f7a91df276ec16aa941032ee1476 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/combined-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/qs/LICENSE;md5=d5c7c6dc45a33a0a9620ed81315672d7 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/caseless/LICENSE;md5=e9dadf023ba6ebd98e3e0acb6e2470e3 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/tough-cookie/LICENSE;md5=7189377a5215f1211b70cf2b9754841e \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/tough-cookie/node_modules/punycode/LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/form-data/License;md5=7aa505292e2636a9e59d4d3f258f4819 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/form-data/node_modules/combined-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/form-data/node_modules/combined-stream/node_modules/delayed-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/form-data/node_modules/asynckit/LICENSE;md5=177bc287fb9558bf3ea50b440c1c86ff \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/form-data/node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/form-data/node_modules/mime-types/node_modules/mime-db/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/performance-now/license.txt;md5=a07ae1b6dc33215d89a1281ee71c863c \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/asn1/LICENSE;md5=5ce2f42143c298495637e28e40cd5462 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/asn1/node_modules/safer-buffer/LICENSE;md5=3baebc2a17b8f5bff04882cd0dc0f76e \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/jsbn/LICENSE;md5=c6ea389b6b52325149beeec27075c5ac \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/LICENSE;md5=0d289b6d63cbcc18e4b2af9a5bd28b54 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/lib/LICENSE-jsbn;md5=32052d48bacabd1c02e56c6889082a27 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/node_modules/jsbn/LICENSE;md5=c6ea389b6b52325149beeec27075c5ac \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/node_modules/safer-buffer/LICENSE;md5=3baebc2a17b8f5bff04882cd0dc0f76e \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/getpass/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/dashdash/LICENSE.txt;md5=ebce61c1a0900d798daaf5853c69ce72 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/tweetnacl/LICENSE;md5=911690f51af322440237a253d695d19f \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/safer-buffer/LICENSE;md5=3baebc2a17b8f5bff04882cd0dc0f76e \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/bcrypt-pbkdf/LICENSE;md5=aaf6ebb9d1b815768d32661e72bdd761 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/bcrypt-pbkdf/node_modules/tweetnacl/LICENSE;md5=911690f51af322440237a253d695d19f \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/jsprim/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/extsprintf/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/LICENSE;md5=04fce49dd88d841ceb36616ab9789ce0 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/node_modules/extsprintf/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/node_modules/core-util-is/LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/is-typedarray/LICENSE.md;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/json-stringify-safe/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/tunnel-agent/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/tunnel-agent/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/har-validator/LICENSE;md5=bfa81591facc9224e4c7451c8dc12958 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/har-validator/node_modules/ajv/LICENSE;md5=715855234c57d97032971adfc0608a07 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/har-validator/node_modules/ajv/node_modules/fast-deep-equal/LICENSE;md5=ea87ade09b9e6da4f2e47904a4ee137b \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/har-validator/node_modules/ajv/node_modules/fast-json-stable-stringify/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/har-validator/node_modules/ajv/node_modules/json-schema-traverse/LICENSE;md5=ea87ade09b9e6da4f2e47904a4ee137b \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/har-validator/node_modules/ajv/node_modules/co/LICENSE;md5=1cb994f27906c83d46a3cc6d9e1d8d6c \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/har-validator/node_modules/har-schema/LICENSE;md5=bfa81591facc9224e4c7451c8dc12958 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/uuid/LICENSE.md;md5=c9420736e23afb538ba5fbe44197f0b4 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/aws4/LICENSE;md5=ff6f181928a91d8631d565516b4db3cb \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/aws-sign2/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/request/node_modules/oauth-sign/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/glob/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/nopt/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/nopt/node_modules/abbrev/LICENSE;md5=e9c0b639498fbe60d17b10099aba77c0 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/fstream/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/fstream/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/fstream/node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/fstream/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/fstream/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/osenv/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/npmlog/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/npmlog/node_modules/console-control-strings/LICENSE;md5=43abbc6f9093aea69560715033788727 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/npmlog/node_modules/gauge/LICENSE;md5=43abbc6f9093aea69560715033788727 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/npmlog/node_modules/gauge/node_modules/strip-ansi/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/npmlog/node_modules/gauge/node_modules/object-assign/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/npmlog/node_modules/gauge/node_modules/has-unicode/LICENSE;md5=2bab5b1c26e9c44fc4e489bb98cfb196 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/npmlog/node_modules/gauge/node_modules/wide-align/LICENSE;md5=9d215c9223fbef14a4642cc450e7ed4b \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/npmlog/node_modules/gauge/node_modules/wide-align/node_modules/string-width/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/npmlog/node_modules/gauge/node_modules/console-control-strings/LICENSE;md5=43abbc6f9093aea69560715033788727 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/npmlog/node_modules/gauge/node_modules/string-width/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/npmlog/node_modules/gauge/node_modules/string-width/node_modules/strip-ansi/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/npmlog/node_modules/gauge/node_modules/string-width/node_modules/code-point-at/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/npmlog/node_modules/gauge/node_modules/string-width/node_modules/is-fullwidth-code-point/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/npmlog/node_modules/gauge/node_modules/string-width/node_modules/is-fullwidth-code-point/node_modules/number-is-nan/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/npmlog/node_modules/gauge/node_modules/signal-exit/LICENSE.txt;md5=e29e20260a1c78dba16a233048565cde \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/npmlog/node_modules/gauge/node_modules/aproba/LICENSE;md5=9d215c9223fbef14a4642cc450e7ed4b \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/npmlog/node_modules/are-we-there-yet/LICENSE;md5=039a23da29f56411e6d75d7b7bc9de13 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/delegates/License;md5=039225978c07bc42e8c0ef2f72b81c09 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/node-gyp/node_modules/npmlog/node_modules/set-blocking/LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/npm/node_modules/npm-lifecycle/node_modules/slide/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/npm/node_modules/unpipe/LICENSE;md5=934ab86a8ab081ea0326add08d550739 \
                    file://node_modules/npm/node_modules/npm-packlist/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-packlist/node_modules/ignore-walk/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-packlist/node_modules/ignore-walk/node_modules/minimatch/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-packlist/node_modules/ignore-walk/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md;md5=7fa99ddc3424107350ca6e9a24552085 \
                    file://node_modules/npm/node_modules/npm-packlist/node_modules/ignore-walk/node_modules/minimatch/node_modules/brace-expansion/node_modules/concat-map/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/npm/node_modules/npm-package-arg/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/npm/node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/nopt/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/nopt/node_modules/abbrev/LICENSE;md5=e9c0b639498fbe60d17b10099aba77c0 \
                    file://node_modules/npm/node_modules/nopt/node_modules/osenv/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/npm/node_modules/readable-stream/node_modules/string_decoder/LICENSE;md5=14af51f8c0a6c6e400b53e18c6e5f85c \
                    file://node_modules/npm/node_modules/readable-stream/node_modules/core-util-is/LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff \
                    file://node_modules/npm/node_modules/readable-stream/node_modules/process-nextick-args/license.md;md5=216769dac98a78ec088ee7cc6fad1dfa \
                    file://node_modules/npm/node_modules/readable-stream/node_modules/util-deprecate/LICENSE;md5=b7c99ef4b0f3ad9911a52219947f8cf0 \
                    file://node_modules/npm/node_modules/read/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/read/node_modules/mute-stream/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/npm/node_modules/mkdirp/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/npm/node_modules/lazy-property/LICENSE;md5=34aed54d1454553d81a843e946b173a0 \
                    file://node_modules/npm/node_modules/node-gyp/LICENSE;md5=694e396551033371686c80d3a1a69e88 \
                    file://node_modules/npm/node_modules/node-gyp/gyp/LICENSE;md5=ab828cb8ce4c62ee82945a11247b6bbd \
                    file://node_modules/npm/node_modules/node-gyp/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/node-gyp/node_modules/tar/LICENSE;md5=34c65f5b9b91f31827910d3b54bd6497 \
                    file://node_modules/npm/node_modules/node-gyp/node_modules/tar/node_modules/block-stream/LICENCE;md5=c695aba12d799c74e770d90e1c5d59aa \
                    file://node_modules/npm/node_modules/node-gyp/node_modules/tar/node_modules/block-stream/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/node-gyp/node_modules/nopt/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/node-gyp/node_modules/minimatch/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/node-gyp/node_modules/minimatch/node_modules/brace-expansion/LICENSE;md5=a5df515ef062cc3affd8c0ae59c059ec \
                    file://node_modules/npm/node_modules/node-gyp/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md;md5=7fa99ddc3424107350ca6e9a24552085 \
                    file://node_modules/npm/node_modules/node-gyp/node_modules/minimatch/node_modules/brace-expansion/node_modules/concat-map/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/npm/node_modules/node-gyp/node_modules/fstream/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/readdir-scoped-modules/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/readdir-scoped-modules/node_modules/dezalgo/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/readdir-scoped-modules/node_modules/dezalgo/node_modules/asap/LICENSE.md;md5=6ef000dc4ca2360ae9216d401862c653 \
                    file://node_modules/npm/node_modules/readdir-scoped-modules/node_modules/dezalgo/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/readdir-scoped-modules/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/readdir-scoped-modules/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/npm/node_modules/readdir-scoped-modules/node_modules/debuglog/LICENSE;md5=40a8cc092438d1ad43c1146547c36218 \
                    file://node_modules/npm/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/npm/node_modules/uuid/LICENSE.md;md5=c9420736e23afb538ba5fbe44197f0b4 \
                    file://node_modules/npm/node_modules/abbrev/LICENSE;md5=e9c0b639498fbe60d17b10099aba77c0 \
                    file://node_modules/npm/node_modules/ini/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/slide/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/npm/node_modules/editor/LICENSE;md5=f9dca98745be166515372ce0f3762920 \
                    file://node_modules/npm/node_modules/cacache/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/cacache/node_modules/y18n/LICENSE;md5=55e5f88040679148136545002139a8b1 \
                    file://node_modules/npm/node_modules/detect-indent/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/lodash._createcache/LICENSE;md5=f519f8cb155e30cece6b0e75aa6a3a53 \
                    file://node_modules/npm/node_modules/lodash._createcache/node_modules/lodash._getnative/LICENSE;md5=f519f8cb155e30cece6b0e75aa6a3a53 \
                    file://node_modules/npm/node_modules/lodash.restparam/LICENSE.txt;md5=f519f8cb155e30cece6b0e75aa6a3a53 \
                    file://node_modules/npm/node_modules/npm-install-checks/LICENSE;md5=a509d5e6a5b1b1583ce07f713fe0d628 \
                    file://node_modules/npm/node_modules/npm-install-checks/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/osenv/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/osenv/node_modules/os-homedir/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/osenv/node_modules/os-tmpdir/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/npm-profile/LICENSE;md5=2764032ecd89f3bafb0a1a35f966f9e8 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/LICENSE;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/agentkeepalive/node_modules/humanize-ms/LICENSE;md5=838c366f69b72c5df05c96dff79b35f2 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/agentkeepalive/node_modules/humanize-ms/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/https-proxy-agent/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/https-proxy-agent/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/https-proxy-agent/node_modules/agent-base/node_modules/es6-promisify/node_modules/es6-promise/LICENSE;md5=6e73e44544d76c1978a076a8292d031a \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/ssri/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/http-proxy-agent/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/http-proxy-agent/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/http-proxy-agent/node_modules/agent-base/node_modules/es6-promisify/node_modules/es6-promise/LICENSE;md5=6e73e44544d76c1978a076a8292d031a \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/pumpify/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/pumpify/node_modules/pump/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/stream-each/LICENSE;md5=a75272c6b584d0f8e2c1676b4e72469e \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/stream-each/node_modules/stream-shift/LICENSE;md5=42014010547e55bd3bcac2fec8c45624 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/parallel-transform/LICENSE;md5=fe19878d618a5580149056ac2bb9df7f \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/through2/LICENSE.html;md5=bb8031aeb39f1781e22716925f7589ac \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/through2/LICENSE.md;md5=12ef18138f1e1743e5d57ffef544235b \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/through2/node_modules/xtend/LICENCE;md5=96bcdf84e670aafacac9e094bce29ac9 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/end-of-stream/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/duplexify/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/duplexify/node_modules/stream-shift/LICENSE;md5=42014010547e55bd3bcac2fec8c45624 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/from2/LICENSE.md;md5=15f73c9cd6e10613050c714901f0e056 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/flush-write-stream/LICENSE;md5=a75272c6b584d0f8e2c1676b4e72469e \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/concat-stream/LICENSE;md5=3ad90c134f824ddfcea611ee1fa567a8 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/concat-stream/node_modules/typedarray/LICENSE;md5=6085b70b74c7dcf7df4e955725e3153d \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/mississippi/node_modules/pump/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/promise-retry/LICENSE;md5=d81e220dee93fdbcbf7696cc76cec0a0 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/promise-retry/node_modules/retry/License;md5=c40fe50d231414ad1bc68e8965e7e95e \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/node-fetch-npm/LICENSE.md;md5=89fabe2fb10f72e48c2b3be506237d1e \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/node-fetch-npm/node_modules/json-parse-better-errors/LICENSE.md;md5=048cc2006d506256349ca6088641486b \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/node-fetch-npm/node_modules/encoding/LICENSE;md5=a9992d70215d97e8b82d289cec0c1ffa \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/node-fetch-npm/node_modules/encoding/node_modules/iconv-lite/LICENSE;md5=f942263d98f0d75e0e0101884e86261d \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/license;md5=2cc4ca67731de11ba12ab2ba3628eb2c \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/pumpify/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/stream-each/LICENSE;md5=a75272c6b584d0f8e2c1676b4e72469e \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/stream-each/node_modules/stream-shift/LICENSE;md5=42014010547e55bd3bcac2fec8c45624 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/parallel-transform/LICENSE;md5=fe19878d618a5580149056ac2bb9df7f \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/through2/LICENSE.html;md5=bb8031aeb39f1781e22716925f7589ac \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/through2/LICENSE.md;md5=12ef18138f1e1743e5d57ffef544235b \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/through2/node_modules/xtend/LICENCE;md5=96bcdf84e670aafacac9e094bce29ac9 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/end-of-stream/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/duplexify/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/duplexify/node_modules/stream-shift/LICENSE;md5=42014010547e55bd3bcac2fec8c45624 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/from2/LICENSE.md;md5=15f73c9cd6e10613050c714901f0e056 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/flush-write-stream/LICENSE;md5=a75272c6b584d0f8e2c1676b4e72469e \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/concat-stream/LICENSE;md5=3ad90c134f824ddfcea611ee1fa567a8 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/concat-stream/node_modules/typedarray/LICENSE;md5=6085b70b74c7dcf7df4e955725e3153d \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/node_modules/mississippi/node_modules/pump/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/cacache/node_modules/y18n/LICENSE;md5=55e5f88040679148136545002139a8b1 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/socks-proxy-agent/node_modules/socks/LICENSE;md5=742dc14598fb295b01df682683c57709 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/socks-proxy-agent/node_modules/socks/node_modules/smart-buffer/LICENSE;md5=742dc14598fb295b01df682683c57709 \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/make-fetch-happen/node_modules/socks-proxy-agent/node_modules/agent-base/node_modules/es6-promisify/node_modules/es6-promise/LICENSE;md5=6e73e44544d76c1978a076a8292d031a \
                    file://node_modules/npm/node_modules/npm-profile/node_modules/aproba/LICENSE;md5=9d215c9223fbef14a4642cc450e7ed4b \
                    file://node_modules/npm/node_modules/lodash.uniq/LICENSE;md5=a3b2b7770df62392c164de4001b59f8f \
                    file://node_modules/npm/node_modules/aproba/LICENSE;md5=9d215c9223fbef14a4642cc450e7ed4b \
                    file://node_modules/npm/node_modules/ansicolors/LICENSE;md5=bf595075ff556bc46c43e08f142fa4f5 \
                    file://node_modules/npm/node_modules/debuglog/LICENSE;md5=40a8cc092438d1ad43c1146547c36218 \
                    file://node_modules/npm/node_modules/iferr/LICENSE;md5=71eb11f3dd6fa9d8989eb0aea3ce6e96 \
                    file://node_modules/npm/node_modules/npmlog/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npmlog/node_modules/console-control-strings/LICENSE;md5=43abbc6f9093aea69560715033788727 \
                    file://node_modules/npm/node_modules/npmlog/node_modules/gauge/LICENSE;md5=43abbc6f9093aea69560715033788727 \
                    file://node_modules/npm/node_modules/npmlog/node_modules/gauge/node_modules/strip-ansi/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/npmlog/node_modules/gauge/node_modules/strip-ansi/node_modules/ansi-regex/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/npmlog/node_modules/gauge/node_modules/object-assign/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/npmlog/node_modules/gauge/node_modules/wide-align/LICENSE;md5=9d215c9223fbef14a4642cc450e7ed4b \
                    file://node_modules/npm/node_modules/npmlog/node_modules/gauge/node_modules/string-width/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/npmlog/node_modules/gauge/node_modules/string-width/node_modules/code-point-at/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/npmlog/node_modules/gauge/node_modules/string-width/node_modules/is-fullwidth-code-point/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/npmlog/node_modules/gauge/node_modules/string-width/node_modules/is-fullwidth-code-point/node_modules/number-is-nan/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/npmlog/node_modules/gauge/node_modules/signal-exit/LICENSE.txt;md5=e29e20260a1c78dba16a233048565cde \
                    file://node_modules/npm/node_modules/npmlog/node_modules/are-we-there-yet/LICENSE;md5=039a23da29f56411e6d75d7b7bc9de13 \
                    file://node_modules/npm/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/delegates/License;md5=039225978c07bc42e8c0ef2f72b81c09 \
                    file://node_modules/npm/node_modules/npmlog/node_modules/set-blocking/LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35 \
                    file://node_modules/npm/node_modules/is-cidr/LICENSE;md5=7676693aa448e7ad480d8eca57e953d6 \
                    file://node_modules/npm/node_modules/is-cidr/node_modules/cidr-regex/LICENSE;md5=7676693aa448e7ad480d8eca57e953d6 \
                    file://node_modules/npm/node_modules/is-cidr/node_modules/cidr-regex/node_modules/ip-regex/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/npm/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-registry-client/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-registry-client/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-registry-client/node_modules/ssri/LICENSE.md;md5=5324d196a847002a5d476185a59cf238 \
                    file://node_modules/npm/node_modules/npm-registry-client/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npm/node_modules/npm-registry-client/node_modules/normalize-package-data/LICENSE;md5=745d0cb7803882ab26451fefb149878e \
                    file://node_modules/npm/node_modules/npm-registry-client/node_modules/request/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/npm/node_modules/npm-registry-client/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/npm/node_modules/npm-registry-client/node_modules/retry/License;md5=c40fe50d231414ad1bc68e8965e7e95e \
                    file://node_modules/npm/node_modules/npm-registry-client/node_modules/npm-package-arg/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/npm/node_modules/npm-registry-client/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/npm/node_modules/npm-registry-client/node_modules/slide/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/npm/node_modules/npm-registry-client/node_modules/concat-stream/LICENSE;md5=3ad90c134f824ddfcea611ee1fa567a8 \
                    file://node_modules/npm/node_modules/npm-registry-client/node_modules/concat-stream/node_modules/typedarray/LICENSE;md5=6085b70b74c7dcf7df4e955725e3153d \
                    file://node_modules/npm/node_modules/npm-registry-client/node_modules/npmlog/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/package-json/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/package-json/node_modules/rc/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/package-json/node_modules/rc/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/package-json/node_modules/rc/LICENSE.BSD;md5=e7a2a325a0069e82aff675bbf74464a0 \
                    file://node_modules/package-json/node_modules/got/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/package-json/node_modules/got/node_modules/object-assign/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/package-json/node_modules/got/node_modules/pinkie-promise/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
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
                    file://node_modules/package-json/node_modules/got/node_modules/read-all-stream/node_modules/pinkie-promise/node_modules/pinkie/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
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
                    file://node_modules/request/node_modules/hawk/LICENSE;md5=aa3dcddf0039666585d9b80574526e38 \
                    file://node_modules/request/node_modules/hawk/node_modules/cryptiles/LICENSE;md5=26920e2bf2057e454e3ab72a437e564e \
                    file://node_modules/request/node_modules/hawk/node_modules/cryptiles/node_modules/boom/LICENSE;md5=ccfa8265c53cf13b063280d0917eb517 \
                    file://node_modules/request/node_modules/hawk/node_modules/cryptiles/node_modules/boom/node_modules/hoek/LICENSE;md5=a670c1b0730654cd87189993221cdf0d \
                    file://node_modules/request/node_modules/hawk/node_modules/sntp/LICENSE;md5=4ce2a96fc8315e28c47cc7b470e4ccdb \
                    file://node_modules/request/node_modules/hawk/node_modules/sntp/node_modules/hoek/LICENSE;md5=a670c1b0730654cd87189993221cdf0d \
                    file://node_modules/request/node_modules/hawk/node_modules/boom/LICENSE;md5=ccfa8265c53cf13b063280d0917eb517 \
                    file://node_modules/request/node_modules/hawk/node_modules/boom/node_modules/hoek/LICENSE;md5=a670c1b0730654cd87189993221cdf0d \
                    file://node_modules/request/node_modules/hawk/node_modules/hoek/LICENSE;md5=a670c1b0730654cd87189993221cdf0d \
                    file://node_modules/request/node_modules/qs/LICENSE;md5=d5c7c6dc45a33a0a9620ed81315672d7 \
                    file://node_modules/request/node_modules/caseless/LICENSE;md5=e9dadf023ba6ebd98e3e0acb6e2470e3 \
                    file://node_modules/request/node_modules/tough-cookie/LICENSE;md5=ceb9c658d7a5d62bee6628c46832168e \
                    file://node_modules/request/node_modules/tough-cookie/node_modules/punycode/LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987 \
                    file://node_modules/request/node_modules/form-data/License;md5=7aa505292e2636a9e59d4d3f258f4819 \
                    file://node_modules/request/node_modules/performance-now/license.txt;md5=a07ae1b6dc33215d89a1281ee71c863c \
                    file://node_modules/request/node_modules/http-signature/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/request/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/request/node_modules/is-typedarray/LICENSE.md;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/request/node_modules/stringstream/LICENSE.txt;md5=3b3d0996fc07ae2d89c4659b9ffcbe2e \
                    file://node_modules/request/node_modules/json-stringify-safe/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/request/node_modules/tunnel-agent/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/request/node_modules/har-validator/LICENSE;md5=bfa81591facc9224e4c7451c8dc12958 \
                    file://node_modules/request/node_modules/har-validator/node_modules/ajv/LICENSE;md5=715855234c57d97032971adfc0608a07 \
                    file://node_modules/request/node_modules/har-validator/node_modules/har-schema/LICENSE;md5=bfa81591facc9224e4c7451c8dc12958 \
                    file://node_modules/request/node_modules/uuid/LICENSE.md;md5=c9420736e23afb538ba5fbe44197f0b4 \
                    file://node_modules/request/node_modules/aws4/LICENSE;md5=ff6f181928a91d8631d565516b4db3cb \
                    file://node_modules/request/node_modules/aws-sign2/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/request/node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/request/node_modules/oauth-sign/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/async/LICENSE;md5=9ec5487258cc65072647c5488b4d59ad \
                    file://node_modules/async/node_modules/lodash/LICENSE;md5=8f10c81975f996c3ba5b424884b4af96 \
                    file://node_modules/uuid/LICENSE.md;md5=c1a615ca498934d9a312c2d5294cf2cf"

SRC_URI = "npm://registry.npmjs.org;name=microservicebus-node;version=${PV}"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

RDEPENDS_microservicebus-node-uuid = " bash"
RDEPENDS_microservicebus-node-npm = " bash"
RDEPENDS_microservicebus-node-npm-node-gyp = " bash python"


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
LICENSE_${PN}-npm-JSONStream-jsonparse = "MIT"
LICENSE_${PN}-npm-JSONStream-through = "Unknown MIT"
LICENSE_${PN}-npm-JSONStream = "Unknown MIT"
LICENSE_${PN}-npm-abbrev = "ISC"
LICENSE_${PN}-npm-ansi-regex = "MIT"
LICENSE_${PN}-npm-ansicolors = "MIT"
LICENSE_${PN}-npm-ansistyles = "MIT"
LICENSE_${PN}-npm-aproba = "ISC"
LICENSE_${PN}-npm-archy = "MIT"
LICENSE_${PN}-npm-bin-links-bluebird = "MIT"
LICENSE_${PN}-npm-bin-links-cmd-shim-graceful-fs = "ISC"
LICENSE_${PN}-npm-bin-links-cmd-shim-mkdirp = "MIT"
LICENSE_${PN}-npm-bin-links-cmd-shim = "BSD-2-Clause"
LICENSE_${PN}-npm-bin-links-gentle-fs-aproba = "ISC"
LICENSE_${PN}-npm-bin-links-gentle-fs-fs-vacuum-graceful-fs = "ISC"
LICENSE_${PN}-npm-bin-links-gentle-fs-fs-vacuum-path-is-inside = "(WTFPL_|_MIT)"
LICENSE_${PN}-npm-bin-links-gentle-fs-fs-vacuum-rimraf = "ISC"
LICENSE_${PN}-npm-bin-links-gentle-fs-fs-vacuum = "ISC"
LICENSE_${PN}-npm-bin-links-gentle-fs-graceful-fs = "ISC"
LICENSE_${PN}-npm-bin-links-gentle-fs-iferr = "MIT"
LICENSE_${PN}-npm-bin-links-gentle-fs-mkdirp = "MIT"
LICENSE_${PN}-npm-bin-links-gentle-fs-path-is-inside = "(WTFPL_|_MIT)"
LICENSE_${PN}-npm-bin-links-gentle-fs-read-cmd-shim-graceful-fs = "ISC"
LICENSE_${PN}-npm-bin-links-gentle-fs-read-cmd-shim = "ISC"
LICENSE_${PN}-npm-bin-links-gentle-fs-slide = "ISC"
LICENSE_${PN}-npm-bin-links-gentle-fs = "Artistic-2.0"
LICENSE_${PN}-npm-bin-links-graceful-fs = "ISC"
LICENSE_${PN}-npm-bin-links-write-file-atomic-graceful-fs = "ISC"
LICENSE_${PN}-npm-bin-links-write-file-atomic-imurmurhash = "MIT"
LICENSE_${PN}-npm-bin-links-write-file-atomic-signal-exit = "ISC"
LICENSE_${PN}-npm-bin-links-write-file-atomic = "ISC"
LICENSE_${PN}-npm-bin-links = "Artistic-2.0"
LICENSE_${PN}-npm-bluebird = "MIT"
LICENSE_${PN}-npm-byte-size = "MIT"
LICENSE_${PN}-npm-cacache-y18n = "ISC"
LICENSE_${PN}-npm-cacache = "ISC"
LICENSE_${PN}-npm-call-limit = "ISC"
LICENSE_${PN}-npm-chownr = "ISC"
LICENSE_${PN}-npm-cli-columns-string-width-is-fullwidth-code-point = "MIT"
LICENSE_${PN}-npm-cli-columns-string-width-strip-ansi-ansi-regex = "MIT"
LICENSE_${PN}-npm-cli-columns-string-width-strip-ansi = "MIT"
LICENSE_${PN}-npm-cli-columns-string-width = "MIT"
LICENSE_${PN}-npm-cli-columns-strip-ansi-ansi-regex = "MIT"
LICENSE_${PN}-npm-cli-columns-strip-ansi = "MIT"
LICENSE_${PN}-npm-cli-columns = "MIT"
LICENSE_${PN}-npm-cli-table2-colors = "MIT"
LICENSE_${PN}-npm-cli-table2-lodash = "MIT"
LICENSE_${PN}-npm-cli-table2-string-width-code-point-at = "MIT"
LICENSE_${PN}-npm-cli-table2-string-width-is-fullwidth-code-point-number-is-nan = "MIT"
LICENSE_${PN}-npm-cli-table2-string-width-is-fullwidth-code-point = "MIT"
LICENSE_${PN}-npm-cli-table2-string-width-strip-ansi-ansi-regex = "MIT"
LICENSE_${PN}-npm-cli-table2-string-width-strip-ansi = "MIT"
LICENSE_${PN}-npm-cli-table2-string-width = "MIT"
LICENSE_${PN}-npm-cli-table2 = "MIT"
LICENSE_${PN}-npm-cmd-shim = "BSD-2-Clause"
LICENSE_${PN}-npm-columnify-strip-ansi-ansi-regex = "MIT"
LICENSE_${PN}-npm-columnify-strip-ansi = "MIT"
LICENSE_${PN}-npm-columnify-wcwidth-defaults-clone = "MIT"
LICENSE_${PN}-npm-columnify-wcwidth-defaults = "MIT"
LICENSE_${PN}-npm-columnify-wcwidth = "MIT"
LICENSE_${PN}-npm-columnify = "MIT"
LICENSE_${PN}-npm-config-chain-ini = "ISC"
LICENSE_${PN}-npm-config-chain-proto-list = "ISC"
LICENSE_${PN}-npm-config-chain = "MIT"
LICENSE_${PN}-npm-debuglog = "MIT"
LICENSE_${PN}-npm-detect-indent = "MIT"
LICENSE_${PN}-npm-detect-newline = "MIT"
LICENSE_${PN}-npm-dezalgo-asap = "MIT"
LICENSE_${PN}-npm-dezalgo = "ISC"
LICENSE_${PN}-npm-editor = "MIT"
LICENSE_${PN}-npm-figgy-pudding = "ISC"
LICENSE_${PN}-npm-find-npm-prefix = "ISC"
LICENSE_${PN}-npm-fs-vacuum = "ISC"
LICENSE_${PN}-npm-fs-write-stream-atomic-iferr = "MIT"
LICENSE_${PN}-npm-fs-write-stream-atomic = "ISC"
LICENSE_${PN}-npm-gentle-fs-iferr = "MIT"
LICENSE_${PN}-npm-gentle-fs = "Artistic-2.0"
LICENSE_${PN}-npm-glob-fs.realpath = "ISC"
LICENSE_${PN}-npm-glob-minimatch-brace-expansion-balanced-match = "MIT"
LICENSE_${PN}-npm-glob-minimatch-brace-expansion-concat-map = "MIT"
LICENSE_${PN}-npm-glob-minimatch-brace-expansion = "MIT"
LICENSE_${PN}-npm-glob-minimatch = "ISC"
LICENSE_${PN}-npm-glob-path-is-absolute = "MIT"
LICENSE_${PN}-npm-glob = "ISC"
LICENSE_${PN}-npm-graceful-fs = "ISC"
LICENSE_${PN}-npm-has-unicode = "ISC"
LICENSE_${PN}-npm-hosted-git-info = "ISC"
LICENSE_${PN}-npm-iferr = "MIT"
LICENSE_${PN}-npm-imurmurhash = "MIT"
LICENSE_${PN}-npm-inflight = "ISC"
LICENSE_${PN}-npm-inherits = "ISC"
LICENSE_${PN}-npm-init-package-json-glob = "ISC"
LICENSE_${PN}-npm-init-package-json-npm-package-arg = "ISC"
LICENSE_${PN}-npm-init-package-json-promzard-read = "ISC"
LICENSE_${PN}-npm-init-package-json-promzard = "ISC"
LICENSE_${PN}-npm-init-package-json-read-package-json = "ISC"
LICENSE_${PN}-npm-init-package-json-read = "ISC"
LICENSE_${PN}-npm-init-package-json-semver = "ISC"
LICENSE_${PN}-npm-init-package-json-validate-npm-package-license = "Apache-2.0"
LICENSE_${PN}-npm-init-package-json-validate-npm-package-name = "ISC"
LICENSE_${PN}-npm-init-package-json = "ISC"
LICENSE_${PN}-npm-ini = "ISC"
LICENSE_${PN}-npm-is-cidr-cidr-regex-ip-regex = "MIT"
LICENSE_${PN}-npm-is-cidr-cidr-regex = "BSD-2-Clause"
LICENSE_${PN}-npm-is-cidr = "BSD-2-Clause"
LICENSE_${PN}-npm-json-parse-better-errors = "MIT"
LICENSE_${PN}-npm-lazy-property = "MIT"
LICENSE_${PN}-npm-libcipm-bin-links = "Artistic-2.0"
LICENSE_${PN}-npm-libcipm-bluebird = "MIT"
LICENSE_${PN}-npm-libcipm-find-npm-prefix = "ISC"
LICENSE_${PN}-npm-libcipm-graceful-fs = "ISC"
LICENSE_${PN}-npm-libcipm-lock-verify-npm-package-arg = "ISC"
LICENSE_${PN}-npm-libcipm-lock-verify-semver = "ISC"
LICENSE_${PN}-npm-libcipm-lock-verify = "ISC"
LICENSE_${PN}-npm-libcipm-npm-lifecycle = "Artistic-2.0"
LICENSE_${PN}-npm-libcipm-npm-logical-tree = "ISC"
LICENSE_${PN}-npm-libcipm-npm-package-arg = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-bluebird = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-cacache-mississippi-concat-stream-buffer-from = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-cacache-mississippi-concat-stream-typedarray = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-cacache-mississippi-concat-stream = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-cacache-mississippi-duplexify-stream-shift = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-cacache-mississippi-duplexify = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-cacache-mississippi-end-of-stream = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-cacache-mississippi-flush-write-stream = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-cacache-mississippi-from2 = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-cacache-mississippi-parallel-transform-cyclist = "Unknown"
LICENSE_${PN}-npm-libcipm-pacote-cacache-mississippi-parallel-transform = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-cacache-mississippi-pumpify = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-cacache-mississippi-pump = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-cacache-mississippi-stream-each-stream-shift = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-cacache-mississippi-stream-each = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-cacache-mississippi-through2-xtend = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-cacache-mississippi-through2 = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-cacache-mississippi = "BSD-2-Clause"
LICENSE_${PN}-npm-libcipm-pacote-cacache-y18n = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-cacache = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-get-stream = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-glob = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-lru-cache = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-agentkeepalive-humanize-ms-ms = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-agentkeepalive-humanize-ms = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-agentkeepalive = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-http-cache-semantics = "BSD-2-Clause"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-http-proxy-agent-agent-base-es6-promisify-es6-promise = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-http-proxy-agent-agent-base-es6-promisify = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-http-proxy-agent-agent-base = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-http-proxy-agent-debug-ms = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-http-proxy-agent-debug = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-http-proxy-agent = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-https-proxy-agent-agent-base-es6-promisify-es6-promise = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-https-proxy-agent-agent-base-es6-promisify = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-https-proxy-agent-agent-base = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-https-proxy-agent-debug-ms = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-https-proxy-agent-debug = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-https-proxy-agent = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-mississippi-concat-stream-buffer-from = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-mississippi-concat-stream-typedarray = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-mississippi-concat-stream = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-mississippi-duplexify-stream-shift = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-mississippi-duplexify = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-mississippi-end-of-stream = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-mississippi-flush-write-stream = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-mississippi-from2 = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-mississippi-parallel-transform-cyclist = "Unknown"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-mississippi-parallel-transform = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-mississippi-pumpify-pump = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-mississippi-pumpify = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-mississippi-pump = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-mississippi-stream-each-stream-shift = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-mississippi-stream-each = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-mississippi-through2-xtend = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-mississippi-through2 = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-mississippi = "BSD-2-Clause"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-node-fetch-npm-encoding-iconv-lite-safer-buffer = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-node-fetch-npm-encoding-iconv-lite = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-node-fetch-npm-encoding = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-node-fetch-npm = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-socks-proxy-agent-agent-base-es6-promisify-es6-promise = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-socks-proxy-agent-agent-base-es6-promisify = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-socks-proxy-agent-agent-base = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-socks-proxy-agent-socks-ip = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-socks-proxy-agent-socks-smart-buffer = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-socks-proxy-agent-socks = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen-socks-proxy-agent = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-make-fetch-happen = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-minimatch-brace-expansion-balanced-match = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-minimatch-brace-expansion-concat-map = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-minimatch-brace-expansion = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-minimatch = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-minipass = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-mississippi = "BSD-2-Clause"
LICENSE_${PN}-npm-libcipm-pacote-mkdirp = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-normalize-package-data = "BSD-2-Clause"
LICENSE_${PN}-npm-libcipm-pacote-npm-package-arg = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-npm-packlist-ignore-walk-minimatch = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-npm-packlist-ignore-walk = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-npm-packlist-npm-bundled = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-npm-packlist = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-npm-pick-manifest-npm-package-arg = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-npm-pick-manifest-semver = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-npm-pick-manifest = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-osenv = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-promise-inflight = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-promise-retry-err-code = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-promise-retry-retry = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-promise-retry = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-protoduck = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-rimraf = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-safe-buffer = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-semver = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-ssri = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-tar-chownr = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-tar-fs-minipass = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-tar-minipass = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-tar-minizlib = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-tar-mkdirp = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-tar-safe-buffer = "MIT"
LICENSE_${PN}-npm-libcipm-pacote-tar-yallist = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-tar = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-unique-filename = "ISC"
LICENSE_${PN}-npm-libcipm-pacote-which = "ISC"
LICENSE_${PN}-npm-libcipm-pacote = "MIT"
LICENSE_${PN}-npm-libcipm-protoduck-genfun = "CC0-1.0"
LICENSE_${PN}-npm-libcipm-protoduck = "MIT"
LICENSE_${PN}-npm-libcipm-read-package-json = "ISC"
LICENSE_${PN}-npm-libcipm-rimraf = "ISC"
LICENSE_${PN}-npm-libcipm-worker-farm = "MIT"
LICENSE_${PN}-npm-libcipm = "MIT"
LICENSE_${PN}-npm-libnpmhook-figgy-pudding = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-JSONStream-jsonparse = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-JSONStream-through = "Unknown MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-JSONStream = "Unknown MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-bluebird = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-figgy-pudding = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-lru-cache-pseudomap = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-lru-cache-yallist = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-lru-cache = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-agentkeepalive-humanize-ms-ms = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-agentkeepalive-humanize-ms = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-agentkeepalive = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-bluebird = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-chownr = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-figgy-pudding = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-glob = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-graceful-fs = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-lru-cache = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-concat-stream-buffer-from = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-concat-stream-inherits = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-concat-stream-readable-stream = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-concat-stream-typedarray = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-concat-stream = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-duplexify-end-of-stream-once = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-duplexify-end-of-stream = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-duplexify-inherits = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-duplexify-readable-stream = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-duplexify-stream-shift = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-duplexify = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-end-of-stream = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-flush-write-stream-inherits = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-flush-write-stream-readable-stream = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-flush-write-stream = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-from2-inherits = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-from2-readable-stream = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-from2 = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-parallel-transform-cyclist = "Unknown"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-parallel-transform-inherits = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-parallel-transform-readable-stream = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-parallel-transform = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-pump-end-of-stream = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-pump-once = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-pumpify-duplexify = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-pumpify-inherits = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-pumpify-pump-end-of-stream = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-pumpify-pump-once = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-pumpify-pump = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-pumpify = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-pump = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-stream-each-end-of-stream = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-stream-each-stream-shift = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-stream-each = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-through2-readable-stream = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-through2-xtend = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi-through2 = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mississippi = "BSD-2-Clause"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-mkdirp = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-aproba = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-aproba = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-fs-write-stream-atomic-graceful-fs = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-fs-write-stream-atomic-iferr = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-fs-write-stream-atomic-imurmurhash = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-fs-write-stream-atomic-readable-stream = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-fs-write-stream-atomic = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-iferr = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-mkdirp = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-rimraf-glob-fs.realpath = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-rimraf-glob-inflight-once = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-rimraf-glob-inflight-wrappy = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-rimraf-glob-inflight = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-rimraf-glob-inherits = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-rimraf-glob-minimatch-brace-expansion-balanced-match = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-rimraf-glob-minimatch-brace-expansion-concat-map = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-rimraf-glob-minimatch-brace-expansion = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-rimraf-glob-minimatch = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-rimraf-glob-once-wrappy = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-rimraf-glob-once = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-rimraf-glob-path-is-absolute = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-rimraf-glob = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-rimraf = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently-run-queue = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-copy-concurrently = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-fs-write-stream-atomic = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-mkdirp = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-rimraf = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-run-queue-aproba = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently-run-queue = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-promise-inflight = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-rimraf = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-ssri-figgy-pudding = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-ssri = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-unique-filename-unique-slug-imurmurhash = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-unique-filename-unique-slug = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-unique-filename = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache-y18n = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-cacache = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-http-cache-semantics = "BSD-2-Clause"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-http-proxy-agent-agent-base-es6-promisify-es6-promise = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-http-proxy-agent-agent-base-es6-promisify = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-http-proxy-agent-agent-base = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-http-proxy-agent-debug-ms = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-http-proxy-agent-debug = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-http-proxy-agent = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-https-proxy-agent-agent-base-es6-promisify-es6-promise = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-https-proxy-agent-agent-base-es6-promisify = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-https-proxy-agent-agent-base = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-https-proxy-agent-debug-ms = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-https-proxy-agent-debug = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-https-proxy-agent = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-lru-cache = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-mississippi = "BSD-2-Clause"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-node-fetch-npm-encoding-iconv-lite-safer-buffer = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-node-fetch-npm-encoding-iconv-lite = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-node-fetch-npm-encoding = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-node-fetch-npm-json-parse-better-errors = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-node-fetch-npm-safe-buffer = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-node-fetch-npm = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-promise-retry-err-code = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-promise-retry-retry = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-promise-retry = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-socks-proxy-agent-agent-base-es6-promisify-es6-promise = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-socks-proxy-agent-agent-base-es6-promisify = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-socks-proxy-agent-agent-base = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-socks-proxy-agent-socks-ip = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-socks-proxy-agent-socks-smart-buffer = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-socks-proxy-agent-socks = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-socks-proxy-agent = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen-ssri = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-make-fetch-happen = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-npm-package-arg-hosted-git-info = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-npm-package-arg-osenv-os-homedir = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-npm-package-arg-osenv-os-tmpdir = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-npm-package-arg-osenv = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-npm-package-arg-semver = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-npm-package-arg-validate-npm-package-name-builtins = "MIT"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-npm-package-arg-validate-npm-package-name = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch-npm-package-arg = "ISC"
LICENSE_${PN}-npm-libnpmhook-npm-registry-fetch = "ISC"
LICENSE_${PN}-npm-libnpmhook = "ISC"
LICENSE_${PN}-npm-libnpx-dotenv = "BSD-2-Clause"
LICENSE_${PN}-npm-libnpx-npm-package-arg = "ISC"
LICENSE_${PN}-npm-libnpx-rimraf = "ISC"
LICENSE_${PN}-npm-libnpx-safe-buffer = "MIT"
LICENSE_${PN}-npm-libnpx-update-notifier = "BSD-2-Clause"
LICENSE_${PN}-npm-libnpx-which = "ISC"
LICENSE_${PN}-npm-libnpx-y18n = "ISC"
LICENSE_${PN}-npm-libnpx-yargs-cliui-string-width = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-cliui-strip-ansi = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-cliui-wrap-ansi-string-width-code-point-at = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-cliui-wrap-ansi-string-width-is-fullwidth-code-point-number-is-nan = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-cliui-wrap-ansi-string-width-is-fullwidth-code-point = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-cliui-wrap-ansi-string-width = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-cliui-wrap-ansi-strip-ansi-ansi-regex = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-cliui-wrap-ansi-strip-ansi = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-cliui-wrap-ansi = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-cliui = "ISC"
LICENSE_${PN}-npm-libnpx-yargs-decamelize = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-find-up-locate-path-p-locate-p-limit-p-try = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-find-up-locate-path-p-locate-p-limit = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-find-up-locate-path-p-locate = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-find-up-locate-path-path-exists = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-find-up-locate-path = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-find-up = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-get-caller-file = "ISC"
LICENSE_${PN}-npm-libnpx-yargs-os-locale-execa-cross-spawn-shebang-command-shebang-regex = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-os-locale-execa-cross-spawn-shebang-command = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-os-locale-execa-cross-spawn = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-os-locale-execa-get-stream = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-os-locale-execa-is-stream = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-os-locale-execa-npm-run-path-path-key = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-os-locale-execa-npm-run-path = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-os-locale-execa-p-finally = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-os-locale-execa-signal-exit = "ISC"
LICENSE_${PN}-npm-libnpx-yargs-os-locale-execa-strip-eof = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-os-locale-execa = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-os-locale-lcid-invert-kv = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-os-locale-lcid = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-os-locale-mem-mimic-fn = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-os-locale-mem = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-os-locale = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-require-directory = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-require-main-filename = "ISC"
LICENSE_${PN}-npm-libnpx-yargs-set-blocking = "ISC"
LICENSE_${PN}-npm-libnpx-yargs-string-width-is-fullwidth-code-point = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-string-width = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-which-module = "ISC"
LICENSE_${PN}-npm-libnpx-yargs-y18n = "ISC"
LICENSE_${PN}-npm-libnpx-yargs-yargs-parser-camelcase = "MIT"
LICENSE_${PN}-npm-libnpx-yargs-yargs-parser = "ISC"
LICENSE_${PN}-npm-libnpx-yargs = "MIT"
LICENSE_${PN}-npm-libnpx = "ISC"
LICENSE_${PN}-npm-lockfile-signal-exit = "ISC"
LICENSE_${PN}-npm-lockfile = "ISC"
LICENSE_${PN}-npm-lodash.-baseindexof = "MIT"
LICENSE_${PN}-npm-lodash.-baseuniq-lodash.-createset = "MIT"
LICENSE_${PN}-npm-lodash.-baseuniq-lodash.-root = "MIT"
LICENSE_${PN}-npm-lodash.-baseuniq = "MIT"
LICENSE_${PN}-npm-lodash.-bindcallback = "MIT"
LICENSE_${PN}-npm-lodash.-cacheindexof = "MIT"
LICENSE_${PN}-npm-lodash.-createcache-lodash.-getnative = "MIT"
LICENSE_${PN}-npm-lodash.-createcache = "MIT"
LICENSE_${PN}-npm-lodash.-getnative = "MIT"
LICENSE_${PN}-npm-lodash.clonedeep = "MIT"
LICENSE_${PN}-npm-lodash.restparam = "MIT"
LICENSE_${PN}-npm-lodash.union = "MIT"
LICENSE_${PN}-npm-lodash.uniq = "MIT"
LICENSE_${PN}-npm-lodash.without = "MIT"
LICENSE_${PN}-npm-lru-cache-pseudomap = "ISC"
LICENSE_${PN}-npm-lru-cache-yallist = "ISC"
LICENSE_${PN}-npm-lru-cache = "ISC"
LICENSE_${PN}-npm-meant = "MIT"
LICENSE_${PN}-npm-mississippi-concat-stream-typedarray = "MIT"
LICENSE_${PN}-npm-mississippi-concat-stream = "MIT"
LICENSE_${PN}-npm-mississippi-duplexify-stream-shift = "MIT"
LICENSE_${PN}-npm-mississippi-duplexify = "MIT"
LICENSE_${PN}-npm-mississippi-end-of-stream = "MIT"
LICENSE_${PN}-npm-mississippi-flush-write-stream = "MIT"
LICENSE_${PN}-npm-mississippi-from2 = "MIT"
LICENSE_${PN}-npm-mississippi-parallel-transform-cyclist = "Unknown"
LICENSE_${PN}-npm-mississippi-parallel-transform = "MIT"
LICENSE_${PN}-npm-mississippi-pumpify-pump = "MIT"
LICENSE_${PN}-npm-mississippi-pumpify = "MIT"
LICENSE_${PN}-npm-mississippi-pump = "MIT"
LICENSE_${PN}-npm-mississippi-stream-each-stream-shift = "MIT"
LICENSE_${PN}-npm-mississippi-stream-each = "MIT"
LICENSE_${PN}-npm-mississippi-through2-xtend = "MIT"
LICENSE_${PN}-npm-mississippi-through2 = "MIT"
LICENSE_${PN}-npm-mississippi = "BSD-2-Clause"
LICENSE_${PN}-npm-mkdirp-minimist = "MIT"
LICENSE_${PN}-npm-mkdirp = "MIT"
LICENSE_${PN}-npm-move-concurrently-copy-concurrently-iferr = "MIT"
LICENSE_${PN}-npm-move-concurrently-copy-concurrently = "ISC"
LICENSE_${PN}-npm-move-concurrently-run-queue = "ISC"
LICENSE_${PN}-npm-move-concurrently = "ISC"
LICENSE_${PN}-npm-node-gyp-fstream = "ISC"
LICENSE_${PN}-npm-node-gyp-minimatch-brace-expansion-balanced-match = "MIT"
LICENSE_${PN}-npm-node-gyp-minimatch-brace-expansion-concat-map = "MIT"
LICENSE_${PN}-npm-node-gyp-minimatch-brace-expansion = "MIT"
LICENSE_${PN}-npm-node-gyp-minimatch = "ISC"
LICENSE_${PN}-npm-node-gyp-nopt = "ISC"
LICENSE_${PN}-npm-node-gyp-semver = "ISC"
LICENSE_${PN}-npm-node-gyp-tar-block-stream = "Unknown ISC"
LICENSE_${PN}-npm-node-gyp-tar = "ISC"
LICENSE_${PN}-npm-node-gyp = "Unknown MIT"
LICENSE_${PN}-npm-nopt-abbrev = "ISC"
LICENSE_${PN}-npm-nopt-osenv = "ISC"
LICENSE_${PN}-npm-nopt = "ISC"
LICENSE_${PN}-npm-normalize-package-data-is-builtin-module-builtin-modules = "MIT"
LICENSE_${PN}-npm-normalize-package-data-is-builtin-module = "MIT"
LICENSE_${PN}-npm-normalize-package-data = "BSD-2-Clause"
LICENSE_${PN}-npm-npm-audit-report-cli-table3-colors = "MIT"
LICENSE_${PN}-npm-npm-audit-report-cli-table3-object-assign = "MIT"
LICENSE_${PN}-npm-npm-audit-report-cli-table3-string-width = "MIT"
LICENSE_${PN}-npm-npm-audit-report-cli-table3 = "MIT"
LICENSE_${PN}-npm-npm-audit-report-console-control-strings = "ISC"
LICENSE_${PN}-npm-npm-audit-report = "ISC"
LICENSE_${PN}-npm-npm-cache-filename = "ISC"
LICENSE_${PN}-npm-npm-install-checks-semver = "ISC"
LICENSE_${PN}-npm-npm-install-checks = "BSD-2-Clause"
LICENSE_${PN}-npm-npm-lifecycle-byline = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-graceful-fs = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-fstream-graceful-fs = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-fstream-inherits = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-fstream-mkdirp = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-fstream-rimraf = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-fstream = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-glob = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-graceful-fs = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-mkdirp = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-nopt-abbrev = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-nopt = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-npmlog-are-we-there-yet-delegates = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-npmlog-are-we-there-yet-readable-stream = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-npmlog-are-we-there-yet = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-npmlog-console-control-strings = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-npmlog-gauge-aproba = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-npmlog-gauge-console-control-strings = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-npmlog-gauge-has-unicode = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-npmlog-gauge-object-assign = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-npmlog-gauge-signal-exit = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-npmlog-gauge-string-width-code-point-at = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-npmlog-gauge-string-width-is-fullwidth-code-point-number-is-nan = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-npmlog-gauge-string-width-is-fullwidth-code-point = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-npmlog-gauge-string-width-strip-ansi = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-npmlog-gauge-string-width = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-npmlog-gauge-strip-ansi = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-npmlog-gauge-wide-align-string-width = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-npmlog-gauge-wide-align = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-npmlog-gauge = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-npmlog-set-blocking = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-npmlog = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-osenv = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-aws-sign2 = "Apache-2.0"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-aws4 = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-caseless = "Apache-2.0"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-combined-stream = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-extend = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-forever-agent = "Apache-2.0"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-form-data-asynckit = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-form-data-combined-stream-delayed-stream = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-form-data-combined-stream = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-form-data-mime-types-mime-db = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-form-data-mime-types = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-form-data = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-har-validator-ajv-co = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-har-validator-ajv-fast-deep-equal = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-har-validator-ajv-fast-json-stable-stringify = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-har-validator-ajv-json-schema-traverse = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-har-validator-ajv = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-har-validator-har-schema = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-har-validator = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-assert-plus = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-jsprim-assert-plus = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-jsprim-extsprintf = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-jsprim-json-schema = "Unknown"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-jsprim-verror-assert-plus = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-jsprim-verror-core-util-is = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-jsprim-verror-extsprintf = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-jsprim-verror = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-jsprim = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-sshpk-asn1-safer-buffer = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-sshpk-asn1 = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-sshpk-assert-plus = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-sshpk-bcrypt-pbkdf-tweetnacl = "Unlicense"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-sshpk-bcrypt-pbkdf = "BSD-3-Clause"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-sshpk-dashdash-assert-plus = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-sshpk-dashdash = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-sshpk-ecc-jsbn-jsbn = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-sshpk-ecc-jsbn-safer-buffer = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-sshpk-ecc-jsbn = "Unknown MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-sshpk-getpass-assert-plus = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-sshpk-getpass = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-sshpk-jsbn = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-sshpk-safer-buffer = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-sshpk-tweetnacl = "Unlicense"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature-sshpk = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-http-signature = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-is-typedarray = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-isstream = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-json-stringify-safe = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-mime-types = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-oauth-sign = "Apache-2.0"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-performance-now = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-qs = "BSD-3-Clause"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-safe-buffer = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-tough-cookie-psl = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-tough-cookie-punycode = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-tough-cookie = "BSD-3-Clause"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-tunnel-agent-safe-buffer = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-tunnel-agent = "Apache-2.0"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request-uuid = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-request = "Apache-2.0"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-rimraf = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-semver = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-tar-block-stream-inherits = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-tar-block-stream = "Unknown ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-tar-fstream = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-tar-inherits = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-tar = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp-which = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-node-gyp = "Unknown MIT"
LICENSE_${PN}-npm-npm-lifecycle-resolve-from = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-slide = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-uid-number = "ISC"
LICENSE_${PN}-npm-npm-lifecycle-umask = "MIT"
LICENSE_${PN}-npm-npm-lifecycle-which = "ISC"
LICENSE_${PN}-npm-npm-lifecycle = "Artistic-2.0"
LICENSE_${PN}-npm-npm-package-arg = "ISC"
LICENSE_${PN}-npm-npm-packlist-ignore-walk-minimatch-brace-expansion-balanced-match = "MIT"
LICENSE_${PN}-npm-npm-packlist-ignore-walk-minimatch-brace-expansion-concat-map = "MIT"
LICENSE_${PN}-npm-npm-packlist-ignore-walk-minimatch-brace-expansion = "MIT"
LICENSE_${PN}-npm-npm-packlist-ignore-walk-minimatch = "ISC"
LICENSE_${PN}-npm-npm-packlist-ignore-walk = "ISC"
LICENSE_${PN}-npm-npm-packlist-npm-bundled = "ISC"
LICENSE_${PN}-npm-npm-packlist = "ISC"
LICENSE_${PN}-npm-npm-pick-manifest = "ISC"
LICENSE_${PN}-npm-npm-profile-aproba = "ISC"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-agentkeepalive-humanize-ms-ms = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-agentkeepalive-humanize-ms = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-agentkeepalive = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-cacache-mississippi-concat-stream-buffer-from = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-cacache-mississippi-concat-stream-typedarray = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-cacache-mississippi-concat-stream = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-cacache-mississippi-duplexify-stream-shift = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-cacache-mississippi-duplexify = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-cacache-mississippi-end-of-stream = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-cacache-mississippi-flush-write-stream = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-cacache-mississippi-from2 = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-cacache-mississippi-parallel-transform-cyclist = "Unknown"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-cacache-mississippi-parallel-transform = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-cacache-mississippi-pumpify = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-cacache-mississippi-pump = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-cacache-mississippi-stream-each-stream-shift = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-cacache-mississippi-stream-each = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-cacache-mississippi-through2-xtend = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-cacache-mississippi-through2 = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-cacache-mississippi = "BSD-2-Clause"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-cacache-y18n = "ISC"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-cacache = "ISC"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-http-cache-semantics = "BSD-2-Clause"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-http-proxy-agent-agent-base-es6-promisify-es6-promise = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-http-proxy-agent-agent-base-es6-promisify = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-http-proxy-agent-agent-base = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-http-proxy-agent-debug-ms = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-http-proxy-agent-debug = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-http-proxy-agent = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-https-proxy-agent-agent-base-es6-promisify-es6-promise = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-https-proxy-agent-agent-base-es6-promisify = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-https-proxy-agent-agent-base = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-https-proxy-agent-debug-ms = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-https-proxy-agent-debug = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-https-proxy-agent = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-mississippi-concat-stream-typedarray = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-mississippi-concat-stream = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-mississippi-duplexify-stream-shift = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-mississippi-duplexify = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-mississippi-end-of-stream = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-mississippi-flush-write-stream = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-mississippi-from2 = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-mississippi-parallel-transform-cyclist = "Unknown"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-mississippi-parallel-transform = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-mississippi-pumpify-pump = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-mississippi-pumpify = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-mississippi-pump = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-mississippi-stream-each-stream-shift = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-mississippi-stream-each = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-mississippi-through2-xtend = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-mississippi-through2 = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-mississippi = "BSD-2-Clause"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-node-fetch-npm-encoding-iconv-lite = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-node-fetch-npm-encoding = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-node-fetch-npm-json-parse-better-errors = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-node-fetch-npm = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-promise-retry-err-code = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-promise-retry-retry = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-promise-retry = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-socks-proxy-agent-agent-base-es6-promisify-es6-promise = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-socks-proxy-agent-agent-base-es6-promisify = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-socks-proxy-agent-agent-base = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-socks-proxy-agent-socks-ip = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-socks-proxy-agent-socks-smart-buffer = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-socks-proxy-agent-socks = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-socks-proxy-agent = "MIT"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen-ssri = "ISC"
LICENSE_${PN}-npm-npm-profile-make-fetch-happen = "ISC"
LICENSE_${PN}-npm-npm-profile = "ISC"
LICENSE_${PN}-npm-npm-registry-client-concat-stream-typedarray = "MIT"
LICENSE_${PN}-npm-npm-registry-client-concat-stream = "MIT"
LICENSE_${PN}-npm-npm-registry-client-graceful-fs = "ISC"
LICENSE_${PN}-npm-npm-registry-client-normalize-package-data = "BSD-2-Clause"
LICENSE_${PN}-npm-npm-registry-client-npm-package-arg = "ISC"
LICENSE_${PN}-npm-npm-registry-client-npmlog = "ISC"
LICENSE_${PN}-npm-npm-registry-client-once = "ISC"
LICENSE_${PN}-npm-npm-registry-client-request = "Apache-2.0"
LICENSE_${PN}-npm-npm-registry-client-retry = "MIT"
LICENSE_${PN}-npm-npm-registry-client-safe-buffer = "MIT"
LICENSE_${PN}-npm-npm-registry-client-semver = "ISC"
LICENSE_${PN}-npm-npm-registry-client-slide = "ISC"
LICENSE_${PN}-npm-npm-registry-client-ssri = "ISC"
LICENSE_${PN}-npm-npm-registry-client = "ISC"
LICENSE_${PN}-npm-npm-registry-fetch-bluebird = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-figgy-pudding = "ISC"
LICENSE_${PN}-npm-npm-registry-fetch-lru-cache = "ISC"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-agentkeepalive-humanize-ms-ms = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-agentkeepalive-humanize-ms = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-agentkeepalive = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-bluebird = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-chownr = "ISC"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-glob = "ISC"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-graceful-fs = "ISC"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-lru-cache = "ISC"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-mississippi-concat-stream-buffer-from = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-mississippi-concat-stream-typedarray = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-mississippi-concat-stream = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-mississippi-duplexify-stream-shift = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-mississippi-duplexify = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-mississippi-end-of-stream = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-mississippi-flush-write-stream = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-mississippi-from2 = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-mississippi-parallel-transform-cyclist = "Unknown"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-mississippi-parallel-transform = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-mississippi-pumpify = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-mississippi-pump = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-mississippi-stream-each-stream-shift = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-mississippi-stream-each = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-mississippi-through2-xtend = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-mississippi-through2 = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-mississippi = "BSD-2-Clause"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-mkdirp = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-move-concurrently = "ISC"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-promise-inflight = "ISC"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-rimraf = "ISC"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-ssri-safe-buffer = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-ssri = "ISC"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-unique-filename = "ISC"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache-y18n = "ISC"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-cacache = "ISC"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-http-cache-semantics = "BSD-2-Clause"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-http-proxy-agent-agent-base-es6-promisify-es6-promise = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-http-proxy-agent-agent-base-es6-promisify = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-http-proxy-agent-agent-base = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-http-proxy-agent-debug-ms = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-http-proxy-agent-debug = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-http-proxy-agent = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-https-proxy-agent-agent-base-es6-promisify-es6-promise = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-https-proxy-agent-agent-base-es6-promisify = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-https-proxy-agent-agent-base = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-https-proxy-agent-debug-ms = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-https-proxy-agent-debug = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-https-proxy-agent = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-lru-cache = "ISC"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-mississippi = "BSD-2-Clause"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-node-fetch-npm-encoding-iconv-lite-safer-buffer = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-node-fetch-npm-encoding-iconv-lite = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-node-fetch-npm-encoding = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-node-fetch-npm = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-promise-retry-err-code = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-promise-retry-retry = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-promise-retry = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-socks-proxy-agent-agent-base-es6-promisify-es6-promise = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-socks-proxy-agent-agent-base-es6-promisify = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-socks-proxy-agent-agent-base = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-socks-proxy-agent-socks-ip = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-socks-proxy-agent-socks-smart-buffer = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-socks-proxy-agent-socks = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-socks-proxy-agent = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen-ssri = "ISC"
LICENSE_${PN}-npm-npm-registry-fetch-make-fetch-happen = "ISC"
LICENSE_${PN}-npm-npm-registry-fetch-npm-package-arg = "ISC"
LICENSE_${PN}-npm-npm-registry-fetch-safe-buffer = "MIT"
LICENSE_${PN}-npm-npm-registry-fetch = "ISC"
LICENSE_${PN}-npm-npm-user-validate = "BSD-2-Clause"
LICENSE_${PN}-npm-npmlog-are-we-there-yet-delegates = "MIT"
LICENSE_${PN}-npm-npmlog-are-we-there-yet = "ISC"
LICENSE_${PN}-npm-npmlog-console-control-strings = "ISC"
LICENSE_${PN}-npm-npmlog-gauge-object-assign = "MIT"
LICENSE_${PN}-npm-npmlog-gauge-signal-exit = "ISC"
LICENSE_${PN}-npm-npmlog-gauge-string-width-code-point-at = "MIT"
LICENSE_${PN}-npm-npmlog-gauge-string-width-is-fullwidth-code-point-number-is-nan = "MIT"
LICENSE_${PN}-npm-npmlog-gauge-string-width-is-fullwidth-code-point = "MIT"
LICENSE_${PN}-npm-npmlog-gauge-string-width = "MIT"
LICENSE_${PN}-npm-npmlog-gauge-strip-ansi-ansi-regex = "MIT"
LICENSE_${PN}-npm-npmlog-gauge-strip-ansi = "MIT"
LICENSE_${PN}-npm-npmlog-gauge-wide-align = "ISC"
LICENSE_${PN}-npm-npmlog-gauge = "ISC"
LICENSE_${PN}-npm-npmlog-set-blocking = "ISC"
LICENSE_${PN}-npm-npmlog = "ISC"
LICENSE_${PN}-npm-once = "ISC"
LICENSE_${PN}-npm-opener = "(WTFPL_|_MIT)"
LICENSE_${PN}-npm-osenv-os-homedir = "MIT"
LICENSE_${PN}-npm-osenv-os-tmpdir = "MIT"
LICENSE_${PN}-npm-osenv = "ISC"
LICENSE_${PN}-npm-pacote-get-stream = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-agentkeepalive-humanize-ms-ms = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-agentkeepalive-humanize-ms = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-agentkeepalive = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-http-cache-semantics = "BSD-2-Clause"
LICENSE_${PN}-npm-pacote-make-fetch-happen-http-proxy-agent-agent-base-es6-promisify-es6-promise = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-http-proxy-agent-agent-base-es6-promisify = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-http-proxy-agent-agent-base = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-http-proxy-agent-debug-ms = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-http-proxy-agent-debug = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-http-proxy-agent = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-https-proxy-agent-agent-base-es6-promisify-es6-promise = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-https-proxy-agent-agent-base-es6-promisify = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-https-proxy-agent-agent-base = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-https-proxy-agent-debug-ms = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-https-proxy-agent-debug = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-https-proxy-agent = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-node-fetch-npm-encoding-iconv-lite-safer-buffer = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-node-fetch-npm-encoding-iconv-lite = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-node-fetch-npm-encoding = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-node-fetch-npm = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-socks-proxy-agent-agent-base-es6-promisify-es6-promise = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-socks-proxy-agent-agent-base-es6-promisify = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-socks-proxy-agent-agent-base = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-socks-proxy-agent-socks-ip = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-socks-proxy-agent-socks-smart-buffer = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-socks-proxy-agent-socks = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen-socks-proxy-agent = "MIT"
LICENSE_${PN}-npm-pacote-make-fetch-happen = "ISC"
LICENSE_${PN}-npm-pacote-minimatch-brace-expansion-balanced-match = "MIT"
LICENSE_${PN}-npm-pacote-minimatch-brace-expansion-concat-map = "MIT"
LICENSE_${PN}-npm-pacote-minimatch-brace-expansion = "MIT"
LICENSE_${PN}-npm-pacote-minimatch = "ISC"
LICENSE_${PN}-npm-pacote-promise-retry-err-code = "MIT"
LICENSE_${PN}-npm-pacote-promise-retry-retry = "MIT"
LICENSE_${PN}-npm-pacote-promise-retry = "MIT"
LICENSE_${PN}-npm-pacote-protoduck-genfun = "CC0-1.0"
LICENSE_${PN}-npm-pacote-protoduck = "MIT"
LICENSE_${PN}-npm-pacote = "MIT"
LICENSE_${PN}-npm-path-is-inside = "(WTFPL_|_MIT)"
LICENSE_${PN}-npm-promise-inflight = "ISC"
LICENSE_${PN}-npm-qrcode-terminal = "Unknown"
LICENSE_${PN}-npm-query-string-decode-uri-component = "MIT"
LICENSE_${PN}-npm-query-string-strict-uri-encode = "MIT"
LICENSE_${PN}-npm-query-string = "MIT"
LICENSE_${PN}-npm-qw = "ISC"
LICENSE_${PN}-npm-read-cmd-shim = "ISC"
LICENSE_${PN}-npm-read-installed-debuglog = "MIT"
LICENSE_${PN}-npm-read-installed-graceful-fs = "ISC"
LICENSE_${PN}-npm-read-installed-read-package-json = "ISC"
LICENSE_${PN}-npm-read-installed-readdir-scoped-modules = "ISC"
LICENSE_${PN}-npm-read-installed-semver = "ISC"
LICENSE_${PN}-npm-read-installed-slide = "ISC"
LICENSE_${PN}-npm-read-installed-util-extend = "MIT"
LICENSE_${PN}-npm-read-installed = "ISC"
LICENSE_${PN}-npm-read-mute-stream = "ISC"
LICENSE_${PN}-npm-read-package-json-json-parse-better-errors = "MIT"
LICENSE_${PN}-npm-read-package-json-slash = "MIT"
LICENSE_${PN}-npm-read-package-json = "ISC"
LICENSE_${PN}-npm-read-package-tree-debuglog = "MIT"
LICENSE_${PN}-npm-read-package-tree-dezalgo = "ISC"
LICENSE_${PN}-npm-read-package-tree-once = "ISC"
LICENSE_${PN}-npm-read-package-tree-read-package-json-glob = "ISC"
LICENSE_${PN}-npm-read-package-tree-read-package-json-graceful-fs = "ISC"
LICENSE_${PN}-npm-read-package-tree-read-package-json-json-parse-better-errors = "MIT"
LICENSE_${PN}-npm-read-package-tree-read-package-json-normalize-package-data-hosted-git-info = "ISC"
LICENSE_${PN}-npm-read-package-tree-read-package-json-normalize-package-data-is-builtin-module-builtin-modules = "MIT"
LICENSE_${PN}-npm-read-package-tree-read-package-json-normalize-package-data-is-builtin-module = "MIT"
LICENSE_${PN}-npm-read-package-tree-read-package-json-normalize-package-data-semver = "ISC"
LICENSE_${PN}-npm-read-package-tree-read-package-json-normalize-package-data-validate-npm-package-license-spdx-correct-spdx-expression-parse-spdx-exceptions = "CC-BY-3.0"
LICENSE_${PN}-npm-read-package-tree-read-package-json-normalize-package-data-validate-npm-package-license-spdx-correct-spdx-expression-parse-spdx-license-ids = "CC0-1.0"
LICENSE_${PN}-npm-read-package-tree-read-package-json-normalize-package-data-validate-npm-package-license-spdx-correct-spdx-expression-parse = "MIT"
LICENSE_${PN}-npm-read-package-tree-read-package-json-normalize-package-data-validate-npm-package-license-spdx-correct-spdx-license-ids = "CC0-1.0"
LICENSE_${PN}-npm-read-package-tree-read-package-json-normalize-package-data-validate-npm-package-license-spdx-correct = "Apache-2.0"
LICENSE_${PN}-npm-read-package-tree-read-package-json-normalize-package-data-validate-npm-package-license-spdx-expression-parse = "MIT"
LICENSE_${PN}-npm-read-package-tree-read-package-json-normalize-package-data-validate-npm-package-license = "Apache-2.0"
LICENSE_${PN}-npm-read-package-tree-read-package-json-normalize-package-data = "BSD-2-Clause"
LICENSE_${PN}-npm-read-package-tree-read-package-json-slash = "MIT"
LICENSE_${PN}-npm-read-package-tree-read-package-json = "ISC"
LICENSE_${PN}-npm-read-package-tree-readdir-scoped-modules = "ISC"
LICENSE_${PN}-npm-read-package-tree = "ISC"
LICENSE_${PN}-npm-readable-stream-core-util-is = "MIT"
LICENSE_${PN}-npm-readable-stream-isarray = "MIT"
LICENSE_${PN}-npm-readable-stream-process-nextick-args = "MIT"
LICENSE_${PN}-npm-readable-stream-string-decoder = "MIT"
LICENSE_${PN}-npm-readable-stream-util-deprecate = "MIT"
LICENSE_${PN}-npm-readable-stream = "MIT"
LICENSE_${PN}-npm-readdir-scoped-modules-debuglog = "MIT"
LICENSE_${PN}-npm-readdir-scoped-modules-dezalgo-asap = "MIT"
LICENSE_${PN}-npm-readdir-scoped-modules-dezalgo-wrappy = "ISC"
LICENSE_${PN}-npm-readdir-scoped-modules-dezalgo = "ISC"
LICENSE_${PN}-npm-readdir-scoped-modules-graceful-fs = "ISC"
LICENSE_${PN}-npm-readdir-scoped-modules-once = "ISC"
LICENSE_${PN}-npm-readdir-scoped-modules = "ISC"
LICENSE_${PN}-npm-read = "ISC"
LICENSE_${PN}-npm-request-aws-sign2 = "Apache-2.0"
LICENSE_${PN}-npm-request-aws4 = "MIT"
LICENSE_${PN}-npm-request-caseless = "Apache-2.0"
LICENSE_${PN}-npm-request-combined-stream-delayed-stream = "MIT"
LICENSE_${PN}-npm-request-combined-stream = "MIT"
LICENSE_${PN}-npm-request-extend = "MIT"
LICENSE_${PN}-npm-request-forever-agent = "Apache-2.0"
LICENSE_${PN}-npm-request-form-data-asynckit = "MIT"
LICENSE_${PN}-npm-request-form-data = "MIT"
LICENSE_${PN}-npm-request-har-validator-ajv-co = "MIT"
LICENSE_${PN}-npm-request-har-validator-ajv-fast-deep-equal = "MIT"
LICENSE_${PN}-npm-request-har-validator-ajv-fast-json-stable-stringify = "MIT"
LICENSE_${PN}-npm-request-har-validator-ajv-json-schema-traverse = "MIT"
LICENSE_${PN}-npm-request-har-validator-ajv = "MIT"
LICENSE_${PN}-npm-request-har-validator-har-schema = "ISC"
LICENSE_${PN}-npm-request-har-validator = "ISC"
LICENSE_${PN}-npm-request-hawk-boom = "BSD-3-Clause"
LICENSE_${PN}-npm-request-hawk-cryptiles-boom = "BSD-3-Clause"
LICENSE_${PN}-npm-request-hawk-cryptiles = "BSD-3-Clause"
LICENSE_${PN}-npm-request-hawk-hoek = "BSD-3-Clause"
LICENSE_${PN}-npm-request-hawk-sntp = "BSD-3-Clause"
LICENSE_${PN}-npm-request-hawk = "BSD-3-Clause"
LICENSE_${PN}-npm-request-http-signature-assert-plus = "MIT"
LICENSE_${PN}-npm-request-http-signature-jsprim-extsprintf = "MIT"
LICENSE_${PN}-npm-request-http-signature-jsprim-json-schema = "Unknown"
LICENSE_${PN}-npm-request-http-signature-jsprim-verror-core-util-is = "MIT"
LICENSE_${PN}-npm-request-http-signature-jsprim-verror = "MIT"
LICENSE_${PN}-npm-request-http-signature-jsprim = "MIT"
LICENSE_${PN}-npm-request-http-signature-sshpk-asn1 = "MIT"
LICENSE_${PN}-npm-request-http-signature-sshpk-bcrypt-pbkdf = "BSD-3-Clause"
LICENSE_${PN}-npm-request-http-signature-sshpk-dashdash = "MIT"
LICENSE_${PN}-npm-request-http-signature-sshpk-ecc-jsbn = "Unknown MIT"
LICENSE_${PN}-npm-request-http-signature-sshpk-getpass = "MIT"
LICENSE_${PN}-npm-request-http-signature-sshpk-jsbn = "MIT"
LICENSE_${PN}-npm-request-http-signature-sshpk-tweetnacl = "Unlicense"
LICENSE_${PN}-npm-request-http-signature-sshpk = "MIT"
LICENSE_${PN}-npm-request-http-signature = "MIT"
LICENSE_${PN}-npm-request-is-typedarray = "MIT"
LICENSE_${PN}-npm-request-isstream = "MIT"
LICENSE_${PN}-npm-request-json-stringify-safe = "ISC"
LICENSE_${PN}-npm-request-mime-types-mime-db = "MIT"
LICENSE_${PN}-npm-request-mime-types = "MIT"
LICENSE_${PN}-npm-request-oauth-sign = "Apache-2.0"
LICENSE_${PN}-npm-request-performance-now = "MIT"
LICENSE_${PN}-npm-request-qs = "BSD-3-Clause"
LICENSE_${PN}-npm-request-stringstream = "MIT"
LICENSE_${PN}-npm-request-tough-cookie-punycode = "MIT"
LICENSE_${PN}-npm-request-tough-cookie = "BSD-3-Clause"
LICENSE_${PN}-npm-request-tunnel-agent = "Apache-2.0"
LICENSE_${PN}-npm-request = "Apache-2.0"
LICENSE_${PN}-npm-retry = "MIT"
LICENSE_${PN}-npm-rimraf = "ISC"
LICENSE_${PN}-npm-safe-buffer = "MIT"
LICENSE_${PN}-npm-semver = "ISC"
LICENSE_${PN}-npm-sha-graceful-fs = "ISC"
LICENSE_${PN}-npm-sha-readable-stream = "MIT"
LICENSE_${PN}-npm-sha = "(BSD-2-Clause_|_MIT)"
LICENSE_${PN}-npm-slide = "ISC"
LICENSE_${PN}-npm-sorted-object = "(WTFPL_|_MIT)"
LICENSE_${PN}-npm-sorted-union-stream-from2-inherits = "ISC"
LICENSE_${PN}-npm-sorted-union-stream-from2-readable-stream-core-util-is = "MIT"
LICENSE_${PN}-npm-sorted-union-stream-from2-readable-stream-inherits = "ISC"
LICENSE_${PN}-npm-sorted-union-stream-from2-readable-stream-isarray = "MIT"
LICENSE_${PN}-npm-sorted-union-stream-from2-readable-stream-string-decoder = "MIT"
LICENSE_${PN}-npm-sorted-union-stream-from2-readable-stream = "MIT"
LICENSE_${PN}-npm-sorted-union-stream-from2 = "MIT"
LICENSE_${PN}-npm-sorted-union-stream-stream-iterate-readable-stream = "MIT"
LICENSE_${PN}-npm-sorted-union-stream-stream-iterate-stream-shift = "MIT"
LICENSE_${PN}-npm-sorted-union-stream-stream-iterate = "MIT"
LICENSE_${PN}-npm-sorted-union-stream = "MIT"
LICENSE_${PN}-npm-ssri = "ISC"
LICENSE_${PN}-npm-strip-ansi-ansi-regex = "MIT"
LICENSE_${PN}-npm-strip-ansi = "MIT"
LICENSE_${PN}-npm-tar-fs-minipass = "ISC"
LICENSE_${PN}-npm-tar-minipass = "ISC"
LICENSE_${PN}-npm-tar-minizlib = "MIT"
LICENSE_${PN}-npm-tar-yallist = "ISC"
LICENSE_${PN}-npm-tar = "ISC"
LICENSE_${PN}-npm-text-table = "MIT"
LICENSE_${PN}-npm-tiny-relative-date = "MIT"
LICENSE_${PN}-npm-uid-number = "ISC"
LICENSE_${PN}-npm-umask = "MIT"
LICENSE_${PN}-npm-unique-filename-unique-slug = "ISC"
LICENSE_${PN}-npm-unique-filename = "ISC"
LICENSE_${PN}-npm-unpipe = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-ansi-align-string-width = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-ansi-align = "ISC"
LICENSE_${PN}-npm-update-notifier-boxen-camelcase = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-chalk-ansi-styles-color-convert-color-name = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-chalk-ansi-styles-color-convert = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-chalk-ansi-styles = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-chalk-escape-string-regexp = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-chalk-supports-color-has-flag = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-chalk-supports-color = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-chalk = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-cli-boxes = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-string-width-is-fullwidth-code-point = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-string-width = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-term-size-execa-cross-spawn-lru-cache = "ISC"
LICENSE_${PN}-npm-update-notifier-boxen-term-size-execa-cross-spawn-shebang-command-shebang-regex = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-term-size-execa-cross-spawn-shebang-command = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-term-size-execa-cross-spawn-which-isexe = "ISC"
LICENSE_${PN}-npm-update-notifier-boxen-term-size-execa-cross-spawn-which = "ISC"
LICENSE_${PN}-npm-update-notifier-boxen-term-size-execa-cross-spawn = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-term-size-execa-get-stream = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-term-size-execa-is-stream = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-term-size-execa-npm-run-path-path-key = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-term-size-execa-npm-run-path = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-term-size-execa-p-finally = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-term-size-execa-signal-exit = "ISC"
LICENSE_${PN}-npm-update-notifier-boxen-term-size-execa-strip-eof = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-term-size-execa = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-term-size = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-widest-line-string-width = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen-widest-line = "MIT"
LICENSE_${PN}-npm-update-notifier-boxen = "MIT"
LICENSE_${PN}-npm-update-notifier-chalk-ansi-styles-color-convert-color-name = "MIT"
LICENSE_${PN}-npm-update-notifier-chalk-ansi-styles-color-convert = "MIT"
LICENSE_${PN}-npm-update-notifier-chalk-ansi-styles = "MIT"
LICENSE_${PN}-npm-update-notifier-chalk-escape-string-regexp = "MIT"
LICENSE_${PN}-npm-update-notifier-chalk-supports-color-has-flag = "MIT"
LICENSE_${PN}-npm-update-notifier-chalk-supports-color = "MIT"
LICENSE_${PN}-npm-update-notifier-chalk = "MIT"
LICENSE_${PN}-npm-update-notifier-configstore-dot-prop-is-obj = "MIT"
LICENSE_${PN}-npm-update-notifier-configstore-dot-prop = "MIT"
LICENSE_${PN}-npm-update-notifier-configstore-graceful-fs = "ISC"
LICENSE_${PN}-npm-update-notifier-configstore-make-dir-pify = "MIT"
LICENSE_${PN}-npm-update-notifier-configstore-make-dir = "MIT"
LICENSE_${PN}-npm-update-notifier-configstore-unique-string-crypto-random-string = "MIT"
LICENSE_${PN}-npm-update-notifier-configstore-unique-string = "MIT"
LICENSE_${PN}-npm-update-notifier-configstore-write-file-atomic = "ISC"
LICENSE_${PN}-npm-update-notifier-configstore-xdg-basedir = "MIT"
LICENSE_${PN}-npm-update-notifier-configstore = "BSD-2-Clause"
LICENSE_${PN}-npm-update-notifier-import-lazy = "MIT"
LICENSE_${PN}-npm-update-notifier-is-ci-ci-info = "MIT"
LICENSE_${PN}-npm-update-notifier-is-ci = "MIT"
LICENSE_${PN}-npm-update-notifier-is-installed-globally-global-dirs-ini = "ISC"
LICENSE_${PN}-npm-update-notifier-is-installed-globally-global-dirs = "MIT"
LICENSE_${PN}-npm-update-notifier-is-installed-globally-is-path-inside-path-is-inside = "(WTFPL_|_MIT)"
LICENSE_${PN}-npm-update-notifier-is-installed-globally-is-path-inside = "MIT"
LICENSE_${PN}-npm-update-notifier-is-installed-globally = "MIT"
LICENSE_${PN}-npm-update-notifier-is-npm = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-got-create-error-class-capture-stack-trace = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-got-create-error-class = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-got-duplexer3 = "BSD-3-Clause"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-got-get-stream = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-got-is-redirect = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-got-is-retry-allowed = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-got-is-stream = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-got-lowercase-keys = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-got-safe-buffer = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-got-timed-out = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-got-unzip-response = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-got-url-parse-lax-prepend-http = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-got-url-parse-lax = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-got = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-registry-auth-token-rc-deep-extend = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-registry-auth-token-rc-minimist = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-registry-auth-token-rc-strip-json-comments = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-registry-auth-token-rc = "Unknown MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-registry-auth-token-safe-buffer = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-registry-auth-token = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-registry-url-rc-deep-extend = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-registry-url-rc-minimist = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-registry-url-rc-strip-json-comments = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-registry-url-rc = "Unknown MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-registry-url = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json-semver = "ISC"
LICENSE_${PN}-npm-update-notifier-latest-version-package-json = "MIT"
LICENSE_${PN}-npm-update-notifier-latest-version = "MIT"
LICENSE_${PN}-npm-update-notifier-semver-diff-semver = "ISC"
LICENSE_${PN}-npm-update-notifier-semver-diff = "MIT"
LICENSE_${PN}-npm-update-notifier-xdg-basedir = "MIT"
LICENSE_${PN}-npm-update-notifier = "BSD-2-Clause"
LICENSE_${PN}-npm-uuid = "MIT"
LICENSE_${PN}-npm-validate-npm-package-license-spdx-correct-spdx-license-ids = "CC0-1.0"
LICENSE_${PN}-npm-validate-npm-package-license-spdx-correct = "Apache-2.0"
LICENSE_${PN}-npm-validate-npm-package-license-spdx-expression-parse-spdx-exceptions = "CC-BY-3.0"
LICENSE_${PN}-npm-validate-npm-package-license-spdx-expression-parse-spdx-license-ids = "CC0-1.0"
LICENSE_${PN}-npm-validate-npm-package-license-spdx-expression-parse = "MIT"
LICENSE_${PN}-npm-validate-npm-package-license = "Apache-2.0"
LICENSE_${PN}-npm-validate-npm-package-name-builtins = "MIT"
LICENSE_${PN}-npm-validate-npm-package-name = "ISC"
LICENSE_${PN}-npm-which-isexe = "ISC"
LICENSE_${PN}-npm-which = "ISC"
LICENSE_${PN}-npm-worker-farm-errno-prr = "MIT"
LICENSE_${PN}-npm-worker-farm-errno = "MIT"
LICENSE_${PN}-npm-worker-farm = "MIT"
LICENSE_${PN}-npm-wrappy = "ISC"
LICENSE_${PN}-npm-write-file-atomic-signal-exit = "ISC"
LICENSE_${PN}-npm-write-file-atomic = "ISC"
LICENSE_${PN}-npm = "Artistic-2.0"
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
LICENSE_${PN}-package-json-got-pinkie-promise = "MIT"
LICENSE_${PN}-package-json-got-read-all-stream-pinkie-promise-pinkie = "MIT"
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
LICENSE_${PN}-request-form-data = "MIT"
LICENSE_${PN}-request-har-validator-ajv = "MIT"
LICENSE_${PN}-request-har-validator-har-schema = "ISC"
LICENSE_${PN}-request-har-validator = "ISC"
LICENSE_${PN}-request-hawk-boom-hoek = "BSD-3-Clause"
LICENSE_${PN}-request-hawk-boom = "BSD-3-Clause"
LICENSE_${PN}-request-hawk-cryptiles-boom-hoek = "BSD-3-Clause"
LICENSE_${PN}-request-hawk-cryptiles-boom = "BSD-3-Clause"
LICENSE_${PN}-request-hawk-cryptiles = "BSD-3-Clause"
LICENSE_${PN}-request-hawk-hoek = "BSD-3-Clause"
LICENSE_${PN}-request-hawk-sntp-hoek = "BSD-3-Clause"
LICENSE_${PN}-request-hawk-sntp = "BSD-3-Clause"
LICENSE_${PN}-request-hawk = "BSD-3-Clause"
LICENSE_${PN}-request-http-signature = "MIT"
LICENSE_${PN}-request-is-typedarray = "MIT"
LICENSE_${PN}-request-isstream = "MIT"
LICENSE_${PN}-request-json-stringify-safe = "ISC"
LICENSE_${PN}-request-mime-types = "MIT"
LICENSE_${PN}-request-oauth-sign = "Apache-2.0"
LICENSE_${PN}-request-performance-now = "MIT"
LICENSE_${PN}-request-qs = "BSD-3-Clause"
LICENSE_${PN}-request-safe-buffer = "MIT"
LICENSE_${PN}-request-stringstream = "MIT"
LICENSE_${PN}-request-tough-cookie-punycode = "MIT"
LICENSE_${PN}-request-tough-cookie = "BSD-3-Clause"
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


