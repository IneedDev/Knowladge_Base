package com.kafka.rest;

import org.springframework.stereotype.Service;
import org.springframework.kafka.core.KafkaTemplate;

@Service
public class SimpleProducer {

    private KafkaTemplate<String, String> simpleProducer;

    public SimpleProducer(KafkaTemplate<String, String> simpleProducer) {
        this.simpleProducer = simpleProducer;
    }
    public void send(String message) {
        simpleProducer.send("simple-message", message);
    }
}
