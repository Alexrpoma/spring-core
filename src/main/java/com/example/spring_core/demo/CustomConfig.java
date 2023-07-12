package com.example.spring_core.demo;

import com.example.spring_core.demo.employees.Director;
import com.example.spring_core.demo.employees.Employee;
import com.example.spring_core.demo.reports.DirectorReport;
import com.example.spring_core.demo.reports.Report;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
@ComponentScan("com.example.spring_core.demo") // Scan packages where it can find @Components (beans)
public class CustomConfig {

  //Dependency injection.
  @Bean
  public DirectorReport directorReport() {
    return new DirectorReport();
  }

  //Director bean.
  @Bean
  public Employee directorBean() {
    return new Director(directorReport());
  }
}
