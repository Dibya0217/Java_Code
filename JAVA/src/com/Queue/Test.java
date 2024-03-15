package com.Queue;

public class Test {

	public static void main(String[] args) {
		Queue q1 = new Queue();
		System.out.println(q1.size()); // 0
		System.out.println(q1.isEmpty()); // true
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(40);
		q1.add(50);
		q1.add(60);
		q1.add(70);
		System.out.println(q1.size()); // 7
		System.out.println(q1.isEmpty()); // false
		System.out.println(q1.peek()); // 10
		System.out.println(q1.poll()); // 10
	}
}
