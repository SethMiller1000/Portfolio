/** A array list of integers
 * Array List Practice (Class)- November 10th, 2017
 * Seth Miller		CIS 1144
 */

package arrayListPractice;

import java.util.ArrayList;

public class ClassArrayPractice
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>( );
		
		list.add( new Integer (34) );
		list.add( new Integer (89) );
		list.add( 65 ); // auto-boxing
		
		System.out.println( "Using the traditional for loop:" );
		for ( int i = 0; i < list.size(); i++ )
			System.out.print( list.get(i) + "\t" );
		
		System.out.println( );
		
		System.out.println( "\nUsing the enhanced for loop:" );
		for ( Integer currentInteger: list )
			System.out.print( currentInteger + "\t" );
		
		System.out.println( );
		
	}// end of main

}// end of ClassNovember10th
