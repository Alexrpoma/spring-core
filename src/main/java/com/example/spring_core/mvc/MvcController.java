package com.example.spring_core.mvc;

import com.example.spring_core.mvc.shapes.Circle;
import com.example.spring_core.mvc.shapes.Shape;
import com.example.spring_core.mvc.shapes.Triangle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MvcController {
  @RequestMapping("/page")
  public String showPage(Model model) {
    Triangle triangle = new Triangle("Triangle", "Blue");
    Circle circle = new Circle("Circle", "White");
    List<Shape> shapes = Arrays.asList(triangle, circle);
    model.addAttribute("shapes", shapes);
    return "page";
  }
}
