// Name: Seth Miller
// Assignment: Programming Assignment 1- Task 3
// Due Date: September 8th, 2017
// Task: Convert a four digit binary number to base 10
// Test case 1: Entering the series of digits "1101" should display a base 10 value of "13"
// Test case 2: Entering the series of digits "0010" should display a base 10 value of "2"
// Test case 3: Entering the series of digits "0101" should display a base 10 value of "5"
// Test result: Correct output predicted on all test cases

package program1CS1;

import java.util.Scanner;

      public class Task3
      {
    	
    	  public static void main (String [] args)
    	  {
    		  Scanner scan = new Scanner( System.in );
    		  
    		  // STEP 1: Input the base ten values of each binary digit (starting on the right)
    		  int FIRST_BINARY_DIGIT_VALUE = 1;
    		  int SECOND_BINARY_DIGIT_VALUE = 2;
    		  int THIRD_BINARY_DIGIT_VALUE = 4;
    		  int FOURTH_BINARY_DIGIT_VALUE = 8;
    		  
    		  // STEP 2: Enter scanner to receive all 4 binary digit values from the user
    		  System.out.print("Please input the leftmost digit:  ");
    		  int leftmostBinaryDigit = scan.nextInt();
    		  
    		  System.out.print("Please input the next digit:      ");
    		  int secondBinaryDigit = scan.nextInt();
    		  
    		  System.out.print("Please input the next digit:      ");
    		  int thirdBinaryDigit = scan.nextInt();
    		  
    		  System.out.print("Please input the last digit:      ");
    		  int fourthBinaryDigit = scan.nextInt();
    		  
    		  // STEP 3: Calculate the value of each of the four binary digits entered
    		  int firstBaseTenValue = leftmostBinaryDigit * FOURTH_BINARY_DIGIT_VALUE;
    		  int secondBaseTenValue = secondBinaryDigit * THIRD_BINARY_DIGIT_VALUE;
    		  int thirdBaseTenValue = thirdBinaryDigit * SECOND_BINARY_DIGIT_VALUE;
    		  int fourthBaseTenValue = fourthBinaryDigit * FIRST_BINARY_DIGIT_VALUE;
    		  
    		  // STEP 4: Add up the values of all four binary digits
    		  int baseTenNumber = firstBaseTenValue + secondBaseTenValue + thirdBaseTenValue + fourthBaseTenValue;
    				  
    		  // STEP 5: Display the sum of all four binary digits
    	      System.out.println();
    		  System.out.println("This number is " + baseTenNumber + " in base 10.");
    		  
    		  
    	  }
     
      }
      