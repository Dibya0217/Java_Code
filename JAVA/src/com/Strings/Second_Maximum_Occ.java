package com.Strings;

public class Second_Maximum_Occ {

	public static void main(String[] args) {
		String s1 = "Diyybbyyaaaa";
		String s2 = "";
		int max1 = 0;
		int max2 = 0;
		char ch1 = ' ';
		char ch2 = ' ';
		for(int i = 0; i < s1.length(); i++) {
			if(s2.indexOf(s1.charAt(i)) == -1) {
				int count = 1;
				for(int j = i + 1; j < s1.length(); j++) {
					if(s1.charAt(i) == s1.charAt(j)) {
						count++;
					}
				}
				s2+= s1.charAt(i);
				if(count >= max1) {
					max2 = max1;
					max1 = count;
					ch2=ch1;
					ch1 = s1.charAt(i);
				}
				else if(count > max2) {
					max2 = count;
					ch2 = s1.charAt(i);
				}
			}
		}
		System.out.println(ch2+" = "+max2);
		System.out.println(ch1+" = "+max1);
		System.out.println(s2);
		
		
		
//		2nd Approach
//		String s1 = "Dibbbbyyaaa";
//		int max1 = 0;
//		int max2 = 0;
//		char ch1 = ' ';
//		char ch2 = ' ';
//		for(int i = 0; i < s1.length(); i++) {
//			int count = 1;
//			for(int j = i + 1; j < s1.length(); j++) {
//				if(s1.charAt(i) == s1.charAt(j)) {
//					count++;
//				}
//			}
//			if(count > max1) {
//				max1 = count;
//				ch1 = s1.charAt(i);
//			}
//		}
//		for(int i = 0; i < s1.length(); i++) {
//			int count = 1;
//			for(int j = i + 1; j < s1.length(); j++) {
//				if(s1.charAt(i) == s1.charAt(j) && s1.charAt(i) != ch1) {
//					count++;
//				}
//			}
//			if(count > max2) {
//				max2 = count;
//				ch2 = s1.charAt(i);
//			}
//		} 
//		System.out.println(ch2+" = "+max2);
////		System.out.println(ch1+" = "+max1);
////		System.out.println(s2);
		
	}

}
