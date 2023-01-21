package com.collections.arraylist;

public class Employee {
	private String Name;
	private String DOB;
	 private   int Age;
   private double Salary;
   private  String address;
	
    public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee(String name, String dOB, int age, double salary, String address) {
		super();
		Name = name;
		DOB = dOB;
		Age = age;
		Salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", DOB=" + DOB + ", Age=" + Age + ", Salary=" + Salary + ", address="
				+ address + "]";
	}




}


