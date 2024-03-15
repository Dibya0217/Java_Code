package com.Testing;

@FunctionalInterface
interface I {
	int add(int a, int b);
	
}

public class Demo_6 {
	public static void main(String[] args) {
//		int a, b;
		I i1 = (a, b) -> a + b;
		i1.add(20, 5);
	}

}
