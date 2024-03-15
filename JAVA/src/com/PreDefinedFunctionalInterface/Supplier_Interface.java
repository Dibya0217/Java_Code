package com.PreDefinedFunctionalInterface;

import java.util.function.Supplier;

public class Supplier_Interface {

	public static void main(String[] args) {
		Supplier<Double> pi = () -> Math.PI;
		System.out.println(pi.get()); // 3.141592653589793
	}

}
