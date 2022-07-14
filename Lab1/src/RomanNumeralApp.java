import java.util.Scanner;
public class RomanNumeralApp 
{
	public static void main(String[] args) 
	{
		int num;
		
		//scanner object
		Scanner keyboard = new Scanner(System.in);
		
		//take user input
		System.out.print("Enter a number between 1 and 10: ");
		num = keyboard.nextInt();
		
		RomanNumeral displayResult = new RomanNumeral(num);
		
		//print the final answer
		System.out.println(displayResult.convertNum());
		keyboard.close();
	}

}
