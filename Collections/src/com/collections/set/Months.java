package com.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Months {

	public static void main(String[] args) {
		LinkedHashSet<String> set1 = new LinkedHashSet<>();
		set1.add("January");
		set1.add("February");
		set1.add("March");
		set1.add("April");
		set1.add("May");
		set1.add("January");
		// set1.add(null);// does not allow null values
		System.out.println(set1);
		Iterator<String> itr = set1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("copy all elements:" + set1.clone());
		// System.out.println(" Remove element :"+set1.remove("April"));
		System.out.println("After removing  one element in set :" + set1);
//			System.out.println(" remove all :"+set1.removeAll(set1));
//			System.out.println("after remove all :"+set1);
//			set1.clear();
//			System.out.println("clearing"+set1);
		
		
		
		TreeSet<String> tree = new TreeSet<>(set1);

		System.out.println();
		System.out.println("tree elements :" + tree);
		System.out.println(tree.descendingSet());
		System.out.println(tree.lower("May"));
		System.out.println(tree.higher("May"));
		System.out.println(tree.ceiling("January"));

	}

}
