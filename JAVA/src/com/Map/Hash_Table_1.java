package com.Map;

import java.util.Hashtable;

public class Hash_Table_1 {

	public static void main(String[] args) {
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(5, "Dibya");
		h1.put(2, "Rohit");
		h1.put(1, "Aamir");
		h1.put(3, "Iswar");
		h1.put(4, "Pradeep");
		System.out.println(h1); // {5=Dibya, 4=Pradeep, 3=Iswar, 2=Rohit, 1=Aamir}
	}

}
