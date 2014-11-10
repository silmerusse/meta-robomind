DISCRIPTION =  "Robomind image with GUI for marsboard"

include robomind-image-core.bb

# x11-base includes matchbox, which provides simple gui.
# By default we will use xfce instead.
# IMAGE_FEATURES += "x11-base"

IMAGE_INSTALL += " \
    packagegroup-core-x11 \
    xrdb \
    nano \
    cpufrequtils \
    packagegroup-xfce-extended \
"

export IMAGE_BASENAME = "robomind-image-gui"
