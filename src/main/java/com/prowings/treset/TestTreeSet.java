package com.prowings.treset;

import java.util.TreeSet;

public class TestTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet<>();

		String s1 = "AAA";
		String s12 = "QQQ";
		String s13 = "ZZZ";

		StringBuffer s2 = new StringBuffer("BBB");
		StringBuilder s3 = new StringBuilder("CCC");
		
//		set.add(s2);
//		set.add(s1);
//		set.add(s3);

		set.add(s13);
		set.add(s12);
		set.add(s1);
		set.add(s12);
		set.add(null);

		
		
		
		System.out.println(set);
	}

}
