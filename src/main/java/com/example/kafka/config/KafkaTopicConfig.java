package com.example.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic temperatureTopic() {
        return TopicBuilder.name("temperature-topic").build();
    }

    @Bean
    public NewTopic humidityTopic() {
        return TopicBuilder.name("humidity-topic").build();
    }

    @Bean
    public NewTopic pressureTopic() {
        return TopicBuilder.name("pressure-topic").build();
    }

    @Bean
    public NewTopic windSpeedTopic() {
        return TopicBuilder.name("wind-speed-topic").build();
    }

    @Bean
    public NewTopic rainfallTopic() {
        return TopicBuilder.name("rainfall-topic").build();
    }

    @Bean
    public NewTopic solarRadiationTopic() {
        return TopicBuilder.name("solar-radiation-topic").build();
    }

    @Bean
    public NewTopic co2Topic() {
        return TopicBuilder.name("co2-topic").build();
    }

    @Bean
    public NewTopic o2Topic() {
        return TopicBuilder.name("o2-topic").build();
    }

    @Bean
    public NewTopic windDirectionTopic() {
        return TopicBuilder.name("wind-direction-topic").build();
    }
}
