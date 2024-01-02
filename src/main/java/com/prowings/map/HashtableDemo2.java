package com.prowings.map;

import java.util.Hashtable;

public class HashtableDemo2 {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(10, "Ram");
		Student s2 = new Student(10, "Ram");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Hashtable<Student, String> hs = new Hashtable<>();
		
		hs.put(s1, "asdfg");
		hs.put(s2, "zxcvb");

		System.out.println(hs);
	}

}
