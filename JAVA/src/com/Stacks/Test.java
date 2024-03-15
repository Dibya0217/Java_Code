package com.Stacks;

public class Test {

	public static void main(String[] args) {
		Stack s1 = new Stack();
		System.out.println(s1.size()); // 0
		System.out.println(s1.isEmpty()); // true
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.push(60);
		s1.push(70);
		System.out.println(s1.size()); // 7
		System.out.println(s1.isEmpty()); // false
		System.out.println(s1.peek()); // 70
		System.out.println(s1.pop()); // 70
	}
}
