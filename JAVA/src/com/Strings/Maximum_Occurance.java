package com.Strings;

public class Maximum_Occurance {
	public static void main(String[] args) {
		String s1 = "banana";
		int max = 0;
		char ch2 = ' ';
		while (s1.length() > 0) {
			char c = s1.charAt(0);
			String s2 = s1.replace(c+"", "");
			int count = s1.length() - s2.length();
			if(count > max) {
				max = count;
				ch2 = c;
			}
			s1 = s2;
		}
		System.out.println(ch2 +" = "+max);
	}
}
// a = 3