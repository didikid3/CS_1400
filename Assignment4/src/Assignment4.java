/*
// AUTHOR: Brandon Chao
// FILENAME: Assignment4.java
// SPECIFICATION: Check if nums are prime. Then calc max/min, sum, count, avg
// FOR: CS 1400 - ASSIGNMENT #4
// TIME SPENT: 1.5 HRS
//*/

import java.util.Scanner;
public class Assignment4 
{
	public static void main(String[] args)
	{
		int total = 0;
		int count = 0;
		int max=0,min=0;
		double average;
		int currentNum;
		boolean quit = false;
		boolean prime = true;
			
		Scanner scanner = new Scanner(System.in);
		
		//Asks for + Ints until they type -1
		while (quit == false)
		{
			System.out.println("Enter a positive integer. Enter -1 to quit.");
			currentNum= scanner.nextInt();
			
			//check if user input -1
			if(currentNum != -1)
			{
				//Check for Prime or Not
				prime = true;
				for(int i = 2; i<currentNum; i++) {
					
					if(currentNum%i == 0) {
						prime = false;
						i = currentNum;
					}
				}//End FOR
				
				if(prime)
					System.out.println("The number " + currentNum + " is prime.");
				else
					System.out.println("The number " + currentNum + " is not prime");
				
				//Initialize MAX MIN on first Num
				if(count == 0) {
					max = currentNum;
					min = currentNum;
				}
				
				//Checking MAX MIN
				if(currentNum > max)
					max = currentNum;
				else if(currentNum < min)
					min = currentNum;
				
				//Preparing to calc Average
				total += currentNum;
				count += 1;
			}
			
			else
				quit = true;
			
		}//End WHILE
		
		average = (double)total / count;
		scanner.close();
		//Output to User
		System.out.println("The maximum positive integer is: " + max);
		System.out.println("The minimum positive integer is: " + min);
		System.out.println("The sum is: " + total);
		System.out.println("The count of number(s) is: " + count);
		System.out.printf("The average is: %.2f",average);
		
		
	}//End MAIN
}//End CLASS
