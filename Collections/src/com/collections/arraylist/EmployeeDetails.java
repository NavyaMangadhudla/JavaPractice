package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class EmployeeDetails {
	public static void main(String[] args) {

		Employee data = new Employee("rani", "22/january/2000", 23, 2000.0, "Nalgonda");
		Employee data1 = new Employee("Navya", "22/january/1999", 23, 2000.0, "Hyd");
		Employee data2 = new Employee("divya", "24/january/1998", 24, 4000.0, "Nkl");
		Employee data3 = new Employee("sony", "21/january/1997", 25, 22000.0, "mlg");
		Employee data4 = new Employee("sai", "20/january/1997", 26, 20300.0, "marrur");

		List<Employee> list = new ArrayList<>();

		list.add(data);
		list.add(data1);
		list.add(data2);
		List<Employee> list1 = new ArrayList<>();
		list1.add(data3);
		list1.add(data4);
		list.addAll(3, list1);// using Add all method

		Object[] arr = new Employee[list.size()];
		arr = list.toArray();
		for (Object e : arr) {
			System.out.println(e.toString());
		}

		System.out.println(list.lastIndexOf(data2));

		// using for each loop
		for (Employee emp : list) {
			System.out.println("Name is:" + emp.getName() + '\n' + "my Age:" + emp.getAge() + '\n' + "my Salary:"
					+ emp.getSalary() + '\n' + "my Address:" + emp.getAddress());
		}

		// using for loop
		for (int emp = 0; emp < list.size(); emp++) {
			System.out.println(list.get(emp).getAge() + list.get(emp).getName() + list.get(emp).getAge()
					+ list.get(emp).getAddress());
		}
		// using while loop

		Iterator<Employee> itr = list.iterator();
		System.out.println(list.size());
		while (itr.hasNext()) {
			System.out.println(itr.next().toString());

		}
	}
}
