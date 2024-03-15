package com.PatternProgram;

public class Hollow_Inverted_Half_Pyramid {
	public static void main(String[] args) {
		int n = 5;
		
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				if(i == j || j == 1 || i == n) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
