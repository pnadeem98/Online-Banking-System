package com.lti.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.banking.beans.Account;
import com.lti.banking.dao.AccountDAO;

@Service("accSer")
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountDAO dao;
	
	@Override
	public long addAcc(Account acc) {
		
		return dao.addAcc(acc);
	}

}
