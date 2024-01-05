package com.prowings.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashmapDemo {
	
	public static void main(String[] args) {
		
		Map<String, Integer> myMap = new LinkedHashMap<>();
		
		myMap.put("aaa", 123);
		myMap.put("bbb", 111);
		myMap.put("aaa", 456);
		myMap.put("xxx", 890);
		myMap.put(null, 123);
		myMap.put("zzz", null);
		myMap.put("qqq", null);
		myMap.put(null, 999);
		
		System.out.println(myMap);
		
//		Set<Map.Entry<String, Integer>> entries = myMap.entrySet();
		
		for(Map.Entry<String, Integer> entry : myMap.entrySet())
		{
			System.out.println(entry.getKey() +"   "+entry.getValue());
		}
	}

}
