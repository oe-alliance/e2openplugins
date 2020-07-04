MODULE = "Bitrate"
DESCRIPTION = "Bitrate viewer"

require openplugins-replace-pli.inc
PR="r1"

DEPENDS += "enigma2"

require openplugins.inc

inherit autotools gettext ${PYTHON_PN}native

EXTRA_OECONF = " \
    STAGING_INCDIR=${STAGING_INCDIR} \
    STAGING_LIBDIR=${STAGING_LIBDIR}"

FILES_${PN} = "${libdir} ${bindir}"

require assume-gplv2.inc
