# Base this image on core-image-base
require recipes-core/images/core-image-base.bb

# Include base settings
require recipes-core/images/msb-image.inc

# Add support for no password
EXTRA_IMAGE_FEATURES += " debug-tweaks"
