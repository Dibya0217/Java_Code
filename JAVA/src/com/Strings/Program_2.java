package com.Strings;

public class Program_2 {

	public static void main(String[] args) {
		String s = "Dibya@123";
		String num = "";
		String cl = "";
		String sl = "";
		String sc = "";
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				num+=s.charAt(i);
			}
			else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				cl+=s.charAt(i);
			}
			else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				sl+=s.charAt(i);
			}
			else {
				sc+=s.charAt(i);
			}
		}
		num = num + cl + sl + sc;
		System.out.println(num);
	}

}
