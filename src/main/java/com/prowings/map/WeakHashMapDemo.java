package com.prowings.map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	
	public static void main(String[] args) {

		Car car1 = new Car(1997, "Suzuki");
		Car car2 = new Car(2020, "Maruti");
		Car car3 = new Car(1997, "Suzuki");
		Car car4 = new Car(2023, "Comet");
		Car car5 = car2;
		
		WeakHashMap<Car, String> myMap = new WeakHashMap<>();
		
		myMap.put(car1, "aaa");
		myMap.put(car2, "bbb");
		myMap.put(car3, "ccc");
		myMap.put(car4, "ddd");
		myMap.put(car5, "eee");

		System.out.println("before GC WeakHashMap : "+myMap);
		
		car4 = null;
		
//		System.gc();
		
		System.out.println("after GC WeakHashMap : "+myMap);
		
		
	}

}
