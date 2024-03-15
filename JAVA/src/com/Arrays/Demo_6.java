package com.Arrays;

import java.util.Arrays;
import java.util.Comparator;

@SuppressWarnings("rawtypes")
class LenComp implements Comparator {
	public int compare(Object arg1, Object arg2) {
		return ((String)arg1).length() - ((String)arg2).length();
	}
}
@SuppressWarnings("rawtypes")
class RevAlpha implements Comparator {
	public int compare(Object arg1, Object arg2) {
		String s1 = (String)arg1;
		String s2 = (String)arg2;
		return s2.compareTo(s1);
	}
}

public class Demo_6 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		String[] arr = {
				"pooja",
				"samantha",
				"sunny",
				"alia",
				"rashmika",
				"dani"
		};
		Arrays.sort(arr, new LenComp());
		/*
		alia
		dani
		pooja
		sunny
		samantha
		rashmika
		 */
		Arrays.sort(arr, new RevAlpha());
		/*
		sunny
		samantha
		rashmika
		pooja
		dani
		alia
		 */
		for(String str : arr) {
			System.out.println(str);
		}
	}
}
