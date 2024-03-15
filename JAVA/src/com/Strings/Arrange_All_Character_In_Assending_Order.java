package com.Strings;

public class Arrange_All_Character_In_Assending_Order {

	public static void main(String[] args) {
		String s1 = "Dibya";
		s1 = s1.toLowerCase();
		char[] s2 = s1.toCharArray();
		
		for(int i = 0; i < s2.length; i++) {
			for(int j = i + 1; j < s2.length; j++) {
				if(s2[i] > s2[j]) {
					char temp = s2[i];
					s2[i] = s2[j];
					s2[j] = temp;
				}
			}
		}
		System.out.println(s2);
	}

}
