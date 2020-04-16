#!/bin/sh
#
# Init Compulab
# 
# Create home dir on data partition if missing and set owner
# Create RAUC data dir

# Get script name
me="$(basename "$(test -L "$0" && readlink "$0" || echo "$0")")"

# Dynamic settings, replaced with values from Yocto variables
MSB_HOME_DIR_PATH="@MSB_HOME_DIR_PATH@"
MSB_NODE_USER="@MSB_NODE_USER@"
MSB_NODE_GROUP="@MSB_NODE_GROUP@"
RAUC_VAR_DIR="@RAUC_VAR_DIR@"
APN="@COMPULAB_APN@"

RESULT=0

# Check if home dir is created
if [ -d ${MSB_HOME_DIR_PATH} ]; then
  # Set permissions on home dir to msb user
  chown -R ${MSB_NODE_USER}:${MSB_NODE_GROUP} ${MSB_HOME_DIR_PATH}
  echo "Home dir ready" | systemd-cat -p info -t "${me}"
  systemd-notify --status="Home dir ready"
  systemd-notify --ready
else
  # Create home dir/path if missing and set permissions
  mkdir -p ${MSB_HOME_DIR_PATH}
  
  chown -R ${MSB_NODE_USER}:${MSB_NODE_GROUP} ${MSB_HOME_DIR_PATH}
  if [ $? -ne 0 ]; then
    echo "Error: Failed to create ${MSB_HOME_DIR_PATH}" | systemd-cat -p emerg -t "${me}"
    systemd-notify --status="Error: Failed to create ${MSB_HOME_DIR_PATH}"
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

echo "Setting up network connection if not exists"
nmcli con show GSMMSB 2>&1 > /dev/null 
if [ $? -ne 0 ]; then
  nmcli con add type gsm ifname cdc-wdm0 con-name GSMMSB apn ${APN}
  nmcli con up GSMMSB || RESULT=4

  if [ $RESULT -eq 4 ]; then
     echo "Connection failed."
  else
     echo "Connection successfully setup."
  fi
fi

##nmcli con add type gsm ifname cdc-wdm0 con-name GSMMSB apn ${APN};nmcli con up GSMMSB;echo "Connection created."|| RESULT=4

exit $RESULT

