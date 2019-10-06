// Seth Miller
// Southwest Baptist University - Spring 2019
// CIS-3333 - Algorithms & Data Structures
// Program 5 - Parallel Linear Runtime Sorting (Due May 17th, 2019)
// Redo program 4 in Java using the Threads class to implement parallelism as discussed in class.

import java.util.*;

public class ParallelLinearSort()
{
	public class ParallelLinearSort extends Thread ( int [] unsortedArray, int startPoint, int endPoint ) 
	{
		int possibleValues = 10;
		// must be changed if more or less
		// possible values for elements is desired
		
		int [] counterArray = new int[ possibleValues ];
		
		// fill each index in counter array with value of zero (0)
		// because array has not been sorted yet
		for ( int i = 0; i < possibleValues; i++ )
		{
			counterArray[ i ] = 0;
			
		}// for ( int i = 0; i < possibleValues; i++ )
		
		// function that sorts array and fills counter array
		public void run()
		{
			for ( int i = startPoint; i < endPoint + 1; i++ )
			{
				counterArray[ unsortedArray[ i ] ]++;
				
			} // end of for ( int i = startPoint; i < endPoint + 1; i++ )
			
		}// end of public void run()
		
		public int [] getCounterArray()
		{
			return counterArray;
		
		} // end of public int [] getCounterArray ()
		
	} // end of public class ParallelLinearSort extends Thread ( int [] unsortedArray )
	
	public static void main( String [] args )
	{
		int possibleValues = 10;
		// must be changed if more or less
		// possible values for elements is desired
		
		// create long integer array
		int [] array = new int [1000]; // number in brackets = length of array
		int midpoint = array.length() / 2 - 1;
		
		// fill array with random integers
		Random random = new Random();
		for ( int i = 0; i < array.length(); i++ )
		{
			array[ i ] = random.nextInt(10) - 1;
			
		} // end of for ( int i = 0; i < arrayLength; i++ )
			
		// create two threads each with their own half of the array
		ParallelLinearSort firstHalf = new ParallelLinearSort( array, 0, midpoint );
		ParallelLinearSort secondHalf = new ParallelLinearSort( array, midpoint + 1, array.length() - 1 );
		
		// run both threads
		// each half is sorted by itself
		firstHalf.run();
		secondHalf.run();
		
		// join threads
		firstHalf.join();
		secondHalf.join();
		
		// get counterArrays for sorted sub-arrays
		int [] firstHalfCounter = firstHalf.getCounterArray();
		int [] secondHalfCounter = secondHalf.getCounterArray();
		
		// get counterArrays of the two sorted subarrays, combine them,
		// and display sorted array
		int [] finalCounterArray = new int[ possibleValues ];
		
		for ( int i = 0; i < possibleValues; i++ )
		{
			finalCounterArray[ i ] = firstHalfCounter[ i ] + secondHalfCounter[ i ];
			
			for ( int x = 0; x < finalCounterArray[ i ]; x++ )
			{
				System.out.print( i );
				
			} // end of for ( int x = 0; x < finalCounterArray[ i ]; x++ )
			
		} // end of for ( int i = 0; i < possibleValues; i++ )
			
		System.out.println();
		
	} // end of public static void main()

} // end of public class ParallelLinearSort()