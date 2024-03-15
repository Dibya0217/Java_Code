package com.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo_1 {
	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<Integer>();
		System.out.println(s1.isEmpty()); // true
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s1.add(10);
		System.out.println(s1.size()); // 5
		System.out.println(s1.isEmpty()); // false
		System.out.println(s1); // [50, 20, 40, 10, 30]
//		s1.clear();
		System.out.println(s1); // []
		System.out.println(s1.contains(20)); // true
		s1.remove(50);
		System.out.println(s1.size()); // 0
		
		Iterator<Integer> itr = s1.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" "); // 20 40 10 30
		}
	}
}
