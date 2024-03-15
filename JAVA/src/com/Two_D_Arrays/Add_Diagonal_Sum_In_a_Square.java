package com.Two_D_Arrays;

public class Add_Diagonal_Sum_In_a_Square {

	public static void main(String[] args) {
		int [][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i][i];
			if(a.length % 2 != 0 && i == a.length/2)continue;
			sum += a[i][a.length - 1 - i];
		}
		System.out.println(sum);
	}
}
// 25
