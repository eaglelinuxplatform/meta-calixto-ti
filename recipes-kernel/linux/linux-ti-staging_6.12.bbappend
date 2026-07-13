# 1. Prepend path
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# 2. GitHub repository
KERNEL_GIT_URI = "git://github.com/eaglelinuxplatform/calixto-ti-linux.git"
KERNEL_GIT_PROTOCOL = "https"

# 3. Branch using
BRANCH = "6.12.y"
KERNEL_GIT_BRANCH = "branch=${BRANCH}"

#AM62L SRCREV . 
SRCREV = "5090923a6e3f708c262ca67f98423f3c0f2f0663"
