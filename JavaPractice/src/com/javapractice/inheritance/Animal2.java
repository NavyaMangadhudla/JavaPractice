package com.javapractice.inheritance;

public class Animal2 {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.Animal();
		
		a.name="navya";
		a.age=20;
		a.breed="yadav";
	System.out.print(a.name+ '\n'+a.age+'\n'+a.breed);
		Dog dog=new Dog();
		dog.dog();
		dog.Animal();
		dog.name="divya";
		dog.color="red";
		dog.age=30;
		System.out.println(dog.name+" "+dog.color+" "+dog.age);
	    ChildDog ch=new ChildDog();
		ch.Animal();
		ch.dog();
		ch.childDog(); 
		
		ch.childDog();
		ch.age=10;
		ch.name="sony";
		System.out.println(ch.age+" "+ch.name);
	}
}


