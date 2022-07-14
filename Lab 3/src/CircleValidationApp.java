/**
 * Name: Siddharth Sancheti
 * Course: CS-125 05
 * Lab #: Lab 3
 * Due Date: 7 July 2022 @ 10 PM
 * Submission Date: 9:45 PM on July 7
 * Description: Driver class that uses JOptionPane to accept user input, display error messages, and
 * output results including radius, perimeter, and area.
 */
import javax.swing.JOptionPane; // need to import JOptionPane class so that it can be used.
public class CircleValidationApp {

	public static void main(String[] args)
	{
		String input;
		double radius;
		
		
		while (true) { // using the while loop creates a loop until the correct type of data is entered.
			try { // coding the exception handling of String inputs	
				input = JOptionPane.showInputDialog("Enter the radius of a circle: ");
				radius = Double.parseDouble(input); // converts user input from a String to a double.
				if (radius <= 0 ) // will throw an error message if the inputed radius is at most zero.
					throw new NegativeDoubleException(radius);
				break; // ends the while loop. Immediately moves to the printing the answers.
			}
			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error: Only enter a postive number, nothing else.");
			} // end of the exception catches
			
			catch (NegativeDoubleException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				
			}
		} // end of the while loop. The input is confirmed to be a POSITIVE NUMBER and is moving to output.
		
		
		Circle classCall = new Circle(radius); // create an object of Circle class.
		
		JOptionPane.showMessageDialog(null, "The radius is " + radius + ". The area is " + classCall.computeArea() + ". The perimeter is " + classCall.computePerimeter() + ".");;
		System.exit(0); // ends the JOptionPane class (Required when using JOptionPane).
		}

}
