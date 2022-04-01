package com.lti.banking.beans;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="Account")
public class Account {

	@Id
	@Column(name="Acc_No")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
	@SequenceGenerator(name = "CUST_SEQ", sequenceName = "cust_seq", allocationSize = 1)
	private long accNo;
	
    @Column(name="Customer_id")
	private int customerId;
	
	@Column(name="Acc_type")
	private String accType;
	
	@Column(name="Total_Amount")
	private double Amount;
	
	
	public Account(String accType, double amount) {
		super();
		this.accType = accType;
		this.Amount = amount;
	}
	
	public Account(int customerId, String accType, double amount) {
		super();
		this.customerId = customerId;
		this.accType = accType;
		this.Amount = amount;
	}

	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
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
	public Account(long accNo, int customerId, String accType, double amount) {
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

