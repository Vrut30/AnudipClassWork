package com.threaddemo;

class SleepDemo extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				sleep(1000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}

public class ThreadSleepDemo {

	public static void main(String[] args) {
		SleepDemo s1 = new SleepDemo();
		s1.start();

	}

}
