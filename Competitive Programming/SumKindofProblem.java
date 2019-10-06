package competitiveProgramming;

import java.util.Scanner;

public class SumKindofProblem
{
	public static void main( String [] args)
	{
		Scanner scan = new Scanner( System.in );
		
		// numDataSets is variable p
		int numDataSets = scan.nextInt( );
		
		// numDatasets for loop
		for ( int i = 0; i < numDataSets; i++ )
		{
			// initialize all variables
			int counter = 0;
			
			int s1 = 0;
			int s2 = 0;
			int s3 = 0;
			
			int dataSetNum = scan.nextInt( );
			int dataSetValue = scan.nextInt( );
			
			// s1 for loop
			for ( int j = 0; j < dataSetValue; j++)
			{
				counter += 1;
				s1 = s1 + counter;
			}// end of s1 for loop
			
			counter = 0;
			
			// s2 for loop
			for ( int j = 0; j < dataSetValue; j++)
			{
				counter ++;
				s2 = s2 + counter;
				counter ++;
			}// end of s2 for loop
			
			counter = 0;
			
			// s3 for loop
			for ( int j = 0; j < dataSetValue; j++)
			{
				counter += 2;
				s3 = s3 + counter;
			}// end of s3 for loop
			
			System.out.println( dataSetNum + " " + s1 + " " + s2 + " " + s3 );
			
		}// end of numDatasets
		
		scan.close();
		
	}// end of main
	
}// end of Fabulous
