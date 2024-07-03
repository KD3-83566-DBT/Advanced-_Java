package com.sunbeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.dto.ApiResponse;
import com.sunbeam.dto.RoomDto;
import com.sunbeam.service.RoomService;

import lombok.NoArgsConstructor;
import lombok.ToString;

@RestController
@RequestMapping("/room")
@NoArgsConstructor
@ToString
public class RoomController {
	@Autowired
	private RoomService roomService;

	@PostMapping("/room")
	public ResponseEntity<?> addroom(@RequestBody RoomDto dto){
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(roomService.addroom(dto));
		}catch (RuntimeException e) {
			System.out.println(e);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse(e.getMessage()));
		}
	}
	
	@GetMapping("/avilable")
	public ResponseEntity<?>getAvailable(){
		
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(roomService.avilableRoom());
		}catch (RuntimeException e) {
			System.out.println(e);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse(e.getMessage()));
		}
		
	}
}
