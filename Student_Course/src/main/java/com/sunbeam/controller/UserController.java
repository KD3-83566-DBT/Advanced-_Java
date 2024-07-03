package com.sunbeam.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.dto.UserDto;
import com.sunbeam.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public UserController() {
		
		// TODO Auto-generated constructor stub
		System.out.println("Inside"+getClass());
	}
	
	@PostMapping("/adduser")
	public ResponseEntity<?> addUsers(@RequestBody @Valid UserDto dto)
	{
		System.out.println("Controlle"+dto);
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(userService.addUser(dto));
		}
		catch(RuntimeException e){
			
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new RuntimeException( e.getMessage()));
			
		}
	}
	
	
	

}
