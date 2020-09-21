/*-------------------------------------------------------------
// AUTHOR: Brandon Chao
// FILENAME: Lab3.java
// SPECIFICATION: Grade calculator
// FOR: CS 1400- Lab #3
// TIME SPENT: how long it took you to complete the assignment.
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        // This scanner is prepared for you to get inputs
        Scanner scanner = new Scanner(System.in);
        // Declare three variables for HW, midterm, and final exam grades
        int homeWork = 0,midterm = 0,finalExam = 0;
        // Declare a loop control variable i
        int i=0;
        
        //challenge variable retry variable
        int retryCounter = 0;

        while (i < 3)
        {
            // Design if-else control flow:
            //
            // if i is 0, asks for the homework grade
            // if i is 1, asks for the midterm exam grade
            // if i is 2, asks for the final exam grade
            //
            // You have to let the user re-try if any of the inputs is invalid.
            // - homework grade is in [0, 100]
            // - midterm grade is in [0, 100]
            // - final exam grade is in [0, 200]
            //
            // The first if-else statement is attached for your reference. You have to
            // finish the last two statments by yourself.
            //-->

            if (i == 0) {
                // Ask the user for homework grade
            	if(retryCounter == 0)
            		System.out.print("Enter your HOMEWORK grade: ");
            	else
            		System.out.print("\nEnter your HOMEWORK grade " + (3-retryCounter) + " chance(s) left:" );

                // Do input validation
                homeWork = scanner.nextInt();
                if (homeWork<0 || homeWork>100) {
                    // Show the error message
                    System.out.println("\n[ERR] Invalid input. A homework grade should be in [0,100].");
                    retryCounter++;
                    
                } else {
                    // Update the loop variable
                    i++;
                    retryCounter = 0;
                }
            }

            // The other two if-else statements go here
            else if(i == 1)
            {
            	if(retryCounter == 0)
            		System.out.print("\nEnter your MIDTERM EXAM grade: ");
            	else
            		System.out.print("\nEnter your MIDTERM EXAM grade " + (3-retryCounter) + " chance(s) left:" );
            	
            	midterm = scanner.nextInt();
            	if(midterm < 0 || midterm > 100)
            	{
            		System.out.println("\n[ERR] Invalid input. A midterm grade should be in [0,100].");
            		retryCounter++;
            	}
            	else
            	{
            		i++;
            		retryCounter = 0;
            	}
            }
            
            else
            {
            	if(retryCounter == 0)
            		System.out.print("\nEnter your FINAL EXAM grade: ");
            	else
            		System.out.print("\nEnter your FINAL EXAM grade " + (3-retryCounter) + " chance(s) left:" );
            	
            	finalExam = scanner.nextInt();
            	if(finalExam < 0 || finalExam > 200)
            	{
            		System.out.println("\n[ERR] Invalid input. A final grade should be in [0,200].");
            		retryCounter++;
            	}
            	else
            	{
            		i++;
            		retryCounter = 0;
            	}
            }
            
            if(retryCounter == 4) {
            	i = 3;
            	System.out.println("\n[ERR] You have tried 3 times. Please restart your program.");
            }
        }
        if(retryCounter != 4)
        {
	        // Calculate the weighted total by the formula showed in the PDF
	        // -->
	        double weighted_total = ((double)finalExam/200 * 50) + (midterm*.25) + (homeWork*.25);
	
	        // Show the weighted total and tell the user s/he passed or not
	        System.out.println("\n[INFO] Student's Weighted Total is " + weighted_total);
	        if (weighted_total >= 50) 
	        {
	            System.out.println("\n[INFO] Student PASSED the class.");
	        } 
	        else 
	        {
	            System.out.println("\n[INFO] Student FAILED the class.");
	        }
        }
        scanner.close();

    }  // End of main
}  // End of class