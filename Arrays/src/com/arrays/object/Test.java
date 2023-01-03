package com.arrays.object;

public class Test{
  int a;
  int b;
public Test() 
     {
		 a=10;
		 b=20;
	}
public Test(int a,int b) {
	this.a=a;
	this.b=b;
}
	public static void main(String[] args) {
	
      Test t1=new Test();
      Test t2=new Test( 50,20);
      Test t3=new Test(30,60);
      
      System.out.println(t1.add());
      System.out.println(t2.add());
      System.out.println(t3.add());
	}
	
public int add() {
return a+b;
}
}