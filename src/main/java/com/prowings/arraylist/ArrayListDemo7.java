package com.prowings.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo7 {
	
	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();

		al1.add("hello");
		al1.add(123);
		al1.add("hii");
		al1.add(123);
		al1.add(2);
		
		System.out.println(al1);
		
		List al2 = al1.subList(2, 4);
		
		System.out.println(al2);
		
		al1.remove("hii");

		System.out.println(al1);
		
	}

	
	
}
