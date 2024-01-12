package com.prowings.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CollectionsDemo11 {
	
	public static void main(String[] args) {

//		Student s = new Student(10, "Ram", "Pune");
		String s = "Hello";
		Student s1 = new Student(20, "Sham", "Mumbai");

//		List<Student> syncList = Collections.singletonList(s);
		List<String> syncList = Collections.singletonList(s);
		
		System.out.println("Synchonized List : "+syncList);
		
//		syncList.add(s1);

		s = s.concat("World");
		
		System.out.println("Synchonized List : "+syncList);
		
		//Singleton Map
		
		Map<String, Integer> syncMap = Collections.singletonMap("AAA", 123);
		
		System.out.println(syncMap);
		
		for(Map.Entry<String, Integer> entry : syncMap.entrySet())
		{
			Map.Entry<String, Integer> e = entry;
			
			entry.setValue(999);
		}
		
	}


}
