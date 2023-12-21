package com.prowings.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListConversion2 {
	
	public static void main(String[] args) {
		
        // Creating an ArrayList of strings
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Orange");
        arrayList.add("Banana");

        // Converting ArrayList to an array of strings
        String[] stringArray = arrayList.toArray(new String[0]);
		
        System.out.println(Arrays.toString(stringArray));
        
        ArrayList<Integer> al = new ArrayList<>();
        
        al.add(123);
        al.add(456);
        al.add(789);
        
        System.out.println("Al is : "+al);
        
        Integer[] nums = al.toArray(new Integer[0]);
        
        System.out.println("Array Nums : "+Arrays.toString(nums));
        
        
	}

}
