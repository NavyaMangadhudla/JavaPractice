package com.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Department {
	String departmentName;
	int departmentId;
	List<EmployeeList> employee;

	public Department(String departmentName, int departmentId, List<EmployeeList> employee)
	{
        this.departmentName = departmentName;
		this.departmentId = departmentId;
		this.employee = employee;
	}

	public String toString() 
	{
		return "Department [departmentName=" + departmentName + ", departmentId=" + departmentId + ", employee="
				+ employee + "]";
	}

	public static void main(String[] args) {
		EmployeeList employee1 = new EmployeeList(101, "Navya");
		EmployeeList employee2 = new EmployeeList(103, "divya");
		EmployeeList employee3 = new EmployeeList(104, "rani");
		EmployeeList employee4 = new EmployeeList(105, "sony");
		EmployeeList employee5 = new EmployeeList(106, "mahesh");

		List<EmployeeList> list = new ArrayList<>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);

		Department department1 = new Department("Telugu", 201, List.of(employee1, employee3));
		Department department2 = new Department("English", 203, List.of(employee2));
		Department department3 = new Department("Social", 204, List.of(employee3, employee4));
		Department department4 = new Department("Maths", 204, List.of(employee4));
		Department department5 = new Department("Hindi", 204, List.of(employee5));

		List<Department> department = new ArrayList<>();
		department.add(department1);
		department.add(department2);
		department.add(department3);
		department.add(department4);
		department.add(department5);

		// System.out.println(department);
		for (Department dep : department) {
			System.out.println(dep.toString());
		}

	}
}
