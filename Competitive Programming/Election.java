package bob;

import java.util.Scanner;

public class Election
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		int N = 0;
		int V1 = 0;
		int V2 = 0;
		int W = 0;
		double A = 0.0;
		
		for(int i = 0; i < t; i++)
		{
			N = scan.nextInt();
			V1 = scan.nextInt();
			V2 = scan.nextInt();
			W = scan.nextInt();
			
			A = 100 / N;
			
			if ((( N - V2) * A) > W )
				System.out.println("GET A CRATE OF CHAMPAGNE FROM THE BASEMENT!");
			else if ((N - V2) < V2 )
				System.out.println("RECOUNT!");
			else
				System.out.println("PATIENCE, EVERYONE!");
			
		}
		
	}

}
