/* 2.Write a Java program to create an abstract class Employee with abstract methods
 *calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that extend 
 *the Employee class and implement the respective methods to calculate salary and display 
 *information for each role.
 */
package com.javacore.demo;

abstract class Employee1 {
	protected String name;
	protected double baseSalary;
	protected double bonus;

	public Employee1(String name, double baseSalary, double bonus) {
		this.name = name;
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}

	abstract double calculateSalary();

	abstract void displayInfo();
}

class Manager1 extends Employee1 {
	
	public Manager1(String name, double baseSalary, double bonus) {
		super(name, baseSalary, bonus);		
	}

	@Override
	double calculateSalary() {
		return baseSalary + bonus;
	}

	@Override
	void displayInfo() {
		System.out.println("Manager: " + name);
		System.out.println("Base Salary: " + baseSalary);
		System.out.println("Bonus: " + bonus);
		System.out.println("Total Salary: " + calculateSalary());
	}
}

class Programmer1 extends Employee1 {
	private int workExperience;

	public Programmer1(String name, double baseSalary, int workExperience, double bonus) {
		super(name, baseSalary, bonus);
		this.workExperience = workExperience;
	}

	@Override
	double calculateSalary() {
		return baseSalary + bonus;
	}

	@Override
	void displayInfo() {
		System.out.println("Programmer: " + name);
		System.out.println("Base Salary: " + baseSalary);
		System.out.println("Work Experience: " + workExperience);
		System.out.println("Bonus: " + bonus);
		System.out.println("Total Salary: " + calculateSalary());
	}
}

public class Lab5_Q2 {
	public static void main(String[] args) {
		Manager1 Manager1 = new Manager1("Vrut Dange", 60000, 10000);
		Manager1.displayInfo();

		System.out.println();

		Programmer1 Programmer1 = new Programmer1("Krush Dange", 70000, 4, 15000);
		Programmer1.displayInfo();
	}
}
