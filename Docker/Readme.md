Dockerfile define step by step how docker environment should be created

docker image is created by building Dockerfile.

Dockerfile - define your own docker image

FROM - it can be more FROM statements in Dockerfile. image:tag

COPY vs ADD - (src... des...)we can add some parts to our Docker container like jar file

        #copy one file into alpine image/container
        COPY ./textfile.txt /usr/src/textfile.txt
        
        than docker run -ti --rm pawel/alpine-smarter:1.0 /bin/sh
        
        ls /usr/src - we can list all new copied files

ENV - there are to cases with define and set values in Docker file or we can define them and set them later

RUN - RUN <command> will invoke a shell automatically (/bin/sh -c by default)

VOLUME - connection from docker host to container (hos path:location on docker side).  On Linux you can go to /var/lib/docker/volumes

    docker volume ls
    
    docker volume inspect
    
    docker inspect
    
EXPOSE

CMD and ENTRYPOINT  - 