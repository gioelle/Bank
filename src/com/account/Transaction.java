package com.account;

import java.util.Date;

public class Transaction {
	private Date date;
	private double amount;
	private String transactor;
	
	
//	+AvailableBalance(AccountNumber):double remainingBalance
//	+ProcessTransaction():void
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransactor() {
		return transactor;
	}
	public void setTransactor(String transactor) {
		this.transactor = transactor;
	}

	
}
