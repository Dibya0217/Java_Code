package com.Exception;

public class Demo_4 {

	public static void main(String[] args) {
		System.out.println("Main starts");
		m1();
		System.out.println("Main Ends");
	}
	public static void m1() {
		System.out.println("M1 starts");
		m2();
		System.out.println("M1 Ends");
	}
	public static void m2() {
		System.out.println("M2 starts");
		try {
			m3();
		} catch (ArithmeticException e) {
			System.out.println("Exception Handeled in M2");
		}
		System.out.println("M2 Ends");
	}
	public static void m3() {
		System.out.println("M3 starts");
		int a = 2/0;
		System.out.println(a);
		System.out.println("M3 Ends");
	}

}
