package com.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Demo_1 {
	public static void main(String[] args) {
		Queue<String> q1 = new ArrayDeque<String>();
		q1.add("Dibya");
		q1.add("Ranjan");
		q1.add("Samal");
		System.out.println(q1); // [Dibya, Ranjan, Samal]
		Deque<String> d1 = new ArrayDeque<String>();
		d1.add("Ranjan");
		d1.addLast("Samal");
		d1.addFirst("Dibya");
		d1.offer(" : ");
		d1.offerFirst("My name is");
		d1.offerLast("Mr. ");
		System.out.println(d1); // [My name is, Dibya, Ranjan, Samal,  : , Mr. ]
	}
}
