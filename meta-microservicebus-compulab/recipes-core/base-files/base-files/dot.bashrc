# ~/.bashrc: executed by bash(1) for non-login shells.

export PS1='\h:\w\$ '
umask 022

alias node-journal='sudo journalctl -u microservicebus-node -n100 -f'
alias node-start='sudo systemctl start microservicebus-node'
alias node-stop='sudo systemctl stop microservicebus-node'
alias node-restart='sudo systemctl restart microservicebus-node'

alias dam-journal='sudo journalctl -u microservicebus-dam -n100 -f'
alias dam-start='sudo systemctl start microservicebus-dam'
alias dam-stop='sudo systemctl stop microservicebus-dam'
alias dam-restart='sudo systemctl restart microservicebus-dam'


printf '\e[0;32m'
printf "           _               ____                  _          ____             \n"
printf " _ __ ___ (_) ___ _ __ ___/ ___|  ___ _ ____   _(_) ___ ___| __ ) _   _ ___  \n"
printf "| \'_ \` _ \\| |/ __| \'__/ _ \\___ \\ / _ \\ \'__\\ \\ / / |/ __/ _ \\  _ \\| | | / __| \n"
printf "| | | | | | | (__| | | (_) |__) |  __/ |   \\ V /| | (_|  __/ |_) | |_| \\__ \\ \n"
printf "|_| |_| |_|_|\\___|_|  \\___/____/ \\___|_|    \\_/ |_|\\___\\___|____/ \\__,_|___/ \n"
printf '\e[1;32m'
printf "microservicebus-node Yocto image from AXIANS IoT Operations\n"
printf '\e[0;32m'
printf "\nCommon commands:\n"
printf "\t\e[1;33mnode-journal\e[0;32m\t-Get the journal feed from microservicebus-node\n"
printf "\t\e[1;33mnode-start\e[0;32m\t-Start the microservicebus-node service\n"
printf "\t\e[1;33mnode-stop\e[0;32m\t-Stop the microservicebus-node service\n"
printf "\t\e[1;33mnode-restart\e[0;32m\t-Retart the microservicebus-node service\n"
printf "\t\e[1;33mdam-journal\e[0;32m\t-Get the journal feed from microservicebus-dam\n"
printf "\t\e[1;33mdam-start\e[0;32m\t-Start the microservicebus-dam service\n"
printf "\t\e[1;33mdam-stop\e[0;32m\t-Stop the microservicebus-dam service\n"
printf "\t\e[1;33mdam-restart\e[0;32m\t-Retart the microservicebus-dam service\n"
printf '\e[0;32m'
printf "For more information visit https://docs.microservicebus.com\n\n"
printf '\e[0m'