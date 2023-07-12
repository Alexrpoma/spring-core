package com.example.spring_core.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  public static void main(String[] args) {
    Employee manager0 = new Manager(new Inform());
    System.out.println(manager0.description());

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CustomConfig.class);
    Employee secretary = context.getBean("secretary", Employee.class);
    System.out.println(secretary.description());

  }
}
