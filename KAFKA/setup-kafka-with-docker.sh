# !/bin/bash

#start kafka
docker-compose up
#confluent tools
docker run -it --rm --net=host confluentinc/cp-schema-registry:3.3.1 bash

#than go to localhost:3030
# Then you can do
kafka-avro-console-consumer
