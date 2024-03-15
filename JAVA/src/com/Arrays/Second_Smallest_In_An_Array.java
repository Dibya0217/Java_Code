package com.Arrays;

public class Second_Smallest_In_An_Array {

	public static void main(String[] args) {
		int [] a = {5, 8, 2, 3, 1, 6};
		int s1 = a[0];
		int s2 = a[0];
		
		for(int i = 1; i < a.length; i++) {
			if(s1 == a[i]) continue;
			if(a[i] < s1) {
				s2 = s1;
				s1 = a[i];
			}
			else if(a[i] < s2 || s1 == s2) {
				s2 = a[i];
			}
		}
		System.out.println(s2);
	}
}
