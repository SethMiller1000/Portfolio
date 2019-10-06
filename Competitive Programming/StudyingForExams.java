package bob;

import java.util.Scanner;

public class StudyingForExams
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt( );
		int T = scan.nextInt( );
		
		double F = 0.0;
		double average = 0;
		double [] averages = new double [N];
		
		for ( int i = 0; i < N; i++ )
		{
			double A = scan.nextDouble( );
			double B = scan.nextDouble( );
			double C = scan.nextDouble( );
			
			average = T / N;
			
			F = (A * Math.pow(average, 2)) + (B * average) + C;
			averages[i] = F;
			
		}// end of for i < N
		
		System.out.println(F);
		
	}// end of main

}// end of StudyingForExams
