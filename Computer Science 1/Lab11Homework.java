package lab11Homework;

public class Lab11Homework
{
	public static int nuumberOfElements (int [] a)
	{
		return a.length;
		
	}// Problem #49, pg. 551
	
	public static int arrayProduct (int [] a)
	{
		int product = 1;
		for (int i = 0; i < a.length; i++)
			product = product * a[i];
		
		return product;
		
	}// Problem #50, pg. 551
	
	public static void setToZero (int [] a)
	{
		for (int i = 0; i < a.length; i++)
			a[i] = 0;
		
	}// Problem #51, pg. 551
	
	public static void doubleElements (double [] a)
	{
		for (int i = 0; i < a.length; i++)
			a[i] = a[i] * 2;
		
	}// Problem #52, pg. 551
	
	public static float percentAbove90 (int [] a)
	{
		int above90Count = 0;
		for (int i = 0; i < a.length; i++)
		{
			 if (a[i] > 90)
				 above90Count++;
		}
		return above90Count/a.length;
			
	}// Problem # 53, pg. 551
	
	public static float percentTrue (boolean [] a)
	{
		int trueCount = 0;
		for (int i = 0; i < a.length; i++)
			if (a[i] == true)
				trueCount++;
		
		return trueCount/a.length;
	
	}// Problem #56, pg. 551
	
	public static boolean helloTest ( String [] sList )
	{
		for (int i = 0; i < sList.length; i++)
		{
			if (sList[i].equals("Hello"))
				return true;
		}// end of for loop
		
		return false;
	}// Problem #57, pg. 551
	
	public static char [] characterConvert ( String s )
	{
		char [] returnArray = new char [s.length()];
		for (int i = 0; i < s.length(); i++)
			returnArray[i] = s.charAt(i);
		return returnArray;
		
	}// Problem #60, pg. 552*
	
	public static boolean [] above100True (int [] a)
	// TASK: Return an array of booleans that reflect the content of "a" such that
	// locations in "a" that are above 100 will be true in the array returned and false otherwise
	{
		boolean [] returnArray = new boolean [a.length];
		
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] > 100)
				returnArray[i] = true;
			else
				returnArray[i] = false;
		}// end of for loop
		
		return returnArray;
		
	}// Problem #61, pg. 552
	
	public static void main (String[] args)
	{
		String [] testList = { "Welcome", "to", "SBU"};
		System.out.print(helloTest(testList));
	}// end of main

}// end of Lab11Homework
