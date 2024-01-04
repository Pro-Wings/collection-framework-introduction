package com.prowings.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortGivenHashMap {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		System.out.println(hm.put("zzz", 10));
		System.out.println(hm.put("aaa", 30));
		System.out.println(hm.put("bbb", 70));
		System.out.println(hm.put("ccc", 20));
		System.out.println(hm.put("aaa", 50));
		
		System.out.println(hm);

		sortByKeys(hm);
		sortByValues(hm);
	}

	public static void sortByValues(HashMap<String, Integer> hm) {
		
		
		
	}

	public static void sortByKeys(HashMap<String, Integer> hm) {
		
		TreeMap<String, Integer> sortedMap = new TreeMap<>(hm);
		
		for(Map.Entry<String, Integer> entry : sortedMap.entrySet())
		{
			System.out.println(entry.getKey() +"  "+entry.getValue());
		}
	
			
	}

}
