/* 2.Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the
 area and perimeter of the rectangle. */

package com.javacore.demo;

import java.util.Scanner;

public class Rectangle
{
	int area;
	int perimeter;
	
	public int area(int length,int width ) 
	{
		area=length*width;
		return area;
	}
	
	public int perimeter(int length,int width) 
	{
		perimeter=2*(length+width);
		return perimeter;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of Retangle: ");
		int length=sc.nextInt();
		System.out.println("Enter width of Retangle: ");
		int width=sc.nextInt();
		
		Rectangle r = new Rectangle();
		
		System.out.println("Area of Rectangle is: " +r.area(length, width));
		System.out.println("Area of Perimeter is: " +r.perimeter(length, width));
	}
}