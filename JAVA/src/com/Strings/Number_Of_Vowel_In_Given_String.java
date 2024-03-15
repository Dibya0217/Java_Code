package com.Strings;

public class Number_Of_Vowel_In_Given_String {

	public static void main(String[] args) {
		String s = "Dibya Ranjan Samal";
		char [] ch = s.toCharArray();
		int count = 0;
		for(int i = 0; i < ch.length; i++) {
			char ch1 = ch[i];
			if(ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U' || ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
				count++;
			}
		}
		System.out.println(count);
	}

}
