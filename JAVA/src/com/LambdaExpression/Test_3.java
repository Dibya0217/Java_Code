package com.LambdaExpression;

interface I3 {
	String bookBus(String pickUp, String drop);
}

public class Test_3 {

	public static void main(String[] args) {
		I3 aI3 = (p, d) -> {
			System.out.println(p+" to "+d+" ticket id booked.");
			return "price is 3000";
		};
		
		System.out.println(aI3.bookBus("Banglore", "Goa"));
	}

}
// Banglore to Goa ticket id booked.
// price is 3000