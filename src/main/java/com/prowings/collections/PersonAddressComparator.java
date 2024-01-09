package com.prowings.collections;

import java.util.Comparator;

public class PersonAddressComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		return p1.getAddress().compareTo(p2.getAddress());
	}

}
