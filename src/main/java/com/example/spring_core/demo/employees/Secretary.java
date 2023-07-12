package com.example.spring_core.demo.employees;

import com.example.spring_core.demo.reports.Report;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Secretary implements Employee {

  private final Report report;

  public Secretary(@Qualifier("secretaryReport") Report report) { //Dependency injection report -> SecretaryReport
    this.report = report;
  }

  @Override
  public String description() {
    return """
        Answer phone calls and redirect them when necessary.
        Manage the daily/weekly/monthly agenda and arrange
        new meetings and appointments.
        """;
  }

  @Override
  public String report() {
    return report.showReport();
  }
}
