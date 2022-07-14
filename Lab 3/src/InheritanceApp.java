/**
 * Name: Siddharth Sancheti
 * Course: CS-125 05
 * Lab #: Lab 3
 * Due Date: 7 July 2022 @ 10 PM
 * Submission Date: 9:45 PM on July 7
 * Description: Driver class that uses JOptionPane to accept user input, display error messages, and
 * output results including radius, perimeter, and area.
 */
// import java.util.Scanner;
public class InheritanceApp {

	public static void main(String[] args) { // main method
		String name = "John Smith", address = "221B Baker Street"; // intializing the strings
		int phoneNumberP1 = 510, phoneNumberP2 = 555, phoneNumberP3 = 3333, customerID = 4146; // intializing all the values.
		// split the phone number int
		
		
		Person callingSuper = new Person(name, address, phoneNumberP1, phoneNumberP2, phoneNumberP3);
		
		System.out.println("Hello " + callingSuper.getName() + ". Your phone number is " + callingSuper.getPhoneNumber() + ". You live at " + callingSuper.getAddress() + ".");
		
		Customer callingSub1 = new Customer(customerID, true);
		
		System.out.print("Your customer id is: " + callingSub1.getCustomerID() + " . " + callingSub1.getMailingList() + "\n");
		
		System.out.println("\n\nNext is a test of the 'super' keyword.");
		
		Customer callingSub2 = new Customer(name);
		System.out.println("I am calling the customer's name from the Customer object: " + callingSub2.getName()); 
		// the getName method is inherited from the super class because 'Customer' is a type of 'Person'
	}
	

}
