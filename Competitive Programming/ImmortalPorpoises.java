package competitiveProgramming;

import java.util.Scanner;

public class ImmortalPorpoises
{
	public static void main(String[] args)
	{
		// call scanner
		Scanner scan = new Scanner( System.in );
		
		int dataSet = scan.nextInt( );
		long pairs = 0;
		long maturePairs = 0;
		long babyPairs = 1;
		long pregnantPairs = 0;
		
		// dataSet for loop
		for ( int i = 1; i <= dataSet; i++ )
		{
			int setNum = scan.nextInt( );
			long years = scan.nextLong( );
			pairs = 0;
			maturePairs = 0;
			babyPairs = 1;
			pregnantPairs = 0;
			
			// years for loop
			for ( long x = 1; x <= years; x++ )
			{
				// if x = 1
				if ( x == 1 )
					pairs = 1;
				
				else
				{
					maturePairs = maturePairs + babyPairs;
					babyPairs = pregnantPairs;
					pairs = babyPairs + maturePairs;
					pregnantPairs = maturePairs;
				}// end of pairs = 1 else
				
				// if pairs is 1,000,000,000+
				if ( pairs >= 1000000000)
				{
					babyPairs = pairs - 1000000000;
					pairs = babyPairs;
					maturePairs = 0;
					// if pairs equals 0
					if ( pairs == 0 )
					{
						babyPairs++;
					}// end of if pairs equals 0
				}// end of if pairs is 1,000,000,000+
				
			}// end of years for loop
			
			System.out.println( setNum + " " + pairs);
		
		}// end of dataSet for loop
		
		scan.close();
		
	}// end of main

}// end of ImmortalPorpoises class
