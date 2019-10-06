// Seth Miller
// Southwest Baptist University - Spring 2019
// CIS-3333 - Algorithms & Data Structures
// Program 5 - Parallel Linear Searching (Due May 17th, 2019)
// Write a linear search in Java using the Threads class to implement parallelism as discussed in class.

import java.util.*;

public class ParallelLinearSearch
{
	public class ParallelLinearSearch( int [] sortedArray, int startPoint, int endPoint, int target )
	{
		public void run()
		{
			for ( int i = startPoint; i < endPoint + 1; i++ )
			{
				if ( sortedArray[ i ] == target )
				{
					System.out.println( i );
					
				} // end of if ( sortedArray[ i ] == target )
				
			} // end of for ( int i = startPoint; i < endPoint + 1; i++ )
			
		} // end of public void run()
		
	} // end of public class ParallelLinearSearch( int [] counterArray )
	
	public static void main( String [] args )
	{
		// ask user for target value
		Scanner scan = new Scanner( System.in );
		System.out.print( "Please enter the value you want to search for: " );
		final int TARGET = scan.nextInt();
		
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
		
		System.out.println( "Target found at indexes:" );
		
		ParallelLinearSearch firstHalf = new ParallelLinearSearch( array, 0, midpoint, TARGET );
		ParallelLinearSearch secondHalf = new ParallelLinearSearch( array, midpint + 1, array.length() - 1, TARGET );
		
		// run both threads
		// each half is searched in a linear format
		firstHalf.run();
		secondHalf.run();
		
		// join threads
		firstHalf.join();
		secondHalf.join();
		
		System.out.println( "Search done" );
	
	} // end of public static void main ()

} // end of public class ParallelLinearSearch