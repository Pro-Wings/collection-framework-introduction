package com.prowings.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo2 {
	
	public static void main(String[] args) {
		
		Vector vector = new Vector<>();
		
		vector.add(123);
		vector.add("hiii");
		vector.add("hello");
		vector.add("hello");
		vector.add(123);
		vector.add(null);
		System.out.println("Original Vector : "+ vector);
		System.out.println(">>>>>>>> Enumeration <<<<<<<<");
		Enumeration emr = vector.elements();
	
		while(emr.hasMoreElements())
		{
			System.out.println(emr.nextElement());
		}
		System.out.println(">>>>>>>> Iterator <<<<<<<<");
		Iterator itr = vector.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(">>>>>>>> ListIterator <<<<<<<<");
		ListIterator ltr = vector.listIterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
	}
	

}
