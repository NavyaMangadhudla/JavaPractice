package com.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.collections.arraylist.Employee;

public class LibraryDetails {

	public static void main(String[] args) {
		Book book1=new Book("Mahabharat","Vysa" , 2053);
		Book book2=new Book("Ramayanam","Valmiki", 1530);
		Book book3=new Book("tikkana","andhraMahabharatam", 1530);
		Book book4=new Book("k","k", 1530);
		Book book5=new Book("h","h", 1530);
		
		 
		LinkedList <Book> library=new LinkedList<Book>();
		library.add(book1);
		library.add(book2);
		library.add(book3);
		library.add(book4);
		library.add(book5);

		System.out.println("...for each....");
		for(Book book : library)
		{
			
			System.out.println(book.getBookName()+" "+book.getauthorName()+" "+book.getBookNo());

	}
		
		Iterator<Book> itr=library.iterator() ;
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
		System.out.println("array list to array");
		Object [] arr=new Book[library.size()];
		arr=library.toArray();
		for(Object ob:arr) {
			System.out.println(ob.toString());
		}
		

	}
	}
