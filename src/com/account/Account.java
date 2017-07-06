package com.account;

import java.util.ArrayList;

public class Account {
	private double balance;
	private String accountNumber;
	private double interestRate;
	private boolean hasDebitCard;
	private boolean hasChecks;
	private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	
	
//	openAccount()
//	transfer()
//	deposit(callProcessTransaction())
//	withdrawal(callProcessTransaction())
//	closeAccount()
//	assignAccountNumber()
//	getStatement(date, date):list of transactions between dates
//	PrintStatement(): void
//	request Checkbook()
//	request debitcard()
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public boolean isHasDebitCard() {
		return hasDebitCard;
	}
	public void setHasDebitCard(boolean hasDebitCard) {
		this.hasDebitCard = hasDebitCard;
	}
	public boolean isHasChecks() {
		return hasChecks;
	}
	public void setHasChecks(boolean hasChecks) {
		this.hasChecks = hasChecks;
	}
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}
	

	
	
}
