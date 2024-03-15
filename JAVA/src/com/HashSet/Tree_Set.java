package com.HashSet;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		Set<Integer> s1 = new TreeSet<Integer>();
		s1.add(50);
		s1.add(60);
		s1.add(40);
		s1.add(55);
		s1.add(45);
		s1.add(30);
		s1.add(70);
		System.out.println(s1); // [30, 40, 45, 50, 55, 60, 70]
	}

}
