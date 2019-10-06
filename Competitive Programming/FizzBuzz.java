package bob;

import java.util.Scanner;

public class FizzBuzz
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		
		int C = scan.nextInt( );
		int X;
		int Y;
		int N;
		
		for ( int i = 0; i < C; i++ )
		{
			X = scan.nextInt( );
			Y = scan.nextInt( );
			N = scan.nextInt( );
			
			for ( int j = 1; j <= N; j++ )
			{
				if ( j % X == 0 && j % Y == 0 )
					System.out.println("FizzBuzz");
				else if (  j % X == 0 )
					System.out.println("Fizz");
				else if ( j % Y == 0 )
					System.out.println("Buzz");
				else
					System.out.println(j);
					
			}
				
		}// end of for loop
		
		
	}// end of main

}// end of FizzBuzz
