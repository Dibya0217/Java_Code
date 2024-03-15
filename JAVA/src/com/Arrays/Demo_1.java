package com.Arrays;

import java.util.Arrays;

public class Demo_1 {

	public static void main(String[] args) {
		int [] a = {10, 20, 30, 40};
		m1(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void m1(int[]a) {
		for(int i = 0; i < 4; i++) {
			a[i]++;
		}
		System.out.println("M1 complete");
	}
}
/*
M1 complete
[11, 21, 31, 41]
 */
