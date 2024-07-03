package com.sunbeam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/test")
public class TestCantroller {
public TestCantroller() {
	System.out.println("in ctor - "+getClass().getName());
}
@GetMapping("/multiply")
public String mulitiplyNos(Model modelMap,@RequestParam int num1,@RequestParam int num2) {
	System.out.println("in multiply"+modelMap);
//	Integer res=num1*num2;
//	modelMap.addAttribute(res);
	modelMap.addAttribute("Multiply_result",num1*num2);
	return "/test/result";
}

}
