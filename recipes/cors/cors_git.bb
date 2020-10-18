# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Node.js CORS middleware"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=947eb5e695dade432a500b12c510de85 \
                    file://node_modules/object-inspect/LICENSE;md5=288162f1d1bfa064f127f2b42d2a656f \
                    file://node_modules/is-negative-zero/LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5 \
                    file://node_modules/has/LICENSE-MIT;md5=d000afc3c9ff3501a5610197db76a246 \
                    file://node_modules/is-regex/LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5 \
                    file://node_modules/is-date-object/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/object-assign/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/object-keys/LICENSE;md5=0026e638d7d5c5f2768864ce0074f8ad \
                    file://node_modules/es-to-primitive/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/string.prototype.trimstart/LICENSE;md5=1e241a19d2d112b1db1a5c1c23216939 \
                    file://node_modules/es-abstract/LICENSE;md5=53ffc646fdb83e45279cfe7105e5157b \
                    file://node_modules/es-abstract/node_modules/object.assign/LICENSE;md5=2b439ca9e99134dee172a7cc6d989174 \
                    file://node_modules/es-abstract/node_modules/es-abstract/LICENSE;md5=53ffc646fdb83e45279cfe7105e5157b \
                    file://node_modules/is-callable/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/is-symbol/LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455 \
                    file://node_modules/define-properties/LICENSE;md5=53ffc646fdb83e45279cfe7105e5157b \
                    file://node_modules/vary/LICENSE;md5=13babc4f212ce635d68da544339c962b \
                    file://node_modules/has-symbols/LICENSE;md5=afee57a289508ed4df3456667778aaf6 \
                    file://node_modules/function-bind/LICENSE;md5=e7417c1a8ad83f88bcac21ad440d48b2 \
                    file://node_modules/string.prototype.trimend/LICENSE;md5=1e241a19d2d112b1db1a5c1c23216939 \
                    file://package.json;md5=b6d2955528d7c595e4d893f874a310bc \
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
                    file://node_modules/object-assign/package.json;md5=2854c33ba575a9ebc613d1a617ece277 \
                    file://node_modules/object-inspect/package.json;md5=57e2064f8faf3540e38138ea72a3da80 \
                    file://node_modules/object-keys/package.json;md5=f008c51545b8133eebae07e2046d241f \
                    file://node_modules/string.prototype.trimend/package.json;md5=ab3703a11172f796ecb3359718ec94e2 \
                    file://node_modules/string.prototype.trimstart/package.json;md5=e364e925184cb00b7101e181b0587c87 \
                    file://node_modules/vary/package.json;md5=3577fc17c1b964af7cfe2c17c73f84f3"

SRC_URI = " \
    git://github.com/expressjs/cors;protocol=https \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    "

# Modify these as desired
PV = "2.8.5+git${SRCPV}"
SRCREV = "5c0b6c7a0cbf126c949b9a76c7c67e26eba6b3e1"

S = "${WORKDIR}/git"

inherit npm

LICENSE_${PN} = "MIT"
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
LICENSE_${PN}-object-assign = "MIT"
LICENSE_${PN}-object-inspect = "MIT"
LICENSE_${PN}-object-keys = "MIT"
LICENSE_${PN}-stringprototypetrimend = "MIT"
LICENSE_${PN}-stringprototypetrimstart = "MIT"
LICENSE_${PN}-vary = "MIT"
