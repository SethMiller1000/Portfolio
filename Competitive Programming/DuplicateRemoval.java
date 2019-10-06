package competitiveProgramming;

import java.util.Scanner;

public class DuplicateRemoval
{
	public static void main ( String [] args )
	{
		Scanner scan = new Scanner ( System.in );
		
		int entries = scan.nextInt();
		
		while ( entries != 0 )
		{
			int entryList [] = new int [entries];
			
			for ( int i = 0; i < entries; i++ )
			{
				entryList[i] = scan.nextInt();
				
			}// end of for i < entries
			
			int last = entryList[0];
			
			String noDuplicates = "" + last;
			
			for ( int i = 1; i < entryList.length; i++ )
			{
				int now = entryList[i];
				
				if ( now != last )
				{
					noDuplicates += " " + now;
				}
				
				last = now;
				
			}// end of for i < entryList.length
			
			System.out.println(noDuplicates + " $");
			
			entries = scan.nextInt();
			
		}// end of while entries != 0
		
		scan.close();
		
	}// end of main
	
}// end of DuplicateRemoval