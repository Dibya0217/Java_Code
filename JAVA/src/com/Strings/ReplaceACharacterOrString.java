package com.Strings;

public class ReplaceACharacterOrString {

	public static void main(String[] args) {
		String s1 = "I_am_a_java_developer";
		System.out.println(s1.replace('a', '@'));
		System.out.println(s1.replace('_', ' '));
		System.out.println(s1.replace("_", " "));
		System.out.println(s1.replace("java", "python"));
	}
}
//I_@m_@_j@v@_developer
//I am a java developer
//I am a java developer
//I_am_a_python_developer