DISCRIPTION =  "Core Robomind image for marsboard"
LICENSE = "MIT"

include recipes-fsl/images/fsl-image-test.bb

IMAGE_FEATURES += " \
    tools-sdk \
    ssh-server-openssh \
    package-management \  
"

IMAGE_INSTALL += " "

export IMAGE_BASENAME = "robomind-image-core"


