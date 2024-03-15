package com.Map;

import java.util.LinkedHashMap;

public class Linked_Hash_Map_1 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> l1 = new LinkedHashMap<Integer, String>();
		l1.put(2, "Dibya");
		l1.put(5, "Rohit");
		l1.put(1, "Aamir");
		l1.put(3, "Iswar");
		l1.put(4, "Pradeep");
		System.out.println(l1); // {2=Dibya, 5=Rohit, 1=Aamir, 3=Iswar, 4=Pradeep}
	}
}
