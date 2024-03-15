package com.Two_D_Arrays;

public class Multiplication_Of_Matrix {

	public static int[][] multiply(int[][]a, int[][]b) {
		int len = a.length;
		int [][] c = new int [len][len];
		
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				for(int k = 0; k < len; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		int [][] a = {{1, 2, 3}, {4, 5, 1}, {2, 1, 2}};
		int [][] b = {{3, 2, 1}, {1, 3, 2}, {2, 1, 4}};
		int [][] c = multiply(a, b);
		for(int[] e : c) {
			for(int d : e) {
				System.out.print(d+"\t");
			}
			System.out.println();
		}
	}
}
/*
11	11	17	
19	24	18	
11	9	12
 */
