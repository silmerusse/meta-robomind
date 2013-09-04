DESCRIPTION = "Robomind Package Groups"
LICENSE = "MIT"

inherit packagegroup

PROVIDES = "${PACKAGES}"

PACKAGES = ""
PACKAGES += "packagegroup-robomind-fonts"
PACKAGES += "packagegroup-robomind-gnome"
PACKAGES += "packagegroup-robomind-custom"
    
RDEPENDS_packagegroup-robomind-fonts = "\
    ttf-ubuntu-mono ttf-ubuntu-sans \
    ttf-dejavu-common ttf-dejavu-sans ttf-dejavu-sans-mono \
    ttf-dejavu-sans-condensed ttf-dejavu-serif ttf-dejavu-serif-condensed \
    ttf-droid-sans ttf-droid-sans-mono \
    ttf-droid-sans-fallback ttf-droid-sans-japanese ttf-droid-serif \
    font-alias \
    xorg-minimal-fonts \
    ttf-wqy-zenhei \
    "

     
RDEPENDS_packagegroup-robomind-gnome = "\
    gnome-backgrounds \
    gnome-menus \
    gnome-themes \
    gnome-system-monitor \
    gnome-session \
    gnome-mplayer \
    gnome-settings-daemon \
    gnome-power-manager \
    gnome-control-center \
    gdm \
    "
 
RDEPENDS_packagegroup-custom = "\
    gst-fsl-plugin \
    alsa-tools \
    libsdl-ttf \
    libsdl-image \
    python-imaging \
    postgresql \
    ntp \
    gimp \
    gthumb \
    gedit \
    bigbuckbunny-1080p \
    bigbuckbunny-480p \
    bigbuckbunny-720p \
    vim \
    xterm \
    twm \
    autoconf \
    automake \
    autofs \
    xclock \
    stat \
    cmake \
    openssh \
    sshfs-fuse \
    zip \
    unzip \
    systemd-compat-units \
    vivante-gpu-sdk \
    rsync \
    wget \
    git \    
    gst-ffmpeg \
    " 
