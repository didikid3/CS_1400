/*-------------------------------------------------------------
// AUTHOR: Brandon Chao
// FILENAME: Lab6.java
// SPECIFICATION: Creating class with different functions on a shape
// FOR: Lab 6
// TIME SPENT: 30 MIN
//-----------------------------------------------------------*/

import java.util.Scanner;

//===========================================================
// Create and determine properties of a Quadrilateral
//===========================================================

public class Lab6 {
    public static void main(String[] args) {


       Scanner console = new Scanner(System.in);
       int side1, side2, side3, side4; 
       String another;

       do
       {
         
         // Read the sides of the quadrilateral
         System.out.println("Enter the sides of the quadrilateral: ");
         side1 = console.nextInt();
         side2 = console.nextInt();
         side3 = console.nextInt();
         side4 = console.nextInt();

         //create a quadrilateral named "shape" by using the default constructor
         Quadrilateral shape = new Quadrilateral();

         //set the sides of the created quadrilateral
         shape.setSide1(side1);
         shape.setSide2(side2);
         shape.setSide3(side3);
         shape.setSide4(side4);
 
         //print all quadrilateral sizes in a single line
         System.out.println("Sides: " + shape.getSide1() + " "
        		 			+ shape.getSide2() + " "
        		 			+ shape.getSide3() + " "
        		 			+ shape.getSide4());

         //fill out the code to check for rectangle 
         if(shape.isRectangle())
        	 System.out.println("It is a rectangle");
         else
        	 System.out.println("It is not a rectangle");

         //fill out the code to check for square
         if(shape.isSquare())
        	 System.out.println("It is a square");
         else
        	 System.out.println("it is not a square");
        
         System.out.println();
         System.out.print("Check another Quadrilateral (y/n)? "); 
         another = console.next();
         System.out.println();

       } while (another.equalsIgnoreCase("y")); 
       console.close();

    }	// method main

}	// class Lab6