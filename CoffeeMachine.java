package com.javacore.demo;

import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choose your Coffee");
		System.out.println("1. Espresso");
		System.out.println("2. Latte");
		System.out.println("3. Cappuccino");
		System.out.println("4. Americano");
		
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("You choose the Espresso,Price is 250rs");
			break;
		case 2:
			System.out.println("You choose the Latte,Price is 200rs");
			break;
		case 3:
			System.out.println("You choose the Cappuccino,Price is 350rs");
			break;
		case 4:
			System.out.println("You choose the Americano,Price is 500rs");
			break;
			
			default:
				System.out.println("Invalid choice");
		
		}

	}

}