package com.prowings.map;

import java.util.EnumMap;
import java.util.HashMap;

import com.prowings.enumsdemo.Days;
import com.prowings.enumsdemo.Size;

public class EnumMapDemo {
	
	public static void main(String[] args) {
		
		EnumMap<Days, Integer> myMap = new EnumMap<>(Days.class);
		
		myMap.put(Days.MONDAY, 1);
		myMap.put(Days.THURSDAY, 4);
		myMap.put(Days.SATURDAY, 6);
		
		System.out.println(myMap);
	
		HashMap<Size, Integer> hm = new HashMap<>();
		hm.put(Size.SMALL, 111);
		hm.put(Size.MEDIUM, 555);
		hm.put(Size.LARGE, 999);
		
		
		EnumMap<Size, Integer> myMap1 = new EnumMap<>(hm);
		System.out.println(myMap1);
		
		
		
		
	}

}
