package com.prowings.collection.concurrency;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> myList = new CopyOnWriteArrayList<>();
		
		myList.add("Java");
		myList.add("Python");
		myList.add("C");
		myList.add(".Net");
		myList.add("JavaScript");
		
		Iterator<String> itr = myList.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			myList.add("C++");
		}
	}

}
