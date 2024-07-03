package com.sunbeam.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.sunbeam.dto.ApiResponse;
import com.sunbeam.entities.Customer;

public interface CustomerService {
List<Customer> listOfCustomer();
Customer addCustomer(Customer c);
Customer getCustomerDetails(Long casId);
ApiResponse updateCategoryDetails(Long casId, Customer customer);
}
