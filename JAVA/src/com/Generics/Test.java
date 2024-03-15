package com.Generics;

public class Test {

	public static void main(String[] args) {
		A<Integer> a1 = new A<Integer>();
		a1.add(100);
//		a1.add("ABC"); // ERR because the generic type is Integer
		int i = a1.get();
		System.out.println(i); // 100
		
		A<String> a2 = new A<String>();
		a2.add("ABC");
		String s = a2.get(); 
		System.out.println(s); // ABC
	}

}
