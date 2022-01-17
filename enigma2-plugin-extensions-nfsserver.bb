MODULE = "NfsServer"
DESCRIPTION = "NFS server configuration"

RDEPENDS:${PN} = "nfs-utils"

require openplugins-replace-pli.inc

require openplugins-setuptools3.inc

require assume-gplv2.inc
