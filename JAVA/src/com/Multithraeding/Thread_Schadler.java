package com.Multithraeding;

class T1 extends Thread {
	static T2 t2;
	@Override
	public void run() {
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i = 1; i <= 5; i++) {
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			System.out.println("T1 => " + i);
		}
	}
}
class T2 extends Thread {
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			System.out.println("T2 => " + i);
		}
	}
}

public class Thread_Schadler {
	public static void main(String[] args) throws InterruptedException {
		T1 t1 = new T1();
//		T2 t2 = new T2();
		t1.start();
		T1.t2.start();
		t1.join();
		for(int i = 1; i <= 5; i++) {
			Thread.sleep(500);
			System.out.println("Main => "+ i);
		}
	}

}
