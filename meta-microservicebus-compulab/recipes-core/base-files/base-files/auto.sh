#!/bin/sh

echo *******************************************************************
echo *                    AUTO INSTALLED TRIGGERED                     *
echo *                        INSTALLING IMAGE                         *
echo *******************************************************************

# Auto deploy
[[ $(tty) == /dev/ttymxc0 ]] || return
SRC=/dev/mmcblk0 DST=/dev/mmcblk2 QUIET=Yes cl-deploy

echo *******************************************************************
echo *                     INSTALLATION COMPLETE                       *
echo *                   remove SD-card and reboot                     *
echo *******************************************************************