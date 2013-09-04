DISCRIPTION =  "Robomind image with full features for marsboard"
LICENSE = "MIT"

include robomind-image-gui.bb

IMAGE_FEATURES += " \
    eclipse-debug \
    qt4-pkgs \
    hwcodecs \
    dbg-pkgs \
    dev-pkgs \
    doc-pkgs \
"

IMAGE_INSTALL += " "


# Add additional recipes    
#IMAGE_INSTALL_append += " packagegroup-core-basic"
#IMAGE_INSTALL_append += " packagegroup-xfce-extended"
#IMAGE_INSTALL_append += " packagegroup-xfce-multimedia"
#IMAGE_INSTALL_append += " packagegroup-fsl"
#IMAGE_INSTALL_append += " packagegroup-fonts-truetype"
#IMAGE_INSTALL_append += " packagegroup-cli-tools"
#IMAGE_INSTALL_append += " packagegroup-core-directfb"

#IMAGE_INSTALL_append += "\
#    packagegroup-robomind-fonts \
#    packagegroup-robomind-custom \
#    packagegroup-robomind-xfce \
#    packagegroup-robomind-gnome \
#    "


export IMAGE_BASENAME = "robomind-image-full"
