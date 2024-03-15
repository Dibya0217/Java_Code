package com.Strings;


public class CheckPalindrome {
	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		int i = 0, j = s.length() - 1;
		while(i < j) {
			if(s.charAt(i) != s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s1 = "RACECAR";
		
//		1st Approach
		String s2 ="";
		
		for(int i = s1.length()-1; i >= 0; i--) {
			s2+=s1.charAt(i);
		}
		if(s1.equals(s2))System.out.println(s1 + " is a Palindrome Number");
		else System.out.println(s1 + " is not a Palindrome Number");
		
//		2nd Approach
		if(isPalindrome(s1))System.out.println(s1 + " is a Palindrome Number");
		else System.out.println(s1 + " is not a Palindrome Number");
		
//		3rd Approach
		char [] ch = s1.toCharArray();
		int len = ch.length - 1;
		
		for(int i = 0; i < len/2; i++) {
			if(ch[i] != ch[len - i]) {
				System.out.println(s1 + " is not a Palindrome Number");
				return;
			}
		}
		System.out.println(s1 + " is a Palindrome Number");
	}
	
	
}
