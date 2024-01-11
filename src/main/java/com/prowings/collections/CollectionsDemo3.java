package com.prowings.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo3 {
	
	public static void main(String[] args) {
		
		//Collections.binerySearch()
		
		ArrayList<String> myList = new ArrayList<>();
		
		myList.add("zzz");
		myList.add("ddd");
		myList.add("aaa");
		myList.add("ccc");
		
		System.out.println("Before reverse : "+myList);
		Collections.reverse(myList);
		System.out.println("After reverse : "+myList);
		
		String reversedString = reverseGivenString("hello");
		
		System.out.println(reversedString);

	}

	public static String reverseGivenString(String input) {
		
		char[] chars = input.toCharArray();
		
		List<Character> charsList = new ArrayList<>();
		
		for(char c : chars)
			charsList.add(c);
		
		Collections.reverse(charsList);
		
		System.out.println(charsList);
		
		char[] charsArr = new char[charsList.size()];
		int index = 0;
		for(Character c : charsList)
		{
			charsArr[index] = c;
			index++;
		}
		
		return new String(charsArr);
		
	}

}
