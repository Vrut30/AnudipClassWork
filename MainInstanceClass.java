package com.javacore.demo;

class A
{
	int nonStaticVariable; // instance variable
	static int staticVariable; // static Varible	
	static void staticMethod() // static method
	{
		System.out.println(staticVariable);
		//System.out.println(nonStaticVariable);// non static methods cant be accessible into static methods
	}
	 void nonStaticMethod()   // instance method
	 {
		 System.out.println(staticVariable);
		 System.out.println(nonStaticVariable);
	 }	
}
public class MainInstanceClass
{
	public static void main(String[] args) 
	{
		A.staticVariable=10;
		//A.nonStaticVariable=10;// no object created so cant access tthe variable
		A.staticMethod();
		//A.nonStaticMethod();// no object created so cant call the variable
		
		A a1=new A();
		A a2=new A();
		
		System.out.println(a1.nonStaticVariable);
		System.out.println(a1.staticVariable);
		a1.nonStaticMethod();
		a1.staticMethod();
		
		System.out.println(a2.staticVariable);
		a1.staticVariable=20;
		System.out.println(a2.staticVariable);
		
	}
	
}