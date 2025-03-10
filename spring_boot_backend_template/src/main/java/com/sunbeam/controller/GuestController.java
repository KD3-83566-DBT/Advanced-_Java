package com.sunbeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.dto.ApiResponse;
import com.sunbeam.dto.GuestDto;
import com.sunbeam.service.GuestService;
@RestController
@RequestMapping("/guest")

public class GuestController {
	@Autowired
	private GuestService guestService;
	
	@PostMapping("/addGuest")
	public ResponseEntity<?> addGuest(@RequestBody GuestDto dto) {
		//return null;
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(guestService.addGuest(dto));
		}catch (RuntimeException e) {
			System.out.println(e);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse(e.getMessage()));
		}
		
	}

}
