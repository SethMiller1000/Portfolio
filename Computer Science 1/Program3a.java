package program3;

// Import scanner, file, text, and IOException classes
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.text.*;

public class Program3a
{
	public static void main( String [] args) throws IOException
	{
		// Initialize variables
		double dropHeight;
		double bounceHeight;
		int bounces = 0;
		int initialBounces = 0;
		int bounceCounter = 0;
		double distance = 0.00;
		double totalDistance = 0.00;
		double bounceIndex;
		final double NEGLIGIBLE = 0.001;
		DecimalFormat math = new DecimalFormat("#.##");
		
		
		// Initialize scanner and read from text file
		File inputFile = new File ("bouncedata.txt");
		Scanner file = new Scanner( inputFile );
		
		// While loop that exits when there is no more integers
		// to read from the text file
		while ( file.hasNextInt( ) )
		{
			// Set variables to values in text file
			dropHeight = file.nextInt( );
			bounceHeight = file.nextInt( );
			bounces = file.nextInt( );
			initialBounces = bounces;
			bounceIndex = bounceHeight / dropHeight;
			distance = 0.00;
			totalDistance = 0.00;
			
			// While loop that runs and updates variables until bounce height is negligible
			while (( bounceHeight > NEGLIGIBLE ) && ( bounces != 0 )) 
			{
				distance = dropHeight + bounceHeight;
				dropHeight = bounceHeight;
				bounceHeight = dropHeight * bounceIndex;
				
				totalDistance= totalDistance + distance;
				
				bounces--;
				bounceCounter++;
				
				//Output
				System.out.println( "Bounce #" + bounceCounter );
				System.out.println( "Down: " + math.format(dropHeight) + " ft." );
				System.out.println( "Up: " + math.format(bounceHeight) + " ft." );
				System.out.println( "Distance: " + math.format(distance) + " ft." );
				System.out.println( "Total Distance: " + math.format(totalDistance) + " ft." );
				System.out.println( "======================================================");
				
				
			}// end of while loop; either bounce height is negligible or smaller,
			 // or there are no bounces left
			
			// Displays bounce index, number of bounces, and actual bounces allowed
			System.out.println( "Bounce Index: " + math.format(bounceIndex) );
			System.out.println( "Number of Bounces: " + initialBounces );
			System.out.println( "Actual bounces allowed: " + bounceCounter );
			System.out.println( "Total distance: " + math.format(totalDistance) + " ft." );
			System.out.println( "======================================================");
			System.out.println( "=====================New Data Set=====================" );
			
			// resets necessary variables for another test
			bounces = 0;
			bounceCounter = 0;
			
		}// end of while loop that tests if file has another integer		
	}// end of main
}// end of Program 3a