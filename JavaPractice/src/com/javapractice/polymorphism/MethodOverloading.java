package com.javapractice.polymorphism;

public class MethodOverloading 
{
 static int x;
 static int y;
 static int z;
 static int add(int x,int y) {
	 return x+y;
 }

 static int add(int x,int y,int z) {
	 return x+y+z;
 }
}
