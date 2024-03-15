package com.Strings;

public class FindAllThePossiblePalindrome {
	
	public static boolean isPalindrome(String s, int start, int end) {
		int i = start, j = end;
		while(i < j) {
			if(s.charAt(i) != s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s1 = "BANANA";
//		1st Approach
		for(int i = 0; i <= s1.length()-1; i++) {
			for(int j = i + 2; j <= s1.length(); j++) {
				String s2 = s1.substring(i, j);
				if(CheckPalindrome.isPalindrome(s2))System.out.println(s2);
			}
		}
		
		
		
		
		
//		2st Approach
		for(int i = 0; i <= s1.length()-1; i++) {
			for(int j = i + 1; j < s1.length(); j++) {
				if(isPalindrome(s1, i, j))System.out.println(s1.substring(i, j+1));
			}
		}
	}

}
