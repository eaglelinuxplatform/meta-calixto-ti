UBOOT_SUFFIX ?= "img"
require ${COREBASE}/meta/recipes-bsp/u-boot/u-boot.inc
require ${COREBASE}/meta/recipes-bsp/u-boot/u-boot-common.inc

PACKAGE_ARCH = "${MACHINE_ARCH}"

PROVIDES += "u-boot"
PKG_${PN} = "u-boot"
PKG_${PN}-dev = "u-boot-dev"
PKG_${PN}-dbg = "u-boot-dbg"

S = "${WORKDIR}/git"

do_deploy:append () {
    cd ${DEPLOYDIR}
    if [ "x${SPL_SPI_BINARY}" != "x" ]
      then
        install ${B}/${SPL_SPI_BINARY} ${DEPLOYDIR}/${SPL_SPI_IMAGE}
    fi
}

