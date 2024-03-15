package com.Testing;

public class Demo_5 {

	public static void main(String[] args) {
		String s1 = new String("Dibya");
		String s2 = "Dibya";
		String s3="Aamir";
		String s4=new String("Aamir");
		
		
	
		System.out.println();
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}

}
