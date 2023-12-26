package com.prowings.set;

import java.util.ArrayList;
import java.util.HashSet;

public class TestConverstion {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		
		al.add(100);
		al.add("AAA");
		al.add(100);
		al.add("BBB");
		al.add("AAA");

		System.out.println(al);
		
		HashSet hs = new HashSet<>(al);
		
		System.out.println(hs);
	}

}
