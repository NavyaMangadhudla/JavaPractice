package com.collections.crudoperatuins;

import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		 Employer employer=new Employer();
		Courses Java=new Courses(101, "Java");
		Courses python=new Courses(102, "Python");
		Courses Testing=new Courses(103, "Testing");
		

        
       
        Employee employee1=new Employee("Navya",101,1000.5,List.of(Java));
        Employee employee2=new Employee("Divya",102,2000.6,null);
        Employee employee3=new Employee("Sony",103,3000.0,null);
        Employee employee4=new Employee("Mahesh",104,12000.09,null);
        
        employer.add(employee1);
        employer.add(employee2);
        employer.add(employee3);
        employer.add(employee4); 
        employer.add(employee4);
        employer.remove(employee4);
        employer.assignCourses(employee1, List.of(Java));
        System.out.println(employee1);
        employee1.checkCourse(employee1);
        		
        		
        
        
        
        
        
        
//		employer.add(new Employee("navya",101,1222.44,List.of(course1,course2)));
//		employer.add(new Employee("divya",102,1000.0,List.of(course2)));
//		employer.add(new Employee("sony",103,2000.0,List.of(course3)));
//		employer.add(new Employee("kumar",101,1300.0,null));
//		employer.add(new Employee("mahi",104,4000.0,List.of()));
//		employer.remove(new Employee("navya",101,1222.44));
//		
//		employer.updateEmployee("", 0);;
//		employer.viewAllEmployees();
//		
		
	
	
	
	
	
	}
	
}
