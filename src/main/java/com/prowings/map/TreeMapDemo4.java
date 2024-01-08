package com.prowings.map;

import java.util.TreeMap;

public class TreeMapDemo4 {
	
	public static void main(String[] args) {

		
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(333, "Hiiii");
		tm.put(555, "ZZZ");
		tm.put(111, "Hello");
		tm.put(444, "AAA");
		tm.put(555, "XXX");
		
		System.out.println(tm);
	}

}
