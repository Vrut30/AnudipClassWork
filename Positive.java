//1.Write a Java program to get a number from the user and print whether it is positive or negative.
package com.javacore.demo;

import java.util.Scanner;

public class Positive 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any Number: ");
		int n=sc.nextInt();
				if(n<0)
				{
					System.out.println("Given Number is Negative");
				}
					else if(n>0)
					{
						System.out.println("Given Number is Positive");
					}
				else
				{
					System.out.println("Given Number is Zero");
				}
	}
}