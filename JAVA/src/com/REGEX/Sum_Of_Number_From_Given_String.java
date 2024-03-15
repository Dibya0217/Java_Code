package com.REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sum_Of_Number_From_Given_String {

	public static void main(String[] args) {
		String s1 = "abc123#8a9@1";
		String expString = "[0-9]";
		
		Pattern p1 = Pattern.compile(expString);
		Matcher m1 = p1.matcher(s1);
		
		int sum = 0;
		
		while(m1.find()) {
			String s = m1.group();
			sum += Integer.parseInt(s);
		}
		System.out.println(sum); // 24
	}
}
