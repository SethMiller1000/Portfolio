// Seth Miller, Andrew Smith, Michael Buxbaum
// SBU Competitive Programming- 03/26/2018 (mm/dd/yyyy)
// Mirror, Mirror on the Wall - Problem ID #: 4923 *COMPLETED*

package competitiveProgramming;

import java.util.Scanner;

public class MirrorMirrorOnTheWall
{
	public static void main( String [] args )
	{
		Scanner scan = new Scanner( System.in );
		
		String word = scan.nextLine();
		
		String output = "";
		
		while ( !( word.equals("#") ) )
		{
			output = "";
			
			for ( int i = 0; i < word.length(); i++ )
			{
				if ( !( word.charAt(i) == 'b' || word.charAt(i) == 'd' || word.charAt(i) == 'p' || word.charAt(i) == 'q' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'v' || word.charAt(i) == 'w' || word.charAt(i) == 'x' ) )
				{
					output = "INVALID";
					i = word.length();
					
				}// end of if word.charAt(i) != b, d, p, q, i, o, v, w, or x
			
			}// end of for ( int i = 0; i < word.length(); i++ )
				
			if ( !( output.equals("INVALID") ) )
			{
				for ( int x = word.length() - 1; x >= 0; x-- )
				{
					if( word.charAt(x) == 'b' )
						output += 'd';
					else if ( word.charAt(x) == 'd' )
						output += 'b';
					else if ( word.charAt(x) == 'p' )
						output += 'q';
					else if ( word.charAt(x) == 'q' )
						output += 'p';
					else
						output += word.charAt(x);
					
				}// end of for x >= 0
				
			}// end of if ( !( output.equals("INVALID") ) )
			
			System.out.println( output );
			
			// Last line of code of loop
			word = scan.nextLine();
			
		}// end of while word is not "#"
		
	}// end of main
	
}// end of MirrorOnTheWall