import java.util.ArrayList;
import java.util.Collections; // collections class for operating on collections

/**
 * Name: Siddharth Sancheti
 * Course: CS-125 05
 * Lab #: Lab 2
 * Due Date: June 30, 2022 @ 10:00 PM
 * Submission Date: 9:30 PM on June 30
 * Description: This is the Operation class stores and sorts all the inputed integers. Then, it will return
 * an array with the integer "-99" omitted from the list.
 */
public class ArrayComputing //name of class and access type.
{

	public static int arrayTotal(ArrayList<Integer> numberList) // static method that calculates the sum total of the array, omitting -99.
	{
		int sumTotal = 0;
		for (int i = 0; i < numberList.size(); i++) {
			sumTotal += numberList.get(i);
		}
		return sumTotal;
	}
	public static double arrayAverage(ArrayList<Integer> numberList) // static method that calculates the average of the array
	{
		int sumTotal2 = 0;
		for (int i = 0; i < numberList.size(); i++) 
		{
			sumTotal2 += numberList.get(i);
		}
		int listSize = numberList.size();
		double average = sumTotal2/listSize;
		return average;
	}
	public static int arrayMax(ArrayList<Integer> numberList) // static method for finding 
	{
		int maxVal = Collections.max(numberList);
		return maxVal;
	}
	public static int arrayMin(ArrayList<Integer> numberList)
	{
		int minVal = Collections.min(numberList);
		return minVal;
	}
	
}
