package com.example.spring_core.demo.reports;

import org.springframework.stereotype.Component;

@Component
public class SecretaryReport implements Report {
  @Override
  public String showReport() {
    return "This is the secretary's report";
  }
}
