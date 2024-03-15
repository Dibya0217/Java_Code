package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Demo_1 {

	public static void main(String[] args) {
		Collection<Integer> e1 = new ArrayList<Integer>();
		System.out.println(e1.isEmpty()); // true
		System.out.println(e1); // []
		e1.add(10);
		e1.add(20);
		e1.add(30);
		e1.add(40);
		System.out.println(e1.contains(40)); // true
		System.out.println(e1); // [10, 20, 30, 40]
		Collection<Integer> e2 = new ArrayList<Integer>();
		e2.add(40);
		e2.add(50);
		System.out.println(e1.containsAll(e2)); // false
		e1.addAll(e2);
		System.out.println(e1); // [10, 20, 30, 40, 40, 50]
		System.out.println(e2); // [40, 50]
		System.out.println(e1.isEmpty()); // false
		System.out.println(e1.size()); // 6
		System.out.println(e2.size()); // 2
//		e1.remove(30);
//		System.out.println(e1); // [10, 20, 40, 40, 50]
//		e1.removeAll(e2);
//		System.out.println(e1); // [10, 20, 30]
		e1.retainAll(e2);
		System.out.println(e1); // [40, 40, 50]
		Collection<Integer> e3 = new ArrayList<Integer>();
		e3.add(10);
		e3.add(20);
		e3.add(30);
		e3.add(40);
		e3.add(50);
		e3.add(60);
		e3.add(70);
		System.out.println(e3);
		Object[] arr = e3.toArray(); // [10, 20, 30, 40, 50, 60, 70]
		for(Object o : arr) {
			System.out.print(o+" "); // 10, 20, 30, 40, 50, 60, 70
		}
	}

}
