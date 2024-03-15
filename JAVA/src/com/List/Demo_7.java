package com.List;

import java.util.List;
import java.util.Stack;

public class Demo_7 {
	public static void main(String[] args) {
		List<String> name = new Stack<String>();
		name.add("Dibya");
		name.add("Ranjan");
		name.add("Samal");
		name.add("Babu");
		System.out.println(name); // [Dibya, Ranjan, Samal, Babu]
		name.set(3, "xyz");
		System.out.println(name); // [Dibya, Ranjan, Samal, xyz]
		System.out.println(name.get(3)); // xyz
		System.out.println(name.remove(3)); // xyz
		System.out.println(name); // [Dibya, Ranjan, Samal]
		System.out.println(name.indexOf("Samal")); // 2
	}
}
