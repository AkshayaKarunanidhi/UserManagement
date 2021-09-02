package com.edubridge.usermanagemnet.bean;

public class User {
	protected int id;
	protected String name;
	protected String email;
	protected String contact;
	protected String gender;
	protected String address;
	
	public User() {
	}
	
	public User(String name, String email, String contact,String gender,String address) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.address = address;
	}

	public User(int id, String name, String email,String contact,String gender, String caddress) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	


public String getContact() {
	return contact;
}
public void setContact(String contact){
	this.contact = contact;
}
	


public String getGender() {
	return gender;
}
public void setGender(String Gender) {
	this.gender = gender;
}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
