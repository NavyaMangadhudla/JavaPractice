package com.collections.arraylist;

public class EmployeeList {
	int employeeId;
	String employeeName;

	
	public String toString() {
		return "EmployeeList [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}

	public EmployeeList(int employeeId, String employeeName)
	{
        this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

}
