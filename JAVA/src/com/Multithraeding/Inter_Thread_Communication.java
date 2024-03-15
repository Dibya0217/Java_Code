package com.Multithraeding;

class BankAccount {
	int bal;
	public BankAccount(int bal) {
		this.bal = bal;
	}
	public synchronized void withdraw(int amount) throws InterruptedException {
		if(amount > bal) {
			System.out.println("Less Balance is available in account");
			wait();
		}
		bal -= amount;
		System.out.println("Withdraw done : "+ amount);
		System.out.println("Closing Balance : "+ bal);
	}
	public synchronized void deposit(int amount) {
		System.out.println("Going to deposit");
		bal+=amount;
		System.out.println("Balance deposit : "+amount);
		System.out.println("Closing balance : "+bal);
		notify();
	}
}

class Th1 extends Thread {
	public static String bal;
	BankAccount a;
	int amount;
	public Th1(BankAccount a, int amount) {
		this.a = a;
		this.amount = amount;
	}
	public void help() {
		a.deposit(amount);
	}
	@Override
	public void run() {
		try {
			a.withdraw(amount);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Inter_Thread_Communication {

	public static void main(String[] args) throws InterruptedException {
		BankAccount a = new BankAccount(10000);
		Th1 t1 = new Th1(a, 6000);
		t1.start();
		Thread.sleep(500);
		t1.help();
		Thread.sleep(1000);
		System.out.println("Avalable Balance : "+Th1.bal);
	}

}
