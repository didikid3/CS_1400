/*
// AUTHOR: Brandon Chao
// FILENAME: Assingment2.java
// SPECIFICATION: Rock Paper Scissors
// FOR: CS 1400 - ASSIGNMENT #2
// TIME SPENT: 1 HR
//*/

/*
 Part 1
 
 String myString = "Practice makes perfect!"	
 Question 1
 System.out.println("The number of characters is " + myString.length());
 
 Question 2
 System.out.println("The string in uppercase is " + myString.toUpperCase());
 
 Question 3
 THIS IS WITH A FOR LOOP UNDER THIS WILL BE NO FOR LOOP
 String myString ="Practice makes perfect!";
 String newString = "";
 for(int i=0;i<7;i++) {
	if (i%2==0)
		newString += myString.toLowerCase().charAt(i+15);
	else
		newString += myString.toUpperCase().charAt(i+15);
 }
 System.out.println(newString);
 -------------
 String myString = "Practice makes perfect!";
 String newString = "";
 newString += myString.toLowerCase().charAt(15);
 newString += myString.toUpperCase().charAt(16);
 newString += myString.toLowerCase().charAt(17);
 newString += myString.toUpperCase().charAt(1);
 newString += myString.toLowerCase().charAt(19);
 newString += myString.toUpperCase().charAt(20);
 newString += myString.toLowerCase().charAt(21);
 System.out.println(newString);
  
 Question 4
 X=3 and Y=6, What do the following expressions evaluate
 A True
 b False
 c False
 d True
 
 */

//PART 2
import java.util.Scanner;
public class Assignment2 
{
	public static void main(String[] args)
	{
		//Data on two players
		Scanner scanner = new Scanner(System.in);
		String player1, player2;
		
		//Collect the input
		System.out.println("Player 1: Choose rock, scissors, or paper:");
		player1 = scanner.nextLine().toUpperCase();
		System.out.println("Player 2: Choose rock, scissors, or paper:");
		player2 = scanner.nextLine().toUpperCase();
		scanner.close();
		
		//Make sure both have valid choices(Rock paper or scissors)
		if((player1.equals("ROCK")||player1.equals("SCISSORS")||player1.equals("PAPER"))&&
				(player2.equals("ROCK")||player2.equals("SCISSORS")||player2.equals("PAPER")))
				{
					//Check for TIE
					if(player1.equals(player2))
						System.out.println("Tie!");
					
					//Player 1 Chooses Rock
					else if (player1.equals("ROCK"))
					{
						//Logic to see who wins
						if(player2.equals("PAPER"))
							System.out.println("Player 2 Wins!");
						else
							System.out.println("Player 1 Wins!");
					}
					
					//Player 1 Chooses Paper
					else if (player1.equals("PAPER"))
					{
						//Logic to see who wins
						if(player2.equals("SCISSORS"))
							System.out.println("Player 2 Wins!");
						else
							System.out.println("Player 1 Wins!");
					}
					
					//Player 1 Chooses Scissors
					else if (player1.equals("SCISSORS"))
					{
						//Logic to see who wins
						if(player2.equals("ROCK"))
							System.out.println("Player 2 Wins!");
						else
							System.out.println("Player 1 Wins!");
					}
				}
		else
		{
			System.out.println("Wrong Choice!");
		}
	}//end Main
}//end Class
