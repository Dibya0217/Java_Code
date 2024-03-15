package com.Strings;

public class Print_Missing_Vowels_In_Given_String {

	public static void main(String[] args) {
		String s1 = "I Hat You";
		String s2 = "aeiouAEIOU";
		
		for(int i = 0; i < s2.length(); i++) {
			if(s1.indexOf(s2.charAt(i))== -1) {
				System.out.println(s2.charAt(i));
			}
		}
	}

}
