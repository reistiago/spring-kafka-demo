package com.screwfix.kafkademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import static com.screwfix.kafkademo.KafkaConfig.TOPIC;

@Profile("producer")
@Service
public class Producer {
    private final KafkaTemplate<String, String> template;

    @Autowired
    public Producer(KafkaTemplate<String, String> template) {
        this.template = template;
    }

    @Scheduled(fixedDelay = 5000L)
    public void send() {
        template.send(TOPIC, "hello");
    }
}
