package lab12;

import javax.swing.JOptionPane;

public class Palindrome2
{
	public static boolean palindrome2( String p )
	//TASK: Return true if p is a palindrome (reads the same forwards as backwards)
	{
		//BASE CASE #1 left >= right indicates the entire word has been checked
		if ( p.length() == 1 || p.length() == 2 )
			return true;
		
		//BASE CASE #2 if the letters don’t match, then p is not a palindrome
		else if ( p.charAt(0) != p.charAt(p.length() - 1) )
			return false;
		
		//SMALLER CALLER – Still a potential palindrome, so check next 2 letters
		else
			return palindrome2( p.substring(1, p.length() - 1) );
		
	}// end of palindrome method
	
	public static void main(String [] args)
	{
		String word = JOptionPane.showInputDialog( "Please enter a word:" );
		
		if ( palindrome2(word) )
			JOptionPane.showMessageDialog( null, "Your word is a palindrome." );
		else
			JOptionPane.showMessageDialog( null, "Your word is not a palindrome." );
		
	}// end of main

}// end of Palindrome2 class
