package com.PatternProgram;

public class Inverted_Full_Pyramid {
	public static void main(String[] args) {
		int n = 6;
		int s = 0;
		
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= s; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			s++;
			System.out.println();
		}
	}
}
