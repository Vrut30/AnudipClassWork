package com.threaddemo;

class MyThread extends Thread {

	@Override // (method overriding)
	public void run() {
		System.out.println("This is my Task!!");
	}

}

class MyThread2 extends Thread {

	@Override // (method overriding)
	public void run() {
		System.out.println("This is my Task2!!");
	}

}

public class ThreadNameDemo {

	public static void main(String[] args) {
		MyThread th=new MyThread();
		th.start();
		th.setName("Vrutvik");
		th.setPriority(1);
		String name= th.getName();
		System.out.println(th.getId());
		System.out.println(th.getPriority());
		System.out.println(name);
		
		MyThread2 th2=new MyThread2();
		th2.start();
		th2.setName("Krushna");
		System.out.println(th.getName());
		System.out.println(th2.getId());
		
		/*
		 * Min  - 1
		 * Max  - 10
		 * Norm - 5
		 */

	}

}
