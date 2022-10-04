package com.Bosonit.ApacheKafkaJuanRodrigo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicBuilder {
    @Bean
    public NewTopic javaGuidesTopic(){
        return TopicBuilder
                .name("javaguides")
                .build();

    }
}
