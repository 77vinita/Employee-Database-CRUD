package com.jdbc_api;
//This class represents the Employee entity
public class Employee {
	private int eid; // Employee ID
	private String name; // Employee name
	private String department; // Employee department
	private String address; // Employee address
	private double salary; // Employee salary

	// Getters and setters for the Employee fields
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// Method to return the Employee details as a string
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", department=" + department + ", address=" + address
				+ ", salary=" + salary + "]";
	}
}
