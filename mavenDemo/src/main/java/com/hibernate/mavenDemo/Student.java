package com.hibernate.mavenDemo;

public class Student {

	private int rollNo;
	   private String firstName; 
	   private String lastName;   
	   private int contactNo;
	   
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
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
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	
	public Student() {
		super();
	}
	
	public Student(int rollNo, String firstName, String lastName, int contactNo) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNo = contactNo;
	}  

}
