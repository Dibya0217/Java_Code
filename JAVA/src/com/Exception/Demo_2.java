package com.Exception;

import java.util.Scanner;

public class Demo_2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n;
		
		while(true) {
			String s = scanner.next();
			try {
				n = Integer.parseInt(s);
				break;
			} catch (NumberFormatException e) {
				System.out.println("!!Wrong Input PLZ Enter Number!!");
			}
 		}
		System.out.println("Number = "+n);
	}
}
//Enter a number
//y
//!!Wrong Input PLZ Enter Number!!
//u
//!!Wrong Input PLZ Enter Number!!
//7
//Number = 7
