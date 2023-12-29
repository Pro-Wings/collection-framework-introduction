package com.prowings.generics;

public class TestGenerics {
	
	public static void main(String[] args) {
		
		Box<Integer> b = new Box<>();
		
		b.setT(10);
		
		Box<String> b1 = new Box<>();
		b1.setT("hello");
		
		System.out.println(b.getT());
		System.out.println(b1.getT());

		System.out.println(b.getT().getClass().getName());
		System.out.println(b1.getT().getClass().getName());
		
		
		Pair<String, Integer> p = new Pair<>("Hello", 123);
		
		Pair<Integer, Integer> p1 = new Pair<>();

//		Pair<int, char> p2 = new Pair<>();  // this is not valid - as generics can not accept primitives - it only works with non-primitives.
		
		System.out.println(p.getKey());
		System.out.println(p.getValue());
		
		
		Pair<String, Box<Integer>> p3 = new Pair<>();
		
		p3.setKey("ABC");
		p3.setValue(b);
		
	}

}
