// Seth Miller- Competitive Programming
// Problem ID: 5930 - Pizza Pricing
// Date: 03/05/2018 (mm/dd/yyyy)

package competitiveProgramming;

import java.util.Scanner;

public class PizzaPricing
{
	public static void main( String [] args )
	{
		Scanner scan = new Scanner( System.in );
		
		int n = scan.nextInt();
		int count = 1;
		
		while ( n != 0 )
		{
			int bestD = 100;
			double bestCost = 100;
			
			
			for ( int i = 0; i < n; i++ )
			{
				int d = scan.nextInt();
				int p = scan.nextInt();
				
				double cost = p / ( Math.PI * Math.pow( (d/2), 2 ) );
				
				if ( cost < bestCost )
				{
					bestCost = cost;
					bestD = d;
					
				}// end of if cost < bestCost
				
			}// end of for i < n
			
			System.out.println("Menu " + count + ": " + bestD);
			count++;
			n = scan.nextInt();
			
		}// end of while n != 0
				
	}// end of main
	
}// end of PizzaPricing