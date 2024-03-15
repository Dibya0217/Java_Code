package com.Arrays;

import java.util.Arrays;


public class Find_key_Using_Binary_Search_Through_Recursion {

	public static void main(String[] args) {
		int [] a = {3, 7, 9, 1, 2, 5, 6};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(search(a, 6, 0, a.length - 1));
		System.out.println(search(a, 10, 0, a.length - 1));
	}
	public static int search(int [] a, int key, int start, int end) {
		if(start > end) return -1;
		
		int mid = (start + end)/2;
		if(a[mid] == key) return mid;
		else if(a[mid] > key) return search(a, key, start, mid - 1);
		else return search(a, key, mid + 1, end);
	}
}
/*
[1, 2, 3, 5, 6, 7, 9]
4
-1
 */
