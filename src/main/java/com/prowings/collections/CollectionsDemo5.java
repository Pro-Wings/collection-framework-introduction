package com.prowings.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo5 {
	
	public static void main(String[] args) {
		
		//Collections.binerySearch()
		
		ArrayList<String> myList = new ArrayList<>();
		
		myList.add("zzz");
		myList.add("ddd");
		myList.add("aaa");
		myList.add("ccc");
		
		System.out.println("Original List : "+myList);
		
		ArrayList<String> myListCopy = new ArrayList<>();
		myListCopy.add("");
		myListCopy.add("");
		myListCopy.add("ZZZ");
		myListCopy.add("ZZZ");
		myListCopy.add("ZZZ");
		myListCopy.add("ZZZ");
		myListCopy.add("ZZZ");
		
		Collections.copy(myListCopy, myList);
		
		System.out.println("Copied List : "+myListCopy);
		
		
	}

}
