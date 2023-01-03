package com.arrays.constructor;

public class ConstructorPractice {
int i;
	public static void main(String[] args) {
		ConstructorPractice cp=new ConstructorPractice();
         System.out.println(cp.i);
	     }
         public ConstructorPractice() 
           {
        	 i=20;
        	 System.out.println(" costructor is called");
           }
         public ConstructorPractice(int a) 
         {
        	i=a; 
         }
         }
	
	
	
