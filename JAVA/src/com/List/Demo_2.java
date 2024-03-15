package com.List;

import java.util.ArrayList;
import java.util.List;

public class Demo_2 {

	public static void main(String[] args) {
		String[] arr={"Java","Python","PHP","C++"};
		List<String> l1 = new ArrayList<String>();
		for(String str : arr) {
			l1.add(str);
		}
		System.out.println(l1); // [Java, Python, PHP, C++]
	}
}
