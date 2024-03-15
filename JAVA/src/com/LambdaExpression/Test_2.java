package com.LambdaExpression;

interface I2 {
	void m1(int a);
}

public class Test_2 {

	public static void main(String[] args) {
		I2 aI2 = a -> System.out.println(a);
		
		aI2.m1(10); // 10
	}

}
