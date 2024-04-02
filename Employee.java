/* 5.Write a Java program to create a class called "Employee" with a name, job title, and salary attributes,
 and methods to calculate and update salary.*/

package com.javacore.demo;

import java.util.Scanner;

public class Employee 
{
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary)
    {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() 
    {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
    }

    public double getSalary() 
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public void calculateUpdatedSalary(double increasePercentage) 
    {
        this.salary += (this.salary * increasePercentage / 100);
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Employee Job Title: ");
        String jobTitle = scanner.nextLine();
        
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(name, jobTitle, salary);
        
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Salary: " + employee.getSalary());

        System.out.print("Enter the percentage increase for salary: ");
        double increasePercentage = scanner.nextDouble();
        employee.calculateUpdatedSalary(increasePercentage);

        System.out.println("Updated Salary: " + employee.getSalary());

        scanner.close();
    }
}