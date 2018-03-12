// Name: Seth Miller
// Assignment: Programming Assignment 1- Task 2
// Due Date: September 8th, 2017
// Task: Convert inch values into millimeters
// Test Case 1: 2 inches should equal 50.8 millimeters.
// Test Case 2: 5 inches should equal 127.0 millimeters.
// Test Case 3: 10 inches should equal 254.0 millimeters.
// Test result: Correct output predicted on all test cases

package program1CS1;

       public class Task2
       {
    	   
    	   public static void main(String [] args)
    	   {
    		 // STEP 1: Input inch measurements (variables)
    		 int inches1 = 2;
    		 int inches2 = 5;
    		 int inches3 = 10;
    		 
    		 // STEP 2: Input amount of millimeters per inch (constant)
    		 final double MILLIMETERS_PER_INCH = 25.4;
    		 
    		 // STEP 3: Convert inch measurements to millimeters
    		 double millimeters1 = inches1 * MILLIMETERS_PER_INCH;
    		 double millimeters2 = inches2 * MILLIMETERS_PER_INCH;
    		 double millimeters3 = inches3 * MILLIMETERS_PER_INCH;
    		 
    		 // STEP 4: Display inch measurements converted to millimeters
    		 System.out.println(inches1 + " inches: " + millimeters1 + " millimeters");
    		 System.out.println(inches2 + " inches: " + millimeters2 + " millimeters");
    		 System.out.println(inches3 + " inches: " + millimeters3 + " millimeters");
    	   }
       
       }