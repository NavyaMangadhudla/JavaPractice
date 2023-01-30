package com.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Student {
	public static void main(String arg[]) {

		List<String> test = new ArrayList<String>();
		test.add("Navya");
		test.add("raj");
		test.add("rani");
		test.add("pooja");
		test.add("sony");
		test.add(1, "divya");
		// test.clear();
		// System.out.println(test);

		List<String> test1 = new ArrayList<String>();
		test1.add("Naveen");
		test1.add("raji");
		test1.add("ran");
		test1.add("pooja");
		test1.add("sou");
		test1.add("gani");
		test1.addAll(test);// using add all method
		test1.addAll(1, test);
		System.out.println(test);
		// test1.clear();
		System.out.println(test.equals(test1));// using equals method
		test.remove(5);// using remove method
		System.out.println("wow is" + test1.lastIndexOf("pooja"));// using last index
		test1.set(5, "thara");// using for replace

		for (String s : test) {
			System.out.println("s is:"+s);
		}
		for (String s2 : test1) {
			System.out.println(s2);
		}

	}

}
