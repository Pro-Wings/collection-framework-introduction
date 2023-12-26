package com.prowings.vector;

import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		Vector vector = new Vector<>();
		
		System.out.println("Capacity : "+vector.capacity());
		System.out.println("Size : "+vector.size());
		
		vector.add(123);
		vector.add("hiii");
		vector.add("hello");
		vector.add("hello");
		vector.add(123);
		vector.add(null);
		vector.add("hiii");
		vector.add("hiii");
		vector.add("hiii");
		vector.add("hiii");
		vector.add("hiii");
		vector.add("hiii");
		vector.add("hiii");
		vector.add("hiii");
		vector.add("hiii");
		vector.add("hiii");
		vector.add("hiii");
		vector.add("hiii");
		vector.add("hiii");
		vector.add("hiii");
		vector.add(null);
		
		System.out.println("Size : "+vector.size());
		System.out.println("Capacity : "+vector.capacity());

		
		System.out.println("Original vector : "+vector);
	}

}
