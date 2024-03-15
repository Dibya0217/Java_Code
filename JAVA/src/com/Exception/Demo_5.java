package com.Exception;

public class Demo_5 {

	public static void fun() {
		System.out.println("Fun Starts");
		throw new ArithmeticException();
	}
	
	public static void main(String[] args) {
		fun();
	}

}
/*
Fun Starts
Exception in thread "main" java.lang.ArithmeticException
	at JAVA/com.Exception.Demo_5.fun(Demo_5.java:7)
	at JAVA/com.Exception.Demo_5.main(Demo_5.java:11)

*/
