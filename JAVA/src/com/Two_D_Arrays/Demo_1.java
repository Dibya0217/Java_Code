package com.Two_D_Arrays;

public class Demo_1 {

	public static void main(String[] args) {
		int [][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		for(int[] b : a) {
			for(int d : b) {
				System.out.print(d+" ");
			}
			System.out.println();
		}
	}
}
/*
1 2 3 
4 5 6 
7 8 9  
 */