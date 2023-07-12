package com.example.spring_core.demo;

import org.springframework.stereotype.Component;

@Component
public class Secretary implements Employee {
  @Override
  public String description() {
    return """
        Answer phone calls and redirect them when necessary.
        Manage the daily/weekly/monthly agenda and arrange
        new meetings and appointments.
        """;
  }
}
