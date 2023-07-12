package com.example.spring_core.demo.reports;

public class DirectorReport implements Report {
  @Override
  public String showReport() {
    return "This is the director's report.";
  }
}
