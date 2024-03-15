package com.Testing;


public class Demo5 {
	static boolean areAnagram(String str1, String str2) {
		int i = 0;
		while(str1.length() != 0 || str2.length() != 0) {
			if(str1.length() != str2.length()) return false;
			else {
				String str3 = str1.replace(str1.charAt(i), '\u0000');
				String str4 = str2.replace(str1.charAt(i), '\u0000');
				str1 = str3;
				str2 = str4;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str1="silent";
		String str2="listen";
		if (areAnagram(str1, str2)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}

