package com.Strings;

public class Remove_Conjucative_Words {

	public static void main(String[] args) {
//		String s1 = "Happy Happy Birthday";
		String s1 = "Banglore Banglore City";
		
		String [] s2 = s1.split(" ");
		
		String s3 = "";
		
		for(int i = 0; i < s2.length; i++) {
			if(i == 0 || !(s2[i].equals(s2[i - 1]))) {
				s3 += s2[i]+" ";
			}
		}
		System.out.println(s3.trim());

	}

}
