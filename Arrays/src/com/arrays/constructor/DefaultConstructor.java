package com.arrays.constructor;

public class DefaultConstructor {
	int id;
	String name;
	int display() {
		System.out.println(id+" "+name);
		return 1;
	}
	

	public static void main(String[] args) {
		DefaultConstructor cn1=new DefaultConstructor();
		DefaultConstructor cn2=new DefaultConstructor();
		cn1.display();
		cn2.display();

	}

}
