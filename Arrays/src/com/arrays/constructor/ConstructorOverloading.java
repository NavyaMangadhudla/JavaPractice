package com.arrays.constructor;

public class ConstructorOverloading {

	int id;
	String name;
	int age;
	ConstructorOverloading(int i,String n)
	{
	id=i;
	name=n;
	}
	ConstructorOverloading( int i,String n,int a)
	{
	id=i;
	name=n;
	age=a;
	}
	void display() {
		System.out.println(id+" " +name+" "+age);
	}
	
	public static void main(String[] args) {
	ConstructorOverloading cno=new ConstructorOverloading(111,"navya" );
	ConstructorOverloading cn2=new ConstructorOverloading(111,"divay",20);
	cno.display();
	cn2.display();

	}

}
