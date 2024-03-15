package com.Arrays;

import java.util.Arrays;

public class Demo_4 {
	public static void main(String[] args) {
		String[]arr = {"banana", "apple", "papaya", "orange", "mango"};
		Arrays.sort(arr);
		for(String str : arr) {
			System.out.println(str);
		}
	}
}
/*
apple
banana
mango
orange
papaya
 */
