package com.javacore.demo;

import java.util.Scanner;

public class ShippingCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choose your shipping method");
		System.out.println("1. Standard shipping");
		System.out.println("2. Express shipping");
		System.out.println("3. Overnight shipping");
		
		int shippingMethod=sc.nextInt();
		int basecost=10; //base shipping cost
		
		switch(shippingMethod)
		{
		case 1:
			System.out.println("You choose standard shipping,");
			break;
		case 2:
			System.out.println("You choose express shipping");
			basecost=basecost+20;
			break;
		case 3:
			System.out.println("You choose overnight shipping");
			basecost=basecost+40;
			break;
			default:
				System.out.println("Invalide shipping method");
		}
		    int totalcost=basecost;
	}

}