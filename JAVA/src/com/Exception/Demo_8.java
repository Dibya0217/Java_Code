package com.Exception;

import java.util.Scanner;

@SuppressWarnings("serial")
class InsuficientBalException extends Exception {
	public InsuficientBalException() {
		super("Low Balance");
	}
	
	public InsuficientBalException(String m) {
		super(m);
	}
}

class Account {
	private double bal;
	
	public Account(double d) {
		bal = d;
	}
	public double getBalance() {
		return bal;
	}
	public void Withdraw(int amt) throws InsuficientBalException {
		if(amt > bal) {
			throw new InsuficientBalException();
		}
		System.out.println("Amount Dispatched");
		bal -= amt;
	}
}

public class Demo_8 {
	public static void main(String[] args) {
		Account account = new Account(5000);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Amount : ");
		int amt = sc.nextInt();
		
		try {
			account.Withdraw(amt);
			System.out.println("Plz Collect Money");
		} catch (InsuficientBalException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		sc.close();
	}

}
