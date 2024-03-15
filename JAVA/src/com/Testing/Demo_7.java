package com.Testing;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo_7 {
	public static void main(String[] args) {
		Map<String, Integer> m1 = new LinkedHashMap<String, Integer>();
		m1.put("Java", 14);
		m1.put("Python", 14);
		m1.put("MERN", 34);
		m1.put("Java", 36);
		m1.put("SQL", 14);
		m1.put("C#", 59);
		m1.put("C++", 69);
		System.out.println(m1.size());
		Iterator<String> i1 = m1.keySet().iterator();
		while(i1.hasNext()) {
			Object key = i1.next();
			Object value = m1.get(key);
			System.out.println(key +" " + value);
		}
	}
}
