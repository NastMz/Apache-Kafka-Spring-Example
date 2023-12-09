package com.example.kafka.producers;

import com.example.kafka.data.utils.DataSource;
import com.example.kafka.models.SensorData;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SensorDataProducer {

    private KafkaTemplate<String, SensorData> kafkaTemplate;
    public SensorDataProducer(KafkaTemplate<String, SensorData> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(SensorData sensorData, String topic) {
        Message<SensorData> message = MessageBuilder
                .withPayload(sensorData)
                .setHeader(KafkaHeaders.TOPIC, topic)
                .build();
        this.kafkaTemplate.send(message);
    }

    @Scheduled(fixedRate = 1000)
    public void produce() {
        Iterable<SensorData> sensorData = DataSource.getInstance().getData();

        for (SensorData data : sensorData) {
            sendMessage(data, data.getTopic());
        }

    }
}
