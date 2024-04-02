/* 4.Write a Java program to create an abstract class Shape with abstract methods calculateArea()
 *and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class
 *and implement the respective methods to calculate the area and perimeter of each shape.
 */

package com.javacore.demo;

abstract class Shape2 {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle2 extends Shape2 {
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle2 extends Shape2 {
    private double side1;
    private double side2;
    private double side3;

    public Triangle2(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double calculateArea() {
        // Using Heron's formula to calculate area
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

public class Lab5_Q4 {
    public static void main(String[] args) {
        Circle2 circle = new Circle2(5);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        Triangle2 triangle = new Triangle2(3, 4, 5);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}
