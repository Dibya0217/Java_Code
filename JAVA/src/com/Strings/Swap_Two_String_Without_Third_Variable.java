package com.Strings;

public class Swap_Two_String_Without_Third_Variable {

	public static void main(String[] args) {
		String s1 = "Dibya";
		String s2 = "Ranjan";
		s1 = s1 + s2;
		s2 = s1.substring(0, (s1.length() - s2.length()));
		s1 = s1.substring(s2.length())+" "+s2;
		System.out.println(s1);
	}

}
