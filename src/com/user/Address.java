package com.user;

//This class creates the address object to be called by the Customer object

public class Address {
	
	private String streetAddress;
	private String city;
	private String state;
	private String zipcode;
	
	//Default Constructor
	public Address (){
	}
	//Parameterized Constructor
	public Address (String streetAddress, String city, String state, String zipcode){
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	

	public String toString(){
		return this.streetAddress + " " + this.city + " " + this.state + " " + this.zipcode;
	}
	
	
	//Getters & setters
	public String getStreetAddress(){
		return this.streetAddress;
	}
	public void setStreetAddress(String streetAddress){
		this.streetAddress = streetAddress;
	}
	public String getCity(){
		return this.city;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String getState(){
		return this.state;
	}
	public void setState(String state){
		this.state = state;
	}
	public String getZipcode(){
		return this.zipcode;
	}
	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}
}
