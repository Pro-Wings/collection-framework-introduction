package com.prowings.set;

import java.util.HashMap;
import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		System.out.println(hs.add("AAA"));
		System.out.println(hs.add("BBB"));
		System.out.println(hs.add("CCC"));
		System.out.println(hs.add("AAA"));
		System.out.println(hs.add(null));
		System.out.println(hs.add(null));

		System.out.println(hs);
		
		
		HashMap<String, Integer> hm = new HashMap<>();
		System.out.println(hm.put("AAA", 123));
		
	}
	
}
