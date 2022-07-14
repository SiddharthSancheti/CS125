import java.util.Scanner;
public class RectangleApp {

	public static void main(String[] args) 
	{
		double length, width;
		
		//new object for Scanner input
		Scanner keyboard = new Scanner(System.in);
		
		// get the length
		System.out.print("Enter the length: ");
		length = keyboard.nextDouble();
		
		System.out.print("Enter the width: ");
		width= keyboard.nextDouble();
		
		// instance of the Rectangle class that passes entered arguments to the constructor
		Rectangle input = new Rectangle(length, width);
		
		//display the data
		System.out.println("\nArea: " + input.computeArea() + " units squared");
		System.out.println("Perimeter: " + input.computePerimeter()+ " units");
		
		keyboard.close();
	}

}
