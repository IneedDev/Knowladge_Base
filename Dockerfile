FROM alpine:3.4
MAINTAINER Pawel Romaniuk

#copy one file into alpine image/container
COPY ./textfile.txt /usr/src/textfile.txt

#RUN apk update
#RUN apk add vim
#RUN apk add git

RUN apk update && \
    apk add curl vim git
