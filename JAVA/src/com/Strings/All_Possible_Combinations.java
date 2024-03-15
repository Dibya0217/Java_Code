package com.Strings;

public class All_Possible_Combinations {

	public static void combinations(String s, int start, int end) {
		if(start == end) {
			System.out.println(s);
			return;
		}
		for(int i = start; i <= end; i++) {
			String s2 = swap(s, start, i);
			combinations(s2, start + 1, end);
		}
	}
	
	public static String swap(String s, int i,  int j) {
		char [] a = s.toCharArray();
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return new String(a);
	}
	
	public static void main(String[] args) {
		String s1 = "abcde";
		combinations(s1, 0, s1.length() - 1);
	}

}
