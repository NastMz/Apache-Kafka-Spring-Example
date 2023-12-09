package com.example.kafka.data.utils;

import com.example.kafka.data.Cities;
import com.example.kafka.data.SensorTypes;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SensorConfigurator {

    private static final List<SensorEntry> sensorEntries = new ArrayList<>();
    private static SensorConfigurator instance;

    private SensorConfigurator () {
        for (Cities city : Cities.values()) {
            generateSensorsForCity(city);
        }
    }

    public static SensorConfigurator getInstance() {
        if (instance == null) {
            instance = new SensorConfigurator();
        }
        return instance;
    }

    private void generateSensorsForCity(Cities city) {
        for (SensorTypes sensorType : SensorTypes.values()) {
            sensorEntries.add(new SensorEntry(sensorType, city));
        }
    }

    public Iterable<SensorEntry> getSensorEntries() {
        return sensorEntries;
    }

    @Getter
    public static class SensorEntry {
        private final String name;
        private final String sensorType;
        private final String city;
        private final String uuid;

        public SensorEntry(SensorTypes sensorType, Cities city) {
            this.name = generateSensorName(sensorType, city);
            this.sensorType = sensorType.name();
            this.city = city.name();
            this.uuid = randomUUID().toString();
        }

        @Override
        public String toString() {
            return String.format("%s(%s, %s, %s),", name, sensorType, city, uuid);
        }
    }

    private static String generateSensorName(SensorTypes sensorType, Cities city) {
        return String.format("SENSOR_%d", sensorType.ordinal() + 1 + city.ordinal() * SensorTypes.values().length);
    }

    private static UUID randomUUID() {
        return UUID.randomUUID();
    }
}
