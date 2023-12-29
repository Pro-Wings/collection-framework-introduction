package com.prowings.generics;

public class MyClass <T> implements MyInterface<T>{

	T t;
	
	@Override
	public void m1(T t) {
		System.out.println("inside m1() - "+t.getClass().getName());
	}

	@Override
	public T m2(T t) {
		return t;
	}

}
