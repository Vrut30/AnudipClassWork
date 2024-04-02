package com.demo;

import java.util.Scanner;

public class AreaCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select a shape to calculate its area:\n1. Square\n2. Circle\n3. Triangle");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			calculateAreaOfSquare(scanner);
			break;
		case 2:
			calculateAreaOfCircle(scanner);
			break;
		case 3:
			calculateAreaOfTriangle(scanner);
			break;
		default:
			System.out.println("Invalid choice");
		}
	}

	public static void calculateAreaOfSquare(Scanner scanner) {
		System.out.print("Enter the side length of the square: ");
		double side = scanner.nextDouble();
		double area = side * side;
		System.out.println("The area of the square is " + area);
	}

	public static void calculateAreaOfCircle(Scanner scanner) {
		System.out.print("Enter the radius of the circle: ");
		double radius = scanner.nextDouble();
		double area = Math.PI * radius * radius;
		System.out.println("The area of the circle is " + area);
	}

	public static void calculateAreaOfTriangle(Scanner scanner) {
		System.out.print("Enter the base length of the triangle: ");
		double base = scanner.nextDouble();
		System.out.print("Enter the height of the triangle: ");
		double height = scanner.nextDouble();
		double area = 0.5 * base * height;
		System.out.println("The area of the triangle is " + area);
	}
}
