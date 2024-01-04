package com.prowings.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCount {
	
	public static void main(String[] args) {
		
		String line = "India is my country India have 29 states India is beautiful country";

		getWordOccurance(line);
		
	}

	public static void getWordOccurance(String line) {
		
		String[] words = line.split(" ");
		
		HashMap<String, Integer> wordCountMap = new HashMap();
		
		for(String word : words)
		{
			if(wordCountMap.containsKey(word))
			{
				int existingWordCount = wordCountMap.get(word);
				wordCountMap.put(word, existingWordCount+1);
			}
			else
				wordCountMap.put(word, 1);
		}
		
		Set<Map.Entry<String, Integer>> setOfEntries = wordCountMap.entrySet();
		
		for(Map.Entry<String, Integer> entry : setOfEntries)
		{
			System.out.println("Word : "+entry.getKey() +"  Occurance :"+entry.getValue());
		}
	}

}
