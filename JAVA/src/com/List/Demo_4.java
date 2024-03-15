package com.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo_4 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Mango");  
		list1.add("Apple");  
		list1.add("Banana");  
		list1.add("Grapes");
		System.out.println(list1); // [Mango, Apple, Banana, Grapes]
		Collections.sort(list1);
		System.out.println(list1); // [Apple, Banana, Grapes, Mango]
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(21);  
		list2.add(9);  
		list2.add(20);  
		list2.add(15);
		System.out.println(list2); // [21, 9, 20, 15]
		Collections.sort(list2);
		System.out.println(list2); // [9, 15, 20, 21]
	}
}
