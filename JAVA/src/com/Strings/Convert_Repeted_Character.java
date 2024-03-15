package com.Strings;

public class Convert_Repeted_Character {

	public static void main(String[] args) {
		String s1 = "Boss";
		String s2 = s1;
		while (s2.length() > 0) {
			char c = s2.charAt(0);
			String s3 = s2.replace(c+"", "");
			int count = s2.length() - s3.length();
			if(count > 1) {
				s1 = s1.replace(c+"", "$");
			}
			s2 = s3;
		}
		System.out.println(s1);
	}

}
