/**
 * Name: Siddharth Sancheti
 * Course: CS-125 05
 * Lab #: Lab 2
 * Due Date: June 30, 2022 @ 10:00 PM
 * Submission Date: _______ on June 30
 * Description: This operator class uses method overloading to return the area of a circle, the surface
 * area of a cylinder, and the volume of a hollow cylinder
 */
import java.lang.Math; // import the math class to simplify math expressions in the code.
import javax.swing.JOptionPane;
public class CircularComputing 
{
	public static double computeObject(double rad) //computing the area of a circle
	{
		return Math.pow(rad, 2) * Math.PI; //formula for the area of a circle is PI*r^2; return the answer
	} // end are of a circle method
	public static double computeObject(double rad, double h) // computing the surface area of a cylinder
	{
		return (Math.pow(rad, 2) * 2 * Math.PI) * (2*Math.PI*rad*h); // area of a cylinder is 
		//(2pi*r^2) * (h * 2pi*r); return the answer
	} // end surface area of cylinder method
	public static double computeObject(double outRad, double inRad, double h) // volume of a hollow cylinder
	{
		return Math.PI*(Math.pow(outRad, 2) - Math.pow(inRad, 2)) * h;  // return the volume of the hollow cylinder to a method that pulls it
	} // end hollow cylinder volume method
	
	public static void output(double answer1, double answer2, double answer3) // create the output object, we will call this method to display the answer.
	{
	JOptionPane.showMessageDialog(null, "The area of the circle with a radius of '5' is " + answer1 + 
				". The surface area of a cylinder with a radius of '6' and a height of '7' is " + answer2 +
				". And the volume of the hollow cylinder with an Outside Radius of '8', and Inside Radius of '4' and a radius of '7' is " + answer3 + ".");
		
	} // end output method
} // end the CircularComputing class
