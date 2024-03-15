package com.Strings.Problems;

public class Reverse_A_String {

	public static void main(String[] args) {
		String s1 = "racecar";
		int i = 0;
		int j = s1.length() - 1;
		boolean flag = true;
		while(i < j) {
			if(s1.charAt(i) != s1.charAt(j)) flag = false;
			i++;
			j--;
		}
		if(flag)System.out.println(s1+" is palindrome");
		else System.out.println("Not Palindrome");
	}
}
