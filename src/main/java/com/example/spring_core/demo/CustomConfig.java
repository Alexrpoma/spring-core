package com.example.spring_core.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.spring_core.demo") // Scan packages where it can find @Components (beans)
public class CustomConfig {
}
