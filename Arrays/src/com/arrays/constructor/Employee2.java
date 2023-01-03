package com.arrays.constructor;

public class Employee2 {

	public static void main(String[] args) 
	{

		Employee emp=new Employee();
//		emp.name="vamshi";
//		String Name=emp.getName();
		System.out.println("employee name:"+emp.getName("kiran"));
//		emp.age=12;
		System.out.println("employee age:"+emp.age(12));
		System.out.println("employee rollNo:"+emp.rollNo(30));
		System.out.println("employee SchoolName:"+(emp.getName("ghs")));
		
	}

}
