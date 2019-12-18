Repository contains different types of issues and agreagte captured knowladge
 
####  main topics - cheet-sheet

- kafka https://github.com/IneedDev/Knowladge_Base/blob/PR-001/KAFKA/Readme.md
- docker https://github.com/IneedDev/Knowladge_Base/blob/PR-001/Docker/Readme.md
- git https://github.com/IneedDev/Knowladge_Base/blob/PR-001/GIT/GIT.md
- k8s https://github.com/IneedDev/resources/blob/PR-001/K8S/k8s.md

#### sample rest app
Dockerized and deployed on AWS under 
http://ec2-52-28-115-213.eu-central-1.compute.amazonaws.com:8080/projects/new

* create AWS account - 12 months free https://aws.amazon.com/console/
* create instance 
* login to ubuntu AWS server with: ssh -i "pma-key-pair.pem" ubuntu@Public IP
* install docker 

        sudo groupadd docker
        sudo usermod -aG docker $USER
        sudo systemctl daemon-reload
        systemctl start docker

* create docker repository under Amazon Container Services
* prepare Dockerfile - sample:
        
        FROM ubuntu:latest
        MAINTAINER xxx yyyy
        RUN apt-get update && apt-get install -y openjdk-8-jdk
        WORKDIR /usr/local/bin/
        ADD target/rest-spring-jpa-0.0.1-SNAPSHOT.jar .
        ENTRYPOINT ["java", "-jar", "rest-spring-jpa-0.0.1-SNAPSHOT.jar"]

* login to docker registry
            
        aws ecr get-login > text.txt
        docker login -u AWS https://753295912869.dkr.ecr.eu-central-1.amazonaws.com
        push docker image to AWS docker registry
* pull image to ecr docker pull 753295912869.dkr.ecr.eu-central-1.amazonaws.com/docker-registry-name
* docker run -p 8080:8080 753295912869.dkr.ecr.eu-central-1.amazonaws.com/docker-repository-name
