package com.PatternProgram;

public class Full_Pyramid {
	public static void main(String[] args) {
		int n = 6;
		int s = n - 1;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= s; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			s--;
			System.out.println();
		}
	}
}
