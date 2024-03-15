package com.Multithraeding;

class C extends Thread {
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class D extends Thread {
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Create_Thread_By_Extend_Thread {

	public static void main(String[] args) {
		C c1 = new C();
		D d1 = new D();
		c1.start();
		d1.start();
	}

}
