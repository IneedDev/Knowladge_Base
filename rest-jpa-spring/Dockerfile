FROM ubuntu:latest

MAINTAINER xxx yyyy

RUN apt-get update && apt-get install -y openjdk-8-jdk

WORKDIR /usr/local/bin/
ADD target/rest-spring-jpa-0.0.1-SNAPSHOT.jar .

ENTRYPOINT ["java", "-jar", "rest-spring-jpa-0.0.1-SNAPSHOT.jar"]
