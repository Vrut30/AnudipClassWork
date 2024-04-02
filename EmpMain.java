package com.javacore.demo;

//Encapsulation
class Employee14
{
	
	private int id;
	private String name;
	private String desig;
	private String sal;
	private String dob;
	private String username;
	private String password;
	
	public Employee14() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee14(int id, String name, String desig, String sal, String dob) 
	{
		super();
		this.id = id;
		this.name = name;
		this.desig = desig;
		this.sal = sal;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() 
	{
		return "Employee14 [id=" + id + ", name=" + name + ", desig=" + desig + ", sal=" + sal + ", dob=" + dob
				+ ", username=" + username + ", password=" + password + "]";
	}
	
}

public class EmpMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}
}