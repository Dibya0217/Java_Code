package com.Strings;

public class Maximum_Occured_Word_Without_Using_Split_Method {
	public static void main(String[] args) {
		String s = "Dibya Dibya Samal Dibya Ranjan Ranjan";
		String s2 = "";
		String [] s3 = new String[100];
		int index = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				s3[index] = s2;
				index++;
				s2 = "";
			}
			else if(s.charAt(i) == s.length() - 1) {
				s3[index] = s2;
				s2 = "";
			}
			else {
				s2 +=s.charAt(i);
			}
		}
		int max = 0;
		String s4 = "";
		for(int i = 0; i < index; i++) {
			int count = 1;
			for(int j = i + 1; j < index; j++) {
				if(s3[i].equals(s3[j])) {
					count++;
				}
			}
			if(count > max) {
				max = count;
				s4 = s3[i];
			}
		}
		System.out.println(s4 + " "+ max);
	}
}
