FILESEXTRAPATHS:prepend := "${THISDIR}/base-files:"

SRC_URI += "file://issue file://issue.net"

do_install:append() {
    install -m 0644 ${WORKDIR}/issue ${D}${sysconfdir}/issue
    install -m 0644 ${WORKDIR}/issue.net ${D}${sysconfdir}/issue.net
}

PR:append = ".calixto"

