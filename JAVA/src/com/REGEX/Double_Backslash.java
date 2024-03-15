package com.REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Double_Backslash {

	public static void main(String[] args) {
		String s1 = "ab.anbh%g.f";
//		String exp = "\\."; // ...
		String exp = "\\%"; // %
		
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(s1);
		
		while(m1.find()) {
			System.out.println(m1.group());
			System.out.println(".................");
		}
	}

}
