package com.prowings.generics;

public class GenericMethodDemo {

	public <T> boolean m1(T t) {
		// some logic
		System.out.println(t.getClass().getName());
		return false;
	}

	public <T extends Number> double average(T[] array) {
        double sum = 0.0;
        for (T element : array) {
            sum += element.doubleValue();
        }
        return sum / array.length;
    }
	
	
	public static void main(String[] args) {

		GenericMethodDemo obj = new GenericMethodDemo();
		obj.m1("Hello");
		
		Integer[] nums = {10,20,30,40,50};
		Long[] nums1 = {10L,20L,30L,40L,50L};
		String[] words = {"aaa","bbb","ccc"};
		
		System.out.println("Average is : "+obj.average(nums));
		System.out.println("Average is : "+obj.average(nums1));
//		System.out.println("Average is : "+obj.average(words));
	}

}
