Dockerfile define step by step how docker environment should be created
docker image is created by building Dockerfile.
Dockerfile - define your own docker image

FROM - it can be more FROM statements in Dockerfile. image:tag
COPY vs ADD - (src... des...)we can add some parts to our Docker container like jar file
ENV - there are to cases with define and set values in Docker file or we can define them and set them later
RUN - RUN <command> will invoke a shell automatically (/bin/sh -c by default)
