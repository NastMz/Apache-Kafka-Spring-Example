package com.example.kafka.consumers;

import com.example.kafka.models.SensorData;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class SensorConsumers {
    private final SimpMessagingTemplate messagingTemplate;

    public SensorConsumers(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @KafkaListener(topics = "temperature-topic", groupId = "group1")
    public void consumeTemperatureData(SensorData data) {
        messagingTemplate.convertAndSend("/topic/temperature", data);
    }

    @KafkaListener(topics = "humidity-topic", groupId = "group1")
    public void consumeHumidityData(SensorData data) {
        messagingTemplate.convertAndSend("/topic/humidity", data);
    }

    @KafkaListener(topics = "pressure-topic", groupId = "group1")
    public void consumePressureData(SensorData data) {
        messagingTemplate.convertAndSend("/topic/pressure", data);
    }

    @KafkaListener(topics = "rainfall-topic", groupId = "group1")
    public void consumeRainfallData(SensorData data) {
        messagingTemplate.convertAndSend("/topic/rainfall", data);
    }

    @KafkaListener(topics = "co2-topic", groupId = "group1")
    public void consumeCO2Data(SensorData data) {
        messagingTemplate.convertAndSend("/topic/co2", data);
    }

    @KafkaListener(topics = "o2-topic", groupId = "group1")
    public void consumeO2Data(SensorData data) {
        messagingTemplate.convertAndSend("/topic/o2", data);
    }

    @KafkaListener(topics = "wind-direction-topic", groupId = "group1")
    public void consumeWindDirectionData(SensorData data) {
        messagingTemplate.convertAndSend("/topic/wind-direction", data);
    }

    @KafkaListener(topics = "wind-topic", groupId = "group1")
    public void consumeWindSpeedData(SensorData data) {
        messagingTemplate.convertAndSend("/topic/wind-speed", data);
    }

    @KafkaListener(topics = "solar-radiation-topic", groupId = "group1")
    public void consumeSolarRadiationData(SensorData data) {
        messagingTemplate.convertAndSend("/topic/solar-radiation", data);
    }
}
