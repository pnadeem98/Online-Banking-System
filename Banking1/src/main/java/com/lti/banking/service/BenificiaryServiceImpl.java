package com.lti.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.banking.beans.Benificiary;
import com.lti.banking.dao.BenificiaryDAO;

@Service("benService")
public class BenificiaryServiceImpl implements BenificiaryService{

	@Autowired
	BenificiaryDAO dao;
	
	@Override
	public int addBen(Benificiary ben) {
		
		return dao.addBen(ben);
	}

	@Override
	public Benificiary searchBenbyId(int id) {
	
		return dao.searchBenbyId(id);
	}

	
	
}
