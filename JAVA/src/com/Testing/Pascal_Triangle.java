package com.Testing;

public class Pascal_Triangle {
	public static int[][] pascal(int size) {
		int [][] a = new int [size][];
		for(int i = 0; i < a.length; i++) {
			// number
			a[i] = new int[i + 1];
			for(int j = 0; j <= i; j++) {
				if(j == 0 || i == j) {
					a[i][j] = 1;
				}
				else {
					a[i][j] = a[i-1][j-1] + a[i-1][j];
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int [][] a = pascal(4);
		for(int i = 0; i < a.length; i++) {
			// space
			for(int j = a.length - 1; j > 0; j++) {
				System.out.print("_");
			}
			for(int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
