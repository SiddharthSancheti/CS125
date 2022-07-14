/**
 * Name: Siddharth Sancheti
 * Course: CS-125 05
 * Lab #: Lab 2/ ArrayComputingApp
 * Due Date: June 30, 2022 @ 10:00 PM
 * Submission Date: 9:30 PM on June 30
 * Description: This driver class takes input of a series of integers and
 * sends it to the operating class. It will then print the minimum integer, the maximum integer,
 * and the average of the series.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayComputingApp // start of ArrayComputing Application class.
{
	public static void main(String[] args) // main method (no return values)
	{
		
		Scanner keyboard = new Scanner(System.in); // scanner object called keyboard. Takes keyboard input.
		ArrayList<Integer> numberList = new ArrayList<Integer>(); // create an array with the data type integer and a size of 100.
		
		System.out.println("This program will take a series of integer inputs and return the average, min,");
		System.out.println("max, and the sum of the integers. Enter the integer '-99' when you are done.");
		
		System.out.print("\n");
		System.out.print("Enter an integer: ");
		int input = keyboard.nextInt(); // store the user's input in the field 'input'.
		
		while (input != -99) {
			numberList.add(input); // append the user's input to the ArrayList
			System.out.print("Enter an integer: ");
			input = keyboard.nextInt(); // stores the user's input in the field input
		}
		int size = numberList.size() - 1;
		numberList.remove(size); // removes the last integer (-99) from the list
		
		
		System.out.println("\n");
		System.out.println("The total is: " + ArrayComputing.arrayTotal(numberList));
		System.out.println("The average is: " + ArrayComputing.arrayAverage(numberList));
		System.out.println("The maximum number is " + ArrayComputing.arrayMax(numberList));
		System.out.print("The minimum number is " + ArrayComputing.arrayMin(numberList));
	
		
		keyboard.close(); // close the keyboard object
	} // end the main method
} // end the class
