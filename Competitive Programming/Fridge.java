// Allison Hawkins, Stephen, and Grant Jennings

package competitiveProgramming;

import java.util.Scanner;

public class Fridge
{
	static boolean dupe (String s)
	{
		boolean bad = false;
		if (s.isEmpty())
			return bad;
		
		else
		{
			char c = s.charAt(0);
			s = s.substring(1);
			while(!s.isEmpty() && !bad)
			{
				if (s.contains("" + c) && c != ' ')
					bad = true;
				c = s.charAt(0);
				s = s.substring(1);
				
			}// end of while !s.isEmpty() && !bad
			
			return bad;
			
		}// end of else
		
	}// end of dupe method


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		while(!s.equals("END"))
		{
			if(!dupe(s))
				System.out.println(s);
			s = scan.nextLine();
			
		}// end of while (!s.equals("END"))
		
		scan.close();
		
	}// end of main
	
}// end of Fridge
