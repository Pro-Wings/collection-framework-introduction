package com.prowings.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateHashMapWithMultipleWays {

	public static void main(String[] args) {

		HashMap<String, Integer> myMap = new HashMap<>();

		myMap.put("abc", 123);
		myMap.put("pqr", 234);
		myMap.put("abc", 789);
		myMap.put("xyz", 345);

		System.out.println(myMap);

		wayOneToIterate(myMap);
		wayTwoToIterate(myMap);
//		wayThreeToIterate(myMap);
//		wayFourToIterate(myMap);
		wayFiveToIterate(myMap);
	}

	public static void wayFiveToIterate(HashMap<String, Integer> myMap) {
		
		System.out.println("ForEach on Values()");
		
		for(Integer val : myMap.values())
		{
			System.out.println(val);
		}
		
	}

	public static void wayOneToIterate(HashMap<String, Integer> myMap) {

		// Iterater on Keyset
		System.out.println("Way 1 : Iterator on Keyset");
		Set<String> setOfKeys = myMap.keySet();

		Iterator<String> itr = setOfKeys.iterator();

		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println("Key : " + key + "  Value : " + myMap.get(key));
		}

	}

	public static void wayTwoToIterate(HashMap<String, Integer> myMap) {

		// Iterater on EntrySet
		System.out.println("Way 2 : Iterator on Entryset");
		Set<Map.Entry<String, Integer>> setOfEntries = myMap.entrySet();
		Iterator<Map.Entry<String, Integer>> itr = setOfEntries.iterator();

		while (itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			System.out.println("Key : " + entry.getKey() + "  Value : " + entry.getValue());
		}

	}

}
