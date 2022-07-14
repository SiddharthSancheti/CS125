/**
 * Name: Siddharth Sancheti
 * Course: CS-125 05
 * Lab #: Lab 3
 * Due Date: 7 July 2022 @ 10 PM
 * Submission Date: 9:45 PM on July 7
 * Description: This is a superclass that will hold a person's name, address, and phone number. The subclass,
 * 'Customer', will inherit methods from this class. This superclass contains two overloaded constructors.
 */

// start of the superclass 'Person'. The subclass 'Customer' will inherit methods from this class.
public class Person { // start of the superclass 'Person'. The subclass 'Customer' will inherit methods from this class.
	private String nameGrabber, addressGrabber;
	private int phoneNumberGrabber1, phoneNumberGrabber2, phoneNumberGrabber3; // separated the phone number into three different parts to return a proper phone number string later on.
	
	public Person() {} // overloaded constructor with no argument.
	
	public Person(String name, String address, int phoneNumberP1, int phoneNumberP2, int phoneNumberP3) { // overloaded constructor #2 that only accepts a person's name, address, and phone number.
		nameGrabber = name; 
		addressGrabber = address; 
		phoneNumberGrabber1 = phoneNumberP1; 
		phoneNumberGrabber2 = phoneNumberP2; 
		phoneNumberGrabber3 = phoneNumberP3;
	}
	public Person(String name, String address) { // overloaded constructor #1 that only accepts the person's name and address.
		nameGrabber = name; addressGrabber = address;
	}
	
	public Person(String name) { // constructor that only accepts the person's name.
		nameGrabber = name;
	}
	/**
	 * Creating the accessor method for every field named.	
	 */
	public void setName(String name) {
		name = nameGrabber;
	}
	
	public void setAddress(String address) {
		address = addressGrabber;
	}
	
	public void setPhoneNumber(int phoneNumberP1, int phoneNumberP2, int phoneNumberP3) {
		phoneNumberGrabber1 = phoneNumberP1;
		phoneNumberGrabber2 = phoneNumberP2;
		phoneNumberGrabber3 = phoneNumberP3;
	}
	
	/**
	 * Creating the mutator methods that get each individual field and return that field.
	 */
	
	public String getName() {
		return nameGrabber;
	}
	public String getAddress() {
		return addressGrabber;
	}
	public String getPhoneNumber() {
		return "(" + phoneNumberGrabber1 + ")" + phoneNumberGrabber2 + "-" + phoneNumberGrabber3;
	}
}
