package com.example.spring_core.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CustomConfig.class);
    Employee secretary = context.getBean("secretary", Employee.class);
    System.out.println(secretary.description());

    Employee manager = context.getBean("manager", Employee.class);
    System.out.println(manager.description());

  }
}
