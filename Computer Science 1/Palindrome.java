package lab12;

import javax.swing.JOptionPane;

public class Palindrome
{
	public static boolean palindrome( String p, int left, int right )
	//TASK: Return true if p is a palindrome (reads the same forwards as backwards)
	{
		//BASE CASE #1 left >= right indicates the entire word has been checked
		if ( left >= right )
			return true;
		
		//BASE CASE #2 if the letters don’t match, then p is not a palindrome
		else if ( p.charAt(left) != p.charAt(right) )
			return false;
		
		//SMALLER CALLER – Still a potential palindrome, so check next 2 letters
		else
			return palindrome (p, left + 1, right - 1);
		
	}// end of palindrome method
	
	public static void main(String[] args)
	{
		String word = JOptionPane.showInputDialog( "Please enter a word:" );
		
		if ( palindrome(word, 0, word.length() - 1) )
			JOptionPane.showMessageDialog( null, "Your word is a palindrome." );
		else
			JOptionPane.showMessageDialog( null, "Your word is not a palindrome." );
		
	}// end of main

}// end of Palindrome class
