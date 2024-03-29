/*-------------------------------------------------------------------------
// AUTHOR: Brandon Chao
// FILENAME: Lab1.java
// SPECIFICATION: Guided lab/activity Sept 4, Get user input, calculate average
// FOR: CS 1400- Lab #1
// TIME SPENT: 8 Min
//-----------------------------------------------------------*/

// All imports have to be included outside the public class
// import the Scanner class from the java.util library
import java.util.Scanner;

// class name should match the file name
public class Lab1{
	// we must have a main method to run the program
	public static void main(String[] args){

		// create a Scanner object to get input from the keyboard
		Scanner scanner = new Scanner(System.in);


		// declare variables 
		double input1,input2,input3;
		final int AMOUNT_INPUT=3;
		double average;


		// Get the Input
		System.out.print("Enter the score on the first test: ");
		input1=scanner.nextInt();
		System.out.print("\n");
		System.out.print("Enter the score on the second test: ");
		input2=scanner.nextInt();
		System.out.print("\n");
		System.out.print("Enter the score on the third test: ");
		input3=scanner.nextInt();
		System.out.print("\n");


		// Calculate the average
		average = (input1+input2+input3)/(double)AMOUNT_INPUT;

		// Display Results
		System.out.println("Your average test score is: "+average);
		
		scanner.close();

	}//end main method
}//end Lab1 class