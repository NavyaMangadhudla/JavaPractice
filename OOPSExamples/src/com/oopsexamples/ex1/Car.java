package com.oopsexamples.ex1;

public class Car {

	public static void main(String[] args) {
		CarData car=new CarData();
		car.setCarModel("MaruthiSwift");
		car.setCarName("Maruthi");
		car.setOwner("Navya");
		
		car.setCarPrice(100000.0);
		System.out.println("*************************************");
		car.display();
		System.out.println("*************************************");
		CarData car1=new CarData();
		car1.setCarModel("MaruthiSwift");
		car1.setCarName("Maruthi");
		car1.setOwner("Navya");
		
		car1.setCarPrice(200000.0);
		System.out.println("*************************************");
		car1.display();
		System.out.println("*************************************");
		


	}

}
