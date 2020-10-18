# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Terminal string styling done right"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/has-flag/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/color-name/LICENSE;md5=d301869b39e08b33665b7c4f16b8e41d \
                    file://node_modules/ansi-styles/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/supports-color/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/color-convert/LICENSE;md5=9bdadfc9fbb3ab8d5a6d591bdbd52811 \
                    file://package.json;md5=855232a14c2948df0f1569d7bf7c595f \
                    file://node_modules/ansi-styles/package.json;md5=ab7a71ab9f6b46acda83106c5f34e6e3 \
                    file://node_modules/color-convert/package.json;md5=370b0177fdb4368f0a688ffa48559ecf \
                    file://node_modules/color-name/package.json;md5=ef649e8b7be42bba6d4fa34aca7e126a \
                    file://node_modules/has-flag/package.json;md5=636dbe2c8d513ad850070def501122bf \
                    file://node_modules/supports-color/package.json;md5=9bd5f75e8324cc8e0b633c59f1c4b60b"

SRC_URI = " \
    git://github.com/chalk/chalk;protocol=https \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    "

# Modify these as desired
PV = "4.1.0+git${SRCPV}"
SRCREV = "c0d8e7ed8a3ec549c81597fc06163276142d948d"

S = "${WORKDIR}/git"

inherit npm

LICENSE_${PN} = "MIT"
LICENSE_${PN}-ansi-styles = "MIT"
LICENSE_${PN}-color-convert = "MIT"
LICENSE_${PN}-color-name = "MIT"
LICENSE_${PN}-has-flag = "MIT"
LICENSE_${PN}-supports-color = "MIT"
