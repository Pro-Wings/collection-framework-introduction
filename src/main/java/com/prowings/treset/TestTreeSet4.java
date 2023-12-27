package com.prowings.treset;

import java.util.TreeSet;

public class TestTreeSet4 {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(10, "AAA", "Pune");
		Employee e2 = new Employee(20, "BBB", "Mumbai");
		Employee e3 = new Employee(30, "ZZZ", "Kolhapur");
		
		TreeSet set = new TreeSet<>(new EmployeeAddressComparator());
		
		set.add(e2);
		set.add(e1);
		set.add(e3);

		System.out.println(set);
		
		System.out.println(set.comparator().getClass().getName());
		
	}

}
