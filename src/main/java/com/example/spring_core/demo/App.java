package com.example.spring_core.demo;

import com.example.spring_core.demo.employees.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CustomConfig.class);

    System.out.println("\nSECRETARY EMPLOYEE:");
    Employee secretary = context.getBean("secretary", Employee.class); //"secretary" -> class name with @Component (Secretary)
    System.out.println(secretary.description());
    System.out.println(secretary.report());


    System.out.println("\nMANAGER EMPLOYEE:");
    Employee manager = context.getBean("manager", Employee.class);  //"manager" -> class name with @Component (Manager)
    System.out.println(manager.description());
    System.out.println(manager.report());

    System.out.println("\nDIRECTOR EMPLOYEE:");
    System.out.println("\nObject(Bean) without @Component");
    Employee director = context.getBean("directorBean", Employee.class);  //"directorBean -> bean id (method) in CustomConfig class.
    System.out.println(director.description());
    System.out.println(director.report());
  }
}
