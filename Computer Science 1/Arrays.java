// Array Familiarization- Steps 3 & 4
// Lab 8: CIS 1144
// Seth Miller

package arrays;

import java.text.*;

public class Arrays
{
	public static void main( String [] args ) 
	{
		// Lab 8- Step 4
		
		// Problem 27
		System.out.println("Problem 27");
		
		int [ ] a = new int[25];
		for ( int i = 0; i < a.length; i++ ) 
		{
			a[i] = 10; // my code
			System.out.print( a[i] + " " ); // my code (proves that all variables of array have value of 10)
		}
		System.out.println(" ");
		System.out.println(" ");
		
		// Problem 28
		System.out.println("Problem 28");
		
		double [ ] b = { 45.2, 13.1, 12.8, 87.4, 99.0, 100.1, 43.8, 2.4 };
		
		for ( int i = 0; i < b.length; i++ ) 
		{
			if ( b[i] > 20 ) // my code
				System.out.print(b[i] + " " ); // my code
		}
		System.out.println(" ");
		System.out.println(" ");
		
		// Problem 29
		System.out.println("Problem 29");
		
		int [ ] c = { 45, 13, 12, 87, 99, 100, 43, 2 };
		int sum = 0; // I initialized this variable
		
		double average = 0.0;
		for ( int i = 0; i < c.length; i++ )
		{
			sum += c[i]; // my code
		}
		average = ( sum/c.length ); // my code
		System.out.println(average);
		
		System.out.println(" ");
		
		// Problem 30
		System.out.println("Problem 30");
		
		int [ ] d = { 3, 7, 9 };
		int [ ] e = { 2, 9, 4 };
		int dotProduct = 0;
		
		for ( int i = 0; i < d.length; i++ ) 
		{
			dotProduct = dotProduct + ( d[i] * e[i] ); // my code
		}
		System.out.println( dotProduct ); // my code
		
		System.out.println(" ");
		
		// Problem 31
		System.out.println("Problem 31");
		
		int [ ] f = { 3, 6, 10 };
		for ( int i = 0; i < f.length; i++ ) 
		{
			System.out.println( "a[" + i + "] = " + f[i] );
		}
		
	}// end of main
}// end of arrays