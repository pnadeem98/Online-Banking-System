package com.lti.banking.dao;

import com.lti.banking.beans.Customer;

public interface CustomerDAO {

	public long addCustomer(Customer cus);
	public Customer searchById(int id);
}
