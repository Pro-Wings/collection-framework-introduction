package com.prowings.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListDemo4 {
	
	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();

		al1.add("hello");
		al1.add(123);

		System.out.println(al1);

		ArrayList al2 = new ArrayList();
		
		al2.add("hello");
		al2.add(123);
		
		System.out.println(al2);
		
		System.out.println(al2.hashCode());
		System.out.println(al1.hashCode());
		
		System.out.println(al1.equals(al2));
	}

	
	
}
