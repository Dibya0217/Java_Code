package com.Multithraeding;

class Account {
	static int bal;
	public Account(int bal) {
		Account.bal = bal;
	}
	public static synchronized void deposit(int amount, String s) throws InterruptedException {
		int a = amount;
		int nB = a + bal;
		Thread.sleep(500);
		bal = nB;
		System.out.println("Deposit Done : "+s);
	}
}

class DepositThread extends Thread {
	Account a;
	int bal;
	String s;
	
	public DepositThread(Account a, int bal, String s) {
		this.a = a;
		this.bal = bal;
		this.s = s;
	}
	public void run() {
		try {
			Account.deposit(bal, s);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Account_Driver {

	public static void main(String[] args) throws InterruptedException {
		Account a1 = new Account(5000);
		Account a2 = new Account(6000);
		new DepositThread(a1, 1000, "T1").start();
		new DepositThread(a2, 2000, "T2").start();
		
		Thread.sleep(2000);
		System.out.println(Account.bal);
		System.out.println(Account.bal);
	}

}
