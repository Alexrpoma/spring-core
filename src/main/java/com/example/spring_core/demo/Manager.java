package com.example.spring_core.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee{

  private final Inform inform;

  public Manager(@Qualifier("managerInform") Inform inform) {
    this.inform = inform;
  }

  @Override
  public String description() {
    return """
        The role of managers is organising and overseeing a
        particular group, project or sector within a business
        """;
  }

  public String inform() {
    return inform.showInform();
  }
}
