// Calculates the sum of the numbers entered by the user
// Lab 6: CIS 1144
// Seth Miller

package workingWithLoops;

import java.util.Scanner;

public class Calculator
{
	public static void main( String [] args)
	{
		final int SENTINEL = 0;
		int number;
		int total = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println( "Welcome to the addition calculator.\n" );
		
		System.out.print( "Enter the first number"
		+ " or 0 for the total > " );
		number = scan.nextInt( );
		
		while ( number != SENTINEL )
		{
			total += number;
			
			System.out.print( "Enter the next number"
			+ " or 0 for the total > " );
			number = scan.nextInt( );
		}
		
		System.out.println( "The total is " + total );
	}
}
