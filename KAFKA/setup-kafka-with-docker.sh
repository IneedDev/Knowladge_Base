# !/bin/bash

#1 start kafka + landoob etc based on docker compose file
docker-compose up

#2 localhost:3030 works

#3 confluent tools
docker run -it --rm --net=host confluentinc/cp-schema-registry:3.3.1 bash

#than go to localhost:3030
# Then you can do
kafka-avro-console-consumer
kafka-avro-console-producer

#register schema on landoop and set topic name
kafka-avro-console-producer \
    --broker-list 127.0.0.1:9092 --topic f \
    --property schema.registry.url=http://127.0.0.1:8081 \
    --property value.schema='{"type":"record","name":"myrecord","fields":[{"name":"f1","type":"string"}]}'

#send sample values
#{"f1": "value1"}
#{"f1": "value2"}

# Consume the records from the beginning of the topic:
kafka-avro-console-consumer --topic test-avro \
    --bootstrap-server 127.0.0.1:9092 \
    --property schema.registry.url=http://127.0.0.1:8081 \
    --from-beginning
