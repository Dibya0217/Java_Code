package com.LambdaExpression;

interface I1 {
	int add(int a, int b);
}

public class Test_1 {

	public static void main(String[] args) {
		I1 aI1 = (a, b) -> a + b;
		
		System.out.println(aI1.add(10, 20)); // 30
	}

}
