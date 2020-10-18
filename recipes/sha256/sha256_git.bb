# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Compute SHA256 of bytes or strings."
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.json;md5=31fc64ebabf786b070212a30fc0eb3a8 \
                    file://node_modules/convert-hex/package.json;md5=d9128ea01f30e40bca2828b793f96216 \
                    file://node_modules/convert-string/package.json;md5=14c4b05c3ef68565d039609facae80c3"

SRC_URI = " \
    git://github.com/cryptocoinjs/sha256;protocol=https \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    "

# Modify these as desired
PV = "0.2.0+git${SRCPV}"
SRCREV = "6f97e2746d83dc6b4d1c408101dcf8ffca840120"

S = "${WORKDIR}/git"

inherit npm

LICENSE_${PN} = "Unknown"
LICENSE_${PN}-convert-hex = "Unknown"
LICENSE_${PN}-convert-string = "Unknown"
