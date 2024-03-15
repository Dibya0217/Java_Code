package com.Multithraeding;

class MyThread2 extends Thread {
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			if(i == 3) System.out.println(10/0);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+" Child Thread");
		}
	}
}

public class ERR_In_Thread {

	public static void main(String[] args) throws InterruptedException {
		MyThread2 t1 = new MyThread2();
		t1.start();
		
		for(int i = 1; i <= 10; i++) {
			Thread.sleep(500);
			System.out.println(i+" Main Thread");
		}
	}

}
