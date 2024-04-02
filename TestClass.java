package com.javacore.demo;

class Student 
{
	int rollNo;
	String name;
	float fee;

	Student (int rollNo, String name, float fee) //parameter list
	{
		this.rollNo=rollNo;
		this.name=name;
		this.fee=fee;
	}
	
	void display()
	{
		System.out.println(rollNo + " " + name + fee);
	}
}

public class TestClass 
{
	public static void main(String[] args) 
	{
		Student sl=new Student(1, "vrutvik " , 1000);
		Student s2=new Student (2, "Rajaat " , 2000);
		sl.display();
		s2.display();
	}
}