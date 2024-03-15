package com.Strings;

public class Find_Length_Without_Using_Length_Method {
	public static void main(String[] args) {
		String s1 = "Dibya";
		int i = 0;
		for(char ch : s1.toCharArray()) {
			System.out.println(ch);
			i++;
		}
		System.out.println(i);
	}
}
