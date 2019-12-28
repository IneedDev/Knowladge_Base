###  Kakfa wurstmeister image 

docker-compose up -d

docker-compose logs -f 

run kafka locally

    docker exec -it kafka /bin/bash
    
alternative for below kafka sh scripts:
    
    docker exec -it kafka /opt/kafka/bin/kafka-topics.sh --bootstrap-server kafka:9092 --topic client --describe

inside Kafka container create topic with partition 1 and replication 1

    ./kafka-topics.sh --bootstrap-server kafka:9092 --create --topic client --partitions 1 --replication-factor 1
    
list of topics
    
    ./kafka-topics.sh --bootstrap-server kafka:9092 --list
    
more details about topic

    ./kafka-topics.sh --bootstrap-server kafka:9092 --topic client --describe
    
start consumer 

    ./kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic client --from-beginning
    
produce message

    ./kafka-console-producer.sh --broker-list localhost:9092 --topic client