package com.prowings.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethodDemo6 {
	//lower bound
	public static void printList(List<? super Number> list) {
	    for (Object elem : list)
	        System.out.println(elem + " ");
	    System.out.println();
	}

	//upper bound
	public static void printList2(List<? extends Number> list) {
		for (Object elem : list)
			System.out.println(elem + " ");
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		List<Object> lst1 = new ArrayList<Object>();
		lst1.add("aaa");
		lst1.add(null);
		lst1.add(123);

		printList(lst1);
		
		List<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(456);
		lst2.add(null);
		lst2.add(123);
		
//		printList(lst2);
		
		
	}
}
