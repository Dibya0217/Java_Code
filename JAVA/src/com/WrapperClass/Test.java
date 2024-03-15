package com.WrapperClass;

public class Test {

	public static void main(String[] args) {
//		Integer i = new Integer(50); //Boxing before java 5
//		int j = i.intValue(); // un-boxing before java 5
//		After java 5
		Integer i = 5; // Auto Boxing
		int j = i; // auto Un-boxing
		System.out.println(j);
	}

}
