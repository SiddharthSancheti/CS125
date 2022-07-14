/**
 * Name: Siddharth Sancheti
 * Course: CS-125 05
 * Lab #: Lab 3
 * Due Date: 7 July 2022 @ 10 PM
 * Submission Date: 9:45 PM on July 7
 * Description: This custom exception class will be called when the field 'radius' has a negative number.
 *
 */
@SuppressWarnings("serial")
public class NegativeDoubleException extends Exception{

// start of the NegativeDoubleException class (extention of Exception superclass
	public NegativeDoubleException() {
		super("Error: Please enter a postive number.");
	}
	
	public NegativeDoubleException(double radius) {
		super("Error: Please enter a postive number: " + radius);
	} // constructor with radius argument
} // end of the NegativeDoubleException class
