package com.Exception;

public class Demo_7 {

	public static void main(String[] args) {
		int a = 10, b = 0, c;
		try {
			System.out.println("Try Starts");
			c = a/b;
			System.out.println("Try Ends");
		} catch (Exception e) {
			System.out.println("Catch Executed");
			e.printStackTrace();
			c = a/2;
//		} catch (NullPointerException e) {	// Un-reachable Catch
//			System.out.println("Catch Executed");
//			c = a/2;
//		} catch (ArithmeticExceptioni e) {	// Un-reachable Catch
//			System.out.println("Catch Executed");
//			c = a/2;
		}
		System.out.println(c);
	}

}
