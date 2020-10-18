DESCRIPTION = "P.A.M Server"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"  

# Package Release 
PR = "r0"

SRC_URI = " \ 
  file://start_server.init \ 
  "
RDEPENDS_${PN} += "bash" 

S = "${WORKDIR}"

inherit update-rc.d 

INITSCRIPT_NAME = "start_server" 
INITSCRIPT_PARAMS = "start 90  S . stop 60  S ." 
 

do_install() { 
  install -d ${D}${sysconfdir}/sysconfig/
  install -d ${D}${sysconfdir}/init.d/ 
  install -m 0755 ${WORKDIR}/start_server.init ${D}${sysconfdir}/init.d/start_server
  
} 



