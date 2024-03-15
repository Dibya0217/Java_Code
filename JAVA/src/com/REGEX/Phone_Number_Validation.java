package com.REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone_Number_Validation {

	public static void main(String[] args) {
		String s = "9861492009";
		String expString = "[6-9][0-9]{9}";
		
		Pattern p1 = Pattern.compile(expString);
		Matcher m1 = p1.matcher(s);
		
		
		if(m1.find())
			System.out.println("Valid");
		else
			System.out.println("Not Valid");
	}

}
