SRC_URI = "git://github.com/E2OpenPlugins/e2openplugin-${MODULE}.git;protocol=git;branch=python3"

S="${WORKDIR}/git"

SRCREV_pn-${PN} ?= "${AUTOREV}"

do_configure_prepend() {
    touch ${S}/NEWS
    touch ${S}/README
    touch ${S}/AUTHORS
    touch ${S}/ChangeLog
}
