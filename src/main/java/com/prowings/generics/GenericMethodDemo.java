package com.prowings.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethodDemo {
	
	//non generic method to convert Array to List
	public static List covertArrayToList(int[] arr)
	{
		List lst = new ArrayList();
		for(int a : arr)
			lst.add(a);
		return lst;
	}
	

	
	public static void main(String[] args) {
		
		int[] nums = {10,20,30,50,60};
		
		System.out.println(covertArrayToList(nums));
		
		List result = covertArrayToList(nums);
		
		for(Object n : result)
		{
			Integer x = (Integer) n; //casting - error prone
		}
	}
	
}
