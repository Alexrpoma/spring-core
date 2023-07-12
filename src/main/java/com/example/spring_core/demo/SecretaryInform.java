package com.example.spring_core.demo;

import org.springframework.stereotype.Component;

@Component
public class SecretaryInform implements Inform{
  @Override
  public String showInform() {
    return "This is the secretary's inform";
  }
}
