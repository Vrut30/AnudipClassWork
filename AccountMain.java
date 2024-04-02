package com.threaddemo;

public class AccountMain {

	public static void main(String[] args) {
		Account ac1=new Account();
		ac1.setName("Vrutvik");
		
		Account ac2=new Account();
		ac2.setName("Krushna");
		
		ac1.start();
		ac2.start();
	}

}
