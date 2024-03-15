package com.REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo_1 {
	public static void main(String[] args) {
		String s1 = "ababababa";
		String exp = "ab";
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s1);
		
		int count = 0;
		while(m.find()) {
			count++;
		}
		System.out.println("exp : "+count);
	}
}
// exp : 4