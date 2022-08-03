package com.example.demo;

public class Employeedet {
	private String name;
	public Employeedet(String name, String lastname,int employeeid) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.employeeid=employeeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	private String lastname;
	private int employeeid;
	public Employeedet(int employeeid) {
		super();
		this.employeeid = employeeid;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

}
