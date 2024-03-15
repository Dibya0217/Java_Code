package com.Exception;

public class Demo_9 {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		try {
			System.out.println("Try Starts");
			int a = 10 / 0;
			System.out.println(a);
		} catch (NullPointerException e) {
			System.out.println("Exception Handled");
		}finally {
			System.out.println("Finally Executes");
		}
		System.out.println("Main Ends");
	} 
}
/*
Main Starts
Try Starts
Finally Executes
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at JAVA/com.Exception.Demo_9.main(Demo_9.java:9)
 */
