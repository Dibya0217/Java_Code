package com.Arrays;

import java.util.Arrays;

public class Find_key_Using_Binary_Search {

	public static void main(String[] args) {
		int [] a = {3, 7, 9, 1, 2, 5, 6};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(search(a, 6));
		System.out.println(search(a, 10));
	}
	
	public static int search(int [] a, int key) {
		int start = 0;
		int end = a.length - 1;
		while(start <= end) {
			int mid = (start + end)/2;
			if(a[mid] == key) {
				return mid;
			}
			else if(a[mid] > key) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
/*
[1, 2, 3, 5, 6, 7, 9]
4
-1
 */
