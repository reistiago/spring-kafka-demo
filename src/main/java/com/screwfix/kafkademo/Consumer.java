package com.screwfix.kafkademo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.screwfix.kafkademo.KafkaConfig.TOPIC;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    public Consumer() {
    }

    /**
     * Consumer group 1
     */
    @KafkaListener(id = "logGroup", topics = TOPIC)
    public void listen(String data) {
        logger.info("Received: " + data);
    }

    /**
     * Consumer group 2
     */
    @KafkaListener(id = "logGroupUpperCase", topics = TOPIC)
    public void listenUpperCase(String data) {
        logger.info("Received: " + data.toUpperCase());
    }
}
