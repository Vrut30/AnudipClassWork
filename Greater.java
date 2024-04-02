//2.Write a Java program that takes three numbers from the user and prints the greatest number.
package com.javacore.demo;

import java.util.Scanner;
public class Greater 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Three Numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println(a+" is greater number");
		}
			else if(b>a && b>c)
			{
				System.out.println(b+" is greater number");
			}
		else
		{
			System.out.println(c+" is greater number");
		}
		
	}

}
