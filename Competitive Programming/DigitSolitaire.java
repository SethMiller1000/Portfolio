package competitiveProgramming;

import java.util.Scanner;

public class DigitSolitaire
{
	public static void main ( String [] args )
	{
		// create scanner
		Scanner scan = new Scanner (System.in);
		
		// initialize and display number variable with value of next integer
		Integer number = scan.nextInt();
		
		// process number while it is greater than 0
		while ( number > 0 )
		{
			// display number
			System.out.print( number.toString() );
			
			// process number while it is 10 or larger
			while ( number >= 10 )
			{
				// Use wrapper class to convert number to string
				// and assign to numString
				String numString = number.toString();
				
				int newNumber = 1;
				
				// process each character of the string
				for ( int i = 0; i < numString.length(); i++ )
				{
					String digit = "" + numString.charAt(i);
					newNumber = newNumber * Integer.parseInt( digit );
					
				}// end of for i < numString.length
				
				// give number variable value of newNumber variable
				// and display number
				number = newNumber;
				System.out.print( " " + number );
				
			}// end of while number >= 10
			
			// start new line
			System.out.println();
			
			// update number variable if there is another integer
			if ( scan.hasNext() )
			{
				number = scan.nextInt();
				
			}// end of if scan.hasNext
			
		}// end of while number > 0
		
		scan.close();
		
	}// end of main

}// end of DigitSolitaire