package com.javacore.demo;

public class ThisClass1 
{
	int a;
	int b;
	
	ThisClass1()
	{
		this.a=10;
		b=20;
	}
	
	public ThisClass1 get()
	{
		return this; //returning current class instance
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		ThisClass1 ts=new ThisClass1();
		ts.get().display();
	}
}
