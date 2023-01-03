package com.javapractice.instance;

public class Auto {
	
	int speed;
	Auto() {
		System.out.println("Iam auto"+speed);
	}
	{
speed=30;
}
public static void main(String args[]) {
	Auto auto=new Auto();
	
}

}