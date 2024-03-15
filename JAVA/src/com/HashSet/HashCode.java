package com.HashSet;

public class HashCode {
	public static void main(String[] args) {
		Integer i = 10;
		System.out.println(i.hashCode()); // 10
		String s1 = "DIBYA";
		System.out.println(s1.hashCode()); // 65040421
		String s2 = "dibya";
		System.out.println(s2.hashCode()); // 95578181
		String s3 = "xyzj";
		System.out.println(s3.hashCode()); // 95578181
		String s4 = "xyzj";
		System.out.println(s4.hashCode()); // 95578181
	}
}
