package competitiveProgramming;

import java.util.Scanner;

public class Parity
{
	public static void main( String [] args )
	{
		Scanner scan = new Scanner( System.in );
		
		String input = scan.nextLine();
		
		while (! (input.equals("#")) )
		{
			char parityType = input.charAt(input.length() - 1 );
			int oneCount = 0;
			
			if ( parityType == 'e' )// wants even parity
			{
				for ( int i = 0; i < input.length(); i++ )
				{
					if ( input.charAt(i) == '1' )
						oneCount++;
					
				}// end of for i < input.length()
				
				if ( oneCount % 2 == 0 )
				{
					input = input.substring( 0, input.length() - 1 );
					input = input + "0";
				}
				else
				{
					input = input.substring( 0, input.length() - 1 );
					input = input + "1";
				}
				
			}// end of if parityType == 'e'
			
			else if ( parityType == 'o' )// wants odd parity
			{
				for ( int i = 0; i < input.length(); i++ )
				{
					if ( input.charAt(i) == '1' )
						oneCount++;
					
				}// end of for i < input.length()
				
				if ( oneCount % 2 == 0 )
				{
					input = input.substring( 0, input.length() - 1 );
					input = input + "1";
				}
				else
				{
					input = input.substring( 0, input.length() - 1 );
					input = input + "0";
				}
				
			}// end of else if parityType == 'o'
			
			System.out.println(input);
			
			input = scan.nextLine();
			
		}// end of while scan.next != "#"
		
		scan.close();
		
	}// end of main
	
}// end of Parity