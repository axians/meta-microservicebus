#!/bin/sh
#
# THIS IS ONLY FOR DEMO, DO NOT USE IN PRODUCTION
#
# Init rpi
# 
# Copy WiFi settings from FAT partition to ROOTFS
# Copy public key for SSH access from FAT partition to ROOTFS
# Create home dir on data partition if missing and set owner

MSB_USER_HOME_DIR="/data/home/msb"
MSB_USER="msb"
MSG_GROUP="msb"

RESULT=0

# Check if WiFi config is on boot part and copy to rootfs
if [ -e /boot/wpa_supplicant-wlan0.conf ]; then
  cp /boot/wpa_supplicant-wlan0.conf /etc/wpa_supplicant/wpa_supplicant-wlan0.conf
  if [ $? -eq 0 ]; then
    chmod 600 wpa_supplicant-wlan0.conf
    chown root wpa_supplicant-wlan0.conf
    systemd-notify --status="WPA config for wlan0 copied from /boot"
  else
    systemd-notify --status="Error: Failed to copy WPA config for wlan0 from /boot"
    RESULT=1
  fi
fi

# Check if SSH authorized_keys is on boot part and copy to rootfs
if [ -e /boot/authorized_keys ]; then
  if [ -d /home/root/.ssh ]; then
    cp /boot/authorized_keys /home/root/.ssh/authorized_keys
    if [ $? -eq 0 ]; then
      chmod go-w $HOME $HOME/.ssh
      chmod 600 $HOME/.ssh/authorized_keys
      chown root $HOME/.ssh/authorized_keys
      systemd-notify --status="SSH Keys copied"
    else
      systemd-notify --status="Error: Failed to copy authorized_keys from /boot"
      RESULT=2
    fi
  fi  
fi

# Check if home dir created
if [ -d ${MSB_USER_HOME_DIR} ]; then
  # Set permissions on home dir to msb user
  chown -R ${MSB_USER}:${MSB_GROUP} ${MSB_USER_HOME_DIR}
  systemd-notify --status="Home dir ready"
  systemd-notify --ready
else
  # Create home dir/path if missing and set permissions
  mkdir -p ${MSB_USER_HOME_DIR}
  chown -R ${MSB_USER}:${MSB_GROUP} ${MSB_USER_HOME_DIR}
  if [ $? -ne 0 ]; then
    systemd-notify --status="Error: Failed to create ${MSB_USER_HOME_DIR}"
    RESULT=3
  else
    systemd-notify --status="Home dir ready"
    systemd-notify --ready
  fi
fi

exit $RESULT
