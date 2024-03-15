package com.Arrays;

public class Find_key_Using_Linear_Search {

	public static void main(String[] args) {
		int [] a = {3, 7, 9, 1, 2, 5, 6};
		System.out.println(search(a, 6));
		System.out.println(search(a, 10));
	}
	
	public static int search(int [] a, int key) {
		for(int i = 0; i < a.length; i++) {
			if(key == a[i]) return i;
		}
		return -1;
	}
}
// 6
//-1
