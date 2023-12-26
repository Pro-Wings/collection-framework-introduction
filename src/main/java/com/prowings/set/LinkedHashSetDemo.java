package com.prowings.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet<>();
//		HashSet lhs = new HashSet<>();
		
		lhs.add("aaa");
		lhs.add("bbb");
		lhs.add("aaa");
		lhs.add("ccc");
		lhs.add(null);
		lhs.add("ddd");
		lhs.add("ccc");
		lhs.add(null);
		
		
		System.out.println(lhs);
	}

}
