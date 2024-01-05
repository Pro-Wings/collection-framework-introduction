package com.prowings.map;

import java.beans.VetoableChangeListener;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashmapDemo {
	
	public static void main(String[] args) {
		
		Car car1 = new Car(1997, "Suzuki");
		Car car2 = new Car(2020, "Maruti");
		Car car3 = new Car(1997, "Suzuki");
		Car car4 = new Car(2023, "Comet");
		Car car5 = car2;
		
		HashMap<Car, String> hm = new HashMap<>();
		hm.put(car1, "aaa");
		hm.put(car2, "bbb");
		hm.put(car3, "ccc");
		hm.put(car4, "ddd");
		hm.put(car5, "eee");
		
		System.out.println(hm);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		IdentityHashMap<Car, String> vehicles = new IdentityHashMap<>();
		
		vehicles.put(car1, "aaa");
		vehicles.put(car2, "bbb");
		vehicles.put(car3, "ccc");
		vehicles.put(car4, "ddd");
		vehicles.put(car5, "eee");
		
		System.out.println(vehicles);
		
		
	}

}
