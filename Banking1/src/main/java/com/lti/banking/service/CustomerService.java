package com.lti.banking.service;

import com.lti.banking.beans.Customer;

public interface CustomerService {

	public long addCustomer(Customer cus);
	public Customer searchById(int id);
}
