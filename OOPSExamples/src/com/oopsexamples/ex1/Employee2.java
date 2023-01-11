package com.oopsexamples.ex1;

public class Employee2 {

	public static void main(String[] args) {
		Employee1 emp=new Employee1();
		
		emp.setSalary(300);
		emp.setHour(8);
		emp.getInfo();
		System.out.println(emp.getInfo());
		System.out.println(emp.addSalary());
		System.out.println(emp.addWork());
		
		
			}
}
