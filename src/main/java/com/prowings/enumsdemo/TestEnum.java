package com.prowings.enumsdemo;

import java.util.Scanner;

public class TestEnum {
	
	public static Days days;
	
	public TestEnum(Days days) {
		this.days = days;
	}
	
	public static void main(String[] args) {
		
		String res = dayFeelsLike(Days.SUNDAY);
		System.out.println(res);
		
		System.out.println(Days.FRIDAY.name());
		System.out.println(Days.MONDAY.ordinal());
		System.out.println(Days.MONDAY);
		String s = Days.MONDAY.toString();

		System.out.println("Please enter a day : ");
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		
		System.out.println("You entered : "+input);
		
		System.out.println(dayFeelsLike(Days.valueOf(input)));
		
		Days d = Days.valueOf("MONDAY");
		
		System.out.println(">>>>>>>>>>>>>");
		for(Days day : Days.values())
		{
			System.out.println(day);
		}
		
	}

	public static String dayFeelsLike(Days day)
	{
		String result = "";
		switch(day)
		{
		case MONDAY :
			result = "Boaring!!";
			break;
		case FRIDAY:
			result = "Exiting... Last day of week!!";
			break;
		case SATURDAY: case SUNDAY :
			result = "Weekends are best!!!";
			break;
			default:
				System.out.println();
				result = "Midweek days are so-so";
		}
		return result;
	}
}
