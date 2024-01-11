package com.prowings.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo4 {
	
	public static void main(String[] args) {
		
		//Collections.binerySearch()
		
		ArrayList<String> myList = new ArrayList<>();
		
		myList.add("zzz");
		myList.add("ddd");
		myList.add("aaa");
		myList.add("ccc");
		
		System.out.println("Before shuffle : "+myList);
		Collections.shuffle(myList);
		System.out.println("After shuffle : "+myList);
		
		System.out.println("Before swap : "+myList);
		
		Collections.swap(myList, 0, 3);
		System.out.println("After swap : "+myList);
		
		Collections.fill(myList, "XXX");
		System.out.println("After fill : "+myList);
	}

}
