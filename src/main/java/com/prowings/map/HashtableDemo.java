package com.prowings.map;

import java.util.Hashtable;

public class HashtableDemo {
	
	public static void main(String[] args) {
		
		Hashtable<String, Integer> hs = new Hashtable<>();
		
		hs.put("AAA", 123);
		hs.put("BBB", 123);
		hs.put("CCC", 123);
		System.out.println(hs.put("AAA", 456));
		hs.put("DDD", 123);
		hs.put("EEE", 123);
		hs.put("QQQ", 123);
		hs.put("VVV", 123);
		hs.put("ZZZ", 123);
		hs.put("XXX", 123);

		hs.put("XXX11", 123);
		hs.put("XXX22", 123);
		hs.put("XXX33", 123);
		hs.put("XXX44", 123);
		hs.put("XXX55", 123);
		hs.put("XXX66", 123);
		hs.put("YYZZ", 123);
		hs.put("BBVV", 123);
		hs.put("BBWW", 123);
		hs.put("QQVV", 123);
		hs.put("GGVV", 123);
		
		System.out.println(hs);
	}

}
