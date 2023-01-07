package com.oopsexamples.ex1;

public class EmployeeClass {
	private int salary;
	private int hour;
	double total;
	
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = (int) salary;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public double getInfo() {
	 total= salary*hour;
        return total;
		
	}
	public double addSalary(){
		int i=500;
		while(salary<i) {
			total=salary+50;
			i++;
		}
		return total;
	}
	public  double addWork() {
		hour=8;
		int i=6;
		while(hour>i) {
			salary= salary+10;
		 i++;
		}
		
		return salary;
	}
	
	}
