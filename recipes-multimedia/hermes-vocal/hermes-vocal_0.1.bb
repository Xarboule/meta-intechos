DESCRIPTION = "Hermes Vocal"
SECTION = "examples"
LICENSE = "CLOSED"
PR = "r0"


SRC_URI = "git://github.com/hermes-project/hermes-vocal.git"
SRCREV="${AUTOREV}"

S = "${D}/hermes-vocal"

inherit python3

do_install() {
    install -m 0755 hermes-vocal.sh ${D}${bindir}
}
