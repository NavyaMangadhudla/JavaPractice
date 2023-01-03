package com.javapractice.finalkeyword;

public class Car {
	final int speedLimit=10 ;
	
	void run()	{
	 System.out.println(speedLimit);
	}
	

	public static void main(String[] args) {
		Car car=new Car();
		car.run();
		
	}

}
