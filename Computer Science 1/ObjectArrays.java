// CIS 1144, Lab 13
// Name: Seth Miller
// Date: November 13th-16th, 2017
// Filename: ObjectArrays.java
// This program will experiment with arrays of objects

package objectArrays;

// Import Scanner, File, & FileNotFoundException
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ObjectArrays 
{
	public static void main( String [] args ) throws FileNotFoundException
	{
		// Instantiate and declare a new array of LineScores with 12 elements
		LineScore [] fileLines = new LineScore [12];
		
		// Initialize index number variable
		int index = 0;
		
		// Create file scanner that scans file "scores.txt"
		Scanner fileScan = new Scanner( new File( "scores.txt" ) );
		
		// While loop that processes data while there is more data in the file
		while ( fileScan.hasNext() )
		{
			String teamName = fileScan.next();
			int teamRuns = fileScan.nextInt();
			int teamHits = fileScan.nextInt();
			int teamErrors = fileScan.nextInt();
				
			// Create new Line Score object in fileLines array with new variables as parameters
			fileLines[index] = new LineScore ( teamName, teamRuns, teamHits, teamErrors );
			
			// increment index variable
			index++;
					
		}// end of while fileScan.hasNext (there is more data in the file)
			
		// Close file
		fileScan.close();
			
		// Display information for each game
		for( int x = 0; x < fileLines.length; x+= 2 )
		{
			System.out.println( "Team\t\tR   H   E" );
			System.out.println( "----------------------------" );
				
			if ( fileLines[x].getTeam().length() > 7 ) // longer than one tab-width
				System.out.println( fileLines[x].getTeam() + "\t" + fileLines[x].getRuns() + "   " + fileLines[x].getHits() + "   " + fileLines[x].getErrors() );
			else
				System.out.println( fileLines[x].getTeam() + "\t\t" + fileLines[x].getRuns() + "   " + fileLines[x].getHits() + "   " + fileLines[x].getErrors() );
			
			if ( fileLines[x + 1].getTeam().length() > 7 ) // longer than one tab-width
				System.out.println( fileLines[x + 1].getTeam() + "\t" + fileLines[x + 1].getRuns() + "   " + fileLines[x + 1].getHits() + "   " + fileLines[x + 1].getErrors() );
			else
				System.out.println( fileLines[x + 1].getTeam() + "\t\t" + fileLines[x + 1].getRuns() + "   " + fileLines[x + 1].getHits() + "   " + fileLines[x + 1].getErrors() );
			
			System.out.println( );
				
		}// end of for x < fileLines.length
		
	}// end of main
	
}// end of ObjectArrays