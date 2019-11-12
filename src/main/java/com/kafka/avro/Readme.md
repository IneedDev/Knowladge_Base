Kafka - AVRO - PRODUCER - CONSUMER

### GenericRecord based on file or string

        GenericRecord -  A generic instance of a record schema. 
        Fields are accessible by name as well as by index.


steps:

- create generic record
- write it to the file
- read it from file

## SpecifiRecord 

AvroSchema ----> MavenPLUGIN ----> Generated Code

### Reflection

Existing Java Class ----> reflection ----> Avro Schema and Object

## Schema Registry 

- component where we can store schemas to increase avro payload and have versioning

## KafkaProducer

https://kafka.apache.org/20/javadoc/org/apache/kafka/clients/producer/KafkaProducer.html 