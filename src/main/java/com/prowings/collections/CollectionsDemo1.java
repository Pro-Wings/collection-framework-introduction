package com.prowings.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo1 {
	
	public static void main(String[] args) {
		
		//Collections.sort()
		
		ArrayList<String> myList = new ArrayList<>();
		
		myList.add("zzz");
		myList.add("ddd");
		myList.add("aaa");
		myList.add("ccc");
		
		System.out.println("Before sorting : "+myList);
		
		Collections.sort(myList);
		
		System.out.println("After sorting : "+myList);
		
		Student s1 = new Student(10, "aaa", "pune");
		Student s2 = new Student(30, "ccc", "kolhapur");
		Student s3 = new Student(60, "xxx", "mumbai");
		
		Student[] stdArr = {s3,s1,s2};
		
		List<Student> stdList = Arrays.asList(stdArr);

		System.out.println("Before sorting : "+stdList);
		Collections.sort(stdList);
		System.out.println("After sorting : "+stdList);
		
		Person p1 = new Person("aaa", "mumbai");
		Person p2 = new Person("bbb", "dubai");
		Person p3 = new Person("ccc", "chennai");
		
		LinkedList<Person> personList = new LinkedList<>();
		
		personList.add(p3);
		personList.add(p1);
		personList.add(p2);
		
		System.out.println("Before sorting by name : "+personList);
		Collections.sort(personList, new PersonNameComparator());
		System.out.println("After sorting by name : "+personList);

		System.out.println("Before sorting by address : "+personList);
		Collections.sort(personList, new PersonAddressComparator());
		System.out.println("After sorting by address: "+personList);
	}

}
