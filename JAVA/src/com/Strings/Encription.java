package com.Strings;

public class Encription {

	public static void main(String[] args) {
		String s1 = "WXYZ";
		
		char[] ch = s1.toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			int l = 4;
			char c = ch[i];
			while(l > 0) {
				if(c == 'Z') {
					l--;
					c = 'A';
				}
				else {
					c = (char)(c + 1);
					l--;
				}
			}
			System.out.println(c);
		}

	}

}
