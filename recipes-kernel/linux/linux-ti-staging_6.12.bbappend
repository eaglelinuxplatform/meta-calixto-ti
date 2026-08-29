# 1. Prepend path
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# 2. GitHub repository
KERNEL_GIT_URI = "git://github.com/eaglelinuxplatform/calixto-ti-linux.git"
KERNEL_GIT_PROTOCOL = "https"

# 3. Branch using
BRANCH = "6.12.y"
KERNEL_GIT_BRANCH = "branch=${BRANCH}"

#AM62L SRCREV . 
SRCREV = "22335c00afa0e2e4af2a614a70edf47d2c269c35"

FILESEXTRAPATHS:prepend := "${THISDIR}/linux-ti-staging-6.12:"
SRC_URI:remove = "file://defconfig"
SRC_URI:append = " file://defconfig;subdir=."
