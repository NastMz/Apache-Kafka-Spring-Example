package com.example.kafka.data;

public enum SensorTypes {
    TEMPERATURE("temperature", "°C"),
    HUMIDITY("humidity", "%"),
    PRESSURE("pressure", "hPa"),
    CO2("co2", "ppm"),
    O2("o2", "%"),
    WIND_DIRECTION("wind-direction", "°"),
    WIND_SPEED("wind-speed", "m/s"),
    RAINFALL("rainfall", "mm/h"),
    SOLAR_RADIATION("solar-radiation", "W/m²");

    final String sensorType;
    final String sensorUnit;

    SensorTypes(String sensorType, String sensorUnit) {
        this.sensorType = sensorType;
        this.sensorUnit = sensorUnit;
    }
}
