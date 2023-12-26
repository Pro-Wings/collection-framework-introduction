package com.prowings.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorDemo {

	public static void main(String[] args) throws Exception {

		ArrayList al = new ArrayList();

		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");
		al.add("EEE");
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
		}
		
		System.out.println(al);
	}

}
