//////////////////////////////////////////////////////////////////////////
//	Name: Seth Miller								                    //
//	Program: 2a									                        //
//	Desc: Asks user for a password and tests if it is acceptable        //
//	Test cases:	If the user does not meet one or more of the 	        //
//  security standards, the console will print an error message.        //
//  If the password meets all requirements, it will print a message     //
//  stating that it is acceptable.                                      //
//////////////////////////////////////////////////////////////////////////

package program2CS1;

import javax.swing.JOptionPane;

public class Program2a
{
	// method that tests if the password is too short
	public static boolean tooShort(String password)
	{
		if ( password.length( ) < 8 )
			return true;
		else
			return false;
	}
	
	// method that tests if the password contains special characters and returns false if so
	public static boolean noSpecialCharacter(String password)
	{
		if ( password.contains("!") || (password.contains("@") || (password.contains("$"))))
			return false;
		else
			return true;
	}
	
	// method that tests if the password contains spaces
	public static boolean containsSpaces(String password)
	{
		if (password.contains(" ") )
			return true;
		else
			return false;
	}
	
	// method that tests if the password starts with an invalid character (an exclamation mark or question mark)
	public static boolean startsWrong(String password)
	{
		if( password.charAt(0) == '!' || password.charAt(0) == '?')
			return true;
		else
			return false;
	}
	
	// method that tests if the first three characters of the password are the same
	public static boolean firstThreeSame(String password)
	{
		if( password.charAt(0) == password.charAt(1) && password.charAt(1) == password.charAt(2) )
			return true;
		else
			return false;
	}
	
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
	}
	
	//main method- tests if password meets all security requirement and displays password is acceptable if so
	public static void main( String [] args )
	{
		String password = JOptionPane.showInputDialog("Please type in a candidate password: ");
		
		if ( tooShort(password) )
			JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long. Try again.");
		
		else if ( noSpecialCharacter(password) )
			JOptionPane.showMessageDialog(null, "Password does not contain a special character. Try again.");
		
		else if ( startsWrong(password) )
			JOptionPane.showMessageDialog(null, "Password starts with invalid character. Try again.");
		
		else if ( containsSpaces(password) )
			JOptionPane.showMessageDialog(null, "Password cannot contain spaces. Try again.");
		
		else if ( firstThreeSame(password) )
			JOptionPane.showMessageDialog(null, "First three characters of password cannot be the same. Try again.");
		
		else if  ( lastThreeSame(password) )
			JOptionPane.showMessageDialog(null, "Last three characters of password cannot be the same. Try again.");
		
		else
			JOptionPane.showMessageDialog( null, "Password is acceptable." );
	}
}
