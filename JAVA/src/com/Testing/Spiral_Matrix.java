package com.Testing;

public class Spiral_Matrix {

	public static int[][] spiral(int size) {
		int b[][] = new int [size][size];
		int row = 0;
		int col = -1;
		char dir = 'r';
		for(int i = 1; i <= size * size; i++) {
			switch (dir) {
			case 'r':
				col++;
				b[row][col] = i;
				if(col == size - 1 || b[row][col + 1] != 0) dir = 'd';
				break;
				
			case 'd':
				row++;
				b[row][col] = i;
				if(row == size - 1 || b[row + 1][col] != 0) dir = 'l';
				break;
				
			case 'l':
				col--;
				b[row][col] = i;
				if(col == 0 || b[row][col - 1] != 0) dir = 'u';
				break;
				
			case 'u':
				row--;
				b[row][col] = i;
				if(b[row - 1][col] != 0) dir = 'r';
			}
		}
		return b;
	}
	
	public static void display(int [][] arr) {
		for(int[]b : arr) {
			for(int c : b) {
				System.out.print(c+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int [][] a = new int[5][5];
		int [][] d = spiral(a.length);
		display(d);
	}

}
