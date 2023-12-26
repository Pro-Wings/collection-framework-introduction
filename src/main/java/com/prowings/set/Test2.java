package com.prowings.set;

import java.util.HashMap;
import java.util.HashSet;

public class Test2 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();

		System.out.println(hm.put("AAA", 123));
		System.out.println(hm.put("BBB", 456));
		System.out.println(hm.put("AAA", 111));
		System.out.println(hm.put("AAA", 888));
		
		System.out.println(hm);
	}
	
}
