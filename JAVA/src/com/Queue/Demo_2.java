package com.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo_2 {

	public static void main(String[] args) {
		Queue<String> q1 = new PriorityQueue<String>();
		q1.add("Dibya");
		q1.add("Ranjan");
		q1.add("Samal");
		System.out.println(q1); // [Dibya, Ranjan, Samal]
	}

}
