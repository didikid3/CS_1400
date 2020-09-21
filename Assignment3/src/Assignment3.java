/*
// AUTHOR: Brandon Chao
// FILENAME: Assignment3.java
// SPECIFICATION:  Make a Menu to perform tasks on 2 strings
// FOR: CS 1400 - ASSIGNMENT #3
// TIME SPENT: 1HR
//*/


/*
 * PART 1
 * 
 * QUESTION 1
 * 	if(score > 59)
	{
		if(score > 69)
		{
			if(score > 79)
			{
				if(score > 89)
					grade = 'A';
				else
					grade = 'B';
			}
			else
				grade = 'C';
		}
		else
			grade = 'D';
	}
	else
		grade = 'F';
 * 	
 * QUESTION 2
 * switch(String.valueOf(letter).toLowerCase())
	{
	case "a":
	case "b":
		System.out.println("Your doing a good job!");
		break;
	case "c":
	case "d":
		System.out.println("You need to study more!")
		break;
	default:
		System.out.println("Maybe next time!");
	}
 */



//PART 2
import java.util.Scanner;
public class Assignment3 
{
	public static void main(String[] args)
	{
		String str1, str2;
		char userInput;
		boolean quit = false;
		
		String commandOptions = "Comand Options\n"
							  + "-----------------------------------\n"
							  + "Option a: checks if the lengths of the two strings are the same.\n"
							  + "Option b: checks if two strings are the same or different.\n"
							  + "Option c: checks which string is lexically larger, or if they are the same\n"
							  + "Option d: prints out the first character (index 0) of each string\n"
							  + "Option e: prints out a new string consisting of the first string concatenated "
							  			+ "(appended) with the second string.\n"
							  + "Option f: prints out two strings using upper case latters.\n"
							  + "Option q: quit the program.";
		
		
		Scanner scanner = new Scanner(System.in);
		
		//Collect User input
		System.out.println("Please enter a string.");
		str1 = scanner.nextLine();
		System.out.println("Please enter another string.");
		str2 = scanner.nextLine();
		
		//print Menu
		System.out.println(commandOptions);
		System.out.println("\n");
		
		//Continues to use this menu until 'q' is typed
		while(quit == false)
		{
			System.out.println("Please, enter an option from the menu.\n");
			userInput = scanner.nextLine().charAt(0);
			
			switch(userInput)
			{
			//Check lengths are same
			case 'a':
				if(str1.length() == str2.length())
					System.out.println("The lengths are the same.");
				else
					System.out.println("The lengths are not the same.");
				break;
				
			//Check strings are equal	
			case 'b':
				if(str1.equals(str2))
					System.out.println("The two strings are the same.");
				else
					System.out.println("The two strings are different.");
				break;
				
			//Lexically larger
			case 'c':
				if(str1.compareTo(str2)>0)
					System.out.println("The first string is lexically larger.");
				else if(str1.compareTo(str2)<0)
					System.out.println("The second string is lexically larger.");
				else
					System.out.println("The two strings are the same.");
				break;
				
			//Print first char of both
			case 'd':
				System.out.println("The first character of the first string is " + str1.charAt(0));
				System.out.println("The first character of the secon string is " + str2.charAt(0));
				break;
				
			//Print concatenated
			case 'e':
				System.out.println("The concatenation of the two strings is \"" + str1+str2 + "\".");
				break;
				
			//Print upper case
			case 'f':
				System.out.println("The first string using upper case letters: " + str1.toUpperCase());
				System.out.println("The second string using upper case letters: " + str2.toUpperCase());
				break;
			
			//Quit
			case 'q':
				quit = true;
				scanner.close();
				System.out.println("Goodbye!");
				break;
			
			//Invalid Inputs
			default:
				System.out.println("Invalid Option.");
				
			}//End Switch
		}//End While
		
	}//end Main
}//end Class
