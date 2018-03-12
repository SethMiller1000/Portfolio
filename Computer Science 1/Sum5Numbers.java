// Calculates the sum of 5 numbers
// Lab 6: CIS 1144
// Seth Miller

package workingWithLoops;

import java.util.Scanner;

public class Sum5Numbers
{
	public static void main( String [] args)
	{
		int total = 0;
		int number;
		
		Scanner scan = new Scanner( System.in );
		
		for ( int i = 1; i <= 5; i++)
		{
			System.out.print( "Enter an integer > " );
			number = scan.nextInt( );
			
			total += number;
		}
		
		System.out.println( "The total is " + total );
	}
}
