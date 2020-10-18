# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Node.js body parsing middleware"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   node_modules/qs/LICENSE.md
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "MIT & ISC & Unknown"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0afd201e48c7d095454eed4ac1184e40 \
                    file://node_modules/unpipe/LICENSE;md5=934ab86a8ab081ea0326add08d550739 \
                    file://node_modules/raw-body/LICENSE;md5=c970d30155ebbdb1903e6de8c0666e18 \
                    file://node_modules/setprototypeof/LICENSE;md5=4846f1626304c2c0f806a539bbc7d54a \
                    file://node_modules/bytes/LICENSE;md5=013e95467eddb048f19a6f5b42820f86 \
                    file://node_modules/on-finished/LICENSE;md5=1b1f7f9cec194121fdf616b971df7a7b \
                    file://node_modules/http-errors/LICENSE;md5=607209623abfcc77b9098f71a0ef52f9 \
                    file://node_modules/qs/LICENSE.md;md5=b289135779dd930509ae81e6041690c0 \
                    file://node_modules/toidentifier/LICENSE;md5=1a261071a044d02eb6f2bb47f51a3502 \
                    file://node_modules/statuses/LICENSE;md5=36e2bc837ce69a98cc33a9e140d457e5 \
                    file://node_modules/media-typer/LICENSE;md5=c6e0ce1e688c5ff16db06b7259e9cd20 \
                    file://node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/iconv-lite/LICENSE;md5=f942263d98f0d75e0e0101884e86261d \
                    file://node_modules/content-type/LICENSE;md5=f4b767f006864f81a4901347fe4efdab \
                    file://node_modules/depd/LICENSE;md5=13babc4f212ce635d68da544339c962b \
                    file://node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/ee-first/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/mime-db/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/safer-buffer/LICENSE;md5=3baebc2a17b8f5bff04882cd0dc0f76e \
                    file://node_modules/type-is/LICENSE;md5=0afd201e48c7d095454eed4ac1184e40 \
                    file://package.json;md5=db648cbc527cd002cb1abbac8bd00842 \
                    file://node_modules/bytes/package.json;md5=bb3cba8a8a870732b7eee0d2e4e29955 \
                    file://node_modules/content-type/package.json;md5=138f1013d1de872220bf2a2f2f052660 \
                    file://node_modules/debug/package.json;md5=71a7656944ffe50cc27ebe02491ae49b \
                    file://node_modules/depd/package.json;md5=b6682ec09424cb14ad83a252a6748f35 \
                    file://node_modules/ee-first/package.json;md5=3ed21090e07ef5dd57729a77c4291cb9 \
                    file://node_modules/http-errors/package.json;md5=a06fe43128e6fe26a6719f1a007b3ef7 \
                    file://node_modules/iconv-lite/package.json;md5=a8b97f25878ddc5419a9afe173037035 \
                    file://node_modules/inherits/package.json;md5=f73908dab55d4259f3ed052ce9fb2fbb \
                    file://node_modules/media-typer/package.json;md5=127ce4abeb265c6eef7b45540241ca91 \
                    file://node_modules/mime-db/package.json;md5=a2d6a0ae45675ab34540644036bae28c \
                    file://node_modules/mime-types/package.json;md5=a6bb66d39adb0d570c3f285fc161e467 \
                    file://node_modules/ms/package.json;md5=cbd55880a650b56c3d5acddbbdbee9bc \
                    file://node_modules/on-finished/package.json;md5=d08696acafdda765ba2fe878b287912a \
                    file://node_modules/qs/package.json;md5=60796714dbfbd548499cfb4ead4b33bf \
                    file://node_modules/raw-body/package.json;md5=169f1f8cab0f9969084a9a8ae1bf2468 \
                    file://node_modules/safer-buffer/package.json;md5=274d956f400350c9f6cf96d22cdda227 \
                    file://node_modules/setprototypeof/package.json;md5=1541c2199513a8830073d21fe710bb0b \
                    file://node_modules/statuses/package.json;md5=ce09e65d18aa8425eac89e41fde1837a \
                    file://node_modules/toidentifier/package.json;md5=2ecc7acf5b134a92fbc0b0999a02f84d \
                    file://node_modules/type-is/package.json;md5=ffa244d8a6f745a081a0cdde026879c9 \
                    file://node_modules/unpipe/package.json;md5=f8318a554ed98c6a030942e9c14aaac8"

SRC_URI = " \
    git://github.com/expressjs/body-parser;protocol=https \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    "

# Modify these as desired
PV = "1.19.0+git${SRCPV}"
SRCREV = "480b1cfe29af19c070f4ae96e0d598c099f42a12"

S = "${WORKDIR}/git"

inherit npm

LICENSE_${PN} = "MIT"
LICENSE_${PN}-bytes = "MIT"
LICENSE_${PN}-content-type = "MIT"
LICENSE_${PN}-debug = "MIT"
LICENSE_${PN}-depd = "MIT"
LICENSE_${PN}-ee-first = "MIT"
LICENSE_${PN}-http-errors = "MIT"
LICENSE_${PN}-iconv-lite = "MIT"
LICENSE_${PN}-inherits = "ISC"
LICENSE_${PN}-media-typer = "MIT"
LICENSE_${PN}-mime-db = "MIT"
LICENSE_${PN}-mime-types = "MIT"
LICENSE_${PN}-ms = "MIT"
LICENSE_${PN}-on-finished = "MIT"
LICENSE_${PN}-qs = "Unknown"
LICENSE_${PN}-raw-body = "MIT"
LICENSE_${PN}-safer-buffer = "MIT"
LICENSE_${PN}-setprototypeof = "ISC"
LICENSE_${PN}-statuses = "MIT"
LICENSE_${PN}-toidentifier = "MIT"
LICENSE_${PN}-type-is = "MIT"
LICENSE_${PN}-unpipe = "MIT"
