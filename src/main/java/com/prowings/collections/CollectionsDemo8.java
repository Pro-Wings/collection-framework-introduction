package com.prowings.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo8 {
	
	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<>();
		
		myList.add("aaa");
		myList.add("zzz");
		myList.add("ddd");
		myList.add("aaa");
		myList.add("ccc");
		myList.add("aaa");
		
		System.out.println("Original List : "+myList);
		
		if(Collections.replaceAll(myList, "aaa", "xxx"))
				System.out.println("After ReplaceAll : "+myList);
		else
			System.out.println("No element found for replace!!");

	}

}
