package com.Sorting;

import java.util.Arrays;

public class Selection_Sort {
	public static void sort(int [] a) {
		for(int i = 0; i < a.length - 1; i++) {
			int index = i;
			for(int j = i + 1; j < a.length; j++) {
				if(a[j] < a[index]) index = j;
			}
			int temp = a[i];
			a[i] = a[index];
			a[index] = temp;
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