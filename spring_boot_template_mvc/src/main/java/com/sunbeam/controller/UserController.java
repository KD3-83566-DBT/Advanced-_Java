package com.sunbeam.controller;
import java.util.Optional;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sunbeam.entities.Role;
import com.sunbeam.entities.User;
import com.sunbeam.service.UserService;

@Component
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	public UserController() {
	}
	
	// "/user/login"
	
	@GetMapping("/login")
	public String loginRandring() {
		System.out.println("in randring login page");
		return "/user/login"; 
	}
	@PostMapping("/login")	
public String ProcessLoginFrom(@RequestParam String email,
		@RequestParam String password,Model map,HttpSession session) {
		try {
		User user=userService.authenticateUser(email,password);
		 session.setAttribute("user", user);
		 if (user.getRole() == Role.BLOGGER)
			 return "redirect:blogger/home";
		 return "/commenter/home";
	}catch (Exception e) {
		System.out.println(e);
		map.addAttribute("message", e.getMessage());
		return "/user/login";
	}

}
}
