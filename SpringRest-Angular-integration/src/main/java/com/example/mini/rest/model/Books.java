package com.example.mini.rest.model;

import java.util.Date;

public class Books {

	private Integer id;
	private String name;
	private String email;
	private String phonenumber;
	private String activeStatus;
	private Date date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Books(Integer id, String name, String email, String phonenumber, String activeStatus, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
		this.activeStatus = activeStatus;
		this.date = date;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", email=" + email + ", phonenumber=" + phonenumber
				+ ", activeStatus=" + activeStatus + ", date=" + date + "]";
	}
	
	

}
