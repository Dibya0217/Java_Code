package com.REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dot_Operator {

	public static void main(String[] args) {
		String s1 = "abnaab";
//		String exp = "."; // if you put . then it take single character like, a, b, n, a, a, b
//		String exp = ".."; // if you put .. then it take double character like, ab, na, ab
//		String exp = "..."; // if you put ... then it take triple character like, abn, aab
//		String exp = "..a"; // if you put ..char then it take two character before that character and character like, bna
//		String exp = "a."; // ab, aa
		String exp = ".n."; // bna
		
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(s1);
		
		while(m1.find()) {
			System.out.println(m1.group());
			System.out.println(".................");
		}
	}

}
