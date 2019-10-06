package competitiveProgramming;

import java.util.Scanner;
import java.util.ArrayList;

public class PersistentBits
{
	public static void main( String [] args )
	{
		Scanner scan = new Scanner (System.in);
		
		// Receive four input values on line
		long a = scan.nextInt();
		long b = scan.nextInt();
		long c = scan.nextInt();
		long s = scan.nextInt();
		long x = s;
		
		// Test if first input of a line is zero (when input is done)
		while ( a != 0 )
		{
			/* UNIT TEST #1- Makes sure input is received in proper order- WORKING
			System.out.println();
			System.out.println(a + " " + b + " " + c + " " + s);
			*/
			
			// Run first calculation
			x = ( a * x + b ) % c;
			
			// Initialize array list to store each calculation's result
			ArrayList<Integer> results = new ArrayList<Integer>( );
			
			// add seed to results Array
			results.add( (int) s);
			
			// while x ( or "result" ) does not equal s ( or "seed" ) or zero
			while ( x != s && x != 0 )
			{	
				// add result of calculation to results ArrayList
				results.add( (int) x);
				
				// run calculation
				x = ( a * x + b ) % c;
				
				
			}// end of while x != s
			
			// Trim array list to size
			results.trimToSize();
			
			// Initialize array for binary equivalent of each calculation's result
			String [] binaryResults = new String [results.size()];
			
			// for loop that adds binary equivalent of each element of result ArrayList to binaryResults array
			for ( int i = 0; i < results.size(); i++ )
			{
				/* UNIT TEST #2- Makes sure results ArrayList was filled correctly- WORKING
				System.out.println( results.get(i) );
				*/
				
				// Initialize variable that is copy of result[i]
				// and string variable for result of binary conversion
				int result = results.get(i);
				String binResult = "";
				
				// Initialize empty integer array list and add value of 1 as first element
				ArrayList <Integer> powersOf2 = new ArrayList <Integer> ( );
				
				/// START OF BINARY CONVERSION PROCESS ///
				
				// for loop that fills array list with powers of 2 less than or equal to result
				for ( int z = 0; z < result; z++ )
				{
					if ( Math.pow( 2, z ) <= result )
						powersOf2.add((int) Math.pow( 2, z ));
					
				}// end of z < result
				
				// Trim powersOf2 ArrayList to size
				powersOf2.trimToSize();
				
				// for loop that creates binary string for each variable in results ArrayList
				for ( int z = powersOf2.size() - 1; z >= 0; z-- )
				{
					if ( powersOf2.get(z) <= result )
					{
						result = result - powersOf2.get(z);
						binResult = binResult + "1";
						
					}// end of if powersOf2.get(z) <= result )
					
					else
						binResult = binResult + "0";
					
				}// end of for z <= 0
				
				/// END OF BINARY CONVERSION PROCESS ///
				
				// while loop that adds zeros until binResult string has length of 16
				while ( binResult.length() < 16 )
				{
					binResult = "0" + binResult;
					
				}// end of while binResult.length() < 16
				
				// add binResult to proper spot in binaryResults array
				binaryResults[i] = binResult;
				
			}// end of for i < results.size()
			
			/* UNIT TEST #3- Makes sure binary conversion was successful
			// and that binaryResults array was filled properly- WORKING
			for ( int i = 0; i < binaryResults.length; i++ )
			{
				System.out.println(binaryResults[i]);
				
			}// end of for i < binaryResults.length
			*/
			
			String finalAnswer = "";
			
			// for loop that tests if each character at a certain index is the same
			// for all elements of binaryResults array
			for ( int i = 0; i < 16; i++ )
			{
				// initialize counters for number of times zero and one occur
				// at certain index for all elements of binaryResults array
				int zeroCount = 0;
				int oneCount = 0;
				
				// for loop that counts number of ones and zeros
				// for all elements of binaryResults array
				for ( int y = 0; y < binaryResults.length; y++ )
				{
					if ( binaryResults[y].charAt(i) == '0' )
						zeroCount++;
					else if ( binaryResults[y].charAt(i) == '1' )
						oneCount++;
					
				}// end of y < binaryResults.length
				
				// Adds appropriate character to finalAnswer string
				if ( zeroCount == 0 )// there are only ones at that index
					finalAnswer = finalAnswer + "1";
				else if ( oneCount == 0 )// there are only zeros at that index
					finalAnswer = finalAnswer + "0";
				else
					finalAnswer = finalAnswer + "?";
				
			}// end of for i < binaryResults.length
			
			///// Displays finalAnswer - FINAL OUTPUT /////
			System.out.println( finalAnswer );
			
			// scan first line of integer
			a = scan.nextInt();
			
			// if a does not equal zero, scan next three integers on line
			if ( a != 0 )
			{
				b = scan.nextInt();
				c = scan.nextInt();
				s = scan.nextInt();
				x = s;
				
			}// end of if a != 0
			
		}// end of while a != "0"
		
		scan.close();
		
	}// end of main
	
}// end of PersistentBits