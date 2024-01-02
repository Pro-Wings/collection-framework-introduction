package com.prowings.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethodDemo4 {
	
	//generic method to convert Array to List
	public static <T> List<T> covertArrayToList(T[] arr)
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
		
		
		String[] words = {"aaa", "bbb", "ccc"};
		
		List<String> wordList = covertArrayToList(words);
		
		System.out.println(wordList);
	}
	
}
