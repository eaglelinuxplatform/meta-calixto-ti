require u-boot-calixto.inc

include ${@ 'recipes-bsp/u-boot/ti-extras.inc' if d.getVar('TI_EXTRAS') else ''}

PR = "r1"

BRANCH = "2025.01"

SRCREV_uboot = "818fb424e2ee80a0f543892e3d562c09c752afbe"


