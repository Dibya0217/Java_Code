package com.Strings;

public class Reverse_Every_Word_Inside_The_String {

	public static void main(String[] args) {
		String s1 = "Java Is Very Easy";
		String s2 = "";
		String[] s3 = s1.split(" ");
		for(int i = 0; i < s3.length; i++) {
			s2+=rev(s3[i])+" ";
		}
		System.out.println(s2.trim());
	}
	public static String rev(String s) {
		String reverse = "";
		for(int i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i);
		}
		return reverse;
	}

}
