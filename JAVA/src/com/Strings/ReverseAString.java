package com.Strings;

public class ReverseAString {

	public static void main(String[] args) {
		String name = "DIBYA";
		
//		1st Approach
		String revString = "";
		for (int i = name.length()-1; i >= 0; i--) {
			revString+=name.charAt(i);
		}
		System.out.println(revString);
		
		
//		2nd Approach
		char [] ch = name.toCharArray();
		for (int i = 0; i < ch.length/2; i++) {
			char temp = ch[i];
			ch[i] = ch[ch.length - i - 1];
			ch[ch.length - i - 1] = temp;
		}
		System.out.println(ch);

	}

}
