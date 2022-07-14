/**
 * Name: Siddharth Sancheti
 * Course: CS-125 05
 * Lab #: Lab 2
 * Due Date: June 30, 2022 @ 10:00 PM
 * Submission Date: 9:30 PM on June 30
 * Description: This driver class will take the input from the user regarding the dimensions of a circular 
 * object and print the area/volume. Uses Option Panes for the output.
 */

public class CircularComputingApp // start the CircularComputing Application. This will have input and output.
{
	public static void main(String[] args) // main method for the operator class
	{
		double answer1 = CircularComputing.computeObject(5.0); //value for the area of a circle; one argument 
		double answer2 = CircularComputing.computeObject(6.0, 7.0); //values for the surface area of cylinder; two arguments
		double answer3 = CircularComputing.computeObject(8.0, 4.0, 7.0); // values for the volume of a hollow cylinder; three arguments
		
		CircularComputing.output(answer1, answer2, answer3);
		
		
	} // end of main method
} // end of driver class
