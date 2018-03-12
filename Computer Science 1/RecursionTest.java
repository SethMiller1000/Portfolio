package lab12;

import javax.swing.JOptionPane;

////////////////////////////////////////////////////////////////////
// Lab 12: Recursion                                              //
// Name: Seth Miller                                              //
////////////////////////////////////////////////////////////////////

public class RecursionTest
{
	public static int power(int x, int y)
	// PRE: x > 0
	// POS: none
	// TAS: Recursively compute x to the y power and return the result. 
	{
		System.out.println( "x: " + x + " and y: " + y );
		if (y == 0)
			return 1;
		else
			return x * power(x, y - 1);
		
	}// end of method power
	
	////// POSTLAB //////
	
	// Problem 24
	public static int foo ( String s, char c )
	{
		if ( s.length() == 0 )
			return 0;
		else
		{
			int count = 0;
			
			if ( s.charAt(0) == c )
				count++;
			
			return count + foo( ( s.substring( 1, s.length() ) ), c );
			
		}// end else
		
	}// end of foo
	
	// Problem 25
	public static String foo2 ( String s )
	{
		if ( s.length() == 0 )
			return "even";
		else if ( s.length() == 1 )
			return "odd";
		else
			return foo2( s.substring(0, s.length() - 1 ) );
		
	}// end of foo2
	
	// Problem 26
	public static int foo3( int n )
	{
		if ( n == 0 )
			return 0;
		else
			return n + foo3( n - 1 );
		
	}// end of foo3
	
	// Problem 27
	public static boolean foo4 ( String s )
	{
		if ( s.length() < 2 )
			return false;
		else if ( s.charAt(0) == 'A' && s.charAt(1) == 'B' )
			return true;
		else
			return foo4( s.substring( 1, s.length( ) ) );
		
	}// end of Problem 27
	
	// Problem 28
	public static int foo5( int n )
	{
		if ( n >= 1000 )
			return n;
		else
			return (foo5(n * n));
		
	}// end of foo5
	
	////// MAIN METHOD //////
	
	public static void main(String [] args)
	{
		//----------------------------------------------------------------- 
	    // The following code tests method power.  The code reads in values 
	    // for x and y, and computes x to the power y. 
	    //----------------------------------------------------------------- 

		int x;
		int y;
		
		////////READ IN VALUES FOR x AND y //////////
		x = Integer.parseInt(JOptionPane.showInputDialog("Enter a value for x"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Enter a value for y"));
		
		////////CALL THE power METHOD WITH x AND y AND DISPLAY RESULT //////////
		JOptionPane.showMessageDialog ( null, "x to the y power equals " + power(x,y) + "." );
		System.out.println( "" );
		
		////// POSTLAB //////
		
		// Test Problem 24
		System.out.println( "Problem 24" );
		int result24 = foo( "cupcake", 'c' );
		System.out.println( "The letter \'c\' occurs " + result24 + " times in the word \"cupcake\"." );
		System.out.println( );
		
		// Test Problem 25
		System.out.println( "Problem 25" );
		String result25 = foo2( "chocolate" );
		System.out.println( "The length of the word \"chocolate\" is " + result25 + "." );
		System.out.println( );
		
		// Test Problem 26
		System.out.println( "Problem 26" );
		int result26 = foo3( 20 );
		System.out.println( "The sum of numbers 0 through 20 is " + result26 + "." );
		System.out.println( );
		
		// Test Problem 27
		System.out.println( "Problem 27" );
		boolean result27 = foo4( "abbaABBA" );
		if (result27)
			System.out.println( "The string \"abbaABBA\" does contain \'A\' & \'B\' in consecutive locations." );
		else
			System.out.println( "The string \"abbaABBA\" does not contain \'A\' & \'B\' in consecutive locations." );
		System.out.println( );
		
		// Test Problem 28
		System.out.println( "Problem 28" );
		int result28 = foo5( 6 );
		System.out.println( "6 squared to itself until it is >= 1000 is " + result28 + "." );
				
	}// end of main

}// end of RecursionTest
