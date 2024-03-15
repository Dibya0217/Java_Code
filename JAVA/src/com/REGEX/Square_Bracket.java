package com.REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Square_Bracket {

	public static void main(String[] args) {
//		String s1 = "ababacbabsbabdbf";
		String s1 = "a.xbcd.t.avf.c";
//		String exp = "a[bcdef]"; // ab, ab, ac, ab, ab
		String exp = "[a-d][.][a-z]"; // a.x, d.t
		
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(s1);
		
		while(m1.find()) {
			System.out.println(m1.group());
			System.out.println(".................");
		}
	}

}
