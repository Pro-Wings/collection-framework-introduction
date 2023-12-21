package com.prowings.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo6 {
	
	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();

		al1.add("hello");
		al1.add(123);
		al1.add("hii");
		al1.add(123);
		al1.add(2);
		
		Integer x = 2;
		//List methods
		
		System.out.println(al1.get(0));
		
//		al1.set(0, "Hiiiii");
		
		al1.add(2,"zzzz");
		System.out.println(al1);

		al1.remove(x);
		System.out.println("after remove : "+al1);
		
		System.out.println(al1.lastIndexOf(123));
		
	}

	
	
}
