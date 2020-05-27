package com.redhat.apresentacao.services;

import org.springframework.stereotype.Component;

@Component
public class CustomerService {
	
	public boolean hasCredit(String cpf) {
		// Could be a search in a data base or a call to another rest api application.
		if (cpf.contains("55")) {
			return true;
		}

		return false;

	}

}
