package com.InnerClass;

public class Method_Local_Inner_Class {
	
	public void mClass() {
		int i = 30;
		int j = 40;
		class Inner {
			public void m2() {
				System.out.println(i+" "+j);
			}
		}
		new Inner().m2();
	}
	
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		class Inner {
			public void m1() {
				System.out.println(i+" "+j); // 10 20
			}
		}
		new Inner().m1();
		
		Method_Local_Inner_Class method = new Method_Local_Inner_Class();
		method.mClass(); // 30 40
		
	}
}
