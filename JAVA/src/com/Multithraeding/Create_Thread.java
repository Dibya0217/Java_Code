package com.Multithraeding;

class MyThread1 extends Thread {
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i+" Child Thread");
		}
	}
}

public class Create_Thread {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.start();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i+" Main Thread");
		}
	}

}
