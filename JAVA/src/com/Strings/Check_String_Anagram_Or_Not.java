package com.Strings;

public class Check_String_Anagram_Or_Not {

	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listen";
		
		boolean flag = true;
		
		while(s1.length()>0) {
			char c = s1.charAt(0);
			String s3 = s1.replace(c+"", "");
			String s4 = s2.replace(c+"", "");
			int s1Count = s1.length() - s3.length();
			int s2Count = s2.length() - s4.length();
			if(s1Count != s2Count) {
				flag = false;
				break;
			}
			s1 = s3;
			s2 = s4;
		}
		if(flag) System.out.println("Anagram");
		else System.out.println("Not Anagram");
	}

}
