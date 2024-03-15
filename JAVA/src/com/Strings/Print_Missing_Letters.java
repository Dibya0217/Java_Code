package com.Strings;

public class Print_Missing_Letters {

	public static void main(String[] args) {
		String s1 = "Dibya";
		s1 = s1.toLowerCase();
		
		for(char i = 'a'; i <= 'z'; i++) {
			if(s1.indexOf(i) == -1) {
				System.out.println(i);
			}
		}
	}

}
