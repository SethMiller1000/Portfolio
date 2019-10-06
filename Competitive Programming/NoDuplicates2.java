package sbuSilver;

import java.util.Scanner;

public class NoDuplicates2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		
		boolean repeats = false;
		String word = "";
		int arrayCount = 1;
		int count = 0;
		int wordSize = 0;
		int charArrayPlace = 0;
		int j = 0;
		
		String [] words;
		String input = scan.nextLine();
		
		if (!input.contains(" ")) 
		{
			repeats = false;
		}// end of if input contains space
		
		else
		{
			for ( int i = 0; i < input.length(); i++ )
			{
				if ( input.charAt(i) == ' ' )
				{
					arrayCount++;
				}// end of while
				
			}// end for i < input.length
			
			words = new String [arrayCount];
			
			while(j < input.length() )
			{
				word = "";
				//wordSize = 0;
				while ( (input.charAt(charArrayPlace) != ' ') )
				{
					word = word + input.charAt(j);
					wordSize++;
					charArrayPlace++;
				}// end of while
				
				if ( count < words.length)
				{
					words[count] = word;
				}
				count++;
				
				j = charArrayPlace;
				
			}// end of for j < input.length2
			
			for ( int X = 0; X < words.length - 1; X++ )
			{
				int counter = 1;
				if (words[X].equals(words[X + counter]))
				{
					repeats = true;
				}// end of if
				counter++;
					
			}// end of for x < words
			
		}//end of if
		
		if (repeats == false)
		{
			System.out.println("yes");
		}// end of if
		
		else if (repeats == true)
		{
			System.out.println("no");
		}// end of else
		
	}// end of main
	
}// end of NoDuplicates