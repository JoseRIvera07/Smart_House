# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Configuration control for production node deployments"
HOMEPAGE = "http://lorenwest.github.com/node-config"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
#   node_modules/json5/LICENSE.md
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Unknown & MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bbda7dda495c6a1d2f2e4aae9ba17115 \
                    file://node_modules/json5/LICENSE.md;md5=d80f2808a405d641840b50a06f80e93c \
                    file://node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://package.json;md5=d869e21299745519fb00ad84bfa24e90 \
                    file://node_modules/json5/package.json;md5=c3c6a43ea9349efac3c8024f34884207 \
                    file://node_modules/minimist/package.json;md5=84505571ecc56b8071068f44de7c79b2"

SRC_URI = " \
    git://github.com/lorenwest/node-config;protocol=https \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    "

# Modify these as desired
PV = "3.3.2+git${SRCPV}"
SRCREV = "1464a401f563dc143efe68a704dc448283ade93e"

S = "${WORKDIR}/git"

inherit npm

LICENSE_${PN} = "Unknown"
LICENSE_${PN}-json5 = "Unknown"
LICENSE_${PN}-minimist = "MIT"
