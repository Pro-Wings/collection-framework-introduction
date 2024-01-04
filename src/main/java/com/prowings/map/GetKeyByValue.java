package com.prowings.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GetKeyByValue {
	
	static HashMap<String, Integer> hm = new HashMap<>();
	public static void main(String[] args) {
		
		
		System.out.println(hm.put("aaa", 123));
		System.out.println(hm.put("zzz", 789));
		System.out.println(hm.put("qqq", 456));
		System.out.println(hm.put("ccc", 123));
		System.out.println(hm.put("aaa", 457));
		System.out.println(hm.put("www", 666));
		System.out.println(hm.put("bbb", 456));
		
		System.out.println(hm);

		String key = getKey(456);
		System.out.println("Key for given value is : "+key);
	}

	public static String getKey(int i) {
		
		String key = null;
		if(hm.containsValue(i)) {
			
			Set<Map.Entry<String, Integer>> entries = hm.entrySet();
			
			for(Map.Entry<String, Integer> entry : entries)
			{
				if(entry.getValue() == i)
				{
					key = entry.getKey();
					break;
				}
					
			}
		}
		else
		{
			System.out.println("Invalid Value");
		}
		return key;
			
	}

}
