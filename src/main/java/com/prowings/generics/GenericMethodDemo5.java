package com.prowings.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethodDemo5 {
	
	//generic method to convert Array to List with bounded type
	public static <T extends Number> List<T> covertArrayToList(T[] arr)
	{
		List<T> lst = new ArrayList<T>();
		for(T a : arr)
			lst.add(a);
		return lst;
	}
	

	
	public static void main(String[] args) {
		
		Integer[] nums = {10,20,30,50,60};
		
		System.out.println(covertArrayToList(nums));
		
		List<Integer> result = covertArrayToList(nums);
		
		for(Integer n : result)
		{
			Integer x = n; //casting not required
		}
		
		
//		String[] words = {"aaa", "bbb", "ccc"};
//		List<String> wordList = covertArrayToList(words);
//
//		Object[] nums3 = {10.4f, 34.5f, 56.6f};
//		List<Object> numsList3 = covertArrayToList(nums3);

		Number[] nums2 = {10.4f, 34.5f, 56.6f};
		List<Number> numsList2 = covertArrayToList(nums2);
		
		System.out.println(numsList2);
	}
	
}
