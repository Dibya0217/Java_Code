package com.Strings;

public class Test_String {
	public static void main(String[] args) {
		String s1 = "Dibya Ranjana Samal";
		System.out.println(s1.indexOf('a')); // 4
		System.out.println(s1.indexOf("anj")); // 7
		System.out.println(s1.indexOf('z')); // -1
		System.out.println(s1.indexOf('a', 5)); // 7
	}
}
