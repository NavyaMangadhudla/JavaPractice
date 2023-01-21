package com.collections.stack;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class MathOperations {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter number of elements");
		int n=Sc.nextInt();
		
		Vector<Integer> element=new Vector<Integer>();
		 int num=1;
		 for(int i=num;i<=n;i++) {
			 num=Sc.nextInt();
			 element.add(num);
			 
		 }
		
		
		element.add(30);
		element.add(20);
		element.add(40);
		element.add(30);
		element.add(70);
		element.add(80);
		element.add(90);
		int total=0;
		Double Avg;
		System.out.println(element);
		
		Collections.sort(element);//using sorting
		System.out.println("sorting numbers");
		for(Integer number :element) {
			System.out.println(number);
		}
		
		for( int i=0;i<element.size();i++) 
		{
			  total=total+element.get(i);
			  			
		}
		
		System.out.println("total is :"+total);
		 
	
		Avg=(double) (total/element.size());
	
	   System.out.println("Avg is :"+Avg);
	}

}
