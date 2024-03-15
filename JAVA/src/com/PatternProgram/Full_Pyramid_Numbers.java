package com.PatternProgram;

public class Full_Pyramid_Numbers {
	public static void main(String[] args) {
		int n = 5;
		int s = n - 1;
		int num = 1;
		
		for(int i = 1; i <= n; i++) {
//			Space
			for(int j = 1; j <= s; j++) {
				System.out.print(" ");
			}
			
//			Numbers
			int inc = i - 1;
			for(int j = 1; j <= num; j++) {
				if(j <= i) {
					inc++;
					System.out.print(inc);
				}
				else if(j > i) {
					inc--;
					System.out.print(inc);
				}
			}
				
			num += 2;
			s--;
			System.out.println();
		}
	}
}
