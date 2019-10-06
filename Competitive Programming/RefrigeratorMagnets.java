// Seth Miller- Competitive Programming
// Problem ID: 5932 - Refrigerator Magnets
// Date: 03/05/2018 (mm/dd/yyyy)

package competitiveProgramming;

import java.util.Scanner;

public class RefrigeratorMagnets
{
	public static void main( String [] args )
	{
		Scanner scan = new Scanner( System.in );
		String phrase = scan.nextLine();
		
		while ( !(phrase.equals("END")) )
		{
			String copy = phrase;
			boolean hasDuplicates = false;
			
			char first = phrase.charAt(0);
			phrase = phrase.substring(1);
				
			while ( !( phrase.isEmpty() || hasDuplicates ) )
			{
				hasDuplicates = ( phrase.contains("" + first) && first != ' ' );
				first = phrase.charAt(0);
				phrase = phrase.substring(1);
				
			}// end of while phrase != empty && hasDuplicates != false
			if ( !(hasDuplicates) )
				System.out.println(copy);
				
			phrase = scan.nextLine();
		}// end of while phrase does not equal "END"
		
	}// end of main
	
}// end of RefrigeratorMagnets