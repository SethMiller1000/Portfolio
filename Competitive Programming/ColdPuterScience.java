package sbuSilver;

import java.util.Scanner;

public class ColdPuterScience
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		
		int n = scan.nextInt();
		
		int negative = 0;
		
		for ( int i = 0; i < n; i++ )
		{
			int t = scan.nextInt();
			if ( t < 0 )
				negative++;
				
		}// end for
		
		System.out.println(negative);

	}// end main

}// end ColdPuterScience
