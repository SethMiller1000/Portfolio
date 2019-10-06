// Seth Miller, Andrew Smith, & Michael Buxbaum
// SBU Competitive Programming - 04/02/2018 (mm/dd/yyyy)
// Line Them Up- ACM ICPC Archive	Problem ID#: 7355

package competitiveProgramming;

import java.util.Scanner;
//import java.io.File;
//import java.io.FileNotFoundException;

public class LineThemUp
{
	public static void main( String [] args ) //throws FileNotFoundException
	{
		Scanner scan = new Scanner( System.in /*new File( "lineThemUpInput.txt" )*/ );
		int count = 0;
		String output = "";
		boolean bugging = true;
		
		String numString = "";
		
		while ( scan.hasNext() )
		{
			numString = scan.next();
			count = Integer.parseInt( numString );
			
			String [] players = new String [count];
			
			for ( int i = 0; i < count; i++ )
			{
				players[i] = scan.next();
				
			}// end of for ( int i = 0; i < count; i++ )
			
			if ( bugging )// <=========================== BUGGING
			{
				System.out.println( );
				System.out.println( "LENGTH: " + players.length );
				
				for ( int i = 0; i < players.length; i++ )
				{
					System.out.println( players[i] );
					
				}// end of for ( int i = 0; i < players.length - 1; i++ )
				
				System.out.println( );
				
			}// end of if ( bugging )
			
			
			
			for ( int i = 1; i < players.length - 1; i++ )
			{
				if ( players[i].charAt(0) > players[i - 1].charAt(0) && players[i + 1].charAt(0) > players[i].charAt(0) )
					output = "INCREASING";
				
				else if ( players[i].charAt(0) < players[i - 1].charAt(0) && players[i + 1].charAt(0) < players[i].charAt(0) )
					output = "DECREASING";
				
				else if ( !( players[i].charAt(0) == players[i - 1].charAt(0) ) )
				{
					output = "NEITHER";
					i = players.length - 1;
					
				}// end of else
				
			}// end of for ( int i = 1; i < players.length - 1; i++ )
			
			System.out.println( output );
			
		}// end of while ( scan.hasNext() )
		
		scan.close();
		
	}// end of main
	
}// end of LineThem