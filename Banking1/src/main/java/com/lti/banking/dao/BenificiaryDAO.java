package com.lti.banking.dao;

import java.util.List;

import com.lti.banking.beans.Benificiary;


public interface BenificiaryDAO {

	public int addBen(Benificiary ben);

	public Benificiary searchBenbyId(int id);
	
	public List<Benificiary> EmpList() ;
	
}
