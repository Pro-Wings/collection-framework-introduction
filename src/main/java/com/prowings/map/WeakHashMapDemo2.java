package com.prowings.map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo2 {
	
	public static void main(String[] args) {

		Car car1 = new Car(1997, "Suzuki");
		Car car2 = new Car(2020, "Maruti");
		Car car3 = new Car(1997, "Suzuki");
		Car car4 = new Car(2023, "Comet");
		Car car5 = car2;
		
		HashMap<Car, String> myMap1 = new HashMap<>();
		myMap1.put(car1, "aaa");
		myMap1.put(car2, "bbb");
		myMap1.put(car3, "ccc");
		myMap1.put(car4, "ddd");
		myMap1.put(car5, "eee");

		System.out.println("before GC HashMap : "+myMap1);
		
		car4 = null;
		
		System.gc();
		
		System.out.println("after GC HashMap: "+myMap1);
		
		
	}

}
