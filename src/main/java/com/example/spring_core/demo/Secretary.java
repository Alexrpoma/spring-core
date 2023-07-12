package com.example.spring_core.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Secretary implements Employee {

  private final Inform inform;

  public Secretary(@Qualifier("secretaryInform") Inform inform) {
    this.inform = inform;
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
  public String inform() {
    return inform.showInform();
  }
}
