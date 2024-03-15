package com.Sorting;

import java.util.Arrays;

public class MergeSort {
	public static void sort(int [] a) {
		if(a.length == 1) return;
		int [] left = new int[a.length/2];
		int [] right = new int[a.length - left.length];
		
		int i;
		for(i = 0; i < left.length; i++) {
			left[i] = a[i];
		}
		for(int j = 0; j < right.length; j++) {
			right[j] = a[i];
			i++;
		}
		
		sort(left);
		sort(right);
		
		merge(left, right, a);
	}
	public static void merge(int[]left, int[]right, int[]a) {
		int i = 0, j = 0, k = 0;
		
		while(i < left.length && j < right.length) {
			if(left[i] < right[j]) a[k++] = left[i++];
			else a[k++] = right[j++];
		}
		
		while(i < left.length) a[k++] = left[i++];
		while(j < right.length) a[k++] = right[j++];
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
