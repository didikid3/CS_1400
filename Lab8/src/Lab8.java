/*-------------------------------------------------------------------------
// AUTHOR: Brandon Chao
// FILENAME: Lab8.java
// SPECIFICATION: Create an array, preform a sort, remove the smallest element, ask user to remove certain value.
// FOR: CS1400 - Lab #8
// TIME SPENT: 30MIN
//----------------------------------------------------------------------*/

import java.util.Scanner;

public class Lab8
{
    public static void main(String[] args)
    {
        // ============================================================
        // Declare some variables. You might need
        // 
        // - an integer for the array size,
        // - a int for the exchange element, and
        // - a scanner object for requesting input from System.in
        // 
        int arraySize;
        int switchElement;
        Scanner scanner = new Scanner(System.in);

        // ============================================================
        // Request array size from the user
        // 
        // - Print this message "How many elements in the array?"
        // - Request an integer from the user using the Scanner object and save it
        // 
        System.out.print("How many elements in the array? ");
        arraySize = scanner.nextInt();
        
        
        // Declare a int array by the size you received above
        int[] userArray = new int[arraySize];
        

        // ============================================================
        // Fill in the Array

        int numOfElements = userArray.length;
        for (int i = 0; i < numOfElements; i++)
        {        
            // Display the message: "Please enter the next value:"
            System.out.print("Please enter the next value: ");
            // Request the next element (int) from the user,
            // save it to the ith element of the array
            userArray[i] = scanner.nextInt();
        }
        

        // ============================================================
        // Sort the array's elements in increasing order
        // 
        // Here we will use Selection Sort like algorithm.

        // The first for loop iterates all elements as element_i
        for (int i = 0; i < numOfElements; i++)
        {
            // The second for loop finds the right position of element_i
            for (int j = i + 1; j < numOfElements; j++)
            {
                // Compare ith value and jth value,
                // 
                // - If array[i] >= array[j], swap these two values
                //   
                // For example, let array[i] = 10, array[j] = 20, to swap
                // array[i] and array[j] means array[i] will become 20
                // and array[j] will have 10.
                // 
                // To swap the values in two position, you would need an
                // extra variable to temporarily hold the value. For example,
                // 
                //     temp = array[i];
                //     array[i] = array[j];
                //     array[j] = temp;
                // 
                if(userArray[i] > userArray[j])
                {
                	switchElement = userArray[i];
                	userArray[i]=userArray[j];
                	userArray[j]=switchElement;
                }
            }
        }


        // ============================================================
        // Display the sorted array on the same line
        
        System.out.println("The array after sorting");

        for (int i = 0; i < numOfElements; i++)
        {
            // Print ith element, do NOT include line break
        	if(i != numOfElements - 1) {
        		System.out.print(userArray[i] + ", ");
        	}
        	else
        		System.out.print(userArray[i]);
        }

        // Print a line break
        System.out.print("\n");
        
        
        // ============================================================
        // Remove the minimum in the sorted array
        // 
        // As our array is sorted in the increasing order, to remove the
        // minimum, we just remove the first element in the array. It is like
        // shifting the array to the left by one element.
        
        // Because we are doing shifting, in each iteration, we use two
        // values, one at index i, the other at index i+1.
        // To prevent us from going over the boundary of array, the following
        // offset variable should be set as the correct value.
        int offset = 1;
        
        // In this for loop, we move the element at i + 1 to the position i
        for (int i = 0; i < numOfElements - offset; i++)
        {
            // Move array[i + 1] to array[i]
        	userArray[i] = userArray[i+1];
        }

        // The last element will be set as zero. Remember the greatest index
        // should be array.length - 1.
        userArray[userArray.length - 1] = 0;
        
        
        // ============================================================
        // Display the Array after removing the first element
        
        System.out.println("The array with the minimum removed");
        
        for (int i = 0; i < numOfElements; i++)
        {
            // Print ith element, do NOT include line break
        	if(i != numOfElements - 1) {
        		System.out.print(userArray[i] + ", ");
        	}
        	else
        		System.out.print(userArray[i]);
        }

        // Print a line break
        System.out.print("\n");
        
        
        // ============================================================
        // Search for an element and remove it

        // Ask the user which element to remove
        System.out.println("Enter the value to search and remove:");
        // Use your Scanner and the int variable valueToRemove to get a value for search
        int valueToRemove = scanner.nextInt();

        // To search, we can iterate all values, record the index of target (t),
        // and then shift to the left values from t to the end.
        boolean isFound = false;
        for (int i = 0; i < numOfElements; i++)
        {
            // if ith element == valueToRemove,
            //     Set a flag isFound
            // 
            // if isFound,
            //     if i + 1 is available
            //         move element i + 1 to index i
            //     if i + 1 is not available
            //         set element i as zero
        	if(userArray[i] == valueToRemove)
        	{
        		isFound = true;
        	}
        	if(isFound)
        	{
        		if(i+1 < numOfElements)
        			userArray[i] = userArray[i+1];
        		else
        			userArray[i] = 0;
        	}
        }

        if (isFound)
        {
            System.out.println("Search element found");
        }
        else
        {
            System.out.println("Search element NOT found");   
        }


        // ============================================================
        // Display the final array
        
        System.out.println("\nThe final array");
        
        for (int i = 0; i < numOfElements; i++)
        {
            // Print ith element, do NOT include line break
        	if(i != numOfElements - 1) {
        		System.out.print(userArray[i] + ", ");
        	}
        	else
        		System.out.print(userArray[i]);
        }

        // Print a line break
        System.out.print("\n");
    
    }
}