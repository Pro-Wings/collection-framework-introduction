package com.prowings.collection.concurrency;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
	
	public static void main(String[] args) {
		
		CopyOnWriteArraySet<String> mySet = new CopyOnWriteArraySet<>();
		
		mySet.add("Java");
		mySet.add("Java");
		mySet.add("JavaScript");
		mySet.add(".Net");
		
		System.out.println(mySet);
		
		Iterator<String> itr = mySet.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			mySet.remove("JavaScript");
		}

		System.out.println(">>>>>>>"+mySet);
	}

}
