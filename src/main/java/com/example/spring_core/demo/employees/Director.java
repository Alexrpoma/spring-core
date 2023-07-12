package com.example.spring_core.demo.employees;

import com.example.spring_core.demo.reports.Report;

public class Director implements Employee{

  private final Report report;

  public Director(Report report) {
    this.report = report;
  }

  @Override
  public String description() {
    return "Creating business strategies and proposing implementation methods.";
  }

  @Override
  public String report() {
    return report.showReport();
  }
}
