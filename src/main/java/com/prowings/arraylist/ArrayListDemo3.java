package com.prowings.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListDemo3 {
	
	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();
		
		System.out.println(">> empty " +al1.isEmpty());
		
		al1.add("hello");
		al1.add(123);
		System.out.println(al1.add("hii"));

		System.out.println(al1);
		System.out.println(">> empty " +al1.isEmpty());
		
		ArrayList al2 = new ArrayList();
		
		al2.addAll(al1); //conversion method
		al2.add(345);
		al2.add(456);
		System.out.println(al2);
		
		System.out.println(al2.remove("hi"));
		
//		al2.removeAll(al1);
//		al2.retainAll(al1);
		
		System.out.println(al2.contains("hellooo"));
		System.out.println(al2.containsAll(al1));
		
		System.out.println(al2);
		
		al2.clear();

		System.out.println("After clear : "+al2);
		
		System.out.println();
	}

	
	
}
