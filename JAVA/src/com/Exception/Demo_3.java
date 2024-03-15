package com.Exception;

public class Demo_3 {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		m1();
		System.out.println("Main Ends");
	}
	public static void m1() {
		System.out.println("M1 Starts");
		try {
			System.out.println("Try Starts");
			int a = 2/0;
			System.out.println(a);
			System.out.println("Try Ends");
		} catch (ArithmeticException e) {
			System.out.println("Catch Exception");
			e.printStackTrace();
		}
		System.out.println("M1 Ends");
	}

}
//Main Starts
//M1 Starts
//Try Starts
//Catch Exception
//java.lang.ArithmeticException: / by zero
//	at JAVA/com.Exception.Demo_3.m1(Demo_3.java:14)
//	at JAVA/com.Exception.Demo_3.main(Demo_3.java:7)
//M1 Ends
//Main Ends

