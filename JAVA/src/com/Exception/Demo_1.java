package com.Exception;

public class Demo_1 {

	public static void main(String[] args) {
		int a = 10, b = 0, c;
		try {
			System.out.println("Try Starts");
			c = a/b;
			System.out.println("Try Ends");
		} catch (ArithmeticException e) {
			System.out.println("Catch Executed");
			c = a/2;
		}
		System.out.println(c);
	}

}
// Try Starts
// Catch Executed
// 5