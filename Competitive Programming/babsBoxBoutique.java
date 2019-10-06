package competitiveProgramming;

import java.util.Scanner;

public class babsBoxBoutique
{
	public static void main( String [] args )
	{
		int caseCount = 1;
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int [][] boxes = new int [n][3];
		
		for ( int i = 0; i < n; i++ )
		{
			for ( int j = 0; j < 3; j++ )
			{
				boxes[i][j] = scan.nextInt();
				
			}// end of j for loop
			
		}// end of i for loop
		
		int [] greatestAreas = new int [n];
		
		for ( int i = 0; i < n; i++ )
		{
			
			int area1 = boxes[i][0] * boxes[i][1];
			int area2 = boxes[i][1] * boxes[i][2];
			int area3 = boxes[i][0] * boxes[i][2];
			
			greatestAreas[i] = area1;
			
			if ( area2 > area1 )
			{
				if ( area2 > area3 )
					greatestAreas[i] = area2;
				else
					greatestAreas[i] = area3;
				
			}// end of if area2 > area1
			
			else if ( area3 > area1 )
			{
				greatestAreas[i] = area3;
				
			}// end of else if area3 > area1
			
		}// end of 2nd i for loop
		
		int largestArea = 0;
		
		for ( int i = 0; i < greatestAreas.length; i++ )
		{
			if ( greatestAreas[i] > largestArea )
				largestArea = greatestAreas[i];
			
		}// end of for i < greatestAreas.length loop
		
		System.out.println(largestArea);
		System.out.println();
		System.out.println( "Case " + caseCount + ": " + largestArea );
		
		scan.close();
		
	}// end of main
	
}// end of babsBoxBoutique