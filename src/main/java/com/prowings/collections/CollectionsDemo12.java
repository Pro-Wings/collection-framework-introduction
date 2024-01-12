package com.prowings.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo12 {
	
	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<>();
		
		myList.add("zzz");
		myList.add("ddd");
		myList.add("aaa");
		myList.add("ddd");
		myList.add("aaa");
		myList.add("ccc");
		myList.add("ddd");

		
		System.out.println(Collections.frequency(myList, "ddd"));

	}


}
