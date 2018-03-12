package midtermReview;

import java.util.Scanner;

public class Exercise4
{
	public static void main( String [] args )
	{
		double value;
		double squareRootValue;
		int rootCount = 0;
		
		Scanner scan = new Scanner( System.in );
		
		System.out.print("Please enter a number: ");
		value = scan.nextDouble();
		
		while ( value < 10 )
		{
			System.out.print("Error! Number must be 10 or larger. Enter another number: ");
			value = scan.nextDouble();
		}
		
		squareRootValue = Math.sqrt(value);
		
		while ( squareRootValue > 1.01 )
		{
			rootCount++;
			value = squareRootValue;
			squareRootValue = Math.sqrt(value);
		}
		
		System.out.println("Root count: " + rootCount );
	}// end of main	
	
}// end of Exercise4
