package com.lti.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.banking.beans.Account;
import com.lti.banking.dao.AccountDAO;

@Service("accSer")
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountDAO dao;
	
	public AccountDAO getDao() {
		return dao;
	}

	public void setDao(AccountDAO dao) {
		this.dao = dao;
	}

	@Override
	public long addacc(Account acc) {
		
		return dao.addacc(acc);
	}

}
