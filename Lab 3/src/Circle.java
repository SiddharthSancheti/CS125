/**
 * Name: Siddharth Sancheti
 * Course: CS-125 05
 * Lab #: Lab 3
 * Due Date: 7 July 2022 @ 10 PM
 * Description: Operator class that uses input from the circle validation app class. Returns the perimeter
 * and area.
 */
import java.lang.Math;
public class Circle // start of the Circle operator class.
{
	private double rad; // local field for storing the value of radius.
	public Circle(double radius) 
	{
		rad = radius;
	}
	
	public void setRadius(double radius) { // accessor method for radius
		radius = rad;
	}
	
	public double getRadius() { // mutator method for radius. Returns the radius.
		return rad;
	}
	public double computeArea() // method that computes the area of a circle and returns it.
	{
		return Math.pow(rad, 2) * Math.PI; // formula for the area of a circle
	}
	
	public double computePerimeter() // method that computes the perimeter of a circle
	{
		return 2 * rad * Math.PI; // formula for the perimeter of a circle.
	}
} // end of the class
