package com.lti.banking.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.banking.beans.Account;

@Repository
public class AccountDAOImpl implements AccountDAO {

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	@Transactional
	public long addAcc(Account acc) {
		em.persist(acc);
		return acc.getAccNo();
	}

}
