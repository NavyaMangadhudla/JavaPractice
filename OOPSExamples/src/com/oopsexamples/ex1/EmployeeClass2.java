package com.oopsexamples.ex1;

public class EmployeeClass2 {

	public static void main(String[] args) {
		EmployeeClass emp=new EmployeeClass();
		
		emp.setSalary(300);
		emp.setHour(8);
		emp.getInfo();
		System.out.println(emp.getInfo());
		System.out.println(emp.addSalary());

		System.out.println(emp.addWork());
			}
}
