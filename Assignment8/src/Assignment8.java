/* 	
// AUTHOR: Brandon Chao
// FILENAME: Assignment8.java
// SPECIFICATION: Learn about recursion
// FOR: CS 1400 - ASSIGNMENT #8
// TIME SPENT: 30 MIN
//*/

import java.util.Scanner;
public class Assignment8  {
	
  public static void main(String[] args)  {
	  
      //declaring variables
      String choice, str, match, strResult;
      char command;
      int number, anotherNumber, result;

      Scanner keyboard = new Scanner(System.in);

      // print the menu
      printMenu();

      do
       {
    	      	  
           // ask a user to choose a command
           System.out.println("\nPlease enter a command:");
           choice = keyboard.next().toLowerCase();
           command = choice.charAt(0);
           
           switch (command)
            {
                 case 'a': // tests whether match is contained in str
                      // consuming the empty string
                      keyboard.nextLine();

                      System.out.println("\nPlease enter a string:");
                      str = keyboard.nextLine();
                      System.out.println("\nPlease enter a substring:");
                      match = keyboard.nextLine();
                      if(Geek2.find(str, match))
			 System.out.println("\n" + match + " is contained in " + str + ".\n");
		      else
			 System.out.println("\n" + match + " is not contained in " + str + ".\n");
                      break;

                 case 'b': // computes the sum of the digits of a number
                     System.out.println("\nPlease enter a number:");
                     number = keyboard.nextInt();
                     result = Geek2.digitSum(number);
 		     System.out.println("\nThe sum of the digits of " + number + " is " + result + ".\n");
                     break;

                 case 'c': // computes a^n, where n is a positive integer
                     System.out.println("\nPlease enter a number:");
                     number = keyboard.nextInt();
                     System.out.println("\nPlease enter another number:");
                     anotherNumber = keyboard.nextInt();
                     result = Geek2.pow(number, anotherNumber);
 		     System.out.println("\n" + number + " to the power of " + anotherNumber + " is " + result + ".\n");
                     break;

                 case 'd': // finds the smallest digit in a number
                     System.out.println("\nPlease enter a number:");
                     number = keyboard.nextInt();
                     result = Geek2.smallestDigit(number);
 		     System.out.println("\nThe smallest digit in " + number + " is " + result + ".\n");
                     break;
                     
                 case 'e': // reverses a string
                      // consuming the empty string
                      keyboard.nextLine();

                     System.out.println("\nPlease enter a string:");
                     str = keyboard.nextLine();
                     strResult = Geek2.reverse(str);
 		     System.out.println("\nThe reverse of " + str + " is " + strResult + ".\n");
                     break;
                     
                 case 'q':
                     System.out.println("\nBye!");
                     break;
                 default:
               	     System.out.println("Invalid input!");
            }

        } while (command != 'q');
      
      keyboard.close();

    }  //end of the main method


  // this method prints out the menu to a user
  public static void printMenu()
   {
    System.out.print("\nCommand Options\n"
                   + "-----------------------------------\n"
                   + "a: tests whether match is contained in str\n"
                   + "b: computes the sum of the digits of a number\n"
                   + "c: computes a^n, where n is a positive integer\n"
                   + "d: finds the smallest digit in a number\n"
                   + "e: reverses a string\n"
                   + "q: quit this program\n");

    } // end of the printMenu method
 } // end of the Assignment8 class