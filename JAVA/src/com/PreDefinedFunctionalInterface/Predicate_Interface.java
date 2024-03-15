package com.PreDefinedFunctionalInterface;

import java.util.function.Predicate;

public class Predicate_Interface {

	public static void main(String[] args) {
		Predicate<Integer> a = i -> i > 10;
		System.out.println(a.test(3)); // false
		System.out.println(a.test(11)); // true
		
		Predicate<String> str = name -> name == "Dibya";
		System.out.println(str.test("Dibya")); // true
		System.out.println(str.test("Ranjan")); // false
	}

}
