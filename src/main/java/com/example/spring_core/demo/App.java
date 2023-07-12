package com.example.spring_core.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CustomConfig.class);

    System.out.println("\nSECRETARY EMPLOYEE:");
    Employee secretary = context.getBean("secretary", Employee.class);
    System.out.println(secretary.description());
    System.out.println(secretary.inform());


    System.out.println("\nMANAGER EMPLOYEE:");
    Employee manager = context.getBean("manager", Employee.class);
    System.out.println(manager.description());
    System.out.println(manager.inform());
  }
}
