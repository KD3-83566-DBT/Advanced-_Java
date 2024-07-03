package com.sunbeam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunbeam.custom_exceptions.ResourceNotFoundException;
import com.sunbeam.dao.CustomerDao;
import com.sunbeam.dto.ApiResponse;
import com.sunbeam.entities.Customer;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
@Autowired
private CustomerDao customerDao;
	@Override
	public List<Customer> listOfCustomer() {	
		return customerDao.findAll();
	}
	@Override
	public Customer addCustomer(Customer c) {
		Customer savedCustomer=customerDao.save(c);
		return savedCustomer;
	}
	@Override
	public Customer getCustomerDetails(Long casId) {
		return customerDao.findById(casId) // Optional<Category>
				.orElseThrow(() -> new ResourceNotFoundException("Invalid Category ID!!!!"));
	}
	@Override
	public ApiResponse updateCategoryDetails(Long casId, Customer customer) {
		String mesg="Customer Updation Failed : invalid id !!!!";
		if(customerDao.existsById(casId)) {
			customerDao.save(customer);
			mesg="Updated category details";
		}
		return new ApiResponse(mesg);
	}

}
