package com.example.spring_core.demo;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee{

  private Inform inform;

  public Manager(Inform inform) {
    this.inform = inform;
  }

  @Override
  public String description() {
    return """
        The role of managers is organising and overseeing a
        particular group, project or sector within a business
        """ + inform.showInform();
  }
}
