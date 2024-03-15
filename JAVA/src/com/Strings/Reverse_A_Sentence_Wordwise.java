package com.Strings;

public class Reverse_A_Sentence_Wordwise {

	public static void main(String[] args) {
		String s1 = "Java Is Very Easy";
		String s = "";
		String[] s2 = s1.split(" ");
		for(int i = s2.length - 1; i >= 0; i--) {
			s+=s2[i]+" ";
		}
		System.out.println(s.trim());

	}

}
