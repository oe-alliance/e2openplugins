MODULE = "OpenAirPlay"
DESCRIPTION = "AirPlay and AirTunes server for enigma2"
RDEPENDS:${PN} = "${PYTHON_PN}-twisted-core ${PYTHON_PN}-twisted-web ${PYTHON_PN}-m2crypto \
                  ${PYTHON_PN}-biplist ${PYTHON_PN}-netclient ${PYTHON_PN}-avahi ${PYTHON_PN}-dbus \
                  ${PYTHON_PN}-core ${PYTHON_PN}-io ${PYTHON_PN}-xmlrpc \
                  hairtunes"

inherit gitpkgv
PV = "0.1+git${SRCPV}"
PKGV = "0.1+git${GITPKGV}"
PR = "r0.2"

require openplugins-setuptools3.inc

PLUGINPATH = "/usr/lib/enigma2/python/Plugins/Extensions/${MODULE}"
do_install() {
	install -d ${D}${PLUGINPATH}
	cp -r ${S}/plugin/* ${D}${PLUGINPATH}
}

FILES:${PN} = "${PLUGINPATH}"

require assume-gplv2.inc
