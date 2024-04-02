package com.threaddemo;

public class Account extends Thread {
	static int balance = 1000;

	@Override
	public void run() {
		synchronized (Account) {

		}

		if (balance > 800) {
			System.out.println(Thread.currentThread().getName() + " Your balance is " + balance + " "
					+ "Rupees u can withdraw the ammount");

			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance = 200;
			System.out.println(Thread.currentThread().getName() + " After withdrawal" + " you balance is " + balance);
		} else {
			System.out.println(Thread.currentThread().getName() + "our is balance is balance "
					+ "So you cant withdraw the amount");
		}
	}

}
