package com.Two_D_Arrays;

public class Pascal_Triangle {

	public static int[][] pascal(int size) {
		int [][] a = new int[size][];
		for(int i = 0; i < a.length; i++) {
			a[i] = new int[i + 1];
			for(int j = 0; j <= i; j++) {
				if(i == j || j == 0) a[i][j] = 1;
				else a[i][j] = a[i-1][j-1] + a[i-1][j];
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		int [][] a = pascal(5);
		
		for(int i = 0; i < a.length; i++) {
			// space
			for(int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for(int n:a[i]) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}
}
/*
    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 
 */
