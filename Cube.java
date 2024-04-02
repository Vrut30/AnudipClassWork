//6. Write a Java program to display the cube of the given number up to an integer.
package com.javacore.demo;

import java.util.Scanner;
public class Cube
{
	public void cube(int n)
	{
		int cube= n*n*n;
		System.out.println("Cube of " + n   +  " is "  + cube);
	}
		
	public static void main(String args[])
	{
		Cube d =new Cube();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Nnumber: ");

		int i =sc.nextInt();
		for(int a =1;a<=i;a++)
		{
			d.cube(a);
			
		}
	}
	
}