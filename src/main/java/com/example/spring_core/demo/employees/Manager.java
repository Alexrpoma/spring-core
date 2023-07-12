package com.example.spring_core.demo.employees;

import com.example.spring_core.demo.reports.Report;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//@PropertySource("application.properties")
public class Manager implements Employee{

  @Value("${manager.description}")
  private String description;

  private final Report report;

  public Manager(@Qualifier("managerReport") Report report) { // Dependency injection report -> ManagerReport
    this.report = report;
  }

  @Override
  public String description() {
    return description;
  }

  public String report() {
    return report.showReport();
  }
}
