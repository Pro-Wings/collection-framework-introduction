package com.prowings.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo6 {
	
	public static void main(String[] args) {
		
		//Collections.binerySearch()
		
		ArrayList<String> myList = new ArrayList<>();
		
		myList.add("zzz");
		myList.add("ddd");
		myList.add("aaa");
		myList.add("ccc");
		
		System.out.println("Original List : "+myList);
		
		String minString = Collections.min(myList);
		
		System.out.println("Minimum element : "+minString);

		String maxString = Collections.max(myList);
		
		System.out.println("Maximum element : "+maxString);
	}

}
