package com.prowings.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo3 {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList<>();
		
		ll.add(1233);
		ll.add("hello");
		ll.add(1233);
		ll.add("hii");
		ll.add(null);
		
		System.out.println("Original LinkedList : "+ ll);
		
		System.out.println(ll.peek());
		System.out.println("After peek() LinkedList : "+ ll);
		
		System.out.println(ll.pop());
		System.out.println("After pop() LinkedList : "+ ll);
		
		ll.push("qqqq");
		System.out.println("After push() LinkedList : "+ ll);
		
		System.out.println(ll.poll());
		System.out.println("After poll() LinkedList : "+ ll);
	}

}
