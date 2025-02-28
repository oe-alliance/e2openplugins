MODULE = "Foreca"
DESCRIPTION = "Weather forecast for the upcoming 10 days"
RDEPENDS:${PN} = "${PYTHON_PN}-html"

inherit gitpkgv
PV = "gitr${SRCPV}"
PKGV = "gitr${GITPKGV}"
PR = "r4"

SRC_URI:openatv = "git://github.com/Belfagor2005/e2openplugin-${MODULE}.git;protocol=https;branch=master"

require openplugins-setuptools3.inc

FILES:${PN} += "/etc/enigma2/Foreca"
CONFFILES:${PN} = "/etc/enigma2/Foreca/City.cfg /etc/enigma2/Foreca/Filter.cfg"

require assume-gplv2.inc
