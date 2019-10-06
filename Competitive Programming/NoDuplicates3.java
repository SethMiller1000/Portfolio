package sbuSilver;

import java.util.Scanner;

public class NoDuplicates3
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		boolean repeats = false;
		String word = "";
		int arrayCount = 1;
		int count = 0;
		String [] message;
		int wordSize = 0;
		int charArrayPlace = 0;
		int j = 0;
		String [] words;
		String input = scan.nextLine();
		if (!input.contains(" ")) 
		{
			repeats = false;
		}
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
				wordSize=0;
				while ((input.charAt(wordSize) != ' '))
				{
					word = word + input.charAt(j);
					wordSize++;
				}// end of while
				
				if ( count < words.length)
				{
					words[count] = word;
				}
				count++;
				charArrayPlace = charArrayPlace + wordSize + 1;
				j = charArrayPlace;
			}// end of for j < input.length2
			
			for ( int X = 0; X < words.length - 1; X++ )
			{
				for (int M = 1; M < words.length - X; M++)
				{
					int counter = 0;
					if (words[X].equals(words[X + counter]))
					{
						repeats = true;
					}
					counter++;
					
				}// end of for x < words
			}//end of else
		if (repeats = false)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		}//end of else of if input does not contain space
		
	}// end of main

}// end of NoDuplicates3
