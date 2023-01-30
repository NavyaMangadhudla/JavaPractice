package com.collections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListOfNames {

	public static void main(String[] args) {
		List<String> name=new ArrayList<String>();
		name.add("navya");
		name.add("divya");
		name.add("raji");
		name.add("anu");
		name.add("ram");
		for(String s:name);
		{
			System.out.println(name);
		}
		//for(int i=0;i<a1.size();i++)
		
//		//System.out.println(name.get(i));
//		ListIterator<String> itr= name.listIterator();
//		System.out.println("forward direction");
//		while(itr.hasNext()) {
//		System.out.println(itr.next());
//		}
//		System.out.println("reverse direction");
//		while(itr.hasPrevious()) {
//		System.out.println(itr.previous());
//		
		}
	}


