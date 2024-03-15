package com.Two_D_Arrays;

public class Print_Spiral_Matrix {

	public static int[][] spiralMatrix(int size) {
		int [][] a = new int [size][size];
		int r = 0;
		int c = -1;
		
		char dir = 'r';
		
		for(int i = 1; i <= size * size; i++) {
			switch (dir) {
			case 'r':
				c++;
				a[r][c] = i;
				if(c == size - 1 || a[r][c + 1] != 0) dir = 'd';
				break;
			case 'd':
				r++;
				a[r][c] = i;
				if(r == size - 1 || a[r + 1][c] != 0) dir = 'l';
				break;
			case 'l':
				c--;
				a[r][c] = i;
				if(c == 0 || a[r][c - 1] != 0) dir = 'u';
				break;
			case 'u':
				r--;
				a[r][c] = i;
				if(a[r - 1][c] != 0) dir = 'r';
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		int [][] c = spiralMatrix(5);
		for(int[] a : c) {
			for(int d : a) {
				System.out.print(d+"\t");
			}
			System.out.println();
		}
	}
}
/*
1	2	3	4	5	
16	17	18	19	6	
15	24	25	20	7	
14	23	22	21	8	
13	12	11	10	9
 */
