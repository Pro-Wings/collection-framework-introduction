package com.prowings.map;

import java.util.TreeMap;

public class TreeMapDemo3 {
	
	public static void main(String[] args) {

		Car c1 = new Car(1997, "AAA");
		Car c2 = new Car(2023, "ZZZ");
		Car c3 = new Car(2021, "VVV");
		
		TreeMap<Car, String> tm = new TreeMap<>();
		tm.put(c1, "Hiiii");
		tm.put(c3, "Hello");
		tm.put(c2, "HiiiiHello");
		tm.put(c1, "HiiiiiiiiiHEEEEEEEEELLLLLOOOO");
		
		System.out.println(tm);
	}

}
