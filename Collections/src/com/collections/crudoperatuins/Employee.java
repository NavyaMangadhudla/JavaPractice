package com.collections.crudoperatuins;

import java.util.List;

public class Employee {
	private String employeeName;
	private int employeeID;
	private  Double Salary;
	List<Courses>courses;
	
	
	
	public Employee(String string, int i, double d) {
		// TODO Auto-generated constructor stub
	}
	public List<Courses> getCourses() {
		return courses;
	}
	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}
	
		public Employee(String employeeName, int employeeID, Double salary, List<Courses> courses) {
		super();
		this.employeeName = employeeName;
		this.employeeID = employeeID;
		Salary = salary;
		this.courses = courses;
	}
		
		
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeID=" + employeeID + ", Salary=" + Salary
				+ ", courses=" + courses + "]";
	}
		
	
	
	public String viewAssignedCourses(int employeeID) {
		System.out.println(".................");
		
		return "courses";
	}
	public void checkCourse(Employee emp) {
		System.out.println("Check Employee Course :"+emp.getCourses());
		
	}
	
	
}
