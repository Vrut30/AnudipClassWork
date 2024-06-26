/* 4.Write a Java program to create a method that takes an integer as a parameter and throws
 *an exception if the number is odd.
 */

package com.exceptionHandling;

public class Lab6_Q4 {
	public static void main(String[] args) {
		int number = 89; // Change this to test different numbers

		try {
			checkIfEven(number);
			System.out.println(number + " is even.");
		} catch (IllegalArgumentException e) {
			System.out.println(number + " is odd.");
		}
	}

	public static void checkIfEven(int number) throws IllegalArgumentException {
		if (number % 2 != 0) {
			throw new IllegalArgumentException("Number is odd.");
		}
	}
}
