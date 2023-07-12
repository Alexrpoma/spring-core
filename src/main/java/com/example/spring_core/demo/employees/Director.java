package com.example.spring_core.demo.employees;

import com.example.spring_core.demo.reports.Report;
import org.springframework.beans.factory.annotation.Value;

public class Director implements Employee{

  @Value("${director.description}")
  private String description;
  private final Report report;

  public Director(Report report) {
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
