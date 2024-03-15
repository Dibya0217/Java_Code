package com.Map;

	import java.util.HashMap;
	import java.util.Map;
	import java.util.Map.Entry;
	
	public class Demo_1 {
	
		public static void main(String[] args) {
			Map<String, Integer> m1 = new HashMap<String, Integer>();
			m1.put("Dibya", 21);
			m1.put("Pudeep", 100);
			m1.put("Rohit", 50);
			m1.put("Aamir", 1000000);
			m1.put("Iswar", 10);
			m1.put("xyz", 10);
			System.out.println(m1); // {Rohit=50, Pudeep=100, Iswar=10, Aamir=1000000, xyz=10, Dibya=21}
			System.out.println(m1.get("Dibya")); // 21
			System.out.println(m1.size()); // 6
			System.out.println(m1.containsKey("Iswar")); // true
			m1.remove("xyz");
			System.out.println(m1); // {Rohit=50, Pudeep=100, Iswar=10, Aamir=1000000, Dibya=21}
			
//			Using Entry Interface
			for (Map.Entry<String, Integer> entry : m1.entrySet()) {
				System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue()+" Class : "+entry.getClass());
			}
			/*
			Key : Rohit Value : 50 Class : class java.util.HashMap$Node
			Key : Pudeep Value : 100 Class : class java.util.HashMap$Node
			Key : Iswar Value : 10 Class : class java.util.HashMap$Node
			Key : Aamir Value : 1000000 Class : class java.util.HashMap$Node
			Key : Dibya Value : 21 Class : class java.util.HashMap$Node
			*/
			
			
//			Convert to set
			for (String k : m1.keySet()) {
				System.out.println("Key : "+k);
			}
			for (Integer v : m1.values()) {
				System.out.println("Value : "+v);
			}
		}
	
	}
