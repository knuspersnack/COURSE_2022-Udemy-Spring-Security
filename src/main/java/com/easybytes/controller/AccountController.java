package com.easybytes.controller;

import com.easybytes.model.Customer;
import com.easybytes.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
public class AccountController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("/myAccount")
	public String getAccountDetails(String input) {

		return "Customers: " + customerRepository.findAll().stream().map(Customer::getEmail).collect(Collectors.joining());
	}

}
