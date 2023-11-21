DESCRIPTION = "Linux Kernel for ti processors"
LICENSE = "GPL-2.0-only"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit kernel

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI = "git://git@github.com/calixto-user/calixto-ti-linux.git;branch=6.1.y;protocol=ssh;" 
           
SRC_URI += "file://defconfig"

S = "${WORKDIR}/git"
SRCREV = "a88cc47c8ecae93a4de283219ecf5a7076b4c7db"

