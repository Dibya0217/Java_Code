package com.Testing;

public class Demo_1 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.println(arr);
		int[] arr2 = new int[arr.length*2];
		int i = 0;
		for(int j = 0; j < arr.length; j++) {
			arr2[i] = arr[j];
			i++;
		}
		for(int j = 0; j < arr.length; j++) {
			arr2[i] = arr[j];
			i++;
		}
		for(int j = 0; j < arr2.length; j++) {
			System.out.println(arr2[j]);
		}
	}
}
