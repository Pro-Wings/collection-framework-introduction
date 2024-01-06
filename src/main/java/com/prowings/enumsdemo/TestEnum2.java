package com.prowings.enumsdemo;

import java.util.Scanner;

public class TestEnum2 {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter a shirt size : ");
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		
		System.out.println("You entered : "+input);

		Size s = Size.valueOf(input);
		
		System.out.println("The number for entered size is : "+s.getSize());
		
		System.out.println(s.calculatePrize());
	}
	
}
