package com.prowings.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesFromArray {
	
	public static void main(String[] args) {
		
		Integer[] input = {10,20,10,30,20,40,50,40};
		
		Integer[] uniqElements = removeDuplicates(input);
		
		System.out.println(Arrays.toString(uniqElements));
	}

	public static Integer[] removeDuplicates(Integer[] input) {
		
//		List<Integer> ls = Arrays.asList(input);
//		
//		HashSet<Integer> hs = new HashSet<>(ls);
//		
//		Integer[] res = hs.toArray(new Integer[0]);
//		
//		return res;

//-------Optimize 1------------		

//		HashSet<Integer> hs = new HashSet<>(Arrays.asList(input));
//		return hs.toArray(new Integer[0]);

//-------Optimize 2------------		
		
		return new HashSet<>(Arrays.asList(input)).toArray(new Integer[0]);
		
		
	}

}
