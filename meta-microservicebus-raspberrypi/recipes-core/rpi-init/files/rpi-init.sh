#!/bin/sh
#
# THIS IS ONLY FOR DEMO, DO NOT USE IN PRODUCTION
#
# Init rpi
# 
# Copy WiFi settings from FAT partition to ROOTFS
# Copy public key for SSH access from FAT partition to ROOTFS
# Create home dir on data partition if missing and set owner

# Get script name
me="$(basename "$(test -L "$0" && readlink "$0" || echo "$0")")"

MSB_USER_HOME_DIR="/data/home/msb"
MSB_USER="msb"
MSG_GROUP="msb"

RESULT=0

# Check if WiFi config is on boot partition and copy to rootfs
if [ -e /boot/wpa_supplicant-wlan0.conf ]; then
  cp /boot/wpa_supplicant-wlan0.conf /etc/wpa_supplicant/wpa_supplicant-wlan0.conf
  if [ $? -eq 0 ]; then
    chmod 600  /etc/wpa_supplicant/wpa_supplicant-wlan0.conf
    chown root /etc/wpa_supplicant/wpa_supplicant-wlan0.conf
    echo "WPA config for wlan0 copied from /boot" | systemd-cat -p info -t "${me}"
  else
    echo "Error: Failed to copy WPA config for wlan0 from /boot" | systemd-cat -p warning  -t "${me}"
    RESULT=1
  fi
fi

# Check if SSH authorized_keys is on boot partition and copy to rootfs
if [ -e /boot/authorized_keys ]; then
  if [ -d /home/root/.ssh ]; then
    cp /boot/authorized_keys /home/root/.ssh/authorized_keys
  else
    mkdir -p /home/root/.ssh/
    cp /boot/authorized_keys /home/root/.ssh/authorized_keys
  fi

  # Set correct permissions for key files
  if [ $? -eq 0 ]; then
    chmod go-w /home/root /home/root/.ssh
    chmod 600 /home/root/.ssh/authorized_keys
    chown root /home/root/.ssh/authorized_keys
    echo "SSH Keys copied"  | systemd-cat -p info -t "${me}"
   else
    echo "Error: Failed to copy authorized_keys from /boot"  | systemd-cat -p warning -t "${me}"
    RESULT=2
   fi
fi

# Check if home dir is created
if [ -d ${MSB_USER_HOME_DIR} ]; then
  # Set permissions on home dir to msb user
  chown -R ${MSB_USER}:${MSB_GROUP} ${MSB_USER_HOME_DIR}
  echo "Home dir ready" | systemd-cat -p info -t "${me}"
  systemd-notify --status="Home dir ready"
  systemd-notify --ready
else
  # Create home dir/path if missing and set permissions
  mkdir -p ${MSB_USER_HOME_DIR}
  chown -R ${MSB_USER}:${MSB_GROUP} ${MSB_USER_HOME_DIR}
  if [ $? -ne 0 ]; then
    echo "Error: Failed to create ${MSB_USER_HOME_DIR}" | systemd-cat -p emerg -t "${me}"
    systemd-notify --status="Error: Failed to create ${MSB_USER_HOME_DIR}"
    RESULT=3
  else
    echo "Home dir ready" | systemd-cat -p info -t "${me}"
    systemd-notify --status="Home dir ready"
    systemd-notify --ready
  fi
fi

# Workaround, manually load module for WiFi
echo "Load BRCM module" | systemd-cat -p info -t "${me}"
modprobe brcmfmac

exit $RESULT