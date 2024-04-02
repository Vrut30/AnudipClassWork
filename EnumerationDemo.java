package com.demo;


enum Shape
{
	North,
	South,
	East,
	West
}
enum Days
{
	North,
	South,
	East,
	West
}
enum Month
{
	North,
	South,
	East,
	West
}
enum Weekends
{
	North,
	South,
	East,
	West
}
enum Direction
{
	North,
	South,
	East,
	West
}

public class EnumerationDemo {

	public static void main(String[] args) {
		
//		Direction di1=Direction.North;
//		Direction dil2=Direction.South;
	
//		System.out.println(" First Direction: " +di1);
//		System.out.println(" First Direction: " +di2);
		
	/*	for(Direction dir: Direction.values())
		{
			System.out.println(dir);
		}*/
		
		Direction dir=Direction.North;
		if(dir == Direction.East)
			System.out.println("Direction:East");
		else if(dir == Direction.West)
		{
			System.out.println();
		}
		
	}

}
