package com.PreDefinedFunctionalInterface;

import java.util.function.Function;

public class Function_Interface {

	public static void main(String[] args) {
		Function<String, Integer> a = i -> i.length();
		System.out.println(a.apply("Dibya")); // 5
	}

}
