package com.Sorting;

import java.util.Arrays;
public class Insertion_Sort {
	public static void sort(int [] a) {
		for(int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while(j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
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