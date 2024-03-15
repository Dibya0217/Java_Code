package com.Multithraeding;

class Counter {
	int count;
	public void increment() {
		count++;
	}
}

public class Create_Thread_By_Implements_Runnable {

	public static void main(String[] args) throws InterruptedException {
		
		Counter c = new Counter();
		
		Runnable e1 = () ->
		{
			for(int i = 1; i <= 1000; i++) {
//				System.out.println("Hi");
				c.increment();
//				System.out.println("increment in e1");
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}
		};
		Runnable f1 = () ->
		{
			for(int i = 1; i <= 1000; i++) {
//				System.out.println("Hello");
				c.increment();
//				System.out.println("increment in f1");
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}	
		};
		
		Thread t1 = new Thread(e1);
		Thread t2 = new Thread(f1);
		
		t1.join();
		t2.join();
		
		t1.start();
		t2.start();
		
		System.out.println(c.count);
	}
}
