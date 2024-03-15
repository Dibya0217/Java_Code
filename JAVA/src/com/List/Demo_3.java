package com.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo_3 {

	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>();
		a1.add("Dibya");
		a1.add("Ranjan");
		a1.add("Samal");
		System.out.println("List : "+a1);
		String [] arr = a1.toArray(new String[a1.size()]);
		System.out.println("Array : "+Arrays.toString(arr));
	}
}
/*
List : [Dibya, Ranjan, Samal]
Array : [Dibya, Ranjan, Samal]
 */
