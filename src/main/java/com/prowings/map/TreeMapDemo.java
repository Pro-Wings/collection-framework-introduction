package com.prowings.map;

import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> tm = new TreeMap<>();
		
		tm.put("zzz", 123);
		tm.put("eee", 111);
		tm.put("zzz", 444);
		tm.put("aaa", 890);
//		tm.put(null, 890);
		tm.put("aaa", null);
		tm.put("aaa1", null);
		
		System.out.println(tm);
	}

}
