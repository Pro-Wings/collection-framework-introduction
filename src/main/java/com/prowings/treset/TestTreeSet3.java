package com.prowings.treset;

import java.util.TreeSet;

public class TestTreeSet3 {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(10, "Ram", "Pune");
		Employee e2 = new Employee(20, "Sham", "Mumbai");
		Employee e3 = new Employee(30, "Sachin", "Kolhapur");
		
		TreeSet set = new TreeSet<>();
		
		set.add(e2);
		set.add(e1);
		set.add(e3);

		System.out.println(set);
		
	}

}
