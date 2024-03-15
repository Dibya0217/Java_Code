package com.Exception;

@SuppressWarnings("serial")
class DemoExp2 extends Exception
{
	
}

public class Demo_6 {

	public static void fun() throws DemoExp2 {
		System.out.println("Fun Starts");
		throw new DemoExp2();
	}
	
	public static void m1() throws DemoExp2 {
		fun();
	}
	public static void main(String[] args) throws DemoExp2 {
//		try {
//			fun();
//			System.out.println("Try Ends");
//		} catch (DemoExp2 e) {
//			System.out.println("Catch inside main()");
//		}
		m1();
	}

}
