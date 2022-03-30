package com.lti.banking.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="Account")
public class Account {

	@Id
	@Column(name="Acc_No")
	private long accNo;
	
	
    @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="Customer_Id")
	private Customer customerId;
	
	@Column(name="Acc_type")
	private String accType;
	
	@Column(name="Amount")
	private double Amount;
	
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public Customer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	public Account(long accNo, Customer customerId, String accType, double amount) {
		super();
		this.accNo = accNo;
		this.customerId = customerId;
		this.accType = accType;
		Amount = amount;
	}
	public Account() {
		super();
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", customerId=" + customerId + ", accType=" + accType + ", Amount=" + Amount
				+ "]";
	}
	
	
}
