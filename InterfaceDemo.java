package com.demo;

//Interface, another way of implementing abstraction in java.
// All the interfaces in java are by default abstract.
//By default all the method in interfaces is abstract.
//All the methods in interface are pure abstract method no concrete method till java 1.8 version
//The abstract method in interface cannot be private//By default the field in the interface are public static and final
//You cannot create object of the interface

interface InterfaceSample
{
	int i=0;
	void display();
	
	static void show()
	{
		
	}
}

class ABC implements InterfaceSample
{
	@Override
	public void display() 
	{
	//	System.out.println(i++);
	}

	//@Override
	public void show() 
	{
		// TODO Auto-generated method stub
		
	}	
}

public class InterfaceDemo 
{
	public static void main(String[] args)
	{
		//InterfaceSample i=new InterfaceSample();
		
	}
}
