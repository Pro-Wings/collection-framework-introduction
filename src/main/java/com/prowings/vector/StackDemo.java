package com.prowings.vector;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.push("AA");
		stack.push("BB");
		stack.push("CC");
		stack.push("DD");
		stack.push("EE");
		
		System.out.println(stack);
		
		System.out.println("Top Element : "+stack.pop());
		System.out.println("After POP : "+stack);

		System.out.println("Top Element : "+stack.peek());
		System.out.println("After PEEK : "+stack);
		
		System.out.println(stack.empty());
		
		System.out.println(stack.search("AAA"));
	}

}
