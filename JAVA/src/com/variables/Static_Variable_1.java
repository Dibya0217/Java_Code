package com.variables;
// The variable which is declare inside the class and outside the method by using static keyword.
public class Static_Variable_1 {
	static int i = 10;
	static int j = 20;
	public static void main(String[] args) {
		System.out.println(i);
		int j = 30;
		System.out.println(j); // take local variable
		System.out.println(Static_Variable_1.j); // If you want to access the static variable then you have to put className.varName.
	}
}
