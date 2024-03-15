package com.REGEX;

public class Demo_3 {

	public static void main(String[] args) {
		String s1 = "ab1c2d3";
		System.out.println(s1.replace("[0-9]", "_"));
		System.out.println(s1.replaceAll("[0-9]", "_"));
		
		String s2 = "a1bc3d";
		String[] a = s2.split("[0-9]");
		for(String str : a) {
			System.out.println(str);
		}
	}
}
/*
ab1c2d3
ab_c_d_
a
bc
d 
*/