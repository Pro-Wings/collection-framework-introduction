package com.prowings.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo10 {
	
	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<>();
		
		myList.add("aaa");
		myList.add("zzz");
		myList.add("ddd");
		myList.add("aaa");
		myList.add("ccc");

		Collections.synchronizedList(myList);
		
		
		System.out.println("Original List : "+myList);
		
		List<String> col = myMethod(myList);
		
//		col.add("XZXZX");
		System.out.println(col.set(0,"AAA"));
		
		System.out.println(col);
	}

	public static List<String> myMethod(ArrayList<String> myList) {
		
		return Collections.unmodifiableList(myList);
//		return myList;
		
	}

}
