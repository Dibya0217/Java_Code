package com.Map;

import java.util.TreeMap;

public class Tree_Map_1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> t1 = new TreeMap<Integer, String>();
		t1.put(8, "Dibya");
		t1.put(4, "Rohit");
		t1.put(9, "Aamir");
		t1.put(3, "Iswar");
		t1.put(10, "Pradeep");
		System.out.println(t1); // {3=Iswar, 4=Rohit, 8=Dibya, 9=Aamir, 10=Pradeep}
	}

}
