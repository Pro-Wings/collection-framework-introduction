package com.prowings.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo2 {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList<>();
		
		ll.add(1233);
		ll.add("hello");
		ll.add(1233);
		ll.add("hii");
		ll.add(null);
		
		System.out.println("Original LinkedList : "+ ll);
		
		ll.addFirst("aaa");
		ll.addLast("zzz");
		System.out.println("LinkedList : "+ ll);
		
		System.out.println(ll.element());
		
		System.out.println(">> after element LinkedList : "+ ll);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		ll.offer("zzz111");
		System.out.println(">> after offer LinkedList : "+ ll);
	}

}
