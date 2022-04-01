package com.lti.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.banking.beans.Customer;
import com.lti.banking.dao.CustomerDAO;


@Service("cusService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO dao;
	
	public CustomerDAO getDao() {
		return dao;
	}

	public void setDao(CustomerDAO dao) {
		this.dao = dao;
	}

	@Override
	public long addCustomer(Customer cus) {
		
		return dao.addCustomer(cus);
	}

	@Override
	public Customer searchById(int id) {
		
		return dao.searchById(id);
	}

}
