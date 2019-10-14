#!/bin/sh

# THIS IS ONLY FOR DEMO, DO NOT USE IN PRODUCTION
#
# Init rpi
# 
# USB is scanned for configuration files if found they are copied
# to /boot and the copied from /boot to rootfs.
#
# Copy WiFi settings
# Copy public key for SSH access
# Copy microservicebus-node service file
# Create home dir on data partition if missing and set owner
# Create RAUC data dir

# Get script name
me="$(basename "$(test -L "$0" && readlink "$0" || echo "$0")")"

MSB_USER_HOME_DIR="/data/home/msb"
MSB_USER="msb"
MSG_GROUP="msb"
RAUC_VAR_DIR="/data/var/rauc"
USB_READY=false

RESULT=0

# Check if USB flash is inserted
if [ -e /dev/sda1 ]; then
  echo "USB found" | systemd-cat -p info -t "${me}"
  if grep -qs '/mnt/flash ' /proc/mounts; then
    echo "USB already mounted" | systemd-cat -p info -t "${me}"
    USB_READY=true
  elif [ -d /mnt/flash ]; then
    echo "Mount USB" | systemd-cat -p info -t "${me}"
    mount /dev/sda1 /mnt/flash
    if [ $? -eq 0 ]; then
      USB_READY=true
    fi
  else
    echo "Create mount point" | systemd-cat -p info -t "${me}"
    mkdir /mnt/flash
    echo "Mount USB" | systemd-cat -p info -t "${me}"
    mount /dev/sda1 /mnt/flash
    if [ $? -eq 0 ]; then
      USB_READY=true
    fi
  fi

  # USB flash mounted and ready
  if [ $USB_READY == true ]; then
    echo "USB mounted and ready" | systemd-cat -p info -t "${me}"
    # Copy WiFi config files from USB to /boot
    if [ -e /mnt/flash/wpa_supplicant-wlan0.conf ]; then
      echo "Found WiFi config on USB, copy to /boot" | systemd-cat -p info -t "${me}"
      cp /mnt/flash/wpa_supplicant-wlan0.conf /boot/wpa_supplicant-wlan0.conf
      if [ $? -eq 0 ]; then
        echo "Successfully copied WiFi config from USB" | systemd-cat -p info -t "${me}"
      else
        echo "Error, failed to copy WiFi config from USB to /boot" | systemd-cat -p warning -t "${me}"
      fi
    fi

    # Copy SSH authorized_keys files from USB to /boot
    if [ -e /mnt/flash/authorized_keys ]; then
      echo "Found authorized_keys on USB, copy to /boot" | systemd-cat -p info -t "${me}"
      cp /mnt/flash/authorized_keys /boot/authorized_keys
      if [ $? -eq 0 ]; then
        echo "Successfully copied authorized_keys from USB" | systemd-cat -p info -t "${me}"
      else
        echo "Error, failed to copy authorized_keys from USB to /boot" | systemd-cat -p warning -t "${me}"
      fi
    fi

    # Copy microservicebus-node.service files from USB to /boot
    if [ -e /mnt/flash/microservicebus-node.service ]; then
      echo "Found microservicebus-node.service file on USB, copy to /boot" | systemd-cat -p info -t "${me}"
      cp /mnt/flash/microservicebus-node.service /boot/microservicebus-node.service
      if [ $? -eq 0 ]; then
        echo "Successfully copied microservicebus-node.service from USB" | systemd-cat -p info -t "${me}"
      else
        echo "Error, failed to copy microservicebus-node.service from USB to /boot" | systemd-cat -p warning -t "${me}"
      fi
    fi

  fi

fi

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

# Check if microservicebus-node.service is on boot partition and copy to rootfs
if [ -e /boot/microservicebus-node.service ]; then
  cp /boot/microservicebus-node.service /lib/systemd/system/microservicebus-node.service
  if [ $? -eq 0 ]; then
    chmod 644  /lib/systemd/system/microservicebus-node.service
    chown root /lib/systemd/system/microservicebus-node.service
    echo "microservicebus-node.service file copied from /boot" | systemd-cat -p info -t "${me}"
  else
    echo "Error: Failed to copy microservicebus-node.service from /boot" | systemd-cat -p warning  -t "${me}"
    RESULT=1
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

# Check if rauc dir is creted
if [ -d ${RAUC_VAR_DIR} ]; then
  echo "RAUC dir ready" | systemd-cat -p info -t "${me}"
else
  # Create rauc dir if missing
  mkdir -p ${RAUC_VAR_DIR}
  if [ $? -ne 0 ]; then
    echo "Error: Failed to create ${RAUC_VAR_DIR}" | systemd-cat -p emerg -t "${me}"
  else
    echo "Created ${RAUC_VAR_DIR}" | systemd-cat -p info -t "${me}"
  fi
fi

# Workaround, manually load module for WiFi
echo "Load BRCM module" | systemd-cat -p info -t "${me}"
modprobe brcmfmac

if [ $? -ne 0 ]; then
  echo "Error: Failed to load WiFi module, ${?}" | systemd-cat -p emerg -t "${me}"
else
  echo "WiFi module loaded" | systemd-cat -p info -t "${me}"
fi

exit $RESULT
