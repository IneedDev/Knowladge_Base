##Instruction 

- post installation

sudo groupadd docker
sudo usermod -aG docker $USER


- start kafka + landoob etc based on docker compose file

        docker-compose up
        
- docker compose file        
        
        version: '2'
        
        services:
          # this is our kafka cluster.
          kafka-cluster:
            image: landoop/fast-data-dev:cp3.3.0
            environment:
              JVM_OPTS: "-Xms8g -Xms8g"
              ADV_HOST: 127.0.0.1         # Change to 192.168.99.100 if using Docker Toolbox
              RUNTdocker -compose upESTS: 0                 # Disable Running tests so the cluster starts faster
              FORWARDLOGS: 0              # Disable running 5 file source connectors that bring application logs into Kafka topics
              SAMPLEDATA: 0               # Do not create sea_vessel_position_reports, nyc_yellow_taxi_trip_data, reddit_posts topics with sample Avro records.
            ports:
              - 2181:2181                 # Zookeeper
        #      - schema registry UI on localhost:3030
              - 3030:3030                 # Landoop UI
              - 8081-8083:8081-8083       # REST Proxy, Schema Registry, Kafka Connect ports
              - 9581-9585:9581-9585       # JMX Ports
              - 9092:9092                 # Kafka Broker
        
        
-- check localhost:3030 

- run confluent tools

       docker run -it --rm --net=host confluentinc/cp-schema-registry:3.3.1 bash
       
test:

      kafka-avro-console-consumer
      kafka-avro-console-producer

- register schema on landoop and set topic name

      kafka-avro-console-producer \
        --broker-list 127.0.0.1:9092 --topic newTopicConsoleProducer \
        --property schema.registry.url=http://127.0.0.1:8081 \
        --property value.schema='{"type":"record","name":"myrecord","fields":[{"name":"f1","type":"string"}]}'
        
- send msg to the topic

        {"f1": "value1"}
        {"f1": "value2"}
        
- consume the records from the beginning of the topic

        kafka-avro-console-consumer --topic newTopicConsoleProducer \
            --bootstrap-server 127.0.0.1:9092 \
            --property schema.registry.url=http://127.0.0.1:8081 \
            --from-beginning
          