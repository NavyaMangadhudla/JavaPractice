package com.arrays.inheritance;

public class Animal {
void eat() {
	System.out.println("eating");
}}
class Dog extends Animal{
	void sleep() {
		System.out.println("sleeping");
	}}
	class Inheritence{
		public static void main(String[] args) {
		Dog d=new Dog();
		d.sleep();
		d.eat();

	}
	}

