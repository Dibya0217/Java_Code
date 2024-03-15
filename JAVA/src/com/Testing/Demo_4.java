package com.Testing;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo_4 {

	public static void main(String[] args) {
		Queue<Integer> q1 = new PriorityQueue<Integer>();
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(40);
		q1.add(50);
		q1.add(60);
		q1.add(70);
//		System.out.println(q1.remove(10));
//		System.out.println(q1.poll());
		System.out.println(q1.offer(80));
		System.out.println(q1.peek());
		System.out.println(q1.element());
		System.out.println(q1.size());
		System.out.println(q1);
	}

}
