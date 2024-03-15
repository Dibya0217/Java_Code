package com.Strings;

public class Print_All_Unique_Character {

	public static void main(String[] args) {
		String s1 = "Dibya Ranjan";
		char [] ch = s1.toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			boolean flag = true;
			for(int j = i + 1; j < ch.length; j++) {
				if(ch[i] == ch[j]) {
					ch[j] = ' ';
					flag = false;
				}
			}
			if(!flag) {
				ch[i] = ' ';
			}
		}
		for(char n : ch) {
			if(n != ' ') {
				System.out.println(n);
			}
		}
	}
}
