package com.Sorting;

import java.util.Arrays;

public class QuickSort {
	
	public static void sort(int [] a) {
		quickSort(a, 0, a.length - 1);
	}
	
	public static void quickSort(int [] a, int start, int end) {
		if(start >= end) return;
		int i = start, j = end;
		int pivot = a[(start + end)/2];
		while(i < j) {
			while(a[i] < pivot) i++;
			while(a[j] > pivot) j--;
			if(i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		quickSort(a, start, j);
		quickSort(a, i, end);
	}
	
	public static void main(String[] args) {
		int [] a = {9, 5, 7, 3, 4, 5, 7, 1};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}
}
/*
[9, 5, 7, 3, 4, 5, 7, 1]
[1, 3, 4, 5, 5, 7, 7, 9]
*/