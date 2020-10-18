# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Cross platform webcam capture"
HOMEPAGE = "https://github.com/chuckfairy/node-webcam#readme"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   node_modules/abbrev/LICENSE
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "MIT & Unknown & ISC & GPLv3"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c872ba378fc017c5f8517dd4f18d1eb4 \
                    file://node_modules/object-inspect/LICENSE;md5=288162f1d1bfa064f127f2b42d2a656f \
                    file://node_modules/is-negative-zero/LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5 \
                    file://node_modules/has/LICENSE-MIT;md5=d000afc3c9ff3501a5610197db76a246 \
                    file://node_modules/abbrev/LICENSE;md5=e9c0b639498fbe60d17b10099aba77c0 \
                    file://node_modules/is-regex/LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5 \
                    file://node_modules/is-date-object/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/object-keys/LICENSE;md5=0026e638d7d5c5f2768864ce0074f8ad \
                    file://node_modules/es-to-primitive/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/string.prototype.trimstart/LICENSE;md5=1e241a19d2d112b1db1a5c1c23216939 \
                    file://node_modules/es-abstract/LICENSE;md5=53ffc646fdb83e45279cfe7105e5157b \
                    file://node_modules/es-abstract/node_modules/object.assign/LICENSE;md5=2b439ca9e99134dee172a7cc6d989174 \
                    file://node_modules/es-abstract/node_modules/es-abstract/LICENSE;md5=53ffc646fdb83e45279cfe7105e5157b \
                    file://node_modules/is-callable/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/is-symbol/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/define-properties/LICENSE;md5=53ffc646fdb83e45279cfe7105e5157b \
                    file://node_modules/has-symbols/LICENSE;md5=afee57a289508ed4df3456667778aaf6 \
                    file://node_modules/function-bind/LICENSE;md5=e7417c1a8ad83f88bcac21ad440d48b2 \
                    file://node_modules/nopt/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/string.prototype.trimend/LICENSE;md5=1e241a19d2d112b1db1a5c1c23216939 \
                    file://src/bindings/CommandCam/COPYING;md5=d32239bcb673463ab874e80d47fae504 \
                    file://package.json;md5=1f68a0a0a67f2768f268533cd59d2087 \
                    file://node_modules/abbrev/package.json;md5=09144e5559c19012a5ad2b1cb548f188 \
                    file://node_modules/define-properties/package.json;md5=78d159123901bac44c44e358eb28f652 \
                    file://node_modules/es-abstract/node_modules/es-abstract/package.json;md5=598f9354e3584c899389eb4332235d41 \
                    file://node_modules/es-abstract/node_modules/object.assign/package.json;md5=39b15f3a21d2ca35b29d6d8c34622892 \
                    file://node_modules/es-abstract/package.json;md5=3720b90ac03834e1b9c21e8c06b7d4a3 \
                    file://node_modules/es-to-primitive/package.json;md5=b183238ced55e20cc222932f965376a2 \
                    file://node_modules/function-bind/package.json;md5=f453e26c8d3482b4c3736f53303b4ec5 \
                    file://node_modules/has/package.json;md5=2fee243336ba5aeebed1e0145472cd49 \
                    file://node_modules/has-symbols/package.json;md5=24e9d883e10a6e4a622fcf6357ee5383 \
                    file://node_modules/is-callable/package.json;md5=f0005414e43f459c76f2d0bad7715afa \
                    file://node_modules/is-date-object/package.json;md5=b0366c20b2ee192e8155131e25328520 \
                    file://node_modules/is-negative-zero/package.json;md5=b33541f9f941d8762a39d3c93f6fcfe8 \
                    file://node_modules/is-regex/package.json;md5=e6ee8cf81fa574554a655f5a74cfb30e \
                    file://node_modules/is-symbol/package.json;md5=cf109cd5c94e334929842882585e5cb6 \
                    file://node_modules/nopt/package.json;md5=4e2d7d5de739353a4704cdd7c542f3a2 \
                    file://node_modules/object-inspect/package.json;md5=57e2064f8faf3540e38138ea72a3da80 \
                    file://node_modules/object-keys/package.json;md5=f008c51545b8133eebae07e2046d241f \
                    file://node_modules/string.prototype.trimend/package.json;md5=ab3703a11172f796ecb3359718ec94e2 \
                    file://node_modules/string.prototype.trimstart/package.json;md5=e364e925184cb00b7101e181b0587c87"

SRC_URI = " \
    git://github.com/chuckfairy/node-webcam;protocol=https \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    "

# Modify these as desired
PV = "0.6.4+git${SRCPV}"
SRCREV = "f1f1e31772827d77671d401211f60687211a642c"

S = "${WORKDIR}/git"

inherit npm

RDEPENDS_${PN} = "bash"

LICENSE_${PN} = "GPLv3 MIT"
LICENSE_${PN}-abbrev = "Unknown"
LICENSE_${PN}-define-properties = "MIT"
LICENSE_${PN}-es-abstract-es-abstract = "MIT"
LICENSE_${PN}-es-abstract-objectassign = "MIT"
LICENSE_${PN}-es-abstract = "MIT"
LICENSE_${PN}-es-to-primitive = "MIT"
LICENSE_${PN}-function-bind = "MIT"
LICENSE_${PN}-has = "MIT"
LICENSE_${PN}-has-symbols = "MIT"
LICENSE_${PN}-is-callable = "MIT"
LICENSE_${PN}-is-date-object = "MIT"
LICENSE_${PN}-is-negative-zero = "MIT"
LICENSE_${PN}-is-regex = "MIT"
LICENSE_${PN}-is-symbol = "MIT"
LICENSE_${PN}-nopt = "ISC"
LICENSE_${PN}-object-inspect = "MIT"
LICENSE_${PN}-object-keys = "MIT"
LICENSE_${PN}-stringprototypetrimend = "MIT"
LICENSE_${PN}-stringprototypetrimstart = "MIT"
