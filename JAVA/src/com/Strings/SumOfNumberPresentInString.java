package com.Strings;

public class SumOfNumberPresentInString {

	public static void main(String[] args) {
		String s = "Dibya23456@Ranjan6850Samal";
		
		char[]ch = s.toCharArray();
		
		int sum = 0;
		
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] >= '0' && ch[i] <='9') {
				sum+=ch[i] - '0';
			}
		}
		System.out.println(sum);
	}
}
