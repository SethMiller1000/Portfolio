/* Seth Miller - April 3rd, 2019
   Southwest Baptist University
   CIS-3333 - Algorithms & Data Structures
   Program 4 - Counter-Sort Algorithm
   
   Description - This program takes a single command line parameter,
   the number of times the function should be tested with random arrays,
   creates a random length array of random digits, sorts it using a counter sort algorithm,
   and displays the sorted array
*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define MAX_ARRAY_LENGTH 1000

void main( int argc, char ** argv )
{
	// CHECK TO SEE IF NUMBER OF TIMES TO SORT A RANDOM ARRAY WAS GIVEN IN COMMAND LINE
	
	if ( argc != 2 ) /* not enough arguments are given */
	{
		/* print error message */
		printf();
		printf( "ERROR: Not enough arguments were given! Try again." );
		printf();
			
	} /* end of if ( argc != 2 ) */
		
	else
	{
		// SORT A RANDOM LENGTH ARRAY AND DISPLAY THE RESULT <INPUT NUMBER> TIMES
		srand( time( NULL ) );
		
		// do N operations - counter sort random array 
		int operations;
		for ( operations = 0; operations < argv[ 1 ]; operations++ ) // sort a random length
		{
			// creating integer array with random length
			int length = rand() % ( MAX_ARRAY_LENGTH + 1 );
			int digitArray[ length ]; 
			
			// setting integer array values to random integers ( 0 - 9 )
			int y;
			for ( y = 0; y < length; y++ )
			{
				digitArray[ y ] = rand() % 10;

			} /* end of for ( y = 0; y < length; y++ ) */
			
			// CALL COUNTERSORT FUNCTION - PERFORM COUNTER SORT ALGORITHM
			
			int result = CounterSort( digitArray, length );
			
			// TEST IF ARRAY WAS SUCCESSFULLY SORTED
			
			if ( result == 1 )
			{
				printf( "SUCESS: ARRAY IS SORTED" ); // success message
				printf();
				
			} /* end of if ( result == 1 ) */
			
			else
			{
				printf( "FAILURE: ARRAY IS NOT SORTED" ); // failure message
				printf();
				
			} /* end of else */
		
		} /* end of for ( operations = 0; operations < argv[ 1 ]; operations++ ) */
		
	} /* end of else */

} /* end of main */

int CounterSort( int * data, int length )
{
	int numberCounter[ 10 ] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }; // counts the occurences of each digit ( 0 - 9 )
	
	if ( length < 0 ) // length of array to sort is invalid value
	{
		return 0; // failure value
		
	} /* end of if ( length < 0 ) */
	
	int x;
	for ( x = 0; x < length; x++ ) // loop through entire random integer array
	{
		numberCounter[ data[ x ] ]++; // incrementing counter sort array element with index of digit found
		
	} /* end of for ( x = 0; x < length; x++ ) */
	
	int sortedArray[ length ]; // the sorted array as a result of the counter sort array
	int index = 0; // the index the next integer will go to
	
	for ( x = 0; x < 10; x++ ) // add and print all of each digit ( 0 - 9 )
	{
		int y;
		for ( y = 0; y < numberCounter[ x ]; y++ ) // add and print how many of that digit
		{
			sortedArray[ index ] = x;
			index++;
			print( x + " " );
			
		}/* end of for ( y = 0; y < numberCounter[ x ]; y++ ) */
	
	} /* end of for ( x = 0; x < length; x++ ) */
	
	// TEST IF ARRAY IS SORTED
	
	for ( x = 0; x < length - 1; x++ )
	{
		if ( sortedArray[ x ] > sortedArray[ x + 1 ] ) // integer in sorted array is larger than the next value
		{
			return 0; // failure value
			
		} /* end of if ( sortedArray[ x ] > sortedArray[ x + 1 ] ) */
		
	} /* end of for ( x = 0; x < length; x++ ) */
	
	printf();
	return 1; // success value
	
} /* end of int CounterSort() */