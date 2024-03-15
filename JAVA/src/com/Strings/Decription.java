package com.Strings;

public class Decription {

	public static void main(String[] args) {
		String s1 = "ABCD";
		
		char[] ch = s1.toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			int l = 3;
			char c = ch[i];
			while(l > 0) {
				if(c == 'A') {
					l--;
					c = 'Z';
				}
				else {
					c = (char)(c - 1);
					l--;
				}
			}
			System.out.println(c);
		}
	}

}
