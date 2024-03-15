package com.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;

public class Demo_3 {

	public static void main(String[] args) {
		Queue<String> q1 = new LinkedList<String>();
		q1.add("Dibya");
		q1.add("Ranjan");
		q1.add("Samal");
		System.out.println(q1); // [Dibya, Ranjan, Samal]
		Deque<String> d1 = new LinkedList<String>();
		d1.add("Ranjan");
		d1.addLast("Samal");
		d1.addFirst("Dibya");
		d1.offer(" : ");
		d1.offerFirst("My name is");
		d1.offerLast("Mr. ");
		System.out.println(d1); // [My name is, Dibya, Ranjan, Samal,  : , Mr. ]
	}

}
