// 3.Write a Java program that throws an exception and catch it using a try-catch block.
 
package com.exceptionHandling;

public class Lab6_Q3 {

	public static void main(String[] args) {
		try {
			int a = 10, b = 0;
			int res = a / b;
			System.out.println("Result is: " + res);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero.");
		}
	}

}
