This README file contains information on the contents of the meta-microservicebus-node layer.

For information regarding the microservicebus-node agent visit https://microservicebus.com

Please see the corresponding sections below for details.

> ⚠ Since the Kirkstone version of Yocto, meta-oe provides only NodeJs v16.  
> There are some **build issue with NodeJs v16** (and npm v8) that are not easy to patch and maintain  
> This layer **imports a repice for NodeJs v14** that is **used by default**.  
> Please refer to the section VI. bellow for more informations.

Dependencies
============

  URI: git://git.openembedded.org/meta-openembedded
  layers: meta-oe
  branch: master

Patches
=======

Please submit any patches via GitHub pull request on https://github.com/axians/meta-microservicebus

Maintainers:  Jonas Andersson   jonaskgandersson@gmail.com
              Mikael Håkansson  wmmihaa@hotmail.com 

Table of Contents
=================

  I. Adding the meta-microservicebus-node layer to your build
 II. Add microservicebus-node to your target
III. Add systemd service configuration for microservicebus-node
 IV. Using package groups
  V. Configuration variables to adapt installations to target
 VI. NodeJs v16 issue

I. Adding the meta-microservicebus-node layer to your build
===========================================================

In order to use this layer, you need to clone the repository of meta-openembedded, 
meta-microservicebus and then make the build system aware of it. Add the layers
manually to bblayers.conf or use add-layer.

In following example the layers and build directory is located in pokys top directory 
and the current directory are the sourced build directory.

Run the following to add layers to bblayers.conf:

  bitbake-layers add-layer ../meta-openembedded/meta-oe
  bitbake-layers add-layer ../meta-microservicebus/meta-microservicebus-node

II. Add microservicebus-node to your target
===========================================

To only add microservicebus-node agent to your target add the "microservicebus-node"
package to your local.conf or image recipe file:

  IMAGE_INSTALL_append = " microservicebus-node"

This will install microservicebus-node in /usr/lib/node/ on your target and microservicebus-node-user
to setup a system user to run microservicebus-node under. For configuration look at section VII below.

III. Add systemd service configuration for microservicebus-node
===============================================================

In order to run microservicebus-node agent as a service a systemd recipe is
included as an reference, the systemd configuration may need alteration for your target.
The systemd service file is located under recipes-microservicebus-node/microservicebus-node-service/files.
To add systemd service to your target add the "microservicebus-node-service"
package to your local.conf or image recipe file:

  IMAGE_INSTALL_append = " microservicebus-node-service"

IV. Using package groups
========================

To simplify installation of microservicebus related packages on target
meta-microservicebus-node is supplied with some package groups located in 
./recipes-microservicebus-node/packagegroups:

  - packagegroup-microservicebus-base

    Adds all recomended packages to get microservicebus up and running.

  - packagegroup-microservicebus-build

    Adds all packages related to build npm packages using gyp on target,
    this includes make, gcc, binutils.

V. Configuration variables to adapt installations to target
==============================================================

In most of the recipes supplied in meta-microservicebus weak assignments to variables is
used to allow customization of the build. Below is a list of variables grouped under respective
recipe. The default settings should be good to get you up and running.

  - microservicebus-node-user

    MSB_NODE_USER ?= "msb"            # Name of user for microServicebus
    MSB_NODE_GROUP ?= "msb"           # Name of user group for microServicebus
    MSB_HOME_DIR_PATH ?= ""           # Specify home directory for msb user, default empty meaning it will be set to default for useradd
    MSB_USER_GROUPS ?= "tty,dialout"  # Specify users groups
    MSB_USER_UID ?= "350"             # Specify users uid

  - microservicebus-node-service

    MSB_NODE_ARG ?= "-w"              # Argument to microservicebus-node, default "-w" is to login using MAC and white list
    MSB_NODE_WORK_DIR ?= "/usr/lib/node/microservicebus-node"   # Workdir is default to npm default installation dir
    MSB_NODE_USER ?= "root"           # Name of user for microServicebus
    MSB_NODE_GROUP ?= "root"          # Name of user group for microServicebus
    MSB_NODE_HOST ?= "microservicebus.com"  # If using private hosting and custom domain this need to change

VI. NodeJs v16 issue
====================

Since the Kirkstone version of Yocto, meta-oe provides only NodeJs v16.  
There are some build issue with NodeJs v16 (and npm v8) that are not easy to patch and maintain *(see [this thread for more details](https://stackoverflow.com/a/72703843/10358602)).*

## Recommended: Use NodeJs v14 for the build and image

To avoid having to maintain npm patches, this layer provides a NodeJS v14 recipe until these issues are fixed.

This recipe for **NodeJs v14 will be automatically used over the v16** one from meta-oe for 2 reasons:

- We defined a prefered version for nodejs in this layer's _layer.conf_ file
- This layer has a higer priority (16) than meta-oe (5)

You shouldn't have to change anything in order to keep using NodeJs v14.

> ℹ If you still want to use NodeJs v16, see the following two sections.  
> In these cases, ensure that your preferred npm version for **microservicebus-core** defined in the settings of your organization is **at least 3.9.91 to support NodeJs v16**  
> If this config isn't enough for v3.9.91+ to be installed, and you don't mind trying the beta version, try to start microSerivceBus with the `--beta` flag

## Use NodeJs v16 for the build and image

If you would like to use NodeJs v16 in your image and for the build, you can simply add the following to your local.conf file:

```
PREFERRED_VERSION_nodejs = "16%"
PREFERRED_VERSION_nodejs-native = "16%"
```

## Use NodeJs v14 for the build and NodeJs v14 in the image

If you rather want to use NodeJs v16 on your image but not for the build due to this issue, define the following in your local.conf file:

```
PREFERRED_VERSION_nodejs = "16%"
```
