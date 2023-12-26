package com.prowings.set;

import java.util.HashMap;
import java.util.HashSet;

public class Test3 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(10, "Ram");
		Employee emp2 = new Employee(20, "Sham");
		Employee emp3 = new Employee(10, "Ram");
		
		System.out.println(emp1 == emp3);
		System.out.println(emp1.equals(emp3));
		
		
		HashSet hs = new HashSet();
		
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		
		
		System.out.println(hs);
		
	}
	
}
