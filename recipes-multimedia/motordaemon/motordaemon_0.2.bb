DESCRIPTION = "Motor Daemon" 
SECTION = "examples" 
LICENSE = "CLOSED" 
PR = "r139"


SRC_URI = "git://github.com/hermes-project/hermes-pilot.git"
SRCREV="${AUTOREV}"


FILES_SOLIBSDEV = ""
FILES_${PN} += "${base_libdir}/*.so"

S = "${WORKDIR}/git"

inherit pkgconfig cmake

do_install() {
    install -d ${D}${bindir}
    install -m 0755 MotorDaemon ${D}${bindir}
    install -d ${D}/etc/
    install -m 0522 ${S}/MotorDaemon.conf ${D}/etc/MotorDaemon.conf

}
