package com.example.kafka.data.utils;

import com.example.kafka.data.SensorTypes;
import com.example.kafka.models.SensorData;

import java.util.*;
import java.util.function.Supplier;

public class DataSource {

    static List<SensorData> data = new ArrayList<>();
    private static DataSource instance;

    private static final Map<SensorTypes, Supplier<String>> dataGeneratorMap = new HashMap<>();

    public static DataSource getInstance() {
        if (instance == null) {
            instance = new DataSource();
        }
        return instance;
    }

    private DataSource() {
        SensorConfigurator sensorConfigurator = SensorConfigurator.getInstance();
        for (SensorConfigurator.SensorEntry sensorEntry : sensorConfigurator.getSensorEntries()) {
            SensorData sensorData = new SensorData();
            sensorData.setSensorId(sensorEntry.getUuid());
            sensorData.setSensorType(sensorEntry.getSensorType());
            sensorData.setSensorLocation(sensorEntry.getCity());
            sensorData.setSensorTimestamp(new Date().toString());
            data.add(sensorData);
        }

        dataGeneratorMap.put(SensorTypes.TEMPERATURE, DataSource::generateTemperature);
        dataGeneratorMap.put(SensorTypes.HUMIDITY, DataSource::generateHumidity);
        dataGeneratorMap.put(SensorTypes.PRESSURE, DataSource::generatePressure);
        dataGeneratorMap.put(SensorTypes.CO2, DataSource::generateCO2);
        dataGeneratorMap.put(SensorTypes.O2, DataSource::generateO2);
        dataGeneratorMap.put(SensorTypes.WIND_DIRECTION, DataSource::generateWindDirection);
        dataGeneratorMap.put(SensorTypes.WIND_SPEED, DataSource::generateWindSpeed);
        dataGeneratorMap.put(SensorTypes.RAINFALL, DataSource::generateRainfall);
        dataGeneratorMap.put(SensorTypes.SOLAR_RADIATION, DataSource::generateSolarRadiation);

    }

    public static Iterable<SensorData> getData() {
        List<SensorData> dataCopy = new ArrayList<>(data);

        for (SensorData sensorData : dataCopy) {
            SensorTypes sensorType = SensorTypes.valueOf(sensorData.getSensorType());
            if (dataGeneratorMap.containsKey(sensorType)) {
                sensorData.setSensorValue(dataGeneratorMap.get(sensorType).get());
            }
        }

        return dataCopy;
    }

    private static String generateTemperature() {
        // Add logic to generate realistic temperature values
        return String.valueOf(15 + Math.random() * 20); // Example: Temperature between 15 and 35 degrees Celsius
    }

    private static String generateHumidity() {
        // Add logic to generate realistic humidity values
        return String.valueOf(30 + Math.random() * 40); // Example: Humidity between 30% and 70%
    }

    private static String generatePressure() {
        // Add logic to generate realistic pressure values
        return String.valueOf(1000 + Math.random() * 50); // Example: Pressure between 1000 and 1050 hPa
    }

    private static String generateCO2() {
        // Add logic to generate realistic CO2 values
        return String.valueOf(300 + Math.random() * 400); // Example: CO2 between 300 and 700 ppm
    }

    private static String generateO2() {
        // Add logic to generate realistic O2 values
        return String.valueOf(18 + Math.random() * 2); // Example: O2 between 18% and 20%
    }

    private static String generateWindDirection() {
        // Add logic to generate realistic wind direction values
        return String.valueOf(Math.random() * 360); // Example: Wind direction between 0 and 360 degrees
    }

    private static String generateWindSpeed() {
        // Add logic to generate realistic wind speed values
        return String.valueOf(Math.random() * 10); // Example: Wind speed between 0 and 10 m/s
    }

    private static String generateRainfall() {
        // Add logic to generate realistic rainfall values
        return String.valueOf(Math.random() * 5); // Example: Rainfall between 0 and 5 mm/h
    }

    private static String generateSolarRadiation() {
        // Add logic to generate realistic solar radiation values
        return String.valueOf(Math.random() * 1000); // Example: Solar radiation between 0 and 1000 W/m^2
    }
}
