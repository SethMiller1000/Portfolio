package midtermReview;

public class Exercise8
{
	public static void main(String[] args)
	{
		int [] nums = { 8, 5, 4, 3, 9, 7, 2 };
		int count = 0;
		for ( int i = 0; i <nums.length; i++ )
		{
			if (nums[i] > 5)
				count++;
			
		}// end of for loop
		System.out.println( "Amount of elements greater than 5: " + count );
		
	}// end of main

}// end of Exercise8
