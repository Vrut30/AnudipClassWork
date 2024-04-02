/* 3.Write a Java program to create a class called "Circle" with a radius attribute.
 You can access and modify this attribute. Calculate the area and circumference of the circle.*/

package com.javacore.demo;

import java.util.Scanner;

public class Circle 
{
	float area;
	double circumference;
	
	public float area(int r) 
	{
		area=(float) (3.14*(r*r));
		return area;
	}
	
	public double circumference(int r) 
	{
		circumference=2*3.14*r;
		return circumference;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of radius: ");
		int r=sc.nextInt();
		
		Circle c=new Circle();
		
		System.out.println("Area of circle is: " +c.area(r));
		System.out.println("Circumference of circle is: " +c.circumference(r));
	}
}