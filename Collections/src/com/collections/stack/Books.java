package com.collections.stack;

import java.util.Stack;

public class Books {

	public static void main(String[] args) {
	
		
		Stack<String> book=new Stack<>();
		book.push("Telugu");
		book.push("English");
		book.add("Hindi");
		book.add("Social");
		book.add("Maths");
		book.add("Physics");
		System.out.println(book);
		System.out.println("using peek method:"+book.peek());
		System.out.println("isEmpty method:"+book.isEmpty());
		System.out.println("remove the element from the stack:"+book.pop());
		System.out.println("insert element into the stack:"+book.push("java"));
		System.out.println("search element :"+book.search("Telugu"));
		
		System.out.println(book);
	
		System.out.println(book.size());

		
		

	}

}
