# meta-calixto-ti

### Folder Structure-Conventions:

 meta-calixto-ti
 |__ conf
 |    |__ machine
 |    |__ layer.conf
 |__ recipes-bsp/u-boot
 |    |__ files
 |    |   |__ fw_env.config
 |    |__ libubootenv_%.bbappend
 |    |__ u-boot-calixto-ti.bb
 |    |__ u-boot-calixto-ti.inc
 |__ recipes-calixto/images
 |    |__ calixto-image-minimal.bb
 |__ recipes-kernel/linux
 |    |__ files
 |    |    |__ defconfig
 |    |__ linux-calixto-ti_6.1.bb
 |__ README.md
 |__ install_prerequisites.sh
