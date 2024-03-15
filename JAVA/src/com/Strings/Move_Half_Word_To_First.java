package com.Strings;

public class Move_Half_Word_To_First {

	public static void main(String[] args) {
		String s1 = "father";
		String s2 = s1.substring(0, (s1.length()/2));
		String s3 = s1.substring((s1.length()/2), s1.length());
		System.out.println(s3+s2);
	}

}
