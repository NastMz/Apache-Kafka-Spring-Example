package com.example.kafka.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class SensorData {
    String sensorId;
    String sensorType;
    String sensorValue;
    String sensorLocation;
    String sensorTimestamp;

    public String getTopic() {
        return this.sensorType.toLowerCase() + "-topic";
    }
}
