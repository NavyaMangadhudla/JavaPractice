package com.arrays.controlstatements;

import java.util.Random;

public class Test1 {
       static int number;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Test1.number=new Random().nextInt();
          System.out.println(Test1.number);
	}

	public void print2() {
	System.out.println(" non-static method");
	}
}
