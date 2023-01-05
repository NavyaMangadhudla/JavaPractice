package com.javapractice.javaclasses;

import java.util.Scanner;

public class JavaClasses2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int l,w,h;
	l=sc.nextInt();
	w=sc.nextInt();
	h=sc.nextInt();
		JavaClasses obj=new JavaClasses();
		obj.setLength(l);
		obj.setWidth(w);
		obj.setHeight(h);
		obj.volume();
		
		

	}
	}


