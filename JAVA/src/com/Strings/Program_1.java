package com.Strings;

public class Program_1 {

	public static void main(String[] args) {
		String s = "Java Is #@ 123";
		int uc = 0;
		int lc = 0;
		int nc = 0;
		int sc = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				uc++;
			}
			else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				lc++;
			}
			else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				nc++;
			}
			else {
				sc++;
			}
		}
		System.out.println(uc);
		System.out.println(lc);
		System.out.println(nc);
		System.out.println(sc);
	}

}
