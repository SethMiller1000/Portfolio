//////////////////////////////////////////////////////////////////////////
//	Name: Seth Miller								                    //
//	Program: 4b									                        //
//	Desc: Asks user for a password and tests if it is acceptable        //
//	Test cases:	If the user does not meet one or more of the 	        //
//  security standards, the console will print an error message and     //
//  ask for another password. If the password meets all requirements,   //
//  it will print a message stating that it is acceptable. If the user  //
//  does not meet one or more of the security standards 4 times, it     //
//  will print a message saying that the user has run out of tries.     //
//////////////////////////////////////////////////////////////////////////

package program4;

// import JOptionPane, Scanner, File, text, and IO
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.File;
import java.io.*;
import java.text.*;

public class Program4b
{
	// declare array that contains all common words that should not be used in passwords
	/*static String [] passwordChecklist;*/
	
	// declare array that contains worst passwords of 2016 that should not be used
	static String [] worstList = new String [25];
	
	// initialize word count variable
	static int wordCount = 0;
	
	// import file scanner that reads text file of common words used in passwords
	static File inputFile = new File ( "usa2.txt" );
			
	// method that opens the text file and counts how many words are in it
	public int findWordCount( ) throws IOException
	{
		// import file scanner that reads text file of common words used in passwords
		Scanner file = new Scanner( inputFile );
		
		while ( file.hasNextLine( ) )
			wordCount++;
		return wordCount;
	}// end of findWordCount
	
	/*
	// Mutator method that sets the size of the array passwordChecklist to value of wordCount
	public static void setPasswordChecklist( int wordCount ) throws FileNotFoundException
	{
		Scanner file = new Scanner( inputFile );
		passwordChecklist = new String [wordCount];
		for ( int i = 0; i < passwordChecklist.length; i++ ) 
		{
			passwordChecklist[i] = file.nextLine( );
		}
	}*/
	
	// Mutator method that hard-codes the 25 worst passwords of 2016 into worstList array
	public static void setWorstList( ) 
	{
			worstList[0] = "123456";
			worstList[1] = "123456789";
			worstList[2] = "qwerty";
			worstList[3] = "12345678";
			worstList[4] = "111111";
			worstList[5] = "1234567890";
			worstList[6] = "1234567";
			worstList[7] = "password";
			worstList[8] = "123123";
			worstList[9] = "987654321";
			worstList[10] = "qwertyuiop";
			worstList[11] = "mynoob";
			worstList[12] = "123321";
			worstList[13] = "666666";
			worstList[14] = "18atcskd2w";
			worstList[15] = "7777777";
			worstList[16] = "1q2w3e4r";
			worstList[17] = "654321";
			worstList[18] = "555555";
			worstList[19] = "3rjs1la7qe";
			worstList[20] = "google";
			worstList[21] = "1q2w3e4r5t";
			worstList[22] = "123qwe";
			worstList[23] = "zxcvbnm";
			worstList[24] = "1q2w3e";
	}// end of setWorstList method
	
	// method that tests if password is a common word
	public static boolean lazyPasswordChoice( String password )
	{
		for (int index = 0; index < worstList.length; index++ ) 
		{
			if ( password == worstList[index] )
				return true;
		}
		
		/*
		for (int index = 0; index < passwordChecklist.length; index++ ) 
		{
			if ( password == passwordChecklist[index] )
				return true;
		}
		*/
		return false;
		
	}
	
	// method that tests if the password is too short
	public static boolean tooShort( String password )
	{
		if ( password.length( ) < 8 )
			return true;
		else
			return false;
	}// end of tooShort
	
	// method that tests if the password contains special characters and returns false if so
	public static boolean noSpecialCharacter(String password)
	{
		if ( password.contains("!") || (password.contains("@") || (password.contains("$"))))
			return false;
		else
			return true;
	}// end of noSpecialCharacter
	
	// method that tests if the password contains spaces
	public static boolean containsSpaces(String password)
	{
		if (password.contains(" ") )
			return true;
		else
			return false;
	}// end of containsSpaces
	
	// method that tests if the password starts with an invalid character (an exclamation mark or question mark)
	public static boolean startsWrong(String password)
	{
		if( password.charAt(0) == '!' || password.charAt(0) == '?')
			return true;
		else
			return false;
	}// end of startsWrong
	
	// method that tests if the first three characters of the password are the same
	public static boolean firstThreeSame(String password)
	{
		if( password.charAt(0) == password.charAt(1) && password.charAt(1) == password.charAt(2) )
			return true;
		else
			return false;
	}// end of firstThreeSame
	
	// method that tests if the last three characters of the password are the same
	public static boolean lastThreeSame(String password)
	{
		char char1 = password.charAt(password.length() - 3 );
		char char2 = password.charAt(password.length() - 2 );
		char char3 = password.charAt(password.length() - 1 );
		
		if( char1 == char2 && char1 == char3)
			return true;
		else
			return false;
	}// end of lastThreeSame
	
	// method that tests if the password meets all security standards
	public static boolean isStrong( String password ) 
	{
		if ( !( (tooShort(password)) || (noSpecialCharacter(password)) || (startsWrong(password)) || (containsSpaces(password)) || (firstThreeSame(password)) || (lastThreeSame(password)) || (lazyPasswordChoice(password)) ))
			return true;
		else
			return false;
	}// end of isStrong method
	
	//main method- tests if password meets all security requirement and displays password is acceptable if so
	public static void main( String [] args ) throws FileNotFoundException
	{		
		// Ask user for password
		String password = JOptionPane.showInputDialog("Please type in a candidate password: ");
		
		/*setPasswordChecklist( wordCount );*/
		setWorstList();
		
		if ( isStrong(password) )
			JOptionPane.showMessageDialog( null, "Password is acceptable." );
		else 
		{
			// Initialize errorCount variable
			int errorCount = 1;
			while ( ( errorCount < 4 ) && (!( isStrong(password) )) )
			{
				if ( lazyPasswordChoice(password) )
				{
					password = JOptionPane.showInputDialog(null, "Password cannot be a common word or password. Try again." );
					errorCount++;
				}
				
				// Test if password is long enough
				else if ( tooShort(password) )
				{
					password = JOptionPane.showInputDialog(null, "Password must be at least 8 characters long. Try again.");
					errorCount++;
				}// end of tooShort test
			
				else if ( noSpecialCharacter(password) ) 
				{
					password = JOptionPane.showInputDialog(null, "Password does not contain a special character. Try again.");
					errorCount++;
				}// end of noSpecialCharacter test
				
				else if ( startsWrong(password) ) 
				{
					password = JOptionPane.showInputDialog(null, "Password starts with invalid character. Try again.");
					errorCount++;
				}// end of startsWrong test
				
				else if ( containsSpaces(password) ) 
				{
					password = JOptionPane.showInputDialog(null, "Password cannot contain spaces. Try again.");
					errorCount++;
				}// end of containsSpaces test
				
				else if ( firstThreeSame(password) ) 
				{
					password = JOptionPane.showInputDialog(null, "First three characters of password cannot be the same. Try again.");
					errorCount++;
				}// end of firstThreeSame test
				
				else if  ( lastThreeSame(password) ) 
				{
					password = JOptionPane.showInputDialog(null, "Last three characters of password cannot be the same. Try again.");
					errorCount++;
				}// end of lastThreeSame test
				
			}// end of while errorCount < 4 loop
			
			// if statement that tests if the user has entered a strong enough password and has not made 4 errors yet (errorCouunt < 4)
			if ( (errorCount >= 4) && (! (isStrong(password)) ) )
				JOptionPane.showMessageDialog( null, "Sorry, you have run out of tries." );
			else
				JOptionPane.showMessageDialog( null, "Password is acceptable." );
			
		}// end of isStrong else statement
		
	}// end of main
	
}// end of Program 4b