package com.Strings;

public class SCP_EX_1 {

	public static void main(String[] args) {
		String s1 = new String("Dibya");
		String s2 = new String("Dibya");
		System.out.println(s1==s2); // Here s1 and s2 are two new object who stored in heap area.
		System.out.println(s1.equals(s2)); // It is override by the developer to print the value. 
		String s3 = "Ranjan";
		String s4 = "Ranjan";
		System.out.println(s3==s4); // Here s3 and s4 are create in SCP in SCP s4 store the address of s1 not create a new object.
		System.out.println(s3.equals(s4));
	}
}
/*
false
true
true
true
 */
