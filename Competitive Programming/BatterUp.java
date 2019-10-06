package sbuSilver;

import java.util.Scanner;

public class BatterUp
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		
		long n = scan.nextInt();
		long count = 0;
		
		double sum = 0;
		
		for ( long i = 0; i < n; i++ ) 
		{
			int nextNum = scan.nextInt();
			
			if ( nextNum != -1 )
			{
				sum = sum + nextNum;
				count++;
			}
			
		}// end for
		
		double slugPercent = sum / count;
		
		System.out.println(slugPercent);

	}// end main

}// end BatterUp
