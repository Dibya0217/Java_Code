package com.Strings;

public class Convert_UpperCase_Without_Inbuilt_Method {

	public static void main(String[] args) {
		String s = "dibya ranjan samal";
		char [] ch = s.toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			char ch1 = ch[i];
			if(ch1 >= 'a' && ch1 <= 'z') ch[i] = (char)(ch1 - 32);
		}
		System.out.println(ch);

	}

}
