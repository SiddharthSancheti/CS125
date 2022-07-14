/**
 * Name: Siddharth Sancheti
 * Course: CS-125 05
 * Lab #: Lab 3
 * Due Date: 7 July 2022 @ 10 PM
 * Submission Date: 9:45 PM on July 7
 * Description: Sub class that inherits methods from the super class. Also adds on methods to return 
 */
public class Customer extends Person{
	
	private int enterCustomerID; // private field for storing the customer's id
	private boolean wantsMailingList; // private field that determines if a customer wants to be on a mailing list.
	private String response;
	
	public Customer(String name) {
		super(name);
	}
	public Customer(int customerID, boolean mailingList) { // constructor that accepts ID and if they want to be on the mailing list.
		enterCustomerID = customerID;
		wantsMailingList = mailingList;
	}
	
	public Customer(boolean mailingList) { // constructor with the only argument about whether they want to be on the mailing list.
		wantsMailingList = mailingList;
	}
	
	public void setCustomerID(int customerID) { // accessor method for ID
		customerID = enterCustomerID;
	}
	
	public void setWantsMailingList(boolean mailingList) { // mutator method for mailingList
		mailingList = wantsMailingList;
	}
	
	public int getCustomerID() {
		return enterCustomerID;
	}
	public String getMailingList() {
		if (wantsMailingList = true) {
			response = "Thank you for signing up for our mailing list!";
		}
		else {
			response = "Thank you for considering joining our mailing list. You are welcome to opt in any time!";
		}
		return response;
	}
}
