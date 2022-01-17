MODULE = "NewsReader"
DESCRIPTION = "RSS reader"

require openplugins-replace-pli.inc

require openplugins-setuptools3.inc

FILES:${PN} += "/etc/feeds.xml"
CONFFILES:${PN} = "/etc/feeds.xml"

require assume-gplv2.inc
