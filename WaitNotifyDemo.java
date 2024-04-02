package com.threaddemo;

class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw....");
		if (this.amount < amount) {
			System.out.println("Less Balance; Wating for Deposit....!");
			try {
				wait();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		this.amount = this.amount - amount;
		System.out.println(Thread.currentThread().getName()+" "+ this.amount);
		System.out.println("Withdraw Completed....!");
	}

	synchronized void deposit(int amount) {
		System.out.println("Going to Deposit....");
		this.amount = this.amount + amount;
		System.out.println(Thread.currentThread().getName()+" "+ this.amount);
		System.out.println("Deposit Completed....!");
		notifyAll();
	}
}

public class WaitNotifyDemo {

	public static void main(String[] args) {
		
		Customer customer=new Customer();
		
		new Thread() {
			public void run() {
				customer.withdraw(12000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				customer.deposit(10000);
			}
		}.start();
	}
}
