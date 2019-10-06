package sbuSilver;

import java.util.Scanner;

public class MaxCode
{
	public static void main ( String [] args ) 
	{
		Scanner scan = new Scanner (System.in);
		
		String word = "";
		int arrayCount = 1;
		int count = 0;
		int j = 0;
		int wordSize = 0;
		int charArrayPlace = 0;
		
		String [] words;
		String input = scan.nextLine();
		
		for ( int i = 0; i < input.length(); i++ )
		{
			if ( input.charAt(i) == ' ' )
			{
				arrayCount++;
			}
			while( j < input.length() )
			{
				word = "";
				wordSize = 0;
				while ((input.charAt(wordSize) != ' '))
				{
					word = word + input.charAt(j);
					wordSize++;
				}// end of while
				
			}// end of for j < input.length2
		}// end for i < input.length
		
		words = new String [arrayCount];
		
		/*while( j < input.length() )
		{
			word = "";
			wordSize = 0;
			while ((input.charAt(wordSize) != ' '))
			{
				word = word + input.charAt(j);
				wordSize++;
			}// end of while
			*/
			if ( count < words.length)
			{
				words[count] = word;
			}
			count++;
			charArrayPlace = charArrayPlace + wordSize + 1;
			j = charArrayPlace;
		//}
		
		
		System.out.println(words.length);
		System.out.println( "" );
		
		for ( int X = 0; X < words.length; X++ ) 
		{
			System.out.println(words[X]);
		}
		
	}// end of main
	
}// end of MaxCode