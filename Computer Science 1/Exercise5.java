// Midterm Review -CS1- Seth Miller
// Exercise 5- UML and Object-Oriented Design

package midtermReview;

public class Exercise5
{
	public class Clock
	{
		private int hrs;
		private int min;

		public Clock( )
		{
			hrs = 0;
			min = 0;
		}

		public Clock( int startHrs, int startMin )
		{
			setHrs( startHrs );
			setMin( startMin );
		}

		public void setHrs( int h )
		{
			hrs = h;
		}

		public void setMin( int m )
		{
			min = m;
		}

		public int getHrs( )
		{
			return hrs;
		}

		public int getMin( )
		{
			return min;
		}
	} // end of Clock
	
}// end of Exercise 5
