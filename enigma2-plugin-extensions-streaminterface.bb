MODULE = "StreamInterface"
DESCRIPTION = "Stream webinterface on port 40080"

RDEPENDS_${PN} = "${PYTHON_PN}-twisted-web"

require openplugins-replace-pli.inc

require openplugins-distutils.inc

require assume-gplv2.inc
