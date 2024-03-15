package com.Strings;

public class Count_Words {

	public static void main(String[] args) {
		String s1 = "Dibya Ranjan Samla";
		int count = 1;
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == ' ' && s1.charAt(i + 1) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
