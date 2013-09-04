DISCRIPTION =  "Robomind image with GUI for marsboard"
LICENSE = "MIT"

include robomind-image-core.bb

IMAGE_FEATURES += " \
    x11-base \ 
"

IMAGE_INSTALL += " \
    nano \
    cpufrequtils \
    packagegroup-xfce-extended \
"

export IMAGE_BASENAME = "robomind-image-gui"
