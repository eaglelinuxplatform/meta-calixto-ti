# 1. Prepend path
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# 2. GitHub repository
KERNEL_GIT_URI = "git://github.com/eaglelinuxplatform/calixto-ti-linux.git"
KERNEL_GIT_PROTOCOL = "https"

# 3. Branch using
BRANCH = "6.12.y"
KERNEL_GIT_BRANCH = "branch=${BRANCH}"

#AM62L SRCREV . 
SRCREV = "891eea49b2f6f1e4d169b71c0bafd32b88266e51"
