package com.lti.banking.service;

import java.util.List;

import com.lti.banking.beans.Benificiary;

public interface BenificiaryService {

	public int addBen(Benificiary ben);
	public Benificiary searchBenbyId(int id);
	public List<Benificiary> EmpList() ;
}
