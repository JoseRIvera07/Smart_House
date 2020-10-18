# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "node.js realtime framework server"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=852d069fbb52f1d8ed1ac32fa4b9147c \
                    file://node_modules/parseuri/LICENSE;md5=b2f87f2456eb667f9260f2af3347b45e \
                    file://node_modules/base64-arraybuffer/LICENSE-MIT;md5=7e6019c14540d23cd5ed7337b94782b0 \
                    file://node_modules/engine.io/LICENSE;md5=c9f272e8d85e84d214436bc09de14478 \
                    file://node_modules/arraybuffer.slice/LICENCE;md5=23a30fb6334f5ebdf72ef2fbb6761dc2 \
                    file://node_modules/engine.io-parser/LICENSE;md5=436a2c205caafa17c010702768e0bed0 \
                    file://node_modules/socket.io-adapter/LICENSE;md5=afbe5b2f47d5cf306759fe2d435b5ee0 \
                    file://node_modules/component-emitter/LICENSE;md5=ee4aea2d350b7bdbf93e14297dcdd8a2 \
                    file://node_modules/socket.io-parser/LICENSE;md5=afbe5b2f47d5cf306759fe2d435b5ee0 \
                    file://node_modules/socket.io-parser/node_modules/component-emitter/LICENSE;md5=ee4aea2d350b7bdbf93e14297dcdd8a2 \
                    file://node_modules/parseqs/LICENSE;md5=b9aac4548c7c97ac7028d5b2b111b19a \
                    file://node_modules/engine.io-client/LICENSE;md5=ff6b9e6830cdd3c4c2c4266dc0b91a86 \
                    file://node_modules/engine.io-client/node_modules/component-emitter/LICENSE;md5=ee4aea2d350b7bdbf93e14297dcdd8a2 \
                    file://node_modules/engine.io-client/node_modules/ws/LICENSE;md5=95833e8f03687308b0584a377b9e12b0 \
                    file://node_modules/cookie/LICENSE;md5=bc85b43b6f963e8ab3f88e63628448ca \
                    file://node_modules/to-array/LICENCE;md5=8966d3100f2d871ee216d056c0ea0160 \
                    file://node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/blob/LICENSE;md5=cc71ab25837279e2c3667079c5d4b5f2 \
                    file://node_modules/async-limiter/LICENSE;md5=4b83a79a0c223073786a52b5ece4619d \
                    file://node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/base64id/LICENSE;md5=abb57c73ecaa9ddaa151a4e424935b47 \
                    file://node_modules/mime-db/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/yeast/LICENSE;md5=4310a14e1d911cc6e4b5a34dbcbeaddd \
                    file://node_modules/accepts/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/after/LICENCE;md5=013fe0a3fb8c715466a12185bc36727b \
                    file://node_modules/ws/LICENSE;md5=95833e8f03687308b0584a377b9e12b0 \
                    file://node_modules/has-binary2/LICENSE;md5=ea88943e21663beb2f4203005de54d51 \
                    file://node_modules/socket.io-client/LICENSE;md5=b034b27f54cd5a363360fd9207438a01 \
                    file://node_modules/socket.io-client/node_modules/socket.io-parser/LICENSE;md5=afbe5b2f47d5cf306759fe2d435b5ee0 \
                    file://node_modules/socket.io-client/node_modules/socket.io-parser/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/socket.io-client/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/xmlhttprequest-ssl/LICENSE;md5=cbfa18387b1df27866558353235d1cde \
                    file://node_modules/negotiator/LICENSE;md5=6417a862a5e35c17c904d9dda2cbd499 \
                    file://package.json;md5=f9c3dc770a00c05541d248e750d76e4d \
                    file://node_modules/accepts/package.json;md5=e6b1f36c7fc3d4a53c34db28ed1fc745 \
                    file://node_modules/after/package.json;md5=3caf383ecea554546a66a2e4d865ec9a \
                    file://node_modules/arraybuffer.slice/package.json;md5=2d68fad47a3cb673146397ce26974d7e \
                    file://node_modules/async-limiter/package.json;md5=1023ed343652ddb4c1948df4c789fe8a \
                    file://node_modules/backo2/package.json;md5=e7a61da3e21b35ea61a828f7939198a6 \
                    file://node_modules/base64-arraybuffer/package.json;md5=4dde471ff18e0e5683ead635fdc4aaae \
                    file://node_modules/base64id/package.json;md5=2895eacbc1a0762d80b0b1783bce4c75 \
                    file://node_modules/better-assert/package.json;md5=e9caedc3376b65e29bf02e483b6b556b \
                    file://node_modules/blob/package.json;md5=6d5409acc45751cdd04b22f41a51bb31 \
                    file://node_modules/callsite/package.json;md5=32235e7adb4895ecbd729d43e42ac7d2 \
                    file://node_modules/component-bind/package.json;md5=93c344398f3ccd5bb38ae0e2534c202f \
                    file://node_modules/component-emitter/package.json;md5=7d589ffe292462c7491b202e36e9eab5 \
                    file://node_modules/component-inherit/package.json;md5=50aa31ba1c2c339927b3ccad8a205650 \
                    file://node_modules/cookie/package.json;md5=f0547125fe24e399b3f2214c05157a51 \
                    file://node_modules/debug/package.json;md5=9e3f20bcb16871dd1be14a29001c79bd \
                    file://node_modules/engine.io/package.json;md5=f5717b12e420c6c02b140a89f8b64b82 \
                    file://node_modules/engine.io-client/node_modules/component-emitter/package.json;md5=81dd6df22a2628fa27a5c4937df567f6 \
                    file://node_modules/engine.io-client/node_modules/ws/package.json;md5=6999a6821cc3d2d07b3b40c6ec557a8b \
                    file://node_modules/engine.io-client/package.json;md5=4702e45e6231f2d4e4c48da015bba1c0 \
                    file://node_modules/engine.io-parser/package.json;md5=4339a1d96b91bc1e02890219154ac4a6 \
                    file://node_modules/has-binary2/package.json;md5=3c15832d942d9a7f893ac4a854d0df76 \
                    file://node_modules/has-cors/package.json;md5=55651393d6d566f3981dbb4e3c02fb70 \
                    file://node_modules/indexof/package.json;md5=60fa99e707a7c50ad28ca90658ddd057 \
                    file://node_modules/isarray/package.json;md5=e70b7c27f122e90075979692d47e1888 \
                    file://node_modules/mime-db/package.json;md5=a2d6a0ae45675ab34540644036bae28c \
                    file://node_modules/mime-types/package.json;md5=a6bb66d39adb0d570c3f285fc161e467 \
                    file://node_modules/ms/package.json;md5=b3ea7267a23f72028e774742792b114a \
                    file://node_modules/negotiator/package.json;md5=f532dffa79bfce9737c04201d64b5160 \
                    file://node_modules/object-component/package.json;md5=30e36da4f06afc9f8a0d4eed7fd96bbc \
                    file://node_modules/parseqs/package.json;md5=28de552017ce502d0c0621cc3d5fe2ef \
                    file://node_modules/parseuri/package.json;md5=8f34cc2baad9e78aa4bf5f35a4aa263b \
                    file://node_modules/socket.io-adapter/package.json;md5=e98771b3e19155395c7bebedcfef4eed \
                    file://node_modules/socket.io-client/node_modules/ms/package.json;md5=cbd55880a650b56c3d5acddbbdbee9bc \
                    file://node_modules/socket.io-client/node_modules/socket.io-parser/node_modules/debug/package.json;md5=cd0b3a0d33bee20af1c9452cccf99e17 \
                    file://node_modules/socket.io-client/node_modules/socket.io-parser/package.json;md5=857495b4bcf2f01fd58a04215eddf155 \
                    file://node_modules/socket.io-client/package.json;md5=ba9fa45e0b04f3dd29cf90654568da5b \
                    file://node_modules/socket.io-parser/node_modules/component-emitter/package.json;md5=81dd6df22a2628fa27a5c4937df567f6 \
                    file://node_modules/socket.io-parser/package.json;md5=6b6e0e692f32f55c58e89060e1e51355 \
                    file://node_modules/to-array/package.json;md5=9ceab7187fa99b7f01e5e74ec2b9543c \
                    file://node_modules/ws/package.json;md5=eca05ad78f5b773b485de66222be47f1 \
                    file://node_modules/xmlhttprequest-ssl/package.json;md5=c84c8978216b3f15d40875a9d68b624a \
                    file://node_modules/yeast/package.json;md5=a3683df9e0d262b372f3863a3af9e7d0"

SRC_URI = " \
    git://github.com/socketio/socket.io.git;protocol=https \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    "

# Modify these as desired
PV = "2.3.0+git${SRCPV}"
SRCREV = "bb43ff2988a3eed196d7bb1a740b9c4764af757a"

S = "${WORKDIR}/git"

inherit npm

LICENSE_${PN} = "MIT"
LICENSE_${PN}-accepts = "MIT"
LICENSE_${PN}-after = "MIT"
LICENSE_${PN}-arraybufferslice = "MIT"
LICENSE_${PN}-async-limiter = "MIT"
LICENSE_${PN}-backo2 = "Unknown"
LICENSE_${PN}-base64-arraybuffer = "MIT"
LICENSE_${PN}-base64id = "MIT"
LICENSE_${PN}-better-assert = "Unknown"
LICENSE_${PN}-blob = "MIT"
LICENSE_${PN}-callsite = "Unknown"
LICENSE_${PN}-component-bind = "Unknown"
LICENSE_${PN}-component-emitter = "MIT"
LICENSE_${PN}-component-inherit = "Unknown"
LICENSE_${PN}-cookie = "MIT"
LICENSE_${PN}-debug = "MIT"
LICENSE_${PN}-engineio = "MIT"
LICENSE_${PN}-engineio-client-component-emitter = "MIT"
LICENSE_${PN}-engineio-client-ws = "MIT"
LICENSE_${PN}-engineio-client = "MIT"
LICENSE_${PN}-engineio-parser = "MIT"
LICENSE_${PN}-has-binary2 = "MIT"
LICENSE_${PN}-has-cors = "Unknown"
LICENSE_${PN}-indexof = "Unknown"
LICENSE_${PN}-isarray = "Unknown"
LICENSE_${PN}-mime-db = "MIT"
LICENSE_${PN}-mime-types = "MIT"
LICENSE_${PN}-ms = "MIT"
LICENSE_${PN}-negotiator = "MIT"
LICENSE_${PN}-object-component = "Unknown"
LICENSE_${PN}-parseqs = "MIT"
LICENSE_${PN}-parseuri = "MIT"
LICENSE_${PN}-socketio-adapter = "MIT"
LICENSE_${PN}-socketio-client-ms = "MIT"
LICENSE_${PN}-socketio-client-socketio-parser-debug = "MIT"
LICENSE_${PN}-socketio-client-socketio-parser = "MIT"
LICENSE_${PN}-socketio-client = "MIT"
LICENSE_${PN}-socketio-parser-component-emitter = "MIT"
LICENSE_${PN}-socketio-parser = "MIT"
LICENSE_${PN}-to-array = "MIT"
LICENSE_${PN}-ws = "MIT"
LICENSE_${PN}-xmlhttprequest-ssl = "MIT"
LICENSE_${PN}-yeast = "MIT"
