package com.Strings;

public class Check_String_Panagram_Or_Not {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		str = str.toLowerCase();
		boolean flag = true;
		while(str.length()>0) {
			for(char i = 'a'; i <= 'z'; i++) {
				char c = i;
				String str2 = str.replace(c+"", "");
				int count = str.length() - str2.length();
				if(count == 0) {
					flag = false;
					break;
				}
				str = str2;
			}
		}
		if(flag) System.out.println("Panagram");
		else System.out.println("Not Panagram");
	}

}
