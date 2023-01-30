package com.collections.crudoperatuins;

import java.util.ArrayList;
import java.util.List;

public class Employer {
	String employerName;
	int employerId;
	String EmailId;

	public Employer() {
		super();
		// TODO Auto-generated constructor stub
	}

	List<Employee> employeeList = new ArrayList<>();

	@Override
	public String toString() {
		return "Employer [employerName=" + employerName + ", employerId=" + employerId + ", EmailId=" + EmailId
				+ ", employeeList=" + employeeList + "]";
	}

	public void add(Employee emp) {

		employeeList.add(emp);
		System.out.println(emp.toString());

	}

	public void remove(Employee emp) {
		employeeList.remove(emp);
		System.out.println(emp.toString() + "remove");

	}

	public void updateEmployee(Employee empDetails,int empId) {
		Employee employe=new Employee();
		employe.setEmployeeName(empDetails.getEmployeeName());
		employe.setSalary(empDetails.getSalary());
		
		
		
		System.out.println("update employee"+empDetails);
	
	}

	public void viewAllEmployees() {

		employeeList.get(employerId);

	}
	public String assignCourses(Employee emp, List<Courses>course) {
		emp.setCourses(course);
		
		return "Courses"+course;
	}


	

	
}
