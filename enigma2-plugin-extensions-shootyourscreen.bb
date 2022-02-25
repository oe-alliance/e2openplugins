MODULE = "ShootYourScreen"
DESCRIPTION = "create screenshots with remote control of your STB"
PACKAGE_ARCH = "${MACHINE_ARCH}"
RDEPENDS:${PN} = "aio-grab"

inherit gitpkgv
SRCREV = ""
PV = "0.3+git${SRCPV}"
PKGV = "0.3+git${GITPKGV}"
PR = "r0"

require openplugins-setuptools3.inc

require assume-gplv2.inc
