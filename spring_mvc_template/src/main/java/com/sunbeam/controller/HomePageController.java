package com.sunbeam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Mnadatory  class lavel annotation to specify this is a spring 
public class HomePageController {
 public HomePageController() {
	System.out.println("in ctor - "+getClass().getName());
}
 @RequestMapping("/")
 public String renderHomePage() {
	System.out.println("in render home page");
	return "/index";
}

}
