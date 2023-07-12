package com.example.spring_core.demo;

import org.springframework.stereotype.Component;

@Component
public class ManagerInform implements Inform{
  @Override
  public String showInform() {
    return "This is the manager's inform";
  }
}
