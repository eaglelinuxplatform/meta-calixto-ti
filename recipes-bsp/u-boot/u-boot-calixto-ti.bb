DESCRIPTION = "u-boot bootloader for ti processors"
require u-boot-calixto-ti.inc
inherit uboot-config

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI = "git://git@bitbucket.org/calixtolinuxplatform/calixto-ti-uboot.git;branch=2021.01;protocol=ssh"


DEPENDS += "dtc-native bc-native lzop-native flex-native bison-native python3-setuptools-native"

SRCREV = "78162204065eb76074dadfa8c41a6a85739a9a5b"




