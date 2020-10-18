# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYRIGHT
#   doc/license.texi
#   doc/html/License-and-Copyright.html
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Unknown & GPLv2"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=96792cb77e04bd5788a36fdc2ff74650 \
                    file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552 \
                    file://doc/license.texi;md5=492c51e0905ba30424435c1ff1de08ab \
                    file://doc/html/License-and-Copyright.html;md5=6bb64efd6d46a8ece8c94421fbe47681"

SRC_URI = "http://www.fftw.org/fftw-${PV}.tar.gz"
SRC_URI[md5sum] = "8aac833c943d8e90d51b697b27d4384d"
SRC_URI[sha1sum] = "59831bd4b2705381ee395e54aa6e0069b10c3626"
SRC_URI[sha256sum] = "6113262f6e92c5bd474f2875fa1b01054c4ad5040f6b0da7c03c98821d9ae303"
SRC_URI[sha384sum] = "8806ac555d5f9ab5f10695f8fc9232bb99d06a6ff6da7a9f6f0fdb0124258442dc6fc096c415e9418c16e36796bac3e3"
SRC_URI[sha512sum] = "ab918b742a7c7dcb56390a0a0014f517a6dff9a2e4b4591060deeb2c652bf3c6868aa74559a422a276b853289b4b701bdcbd3d4d8c08943acf29167a7be81a38"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

