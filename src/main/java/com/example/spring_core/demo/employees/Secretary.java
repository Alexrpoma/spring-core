package com.example.spring_core.demo.employees;

import com.example.spring_core.demo.reports.Report;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Secretary implements Employee {

  @Value("${secretary.description}")
  private String description;
  private final Report report;

  public Secretary(@Qualifier("secretaryReport") Report report) { //Dependency injection report -> SecretaryReport
    this.report = report;
  }

  @Override
  public String description() {
    return description;
  }

  @Override
  public String report() {
    return report.showReport();
  }
}
