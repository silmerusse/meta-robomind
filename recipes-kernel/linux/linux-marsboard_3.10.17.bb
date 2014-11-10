# Adapted from linux-imx.inc, copyright (C) 2013 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc

DESCRIPTION = "Linux kernel for MarS Board"

SRC_URI = "git://github.com/silmerusse/linux-imx.git;branch=imx_3.10.17_1.0.1_ga \
           file://defconfig"
SRCREV = "${AUTOREV}"
SCMVERSION = "n"

COMPATIBLE_MACHINE = "(marsboard)"

# Move .debug to a seperate package to avoid QA issue.
PACKAGES =+ "kernel-dbg"
FILES_kernel-dbg = "${KERNEL_SRC_PATH}/drivers/input/touchscreen/generic_ts_rel/lib/.debug/"
