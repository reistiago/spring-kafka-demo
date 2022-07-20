package com.screwfix.kafkademo;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class KafkaConfig {

    public static final String TOPIC = "topic1";

    @Bean
    public NewTopic topic() {
        return new NewTopic(TOPIC, 1, (short) 1);
    }
}
