package com.variables;
// The variable which is declare inside the method. You can't use outside the method. Local variable have higher priority.
public class Local_Variable {
	public static void main(String[] args) {
		int i = 10; // Local Variable
		System.out.println(i);
		
//		int i = 20;// You can't redeclare the variable
		i = 20; // You can initialize
		System.out.println(i);
		
//		int j;
//		System.out.println(j); // If you can't initialize the local variable then you can't access.
	}
}
