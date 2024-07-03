package com.sunbeam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.dto.ApiResponse;
import com.sunbeam.entities.Customer;

import com.sunbeam.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
 @Autowired
 private CustomerService customerservice;
 public CustomerController() {
	 System.out.println("in ctr "+getClass().getName());
 }
 @GetMapping
 public List<Customer> listOfCustomer(){
	 System.out.println("in list of method");
	return customerservice.listOfCustomer();
	 
 }
 @PostMapping
 public  ResponseEntity<?> addcustomer(@RequestBody Customer customer) {
	System.out.println("in add customer" + customer);
	try {
		// invoke service layer
		return ResponseEntity.status(HttpStatus.CREATED).body(customerservice.addCustomer(customer));
	} catch (RuntimeException e) {
		System.out.println(e);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse(e.getMessage()));
	}
	 
 }
 
 @GetMapping("/{casId}")
	public ResponseEntity<?> getCategoryDetails(@PathVariable Long casId) {
		System.out.println("in get category " + casId);
		try {
			return ResponseEntity.ok(customerservice.getCustomerDetails(casId));
		} catch (RuntimeException e) {
			System.out.println(e);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse(e.getMessage()));
		}
	}
 @PutMapping("/{casId}")
	public ResponseEntity<?> updateCategory(@PathVariable Long casId, @RequestBody Customer customer) {
		System.out.println("in update " + casId + " " + customer);
		return ResponseEntity
				.ok(customerservice
						.updateCategoryDetails(casId, customer));
	}
}
