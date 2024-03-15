package com.PreDefinedFunctionalInterface;

import java.util.function.Consumer;

public class Consumer_Interface {

	public static void main(String[] args) {
		Consumer<Integer> a = i -> System.out.println(i); // 20
		a.accept(20);
		
		Consumer<String> str = name -> System.out.println(name); // Dibya
		str.accept("Dibya");
	}

}
