package com.prowings.treset;

import java.util.TreeSet;

public class TestTreeSet2 {
	
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet<>();
		
		set.add(90);
		set.add(30);
		set.add(10);
		set.add(70);
		set.add(20);

		System.out.println(set);
		
		System.out.println(set.subSet(20, 70));
		System.out.println(set.first());
		System.out.println(set.last());
		
		System.out.println("sortedSet's headset() :"+set.headSet(70));
		System.out.println(set.tailSet(70));
		
		System.out.println("NavigableSet's headset() :"+set.headSet(70, true));
	}

}
