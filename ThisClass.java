package com.javacore.demo;

//This is pointing to current class data member current class constrictor
public class ThisClass 
{
	int a;
	int b;
	int c;
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	ThisClass()
	{
		this(10,20);
		System.out.println("Inside the Default constrictor");
	}
	
	ThisClass (int a, int b)
	{
		this(10,20,30);
		this.a=a;
		this.b=b;
		System.out.println("Inside the Parameterized constrictor-1");
	}
	
	ThisClass (int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("Inside the Parameterized constrictor-2");
	}

	public static void main(String[] args) 
	{
		ThisClass tiss=new ThisClass();
		tiss.display();
		ThisClass tis=new ThisClass(20,30);

	}
}
