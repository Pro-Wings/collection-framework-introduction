package com.prowings.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) throws Exception {
		
		ArrayList al = new ArrayList();
		
//		System.out.println("Initial Capacity : "+getCapacity(al)); //==zero
		al.add(123);
		al.add(123);
		al.add(123);
		al.add(123);
		al.add(123);
		al.add(123);
		al.add(123);
		al.add(123);
		al.add(123);
		al.add(123);
		al.add(123);
		System.out.println("Initial Capacity : "+getCapacity(al)); //==Ten
		System.out.println("Size : "+al.size());
		
		
	}

	
	  public static int getCapacity(ArrayList<?> l) throws Exception {
	        Field dataField = ArrayList.class.getDeclaredField("elementData");
	        dataField.setAccessible(true);
	        return ((Object[]) dataField.get(l)).length;
	    }
	
}
