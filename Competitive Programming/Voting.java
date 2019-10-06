// Seth Miller, Andrew Smith, & Michael Buxbaum 
// SBU Competitive Programming - 03/26/2018 (mm/dd/yyyy)
// Voting - Problem ID #: 4921 (ACM ICPC Archive)
// *Andrew wrote it first, submitted it to the archive successfully, and then deleted it.
//  I rewrote it in my free time.

package competitiveProgramming;

import java.util.Scanner;

public class Voting
{
	public static void main( String [] args )
	{
		Scanner scan = new Scanner( System.in );
		
		String votes = scan.nextLine().toUpperCase();
		
		while ( !( votes.equals( "#" ) ) )
		{
			int yCount = 0;
			int nCount = 0;
			int absent = 0;
			
			for ( int i = 0; i < votes.length(); i++ )
			{
				if ( votes.charAt(i) == 'Y' )
					yCount++;
				else if ( votes.charAt(i) == 'N' )
					nCount++;
				else if ( votes.charAt(i) == 'A' )
					absent++;
				
			}// end of for ( int i = 0; i < votes.length(); i++ )
			
			// DEBUGGING
			System.out.println( );
			System.out.println( absent );
			System.out.println( votes.length() );
			System.out.println( );
			
			if ( absent < ( votes.length() / 2 ) )
			{
				if ( yCount > nCount )
					System.out.println( "yes" );
				else if ( nCount > yCount )
					System.out.println( "no" );
				else
					System.out.println( "tie" );
				
			}// end of if ( absent < ( votes.length() / 2 ) )
			
			else
				System.out.println( "need quorum" );
			
			votes = scan.nextLine().toUpperCase();
			
		}// end of while ( !( votes.equals( "#" ) ) )
		
		// END OF CODE
		scan.close();
		
	}// end of main
	
}// end of Voting