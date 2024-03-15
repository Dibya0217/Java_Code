package com.variables;
// The variable which is declare inside the class and outside the method without using static keyword.
public class NonStatic_Variable_1 {
	int i = 10;
	int j;
	int k;
	public static void main(String[] args) {
//		System.out.println(i); // ERR Because you can't directly access the non-static variable. If you want to access the non-static variable first you want to create the object. Every time if you create the new object using new keyword the non-static variable is execute.
		NonStatic_Variable_1  n1 = new NonStatic_Variable_1(); // Object Creation
		System.out.println(n1.i);
		System.out.println(n1.j);
		n1.k = 50;
		System.out.println(n1.k);
	}
}
