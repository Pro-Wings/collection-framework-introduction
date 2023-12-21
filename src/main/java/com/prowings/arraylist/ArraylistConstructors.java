package com.prowings.arraylist;

import java.util.ArrayList;
import java.util.HashSet;

public class ArraylistConstructors {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		
		System.out.println("ArrayList al : "+al);
		
		HashSet hs = new HashSet(al);
		
		System.out.println(hs);
		
		ArrayList al2 = new ArrayList(hs);
		System.out.println(al2);
		
	}

}
