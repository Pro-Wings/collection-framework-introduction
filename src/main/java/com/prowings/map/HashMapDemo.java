package com.prowings.map;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		System.out.println(hm.put("aaa", 123));
		System.out.println(hm.put("zzz", 789));
		System.out.println(hm.put(null, 456));
		System.out.println(hm.put("ccc", 123));
		System.out.println(hm.put("aaa", 456));
		System.out.println(hm.put(null, 666));
		System.out.println(hm.put("bbb", null));
		System.out.println(hm.put("eee", null));
		System.out.println(hm.put("xxx", null));
		System.out.println(hm.put("yyy", null));
		System.out.println(hm.put("vvv", null));
		System.out.println(hm.put("rrr", null));
		System.out.println(hm.put("tttt", null));
		System.out.println(hm.put("uuuu", null));
		System.out.println(hm.put("mmmm", null));
		
		System.out.println(hm);
	}
	
}
