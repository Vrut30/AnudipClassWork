package com.javacore.demo;

// No concrete class will have a abstract method
//It is not compulsory that abstract class must have abstract methods.It may or may not have abstract methods.
//But the class which has at least one abstract method must be declared as abstract.
//Abstract method cannot be private
//constructor and field cannot be abstract
abstract class Animal1
{
	int i;
	
	public Animal1() //constructor create
	{
		
	}
	
	abstract void soundAnimal1();  //Abstract Method
	
	void display()   // Concrete Method
	{
		
	}
	
	void Vrut()  // Concrete Method
	{
		
	}
	
	abstract void ABC();   //Abstract Method

}

class Cat1 extends Animal1
{
	@Override
	void soundAnimal1() 
	{
		// TODO Auto-generated method stub
		System.out.println("Meow....");
		
	}

	@Override
	void ABC() 
	{
		// TODO Auto-generated method stub
		
	}
}

class Cow1 extends Animal1
{
	@Override
	void soundAnimal1() 
	{
		// TODO Auto-generated method stub
		System.out.println("Hamaa....");
		
	}

	@Override
	void ABC()
	{
		// TODO Auto-generated method stub
		
	}
}

public class Abstract_demo 
{
	public static void main(String[] args) 
	{
		// you cannot create object of abstract class
		
		//Animal a1=new Animal();
		
		Cat1 c1=new Cat1();
		Animal1 a1 = c1;
		
		//concrete class object is auto to the abstract class
	}
}