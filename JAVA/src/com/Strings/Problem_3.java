package com.Strings;

public class Problem_3 {

	public static void main(String[] args) {
		String s1 = "Dibya23456@Ranjan6850Samal";
		String s2 = "";
		char[]ch = s1.toCharArray();
		
		int sum = 0;
		
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] >= '0' && ch[i] <='9') {
				s2+=ch[i];
				i++;
				while(i < ch.length && ch[i] >= '0' && ch[i] <= '9') {
					s2+=ch[i];
					i++;
				}
				sum += Integer.parseInt(s2);
				s2 = "";
			}
//			else {
//				sum+=Integer.parseInt(s2);
//				s2 = "";
//			}
		}
		System.out.println(sum);
	}

}
