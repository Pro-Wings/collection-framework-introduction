package com.prowings.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList<>();
		
		ll.add(1233);
		
		ll.add("hello");
		
		ll.add(1233);

		ll.add("hii");
		ll.add(null);
		
		
		System.out.println(ll);
		
		System.out.println(ll.get(0));
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
	
		Iterator ditr = ll.descendingIterator();
		
		while(ditr.hasNext())
		{
			System.out.println(ditr.next());
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		
		Iterator itr = ll.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		
		ListIterator ltr = ll.listIterator(2);
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}

		
		
	}

}
