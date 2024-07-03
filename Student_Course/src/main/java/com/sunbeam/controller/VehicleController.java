package com.sunbeam.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.dto.VehicleDto;
import com.sunbeam.service.VehicleService;

@RestController
@RequestMapping("/Vehicle")
public class VehicleController {
	@Autowired
	private VehicleService vehicleService;
	public VehicleController() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside"+getClass());
	}
	
	@PostMapping("/addvehicle")
	public ResponseEntity<?> addVehicle (@RequestBody @Valid VehicleDto Dto)
	{
		try {
			return  ResponseEntity.status(HttpStatus.CREATED).body(vehicleService.addVehicle(Dto));
			}
		catch(RuntimeException e)
		{
			return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
		
	}
		@DeleteMapping("/delete/{name}")
		public ResponseEntity<?> deleteVehicle(@PathVariable String name)
		{
			try {
				return  ResponseEntity.status(HttpStatus.CREATED).body(vehicleService.deleteVehicleByUname(name));
				}
			catch(RuntimeException e)
			{
				return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
			}
		}
	
		@GetMapping("/vehicles/{name}")
		public ResponseEntity<?> getVehicle(@PathVariable String name)
		{
			try {
				return  ResponseEntity.status(HttpStatus.CREATED).body(vehicleService.GetAllVehicles(name));
				}
			catch(RuntimeException e)
			{
				return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
			}
		}
	
	

}
