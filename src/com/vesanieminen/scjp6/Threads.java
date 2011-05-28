package com.vesanieminen.scjp6;

public class Threads {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyRunnable());
		Thread thread2 = new Thread(new MyRunnable());
		MyThread myThread1 = new MyThread();
		myThread1.setPriority(Thread.MAX_PRIORITY);
		MyThread myThread2 = new MyThread();
		
		thread1.start();
		thread2.start();
		myThread1.start();
		myThread2.start();
		
		try {
			thread1.join();
			thread2.join();
			myThread1.join();
			myThread2.join();
		}
		catch (Exception e) { }
	}

}

class MyRunnable implements Runnable {

	private static int nextId = 0; 	
	private int id;
	
	public MyRunnable() {
		id = MyRunnable.nextId++;
	}
	
	@Override
	public void run() {
		long l = 0;
		while (true) {
			System.out.println("MyRunnable" + id + ":" + l);
			++l;
			if (l % 10 == 0) {
				Thread.yield();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class MyThread extends Thread {
	
	private static int nextId = 0; 	
	private int id;
	
	public MyThread() {
		id = MyThread.nextId++;
	}
	
	public void run() {
		long l = 0;
		while (true) {
			System.out.println("MyThread" + id + ":" + l);
			++l;
			if (l % 10 == 0) {
				Thread.yield();
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}
	
}
