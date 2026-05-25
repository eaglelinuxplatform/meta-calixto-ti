SUMMARY = "Calixto Custom Base Image"
DESCRIPTION = "Custom image for AM62L Stamp Board based on Arago TI SDK"

# Pull in everything from the TI base image
require recipes-core/images/tisdk-base-image.bb

# Override the image name (This changes the .tar.xz / .wic filename)
export IMAGE_BASENAME = "calixto-base-image"

# Optional: Add specific packages only for your custom image
IMAGE_INSTALL:append = " htop bash"
