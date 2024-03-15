package com.Strings;

public class Occarance_Of_Each_Character_Without_Using_Replace_Method {
	public static void main(String[] args) {
		String s1 = "banana";
//		Max
		int max = 0;
		char ch2 = ' ';
		for(int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			int count = 0;
			int j = 0;
			while(j < s1.length()) {
				if(ch == s1.charAt(j)) {
					count++;
				}
				j++;
			}
			if(count > max) {
				max = count;
				ch2 = ch;
			}
		}
		System.out.println(ch2+" = "+max);
		
//		Min
		int min = s1.length();
		char ch3 = ' ';
		for(int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			int count = 0;
			int j = 0;
			while(j < s1.length()) {
				if(ch == s1.charAt(j)) {
					count++;
				}
				j++;
			}
			if(count < min) {
				min = count;
				ch3 = ch;
			}
		}
		System.out.println(ch3+" = "+min);
	}
}
