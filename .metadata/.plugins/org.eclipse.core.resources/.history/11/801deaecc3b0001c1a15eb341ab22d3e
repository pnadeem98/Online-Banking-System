package com.lti.banking.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AccountDetails")
public class Transactions {

	@Id
	@Column(name="Trans_Id")
	private int transId;
	
	@Column(name="Acc_No")
	private long accNo;
	
	@Column(name="Ben_Id")
	private int benId;
	
	@Column(name="Trans_Amount")
	private double transAmount;
	
	@Column(name="Trans_Type")
	private String transType;
	
	@Column(name="Trans_Password")
	private String trans_password;

	public int getTransId() {
		return transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public int getBenId() {
		return benId;
	}

	public void setBenId(int benId) {
		this.benId = benId;
	}

	public double getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getTrans_password() {
		return trans_password;
	}

	public void setTrans_password(String trans_password) {
		this.trans_password = trans_password;
	}

	public Transactions(int transId, long accNo, int benId, double transAmount, String transType,
			String trans_password) {
		super();
		this.transId = transId;
		this.accNo = accNo;
		this.benId = benId;
		this.transAmount = transAmount;
		this.transType = transType;
		this.trans_password = trans_password;
	}

	public Transactions() {
		super();
	}

	@Override
	public String toString() {
		return "Transactions [transId=" + transId + ", accNo=" + accNo + ", benId=" + benId + ", transAmount="
				+ transAmount + ", transType=" + transType + ", trans_password=" + trans_password + "]";
	}
	
}
