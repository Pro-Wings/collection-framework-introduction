package com.prowings.vector;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator {
	
	public static void main(String[] args) {
		
		
		Map<String, Integer> map = new ConcurrentHashMap();
		map.put("A", 1);
		map.put("B", 2);
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
		    Map.Entry<String, Integer> entry = iterator.next();
		    System.out.println(entry.getKey() + ": " + entry.getValue());
		    map.put("C", 3); // No ConcurrentModificationException will be thrown
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		
		List list = new CopyOnWriteArrayList<>();
		
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		list.add("DDD");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			list.add("ZZZ");
		}
		
		System.out.println(list);
	}

}
