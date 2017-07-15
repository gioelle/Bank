package com.account;

import java.util.ArrayList;
import java.util.Date;

public class Account {
	private double balance;
	private String accountNumber;
	private double interestRate;
	private boolean hasDebitCard;
	private boolean hasChecks;
	private String type;
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
	
	@Override
	public String toString() {
		return  "~" + type + "," + balance + "," + accountNumber + "," + interestRate + ","
				+ hasDebitCard + "," + hasChecks;
	}
	//method to alter amount using a transaction
	public void processTransaction(double amount, String transactor) {
		Transaction transaction = new Transaction(amount, transactor);
		transactions.add(transaction);
		this.balance += amount;
	}
	
	public void generateNumber(String last4) {
		int temp = (int)Math.random()*999 + 100;
		this.accountNumber = last4 + temp;
	}
	
	public Account() {
		this.balance = 0;
	}
	public void setAccountValues(String type) {
		
		interestRate = 0.08;
		this.type = type;
		
		
	}
	
	
	
	public void setAccountValues(boolean hasDebitCard, boolean hasChecks) {
		
		this.hasDebitCard = hasDebitCard;
		this.hasChecks = hasChecks;
		this.type = "Checking";
	
	}
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
	public boolean hasDebitCard() {
		return hasDebitCard;
	}
	public void setHasDebitCard(boolean hasDebitCard) {
		this.hasDebitCard = hasDebitCard;
	}
	public boolean hasChecks() {
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isHasDebitCard() {
		return hasDebitCard;
	}
	public boolean isHasChecks() {
		return hasChecks;
	}
	
}
