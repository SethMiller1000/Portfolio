// Fun with sorting- Insertion sort
// Lab 10: CIS 1144
// Author: Seth Miller

package sortingPackage;

import java.util.Random;

public class FunWithInsertionSort
{
	public static void print (int [] n)
	// TASK: Displays an array
	{
		for ( int i = 0; i < n.length; i++ )
			System.out.print( n[i] + " " );
		System.out.println( );
		
	}// end of print method
	
	public static void insertionSort( int [] array )
	// TASK: Sort array numbers using bubble-sort algorithm
	{
		int counter = 0;
		
		int i, j, temp;
		
		for ( i = 0; i < array.length; i++ )
		{
			j = i;
			temp = array[i];
			
			while ( j != 0 && array [j - 1] > temp )
			{
				array[j] = array[j-1];
				j--;
				counter++;
			}// end of while loop
			
			array[j] = temp;
			
		}// end of for loop i < array.length
		System.out.println(counter);
		
	}// end of insertion sort method

public static void main( String [] args )
{
	int [] numArray = new int [ 100 ];
	Random rand = new Random( );
	
	for ( int i = 0; i < numArray.length; i++ )
	{
		numArray[i] = rand.nextInt( 1000 ) + 1;
		
	}// end of for loop i < numArray.length
	
	print (numArray);
	insertionSort( numArray );
	print (numArray);
	
	}// end of main

}// end of FunWithInsertionSort
