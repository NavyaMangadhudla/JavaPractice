package com.arrays;

public class Helloworld {

	private static int id;
	
	public static void main(String[] argss) {
		Helloworld hw = new Helloworld();
		System.out.println("Hello World");
		id = 0;
		hw.incrementId();
		int curId = Helloworld.getId();
		System.out.println("Current Id = " + Helloworld.getId());
	}
	private void incrementId() {
		id = id + 1;
	}
	public static int getId() {
		return id;
	}
}
