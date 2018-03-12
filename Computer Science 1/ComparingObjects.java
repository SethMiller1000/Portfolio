// Comparing object references and data- Lab 5: CIS 1144
// Seth Miller

package workingWithSelection;

public class ComparingObjects
{
	public static void main( String [] args )
	{
		// instantiate two SimpleDate objects with identical data
		SimpleDate d1 = new SimpleDate( 4, 10, 2020 );
		SimpleDate d2 = new SimpleDate( 4, 10, 2020 );
		
		// assign object reference d1 to d3
		SimpleDate d3 = d1; // d3 now points to d1
		
		//instantiate another object with different data
		SimpleDate d4 = new SimpleDate( 12, 1, 2020);
		
		//compare references using the equality operator
		if ( d1 == d2 )
			System.out.println( "d1 and d2 are equal\n" );
		else
			System.out.println( "d1 and d2 are not equal\n" );
		
		if ( d1 == d3 )
			System.out.println( "d1 and d3 are equal\n" );
		else
			System.out.println( "d1 and d3 are not equal\n" );
		
		// compare object data using the equals method
		if ( d1.equals( d2 ) )
			System.out.println( "d1 data and d2 data are equal\n" );
		else
			System.out.println( "d1 data and d2 data are not equal\n" );
		
		if ( ! d1.equals( d4 ) )
			System.out.println( "d1 data and d4 data are not eqaul" );
		else
			System.out.println( "d1 data and d4 data are equal" );	
	}
}