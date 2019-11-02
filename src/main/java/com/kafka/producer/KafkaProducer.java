package com.kafka.producer;

import com.example.Customer;
import org.apache.kafka.clients.*;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class KafkaProducer {

    public static void main(String[] args) {

        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", "127.0.0.1:9092");
        properties.setProperty("acks", "all");
        properties.setProperty("retries", "10");

        //avro producer
        properties.setProperty("key.serializer", StringSerializer.class.getName());
        properties.setProperty("value.serializer", KafkaAvroSerializer.class.getName());
        properties.setProperty("schema.registry.url", "http://127.0.0.1:8081");

        org.apache.kafka.clients.producer.KafkaProducer<String, Customer> kafkaProducer = new org.apache.kafka.clients.producer.KafkaProducer<String, Customer>(properties);
        String topic = "kafka-producer-topic";

        Customer customer = Customer.newBuilder()
                .setLastName("LastName")
                .setFirstName("New")
                .setHeight(100)
                .setWeight(1001)
                .setAge(45)
                .build();
        ProducerRecord<String, Customer> producerRecord = new ProducerRecord<String, Customer>(topic, customer);

        kafkaProducer.send(producerRecord, new Callback() {
            @Override
            public void onCompletion(RecordMetadata recordMetadata, Exception e) {
                if (e == null){
                    System.out.println("OK");
                    System.out.println(recordMetadata.toString());
                } else {
                    e.printStackTrace();
                }
            }

    });

        kafkaProducer.flush();
        kafkaProducer.close();
}
}
