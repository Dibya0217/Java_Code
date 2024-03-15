package com.Multithraeding;

class Thread_1 extends Thread {
	public void run() {
		for(int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+" Thread");
		}
	}
}

public class Daemon_Thread {

	public static void main(String[] args) throws InterruptedException {
		Thread_1 t1 = new Thread_1();
		System.out.println("Is "+Thread.currentThread().getName()+" a Daemon Thread "+Thread.currentThread().isDaemon());
		System.out.println("Is "+t1.getName()+" a Daemon Thread "+t1.isDaemon());
		t1.setDaemon(true); // non-daemon to daemon
//		Thread.currentThread().setDaemon(true);
		System.out.println("Is "+t1.getName()+" a Daemon Thread "+t1.isDaemon());
		System.out.println("Is "+Thread.currentThread().getName()+" a Daemon Thread "+Thread.currentThread().isDaemon());
		t1.start();
		for(int i = 1; i <= 5; i++) {
			Thread.sleep(500);
			System.out.println(i+" Main");
		}
	}

}
