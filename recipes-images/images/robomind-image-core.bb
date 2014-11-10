DISCRIPTION =  "Core Robomind image for marsboard"

SRC_URI += "file://COPYING.MIT"

LIC_FILES_CHKSUM = "file://../COPYING.MIT;md5=e733b82bd2cbb43817d606f299ebd45a"

include recipes-fsl/images/fsl-image-machine-test.bb

IMAGE_FEATURES += " \
    tools-sdk \
    ssh-server-openssh \
    package-management \  
"

IMAGE_INSTALL += " "

export IMAGE_BASENAME = "robomind-image-core"


