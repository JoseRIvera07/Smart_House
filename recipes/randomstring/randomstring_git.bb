# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "A module for generating random strings"
HOMEPAGE = "https://github.com/klughammer/node-randomstring"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c5e342b2765e21bf07cf7ad6dca28075 \
                    file://package.json;md5=e454e44503db10f94046dd38dde3a802 \
                    file://node_modules/array-uniq/package.json;md5=7467c2ceef776b0e85bdd4be54fd302b"

SRC_URI = " \
    git://github.com/klughammer/node-randomstring;protocol=https \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    "

# Modify these as desired
PV = "1.1.5+git${SRCPV}"
SRCREV = "f504e8586d9ada54ca2642eb1752d49f7f48acde"

S = "${WORKDIR}/git"

inherit npm

LICENSE_${PN} = "MIT"
LICENSE_${PN}-array-uniq = "Unknown"
