package com.PatternProgram;

public class Hollow_Rectangle {
	public static void main(String[] args) {
		int l = 5;
		int w = 3;
		
		for(int i = 1; i <= w; i++) {
			for(int j = 1; j <= l; j++) {
				if(i == 1 || j == 1 || i == w || j == l)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
