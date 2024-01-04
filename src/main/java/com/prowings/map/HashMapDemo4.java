package com.prowings.map;

import java.util.HashMap;

public class HashMapDemo4 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		System.out.println(hm.put("aaa", 123));
		System.out.println(hm.put("zzz", 789));
		System.out.println(hm.put(null, 456));
		System.out.println(hm.put("ccc", 123));
		System.out.println(hm.put("aaa", 456));
		System.out.println(hm.put(null, 666));
		System.out.println(hm.put("bbb", null));
		
		System.out.println(hm);
		
		System.out.println(hm.containsKey("aaa2"));
		System.out.println(hm.containsValue(12233));
		
		HashMap<String, Integer> hm2 = new HashMap<>();
		
		hm2.putAll(hm);
		
		System.out.println(hm2);
	}
	
}
