package com.Sorting;

import java.util.Arrays;

public class Bubble_Sort {

	public static void sort(int [] a) {
		for(int i = 0; i < a.length - 1; i++) {
			for(int j = 0; j <a.length - 1 - i; j++) {
				if(a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int [] a = {9, 5, 7, 3, 4, 5, 7, 1, 2};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}
}
/*
[9, 5, 7, 3, 4, 5, 7, 1, 2]
[1, 2, 3, 4, 5, 5, 7, 7, 9]
 */