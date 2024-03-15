package com.Map;

import java.util.HashMap;

public class Hash_Map_1 {
	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(5, "Dibya");
		h1.put(3, "Aamir");
		h1.put(7, "Iswar");
		h1.put(2, "Rohit");
		h1.put(1, "Pudeep");
		System.out.println(h1); // {1=Pudeep, 2=Rohit, 3=Aamir, 5=Dibya, 7=Iswar}
	}
}
