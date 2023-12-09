package com.example.kafka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SensorDataController {

    @GetMapping("/kafka-demo")
    public String showSensorData() {
        return "index";
    }
}