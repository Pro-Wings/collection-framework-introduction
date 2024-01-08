package com.prowings.map;

import java.util.TreeMap;

public class TreeMapDemo2 {
	
	public static void main(String[] args) {

		String s1 = "aaa";
		StringBuffer s2 = new StringBuffer("bbb");
		StringBuilder s3 = new StringBuilder("zzz");
		
		TreeMap tm = new TreeMap<>();
		tm.put(s1, 111);
		tm.put(s2, 123);
		tm.put(s3, 444);
		
		System.out.println(tm);
	}

}
