package com.lti.banking.service;

import com.lti.banking.beans.Customer;

public interface CustomerService {

	public int addCustomer(Customer cus);
	public Customer searchById(int id);
}
