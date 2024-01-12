package com.prowings.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo9 {
	
	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<>();
		
		myList.add("aaa");
		myList.add("zzz");
		myList.add("ddd");
		myList.add("aaa");
		myList.add("ccc");
		myList.add("aaa");
		myList.add("zzz");
		myList.add("ddd");
		myList.add("aaa");
		myList.add("ccc");
		myList.add("aaa");
		
		ArrayList<String> targetList = new ArrayList<>();
		targetList.add("aaa");
		targetList.add("ccc");
		targetList.add("aaa");

		System.out.println("Original List : "+myList);
		System.out.println("Target List : "+targetList);
		
//		int index = Collections.indexOfSubList(myList, targetList);
		int index = Collections.lastIndexOfSubList(myList, targetList);
		
		if(index >= 0)
			System.out.println("Target List presrent in SourceList at index : "+ index);
		else
			System.out.println("Target List is not present in Source List!!");
	}

}
