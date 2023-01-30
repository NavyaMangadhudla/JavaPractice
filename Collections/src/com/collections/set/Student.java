package com.collections.set;

import java.util.HashSet;

public class Student {
	String Name;
	int Id;
	String DOB;
	String Address;

	Student(String Name, int Id, String DOB, String Address) {

		this.Name = Name;
		this.Id = Id;
		this.DOB = DOB;
		this.Address = Address;

	}

	public static void main(String[] args) {
		Student student1 = new Student("Navya", 1, "12-january-1998", "Nalgonda");
		Student studen2 = new Student("Divya", 2, "13-feb-1992", "Nakrekal");
		Student student3 = new Student("sony", 3, "11-may-1993", "Marrur");
		Student student4 = new Student("rani", 4, "14-june-1991", "Suryapet");

		HashSet<Student> set = new HashSet<>();
		set.add(student1);
		set.add(studen2);
		set.add(student3);
		set.add(student4);
		set.add(student4);// duplicates not allow
		
		

		for (Student student : set) {
			System.out.println(student.Name + " " + student.Id + " " + student.DOB + " " + student.Address);
		}

	}

}
