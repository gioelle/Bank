package com.account;

import java.util.Calendar;
import java.util.Date;

public class Transaction {
	private Date date;
	private double amount;
	private String transactor;
	
	public Transaction(double amount, String transactor) {
		this.date = Calendar.getInstance().getTime();
	}
	//	when a new transaction object is created, add it to transaction array in customer object,
	// call a method to change the account balance
//	+AvailableBalance(AccountNumber):double remainingBalance
//	+ProcessTransaction():void
	public String toString() {
		return  "*" + date + "," + amount + "," + transactor;
	}
	
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
