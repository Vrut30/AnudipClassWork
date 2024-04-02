/*Write a Java program to create a class called Animal with a method called makeSound().
Create a subclass called Cat that overrides the makeSound() method to bark.*/

package com.javacore.demo;
class Animal2
{
	public void makeSound() 
	{
		System.out.println(" ");
	}
}

class Cat extends Animal2
{
	public void makeSound() 
	{
		System.out.println("Meow...Meow...");
	}	
}

public class Lab3_Q4 
{
	public static void main(String[] args) 
	{
		Cat c=new Cat();
		c.makeSound();
	}
}