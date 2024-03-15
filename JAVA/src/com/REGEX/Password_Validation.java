package com.REGEX;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password_Validation {

	public static void main(String[] args) {
		System.out.print("Enetr Password : ");
		Scanner sc = new Scanner(System.in);
		String password = sc.next();
		String ptrn = "(?=*[!@#$%])(?=*[0-9])(?=*[A-Z]){5, 10}";
		
		Pattern p = Pattern.compile(ptrn);
		Matcher m = p.matcher(password);
		System.out.println(m.matches());
		sc.close();
	}
}
