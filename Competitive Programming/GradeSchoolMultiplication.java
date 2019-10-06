// Seth Miller- Competitive Programming
// Problem ID: 5928 - Grade School Multiplication
// Date: 03/05/2018 (mm/dd/yyyy)

package competitiveProgramming;

import java.util.Scanner;

public class GradeSchoolMultiplication
{
	public static void main( String [] args )
	{
		// Variable for debugging; to turn on, make value "true"
		final boolean DEBUGGING = true;
		
		Scanner scan = new Scanner( System.in );
		
		long number1 = scan.nextLong();
		long number2 = scan.nextLong();
		
		int count = 1;
		
		while ( !(number1 == 0 || number2 == 0 ) )// both numbers are not zero
		{
			System.out.println( "Problem " + count );
			System.out.println(number1);
			System.out.println(number2);
			
			String numString1 = ( Long.toString(number1) );
			String numString2 = ( Long.toString(number2) );
			
			// Make string variable for bar and calculate length
			int barLength = (numString1.length() + numString2.length() );
			String bar = "-";
			
			while (bar.length() != barLength)
			{
				bar = bar + "-";
				
			}// end of while bar.length() != barLength
			
			System.out.println(bar);
			
			for ( int i = numString2.length() - 1; i >= 0; i-- )
			{
				if (DEBUGGING)// START OF IF DEBUGGING PART 1
				{
					System.out.println();
					System.out.println(number1);
					System.out.println( (int) numString2.charAt(i) ); // HOW IS THIS RECEIVING TWO DIGITS?!?!?!?!?!?!?

				}// END OF IF DEBUGGING PART 1
				
				System.out.println( number1 * ( (int) numString2.charAt(i) ) );
				
			}// end of for i < numString2.length()
			
			// Last thing to print for each problem
			System.out.println(bar);
			System.out.println(number1 * number2);
			
			number1 = scan.nextInt();
			number2 = scan.nextInt();
			
			count++;
			
		}// end of while neither number1 or number2 equal "0"
		
	}// end of main
	
}// end of GradeSchool Multiplication
