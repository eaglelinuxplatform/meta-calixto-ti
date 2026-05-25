require u-boot-calixto.inc

include ${@ 'recipes-bsp/u-boot/ti-extras.inc' if d.getVar('TI_EXTRAS') else ''}

PR = "r1"

BRANCH = "2025.01"

SRCREV_uboot = "b7d03b98769da50b5a52d8e112f33f3609ea386b"


