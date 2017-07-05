package com.user;

// import java.util.ArrayList;

public class Customer {
//	private ArrayList<Account> accountList;
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;
	private Address address;
	
//	public ArrayList<Account> getAccountList() {
//		return accountList;
//	}
//
//	public void setAccountList(ArrayList<Account> accountList) {
//		this.accountList = accountList;
//	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	//default constructor
	public Customer() {}
	
	

}
