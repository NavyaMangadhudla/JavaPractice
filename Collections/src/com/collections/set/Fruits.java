package com.collections.set;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Fruits {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("mango");
		queue.add("banana");
		queue.add("Orange");
		queue.add("Apple");
		queue.add("Guava");
		queue.add("Apple");//duplicates allow
		//queue.add(null); does not allow null value
		System.out.println(queue);//does not follow order
		System.out.println("iterating the queue elements");
		Iterator<String> itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(queue.peek());
		System.out.println(queue.element());
		queue.remove("Guava");
		System.out.println("removing one element : " + queue);
		queue.poll();
		System.out.println("after using poll(delete) method:" + queue);

		Deque<String> fruit = new ArrayDeque<>();
		fruit.add("mango");
		fruit.add("banana");
		fruit.add("Orange");
		fruit.add("Apple");
		fruit.add("Guava");
		fruit.add("mango");
		System.out.println(fruit);// follow order
		System.out.println("add one element in last:" + fruit.offer("lemon"));
		System.out.println(fruit);
		System.out.println(" first element in the set:" + fruit.element());
		System.out.println(fruit.getFirst());
		System.out.println("first element in the set:" + fruit.peekFirst());
		System.out.println(fruit.peekLast());

	}

}
