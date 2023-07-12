package com.example.spring_core.demo.employees;

import com.example.spring_core.demo.reports.Report;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee{

  private final Report report;

  public Manager(@Qualifier("managerReport") Report report) { // Dependency injection report -> ManagerReport
    this.report = report;
  }

  @Override
  public String description() {
    return """
        The role of managers is organising and overseeing a
        particular group, project or sector within a business
        """;
  }

  public String report() {
    return report.showReport();
  }
}
