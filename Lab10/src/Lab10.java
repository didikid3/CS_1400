import java.util.Scanner;

public class Lab10 {
	
	public static void main(String[] args) {
		
	      //declaring variables
	      String choice, str;
	      char command;

	      Scanner keyboard = new Scanner(System.in);
	      
	      do
	       {
	    	  
	           // ask a user a word/sentence or q to quit
	           System.out.println("Do you want to check if a word/sentence is a palindrome (yes/no)?");
	           choice = keyboard.next().toLowerCase();
	           command = choice.charAt(0);
	           
	           switch (command)
	            {
	                 case 'y': // tests whether a word/sentence is a palindrome
	                      // consuming the empty string
	                      keyboard.nextLine();
	                	 
	                      System.out.println("\nPlease enter a word/sentence:");
	                      str = keyboard.nextLine();
	                      if(Palindrome.isPalindrome(str))
				 System.out.println(str + " is a palindrome\n");
			      else
				 System.out.println(str + " is not a palindrome\n");
	                      break;

	                 case 'n': // quit

                	      System.out.println("Bye!");
	                      break;
	                 default:
	                      System.out.println("Invalid input!");
	            }

	        } while (command != 'n');
	      
	      keyboard.close();
		
	} //end of the main method

} //end of the class