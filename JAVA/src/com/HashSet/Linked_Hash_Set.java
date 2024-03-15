package com.HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_Hash_Set {

	public static void main(String[] args) {
		Set<Integer> s1 = new LinkedHashSet<Integer>();
		System.out.println(s1.isEmpty());
		s1.add(10);
		s1.add(10);
		s1.add(20);
		s1.add(22);
		s1.add(25);
		s1.add(28);
		System.out.println(s1.size()); // 5
		System.out.println(s1.isEmpty()); // false
		System.out.println(s1); // [10, 20, 22, 25, 28]
//		s1.clear();
//		System.out.println(s1); // []
		System.out.println(s1.contains(20)); // true
		s1.remove(20);
		System.out.println(s1.size()); // 0
		
		Iterator<Integer> itr = s1.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" "); // 10 22 25 28
		}
	}

}
