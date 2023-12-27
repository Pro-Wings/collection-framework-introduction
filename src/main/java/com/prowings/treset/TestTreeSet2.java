package com.prowings.treset;

import java.util.Iterator;
import java.util.Set;
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
		
		System.out.println("NavigableSet's heigher() :"+set.higher(45));
		System.out.println("NavigableSet's lower() :"+set.lower(30));

		System.out.println("NavigableSet's ceiling() :"+set.ceiling(30));
		System.out.println("NavigableSet's floor() :"+set.floor(30));
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println(">>>>>>>>>>decending iterator<<<<<<<<<<");
		Iterator itr1 = set.descendingIterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println(">>>>>>>>>>decending set<<<<<<<<<<");
		
		Set decendingSet = set.descendingSet();
		
		System.out.println(decendingSet);
		
		System.out.println(set.pollFirst());
		
		System.out.println("After pollFirst() : "+set );

		System.out.println(set.pollLast());
		
		System.out.println("After pollLast() : "+set );
	}

	
}
