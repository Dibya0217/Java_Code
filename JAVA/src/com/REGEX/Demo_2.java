package com.REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo_2 {

	public static void main(String[] args) {
		String s1 = "abnnsnnabmab";
		String exp = "ab";
		
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(s1);
		
		while(m1.find()) {
			System.out.println(m1.start());
			System.out.println(m1.end());
			System.out.println(m1.group());
			System.out.println(".................");
		}
	}
}
/*
 0
2
ab
.................
7
9
ab
.................
10
12
ab
.................
 */
