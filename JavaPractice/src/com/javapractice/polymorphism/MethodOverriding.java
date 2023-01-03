package com.javapractice.polymorphism;

public class MethodOverriding {

	public void disp()
	{
		System.out.println("hello iam in parent");
	}
	
	
	public static void main(String[] args) {
		Child child=new Child();
		child.disp();
		
	}


}

class Child extends MethodOverriding
{
	public void disp()
	{
		System.out.println("hello iam in child");
	}
	
}