package com.prowings.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo5 {
	
	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();

		al1.add("hello");
		al1.add(123);
		al1.add("hii");
		al1.add(123);
		
		
		Iterator itr = al1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
		
		ListIterator ltr = al1.listIterator(3);
		
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
	}

	
	
}
