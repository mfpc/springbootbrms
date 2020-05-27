package com.redhat.apresentacao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redhat.apresentacao.services.CustomerService;

@RestController
public class CustomerController {

	
	@Autowired
	CustomerService customerService;
	
	@GetMapping(path = "/getinformation")
	public String getInformation(String cpf) {
		System.out.println("Consulting the customer credit with cpf: " + cpf);

		if (customerService.hasCredit(cpf))
			return "Approved";

		return "Declined";
	}

	

}
