// Seth Miller, Michael Buxbaum, Andrew Smith, & Nathan Hooper- Competitive Programming
// Painter- Problem ID: 3395
// Date Created: 03/12/2018 (mm/dd/yyyy)

package competitiveProgramming;

import java.util.Scanner;

public class Painter
{
	public static void main( String [] args )
	{
		Scanner scan = new Scanner( System.in );
		
		int numColors = scan.nextInt();
		
		while ( numColors != 0 )
		{
			System.out.print( numColors + " " ); // TEST LINE!
			
			int [] colorAmounts = new int [numColors];
			
			for ( int i = 0; i < colorAmounts.length; i++ )
			{
				colorAmounts[i] = scan.nextInt(); // array of how much of each color is needed
				
				System.out.print( colorAmounts[i] + " " ); // TEST LINE!
				
			}// for i < colorAmounts.length
			
			int amountGrayNeeded = scan.nextInt(); // integer variable of how much gray is needed
			
			System.out.print( amountGrayNeeded ); // TEST LINE!
			System.out.println(); // TEST LINE
			System.out.println(); // TEST LINE
			
			int kitsNeeded = 0; // OUTPUT INITIALIZED<----------------
			
			while ( amountGrayNeeded != 0 ) ///// START OF UNFINISHED PART
			{
				for ( int i = 0; i < colorAmounts.length; i++ )
				{
					colorAmounts[i] = colorAmounts[i] - 50;
					
				}// end of 2ND for i < colorAmounts.length
				
				kitsNeeded++;// Last line of while loop
				
			}// end of while amountGrayNeeded != 0
			
			System.out.println( kitsNeeded );
			
			// PRECONDITION FOR NEXT LOOP
			numColors = scan.nextInt();
			
		}// end of while numColors!= 0
		
		scan.close();
		
	}// end of main
	
}// end of Painter