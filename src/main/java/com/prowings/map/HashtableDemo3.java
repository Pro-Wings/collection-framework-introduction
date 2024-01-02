package com.prowings.map;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableDemo3 {
	
	public static void main(String[] args) {
		
		Hashtable<String, Integer> hs = new Hashtable<>();
		
		hs.put("AAA", 123);
		hs.put("BBB", 123);
		hs.put("CCC", 123);
		System.out.println(hs.put("AAA", 456));
		hs.put("DDD", 123);
		
		System.out.println(hs);
		
		Set<String> keys = hs.keySet();
		
		Iterator<String> itr = keys.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println(">>>>>Entryset<<<<<<<");
		
		Set<Map.Entry<String, Integer>> entries = hs.entrySet();
		
		Iterator itr1 = entries.iterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
			
		}
		
		System.out.println(">>>>>Iterating Entryset using for-each loop<<<<<<<");
		for(Map.Entry<String, Integer> e : entries)
		{
			System.out.println("Key = " + e.getKey() +" Value = "+ e.getValue());
		}
		
		System.out.println(">>>>>>>>>> Values method<<<<<<<<");
		
		Collection<Integer> vals = hs.values();
		
		for(Integer i : vals)
		{
			System.out.println(i);
		}
	}

}
