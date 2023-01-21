package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class EmployeeData {
	
	    public  void Employee(String Name,String DOB,int Age,double Salary,String address) {
    	System.out.println("my name is:"+Name+'\n'+"my DOB IS:"+DOB+'\n'+"my age :"+Age+'\n'+"Salary :"+Salary+'\n'+"address:"+address);
    	
    }
    public static void main(String args[]) {

    	EmployeeData data=new EmployeeData();
    	data.Employee("Navya", "22/january/2023", 23, 2000.0,"Nalgonda");
    	List <Object>list=  new ArrayList<>(); 
    	list.add("Navya");
    	list.add("22/jaunary/2023");
    	list.add(25);
    	list.add(20000);
    	list.add("nalgonda");
    	System.out.println(list);
    	
    }
    

}
