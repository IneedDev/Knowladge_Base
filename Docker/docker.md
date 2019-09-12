docker-compose up or docker-compose up -d // run as daemon in the background
docker-compose down
docker-compose logs

*** sample docker-compose

version: '3.5
services:
  app:
    build: .  // docker compose build . means that compose will look for a Dockerfile
    image: "db_anonymizer:v1"  //to build result image from Dockerfile will be called
    volumes:
      - ./user-settings/:/usr/src/app/


*** docker-compose volume
volumes:
- ./user-settings/:/usr/src/app/
// location on host side : location on docker side

*** docker-compose localhost db connection
jdbc:postgresql://host.docker.internal:5432/InPost?autoReconnect=true&useSSL=false


*** delete images not active
docker images prune
docker images prune -a

#list of all containers
docker ps -a

#list container ports
docker ps -a -q

#list images id
docker images -a -q

#Batch remove containers and images at once

docker stop $(docker ps -a -q)
docker rm $(docker ps -a -q)
docker rmi $(docker images -a -q)

#sample Dockerfile

FROM openjdk:8u212-b04-jdk-stretch
#define parts of container in this case we need add jar file
ADD ./target/APP_NAME_IMAGE-1.0-SNAPSHOT.jar .
#command definition to run image
CMD java -Xms512m -Xmx1024m -jar APP_NAME_IMAGE-1.0-SNAPSHOT.jar

#FROM IMAGE TO CONTAINER

docker build -t IMAGE_NAME .
docker build -t docker_image_name:and_version .
docker run

