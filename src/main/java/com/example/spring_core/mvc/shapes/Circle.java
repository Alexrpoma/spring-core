package com.example.spring_core.mvc.shapes;

public record Circle(String name, String color) implements Shape {
  @Override
  public String description() {
    return "This is a %s circle.".formatted(color);
  }
}
