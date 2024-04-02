/* 1.Write a Java program to create a class Employee with a method called calculateSalary().
Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary() 
method to calculate and return the salary based on their specific roles. */

package com.javacore.demo;

class Employee2 {

	public void calculateSalary() {

		System.out.println("Salary of Employee:");
	}

}

class Manager extends Employee2 {

	public void calculateSalary() {

		System.out.println(" Salary of Manager is 40 LPA ");
	}
}

class Programmer extends Employee2 {
	public void calculateSalary() {

		System.out.println(" Salary of Programmer is 20 LPA ");
	}

}

public class Lab4_Q1 {

	public static void main(String[] args) {

		Employee2 emp = new Employee2();
		emp.calculateSalary();

		Employee2 mn = new Manager();
		mn.calculateSalary();

		Employee2 pr = new Programmer();
		pr.calculateSalary();

	}

}