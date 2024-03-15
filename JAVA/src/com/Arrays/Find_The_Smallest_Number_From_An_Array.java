package com.Arrays;

public class Find_The_Smallest_Number_From_An_Array {
	public static void main(String[] args) {
		int[] a = {5, 8, 2, 3, 1, 6};
		int small = a[0];
		
		for(int i = 1; i < a.length; i++) {
			if(small > a[i]) {
				small = a[i];
			}
		}
		System.out.println(small);
	}
}
// 1